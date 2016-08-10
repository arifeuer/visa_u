package com.visa.exception;

/**
 * Created by afeuer on 8/9/16.
 */
public class BadMonthException extends Exception {
    public BadMonthException(Throwable th) {
        super(th);
    }

    public BadMonthException(String s, Throwable th) {
        super(s, th);
    }
}
