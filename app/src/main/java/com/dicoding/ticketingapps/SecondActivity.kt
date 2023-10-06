package com.dicoding.ticketingapps
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var namaTextView: TextView
    private lateinit var umurTextView: TextView
    private lateinit var menikahTextView: TextView
    private lateinit var alamatTextView: TextView
    private lateinit var gajiTextView: TextView
    private lateinit var bekerjaTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Mendapatkan data dari intent
        val intent = intent
        val nama = intent.getStringExtra("nama")
        val umur = intent.getIntExtra("umur", 0)
        val sudahMenikah = intent.getBooleanExtra("sudahMenikah", false)

        // Mendapatkan bundle dari intent
        val bundle = intent.extras
        val alamat = bundle?.getString("alamat")
        val gaji = bundle?.getInt("gaji", 0)
        val sedangBekerja = bundle?.getBoolean("sedangBekerja", false)

        // Menampilkan data di TextView
        namaTextView = findViewById(R.id.namaTextView)
        umurTextView = findViewById(R.id.umurTextView)
        menikahTextView = findViewById(R.id.menikahTextView)
        alamatTextView = findViewById(R.id.alamatTextView)
        gajiTextView = findViewById(R.id.gajiTextView)
        bekerjaTextView = findViewById(R.id.bekerjaTextView)

        namaTextView.text = "Nama: $nama"
        umurTextView.text = "Umur: $umur"
        menikahTextView.text = "Menikah: $sudahMenikah"
        alamatTextView.text = "Alamat: $alamat"
        gajiTextView.text = "Gaji: $gaji"
        bekerjaTextView.text = "Sedang Bekerja: $sedangBekerja"
    }
}