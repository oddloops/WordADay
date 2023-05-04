package com.example.wordaday;

public class Word {
    private final String wordText;
    private final String pronunciation;
    private final String wordDefinition;

    public Word (String wordText, String pronunciation, String wordDefinition) {
        this.wordText = wordText;
        this.pronunciation = pronunciation;
        this.wordDefinition = wordDefinition;
    }

    public String getWord() {
        return this.wordText;
    }

    public String getPronunciation() {
        return this.pronunciation;
    }

    public String getDefinition() {
        return this.wordDefinition;
    }
}
