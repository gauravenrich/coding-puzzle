package com.lowleveldesign.loggingsystem;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(INFO==logLevel){
            System.out.println("INFO: "+message);
        }else {
            super.log(logLevel,message);
        }
    }
}
