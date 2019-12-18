package com.example.myapplication;

import android.graphics.Bitmap;


public class BookModel {

    private Bitmap bit;
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookModel(Bitmap b,String name,String author){
        this.bit = b;
        this.name = name;
        this.author = author;
    }


    public Bitmap getBit() {
        return bit;
    }

    public void setBit(Bitmap bit) {
        this.bit = bit;
    }





        //setters

    }

