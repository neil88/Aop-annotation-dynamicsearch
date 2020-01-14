package cn.neil.aop;

import cn.neil.utils.BeanUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Aspect
public class SetFiledValueAspect {

    @Autowired
    private BeanUtil beanUtil;

    @Around("@annotation(cn.neil.Annotation.NeedSetFiledValue)")
    public Object doSetFieldValue(ProceedingJoinPoint pjp) throws Throwable {
        Object res = pjp.proceed();
        if (res instanceof Collection) {
            this.beanUtil.setValue((Collection) res);
        }
        return res;
    }
}