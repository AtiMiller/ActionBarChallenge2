package com.example.actionbarchallenge;

public class Book
{
    private String type;
    private String title;
    private String writer;

    public Book(String type, String title, String writer) {
        this.type = type;
        this.title = title;
        this.writer = writer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
