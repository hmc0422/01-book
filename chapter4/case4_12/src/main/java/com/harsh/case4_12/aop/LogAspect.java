package com.harsh.case4_12.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    /**
     * @Aspect 表明切面类
     * @Pointcut 切入点定义
     * 第一个*：表示方法返回任意值
     * 第二个*：表示service包下的任意类
     * 第三个*：表示勒种的任意方法
     * 括号中的两个点：表示方法参数任意
     */
    @Pointcut("execution(* com.harsh.case4_12.service.*.*(..))")
    public void pcl() {

    }

    /**
     * @Before 表示这是一个前置通知，该方法在目标方法执行之前执行
     */
    @Before(value = "pcl()")
    public void before(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法开始执行...");
    }

    /**
     * @After 表示这是一个后置通知，该方法在目标方法执行之后执行
     */
    @After(value = "pcl()")
    public void after(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法执行结束...");
    }

    /**
     * @AfterReturning 表示这是一个返回通知，在该方法中可以获取目标方法的返回值
     * returning：指返回值得变量名，对应方法的参数，注意，在方法参数中定义了result的类型为object，表示目标方法的返回值可以是任意类型
     */
    @AfterReturning(value = "pcl()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法返回值为：" + result);
    }

    /**
     * @AfterThrowing 表示这是一个异常通知，即当目标方法发生异常时，该方法会被调用
     */
    @AfterThrowing(value = "pcl()", throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法抛异常了，异常是：" + e.getMessage());
    }

    /**
     * @Around 表示这是一个环绕通知，环绕通知是所有通知里功能最为强大的通知，可以实现前置通知、后置通知、异常通知以及返回通知的功能
     */
    @Around(value = "pcl()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        return pjp.proceed();
    }

}
