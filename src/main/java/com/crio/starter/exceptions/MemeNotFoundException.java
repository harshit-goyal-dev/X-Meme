package com.crio.starter.exceptions;

public class MemeNotFoundException extends RuntimeException{
    
    public MemeNotFoundException(String msg){
        super(msg);
    }
}
