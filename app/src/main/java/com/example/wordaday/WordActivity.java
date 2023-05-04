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
        words.add(new Word("apple", "/ˈæpəl/", "a round fruit with red or green skin and a white inside"));
        words.add(new Word("banana", "/bəˈnænə/", "a long curved fruit with yellow skin and a soft inside"));
        words.add(new Word("cherry", "/ˈtʃɛri/", "a small round fruit with a red or black skin and a stone inside"));
        words.add(new Word("durian", "/ˈdʊriən/", "a large spiky fruit with a strong smell and a creamy inside"));
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
}
