package com.dn5.designpatterns.exercise2;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Microsoft Word Document");
    }

}