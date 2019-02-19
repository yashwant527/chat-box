package com.londonappbrewery.flashchatnewfirebase;

import android.support.annotation.Keep;

import java.io.Serializable;
@Keep
class InstantMessage implements Serializable {

     String message;
     String author;

    InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {

    }

    public  String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
