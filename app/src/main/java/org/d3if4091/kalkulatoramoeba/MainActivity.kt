package org.d3if4091.kalkulatoramoeba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import org.d3if4091.kalkulatoramoeba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHitung.setOnClickListener{hitungAmoeba()}
        binding.btnReset.setOnClickListener{reset()}
    }

    private fun hitungAmoeba(){
        var jumlahAwalAmoeba = binding.jumlahAwalAmoebaInp.text.toString().toDouble()
        var jumlahPembelahanAmoeba = binding.jumlahPembelahanAmoebaInp.text.toString().toDouble()
        var rentangWaktu = binding.rentangWaktuInp.text.toString().toDouble()
        var jangkaWaktu = binding.jangkaWaktuInp.text.toString().toDouble()

        var jumlahWaktuPembelahan = jangkaWaktu /  rentangWaktu

        var hasil = jumlahAwalAmoeba *  (Math.pow(jumlahPembelahanAmoeba, jumlahWaktuPembelahan))

        binding.hasil.text = Math.round(hasil).toString()
    }

    private fun reset(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHitung.setOnClickListener{hitungAmoeba()}
        binding.btnReset.setOnClickListener{reset()}
    }
}