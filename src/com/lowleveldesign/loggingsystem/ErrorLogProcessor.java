package com.lowleveldesign.loggingsystem;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(ERROR==logLevel){
            System.out.println("ERROR: "+message);
        }else {
            super.log(logLevel, message);
        }
    }
}
