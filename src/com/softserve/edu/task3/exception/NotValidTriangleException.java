package com.softserve.edu.task3.exception;

/**
 * Created by Kostya on 25.05.2017.
 */
public class NotValidTriangleException extends RuntimeException{
    public NotValidTriangleException() {
        super("Not valid triangle!");
    }
}
