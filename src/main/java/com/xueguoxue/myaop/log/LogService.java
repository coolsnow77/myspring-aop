package com.xueguoxue.myaop.log;

import org.springframework.stereotype.Component;

@Component
public class LogService implements Loggable {
    @Override
    public void log() {
        System.out.println("log from LogService");
    }
}
