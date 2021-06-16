package com.duncancodes.buttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText userInput; //storing EditText widget data in variable userInput
    private Button button; //as above, button for button
    private TextView textView; //as above etc
    private int numTimesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.note_layout);

                    //(EditText) sets the data type
        userInput =(EditText) findViewById(R.id.editText);  //findViewById returns view object and appropriate
        button = (Button) findViewById(R.id.button);        //type is assigned using casting
        textView = (TextView) findViewById(R.id.textView);  //R.id is a class which allows us to search and pass XML @+ID's
                                                            //Basically, it refers to the widget in the layout

        View.OnClickListener ourOnClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numTimesClicked++;
                String result = "\nThe button has been clicked " + numTimesClicked + " time(s)";
                textView.append(result);
            }
        };

        button.setOnClickListener(ourOnClickListener);
    }


}