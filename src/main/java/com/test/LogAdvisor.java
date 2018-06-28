package com.test;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author WH1707008
 * @date 2018/6/22 19:10
 * 该切片针对所有方法
 */
public class LogAdvisor implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("我要打印日志喽！ [log] "+target.getClass().getName()+"."+method.getName()+"( )");
    }


}
