package com.duncancodes.buttoncounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

public class NotepadActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: " );
        setContentView(R.layout.activity_notepad);

        Button btnToDash = (Button) findViewById(R.id.btnBackToDash);
        btnToDash.setOnClickListener(v -> {
            Log.d(TAG, "btnToDash clicked");

            Intent intent = new Intent(NotepadActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }

}
