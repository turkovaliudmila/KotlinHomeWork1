package ru.geekbrains.kotlinhomework1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newCat = Cat("Barsik", 3, "white")

        val textView = findViewById<TextView>(R.id.text1)

        val button1 = findViewById<Button>(R.id.button1)
        button1?.setOnClickListener() {
            textView.setText("Name: ${newCat.name} Age: ${newCat.age}")
        }
    }
}
