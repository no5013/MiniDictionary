package com.example.asus.minidictionary.models;

/**
 * Created by WIT on 01-Mar-16.
 */
public enum PartOfSpeech {

    NOUN("noun"),
    PRONOUN("pronoun"),
    VERB("verb"),
    ADVERB("adverb"),
    ADJECTIVE("adjective"),
    PREPOSITION("preposition"),
    CONJUNCTION("conjunction"),
    INTERJECTION("interjection");

    private String name;
    PartOfSpeech(String name){this.name=name;}

    @Override
    public String toString() {
        return name;
    }
}
