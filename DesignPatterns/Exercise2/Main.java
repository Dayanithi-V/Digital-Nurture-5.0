package com.dn5.designpatterns.exercise2;

public class Main {

    public static void main(String[] args) {

        com.dn5.designpatterns.exercise2.DocumentFactory wordFactory = new com.dn5.designpatterns.exercise2.WordDocumentFactory();
        com.dn5.designpatterns.exercise2.Document wordDocument = wordFactory.createDocument();
        wordDocument.open();

        com.dn5.designpatterns.exercise2.DocumentFactory pdfFactory = new com.dn5.designpatterns.exercise2.PdfDocumentFactory();
        com.dn5.designpatterns.exercise2.Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();

        com.dn5.designpatterns.exercise2.DocumentFactory excelFactory = new com.dn5.designpatterns.exercise2.ExcelDocumentFactory();
        com.dn5.designpatterns.exercise2.Document excelDocument = excelFactory.createDocument();
        excelDocument.open();

    }

}