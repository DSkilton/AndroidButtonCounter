package com.duncancodes.buttoncounter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private EditText userInput; //storing EditText widget data in variable userInput
    private TextView textView; //as above etc
    private final String TEXT_CONTENTS = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: in");
        setContentView(R.layout.activity_main);

        ImageView ivNotepad = (ImageView)findViewById(R.id.imageViewNotepad);
        ivNotepad.setOnClickListener(v -> {
            Log.d(TAG, "Image view clicked");

            Intent intent = new Intent(MainActivity.this, NotepadActivity.class);
            startActivity(intent);
        });
    }


}
