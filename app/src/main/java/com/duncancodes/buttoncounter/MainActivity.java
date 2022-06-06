package com.duncancodes.buttoncounter;

import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText userInput; //storing EditText widget data in variable userInput
    private TextView textView; //as above etc
    private static final String TAG = MainActivity.class.getName();
    private final String TEXT_CONTENTS = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: in");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.note_layout);

                    //(EditText) sets the data type
        userInput = (EditText) findViewById(R.id.editText); //findViewById returns view object and appropriate
        Button button = (Button) findViewById(R.id.button); //type is assigned using casting
        textView = (TextView) findViewById(R.id.textView);  //R.id is a class which allows us to search and pass XML @+ID's
                                                            //Basically, it refers to the widget in the layout

        userInput.getText().clear();//clears EditText
        textView.setText("");//clears TextView
        textView.setMovementMethod((new ScrollingMovementMethod()));//makes the text view scroll

        View.OnClickListener ourOnClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String result = userInput.getText().toString();
//                another way would be to use:
//                Editable e = userInput.getText();
//                result = e.toString();
                result = result + "\n";
                textView.append(result);
                userInput.setText("");// clears text on button click
            }
        };
        if(button != null) { //checks for null value
            button.setOnClickListener(ourOnClickListener);
            Log.d(TAG, "onCreate: out");
        }
    }//end of create method

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: in");
        super.onStart();
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: in");
//        String saveString = savedInstanceState.getString(TEXT_CONTENTS);//restores onSaveInstanceState
//        textView.setText(saveString); //restores text to text view
        textView.setText(savedInstanceState.getString(TEXT_CONTENTS)); //short hand of previous two lines
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: out");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: in");
        super.onDestroy();
        Log.d(TAG, "onDestroy: out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: in");
        super.onRestart();
        Log.d(TAG, "onRestart: out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        Log.d(TAG, "onSaveInstanceState: in");
        outState.putString(TEXT_CONTENTS, textView.getText().toString()); //saves whatever is in the textView so if the app
        super.onSaveInstanceState(outState);                              //change orientation, the data isn't lost
        Log.d(TAG, "onSaveInstanceState: out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: in");
        super.onPause();
        Log.d(TAG, "onPause: out");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: in");
        super.onResume();
        Log.d(TAG, "onResume: out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: in");
        super.onStop();
        Log.d(TAG, "onStop: out");
    }
}