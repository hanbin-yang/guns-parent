package com.stylefeng.guns.rest.common;

public class CurrentUser {
    private static final ThreadLocal<String> threadLocal = new ThreadLocal();

    public static void saveCurrentUser(String userId) {
        CurrentUser.threadLocal.set(userId);
    }

    public static String getCurrentUser() {
        return CurrentUser.threadLocal.get();
    }
}
