package com.example.glosoria.model;

public class Deck {

    private Card[] cards;
    private String title;


    public Deck(Card[] cards, String title) {
        this.cards = cards;
        this.title = title;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
