package com.lowleveldesign.loggingsystem;

public class LoggerMain {
    public static void main(String[] args) {
        LogProcessor logger=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(1,"Printing info level message");
        logger.log(2,"Printing debug level message");
        logger.log(3,"Printing error level message");

    }
}
