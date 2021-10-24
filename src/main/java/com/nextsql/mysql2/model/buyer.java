package com.nextsql.mysql2.model;

import javax.persistence.*;

@Entity
public class buyer {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int bookno;
    @Column
    private String bookname;
    @Column
    private String author;

    public long getId() {
        return id;
    }

    public int getBookno() {
        return bookno;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
