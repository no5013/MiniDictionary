package com.example.asus.minidictionary.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.asus.minidictionary.R;
import com.example.asus.minidictionary.models.Definition;
import com.example.asus.minidictionary.models.Storage;
import com.example.asus.minidictionary.models.Word;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NewWordActivity extends AppCompatActivity {

    private Button addWordButton;
    private TextView wordField;
    private TextView pronunciationField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);
        this.initComponent();
    }

    private void initComponent(){
        wordField = (TextView)findViewById(R.id.wordField);
        pronunciationField = (TextView)findViewById(R.id.pronunciationField);
        addWordButton = (Button)findViewById(R.id.addWordButton);

        addWordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveWord(""+wordField.getText() ,""+pronunciationField.getText() , null);
                finish();
            }
        });
    }

    private void saveWord(String word,String pronunciation,ArrayList<Definition> translations){
        Word newWord = new Word(word);
        Storage.getInstance().addWord(newWord);
    }
}
