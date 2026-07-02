package com.dn5.designpatterns.exercise2;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Microsoft Excel Document");
    }

}