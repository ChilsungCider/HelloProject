package org.example;

public class Word {
    private String name; // 접근한정자 : default (없음)
    private String meaning; // 접근한정자 : private

    public Word(String name, String meaning) {
        this.name = name;
        this.meaning = meaning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

}
