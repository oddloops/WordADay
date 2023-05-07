package com.example.wordaday;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class WordActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView wordTextView;
    private TextView pronunciationTextView;
    private TextView definitionTextView;

    private final ArrayList<Word> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordTextView = findViewById(R.id.word_textview);
        pronunciationTextView = findViewById(R.id.pronunciation_textview);
        definitionTextView = findViewById(R.id.definition_textview);
        Button randomWordButton = findViewById(R.id.random_word_button);
        randomWordButton.setOnClickListener(this);

        // Add some Word objects to the ArrayList
        words.add(new Word("Discombobulate", "/dɪskəmˈbɒbjʊleɪt/", "to confuse or disconcert; upset; frustrate"));
        words.add(new Word("Discombobulate", "/dɪskəmˈbɒbjʊleɪt/", "to confuse or disconcert; upset; frustrate"));
        words.add(new Word("Ephemeral", "/ɪˈfɛmərəl/", "lasting a very short time; short-lived; transitory"));
        words.add(new Word("Superfluous", "/suːˈpɜːflʊəs/", "being more than is sufficient or required; excessive; unnecessary"));
        words.add(new Word("Conundrum", "/kəˈnʌndrəm/", "a riddle, the answer to which involves a pun or play on words; an enigma; a mystery"));
        words.add(new Word("Ubiquitous", "/juːˈbɪkwɪtəs/", "present, appearing, or found everywhere; omnipresent"));
        words.add(new Word("Solace", "/ˈsɒlɪs/", "comfort in sorrow, misfortune, or distress; consolation"));
        words.add(new Word("Magnanimous", "/mæɡˈnænɪməs/", "generous in forgiving an insult or injury; unselfish; noble; high-minded"));
        words.add(new Word("Esoteric", "/ˌɛsəʊˈtɛrɪk/", "intended for or likely to be understood by only a small number of people with a specialized knowledge or interest; obscure; arcane"));
        words.add(new Word("Esoteric", "/ˌɛsəʊˈtɛrɪk/", "intended for or likely to be understood by only a small number of people with a specialized knowledge or interest; obscure; arcane"));
    }

    @Override
    public void onClick(View v) {
        // Choose a random Word object from the ArrayList
        Random random = new Random();
        Word randomWord = words.get(random.nextInt(words.size()));

        // Update TextViews with random Word object's information
        wordTextView.setText(randomWord.getWord());
        pronunciationTextView.setText(randomWord.getPronunciation());
        definitionTextView.setText(randomWord.getDefinition());
    }

    public static class Word {
        final String wordText;
        final String pronunciation;
        final String defintionText;

        Word (String wordText, String pronunciation, String defintionText) {
            this.wordText = wordText;
            this.pronunciation = pronunciation;
            this.defintionText = defintionText;
        }

        public String getWord() {
            return this.wordText;
        }

        public String getPronunciation () {
            return this.pronunciation;
        }

        public String getDefinition() {
            return this.defintionText;
        }
    }
}
