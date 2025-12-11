package com.example.glosoria.Enteties;

import jakarta.persistence.*;

@Entity
@Table(name = "cards")

public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String langOne;
    private String langTwo;
    private int timesWrong;
    private int timesRight;



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
