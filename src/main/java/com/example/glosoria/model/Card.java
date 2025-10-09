package com.example.glosoria.model;

public class Card {

    private String langOne;
    private String langTwo;
    private int timesWrong;
    private int timesRight;

    public Card(String langOne, String langTwo, int timesWrong, int timesRight) {
        this.langOne = langOne;
        this.langTwo = langTwo;
        this.timesWrong = 0;
        this.timesRight = 0;
    }

    public String getLangOne() {
        return langOne;
    }

    public void setLangOne(String langOne) {
        this.langOne = langOne;
    }

    public String getLangTwo() {
        return langTwo;
    }

    public void setLangTwo(String langTwo) {
        this.langTwo = langTwo;
    }

    public int getTimesWrong() {
        return timesWrong;
    }

    public void setTimesWrong(int timesWrong) {
        this.timesWrong = timesWrong;
    }

    public int getTimesRight() {
        return timesRight;
    }

    public void setTimesRight(int timesRight) {
        this.timesRight = timesRight;
    }
}
