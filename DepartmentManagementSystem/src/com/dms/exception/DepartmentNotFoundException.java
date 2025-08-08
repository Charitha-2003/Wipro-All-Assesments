package com.dms.exception;

@SuppressWarnings("serial")
public class DepartmentNotFoundException extends Exception {

    public DepartmentNotFoundException(String message) {
        super(message);
    }
}
