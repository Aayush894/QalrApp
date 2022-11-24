package com.example.newqalrapp;

public class CategoryModel {
    private String DocId;
    private String name;
    private int noOfTests;

    public CategoryModel(String docId, String name, int noOfTests) {
        DocId = docId;
        this.name = name;
        this.noOfTests = noOfTests;
    }

    public String getDocId() {
        return DocId;
    }

    public void setDocId(String docId) {
        DocId = docId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfTests() {
        return noOfTests;
    }

    public void setNoOfTests(int noOfTests) {
        this.noOfTests = noOfTests;
    }
}
