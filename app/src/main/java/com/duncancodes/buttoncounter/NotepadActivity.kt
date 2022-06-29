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
import android.widget.Button
import com.duncancodes.buttoncounter.NotepadActivity

class NotepadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        setContentView(R.layout.activity_notepad)
        val btnToDash = findViewById<View>(R.id.btnBackToDash) as Button
        btnToDash.setOnClickListener { v: View? ->
            Log.d(TAG, "btnToDash clicked")
            val intent = Intent(this@NotepadActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        val TAG: String = MainActivity::class.java.name
    }
}