package com.duncancodes.buttoncounter

import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import com.duncancodes.buttoncounter.ButtonCounterActivity
import com.duncancodes.buttoncounter.R
import android.text.method.ScrollingMovementMethod
import com.duncancodes.buttoncounter.MainActivity
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.duncancodes.buttoncounter.NotepadActivity

class MainActivity : AppCompatActivity() {
    private val userInput : EditText? = null //storing EditText widget data in variable userInput
    private val textView : TextView? = null //as above etc
    private val TEXT_CONTENTS = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: in")
        setContentView(R.layout.activity_main)
        val ivNotepad = findViewById<View>(R.id.imageViewNotepad) as ImageView
        ivNotepad.setOnClickListener { v: View? ->
            Log.d(TAG, "Image view clicked")
            val intent = Intent(this@MainActivity, NotepadActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.name
    }
}