package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity;
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val FlutterButton:Button=findViewById(R.id.button)
        FlutterButton.setOnClickListener {
            startActivity(
                FlutterActivity.createDefaultIntent(this)
            )
        }

    }
}