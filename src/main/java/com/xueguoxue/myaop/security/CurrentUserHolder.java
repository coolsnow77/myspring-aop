package com.xueguoxue.myaop.security;

public class CurrentUserHolder {

    private static final ThreadLocal<String> holer = new ThreadLocal<>();

    public static String get(){
        return holer.get() == null ? "unknown" : holer.get();

    }

    public static void set(String user){
        holer.set(user);
    }
}
