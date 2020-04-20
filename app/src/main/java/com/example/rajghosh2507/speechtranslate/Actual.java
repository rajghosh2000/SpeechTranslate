package com.example.rajghosh2507.speechtranslate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Actual extends AppCompatActivity implements TextToSpeech.OnInitListener {
    EditText e1;
    Button b1;
    String s1;
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual);
        tts= new TextToSpeech(Actual.this,this);
        e1=findViewById(R.id.editText2);
        b1=findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                tts.speak(s1,TextToSpeech.QUEUE_ADD,null);
            }
        });
    }

    @Override
    public void onInit(int status) {
        tts.setLanguage(Locale.ENGLISH);
        tts.setSpeechRate(0.8f);
    }
}
