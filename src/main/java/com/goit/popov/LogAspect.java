package com.goit.popov;

import org.apache.log4j.Priority;
import org.aspectj.lang.ProceedingJoinPoint;
import org.apache.log4j.Logger;

import java.util.Date;

/**
 * Created by Andrey on 10/4/2016.
 */
public class LogAspect {

        public Object onExecute(ProceedingJoinPoint pjp) throws Throwable {
                Object result = pjp.proceed();
                System.out.println("User: "+System.getProperty("user.name")+" on "+
                        new Date()+ " executed method: "+pjp.getSignature().getName()+" with the following "+
                        "parameters: "+pjp.getArgs()[0]+" & "+pjp.getArgs()[1]);
                Logger  logger = Logger.getLogger("log");
                logger.info("User: "+System.getProperty("user.name")+" on "+
                        new Date()+ " executed method: "+pjp.getSignature().getName()+" with the following "+
                        "parameters: "+pjp.getArgs()[0]+" & "+pjp.getArgs()[1]);
                return result;
        }
}

