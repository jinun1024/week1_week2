package com.example.myapplicat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.myapplicat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding


    var i =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btn.setOnClickListener{
            ++i
            Toast.makeText(this@MainActivity,i.toString(),Toast.LENGTH_SHORT).show()
        }
        binding.btn2.setOnClickListener{
            --i
            Toast.makeText(this@MainActivity,i.toString(),Toast.LENGTH_SHORT).show()
        }
        binding.btn3.setOnClickListener{
            println("jjj")
        }

    }



}