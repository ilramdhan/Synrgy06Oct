package com.dicoding.ticketingapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var sendDataButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendDataButton = findViewById(R.id.sendDataButton)
        sendDataButton.setOnClickListener {
            sendDataToSecondActivity()
        }
    }

    private fun sendDataToSecondActivity() {
        // Membuat intent eksplisit untuk berpindah ke SecondActivity
        val intent = Intent(this, SecondActivity::class.java)

        // Menambahkan data ke intent
        intent.putExtra("nama", "Ilham Ramadhan") // String
        intent.putExtra("umur", 21) // Integer
        intent.putExtra("sudahMenikah", false) // Boolean

        // Membuat bundle dan menambahkannya ke intent
        val bundle = Bundle()
        bundle.putString("alamat", "Klaten, Jawa Tengah")
        bundle.putInt("gaji", 5000000)
        bundle.putBoolean("sedangBekerja", true)
        intent.putExtras(bundle)

        // Memulai activity kedua
        startActivity(intent)
    }
}
