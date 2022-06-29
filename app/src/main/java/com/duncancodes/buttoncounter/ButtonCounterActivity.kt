package com.duncancodes.buttoncounter

import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button

class ButtonCounterActivity : AppCompatActivity() {
    private val TEXT_CONTENTS: String = ""
    private var userInput: EditText? = null
    private var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: in")
        setContentView(R.layout.activity_button_counter)
        setContentView(R.layout.activity_notepad)

        //(EditText) sets the data type
        userInput =
            findViewById<View>(R.id.editText) as EditText //findViewById returns view object and appropriate
        val button = findViewById<View>(R.id.button) as Button //type is assigned using casting
        textView =
            findViewById<View>(R.id.textView) as TextView //R.id is a class which allows us to search and pass XML @+ID's
        //Basically, it refers to the widget in the layout
        userInput!!.text.clear() //clears EditText
        textView!!.text = "" //clears TextView
        textView!!.movementMethod = ScrollingMovementMethod() //makes the text view scroll
        val ourOnClickListener = View.OnClickListener {
            var result = userInput!!.text.toString()
            //                another way would be to use:
//                Editable e = userInput.getText();
//                result = e.toString();
            result = """
                  $result
                  
                  """.trimIndent()
            textView!!.append(result)
            userInput!!.setText("") // clears text on button click
        }
        if (button != null) { //checks for null value
            button.setOnClickListener(ourOnClickListener)
            Log.d(TAG, "onCreate: out")
        }
    } //end of create method

    override fun onStart() {
        Log.d(TAG, "onStart: in")
        super.onStart()
        Log.d(TAG, "onStart: out")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onRestoreInstanceState: in")
        //        String saveString = savedInstanceState.getString(TEXT_CONTENTS);//restores onSaveInstanceState
//        textView.setText(saveString); //restores text to text view
        textView!!.text =
            savedInstanceState.getString(TEXT_CONTENTS) //short hand of previous two lines
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState: out")
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: in")
        super.onDestroy()
        Log.d(TAG, "onDestroy: out")
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart: in")
        super.onRestart()
        Log.d(TAG, "onRestart: out")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState: in")
        outState.putString(
            TEXT_CONTENTS,
            textView!!.text.toString()
        ) //saves whatever is in the textView so if the app
        super.onSaveInstanceState(outState) //change orientation, the data isn't lost
        Log.d(TAG, "onSaveInstanceState: out")
    }

    override fun onPause() {
        Log.d(TAG, "onPause: in")
        super.onPause()
        Log.d(TAG, "onPause: out")
    }

    override fun onResume() {
        Log.d(TAG, "onResume: in")
        super.onResume()
        Log.d(TAG, "onResume: out")
    }

    override fun onStop() {
        Log.d(TAG, "onStop: in")
        super.onStop()
        Log.d(TAG, "onStop: out")
    }

    companion object {
        val TAG = ButtonCounterActivity::class.java.name
    }
}