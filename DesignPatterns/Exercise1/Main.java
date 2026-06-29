package com.dn5.designpatterns.exercise1;

public class Main {

    public static void main(String[] args) {

        Logger firstLogger = Logger.getInstance();

        firstLogger.writeLog("Application Started");

        Logger secondLogger = Logger.getInstance();

        secondLogger.writeLog("User Logged In");

        if (firstLogger == secondLogger) {
            System.out.println("\nOnly one Logger object is created.");
        } else {
            System.out.println("\nMultiple Logger objects are created.");
        }

    }
}