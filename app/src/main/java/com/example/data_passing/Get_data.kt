package com.example.data_passing

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.data_passing.databinding.ActivityGetDataBinding

class Get_data : AppCompatActivity() {
    lateinit var binding: ActivityGetDataBinding
    var data=""
    var data2=""
    var data3=""
    var data4=""
    var data5=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityGetDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        data= intent.getStringExtra("key").toString()
        Log.e("data", "onCreate: $data", )
        binding.gettext1.text=data


        data2= intent.getStringExtra("key2").toString()
        Log.e("data2", "onCreate: $data2", )
        binding.gettext2.text=data2


        data3= intent.getStringExtra("key3").toString()
        Log.e("data3", "onCreate: $data3", )
        binding.gettext3.text=data3


        data4= intent.getStringExtra("key4").toString()
        Log.e("data4", "onCreate: $data4", )
        binding.gettext4.text=data4


        data5= intent.getStringExtra("key5").toString()
        Log.e("data", "onCreate: $data5", )
        binding.gettext5.text=data5
    }
}