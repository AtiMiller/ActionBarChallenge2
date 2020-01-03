package com.example.actionbarchallenge;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
    public static ArrayList<Book> books;

    @Override
    public void onCreate() {
        super.onCreate();

        books = new ArrayList<Book>();

        books.add(new Book("SciFi", "Twilight", "Stephenie Meyer"));
        books.add(new Book("Drama", "Pride and Prejudice", "Jane Austine"));
        books.add(new Book("SciFi", "Lord of the Rings", "J.R.R.Tolkien"));
        books.add(new Book("Romance", "The Notebook", "Nicholas Sparks"));
        books.add(new Book("Romance", "The fault in our stars", "John Green"));


    }
}
