package com.example.data_passing

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.data_passing.databinding.ActivityGetDataBinding
import com.example.data_passing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
 lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btn1.setOnClickListener {
            if (binding.edt1.text.isNullOrEmpty()) {
               binding.edt1.error = "Value Required"
                Toast.makeText(this, "Enter a value", Toast.LENGTH_SHORT).show()
            }
            else if (binding.edt2.text.isNullOrEmpty()) {
                binding.edt1.error = "Value Required"
                Toast.makeText(this, "Enter a value", Toast.LENGTH_SHORT).show()
            }
            else if (binding.edt3.text.isNullOrEmpty()) {
                binding.edt1.error = "Value Required"
                Toast.makeText(this, "Enter a value", Toast.LENGTH_SHORT).show()
            }
            else if(binding.edt4.text.isNullOrEmpty()) {
                binding.edt1.error = "Value Required"
                Toast.makeText(this, "Enter a value", Toast.LENGTH_SHORT).show()
            }
            else if (binding.edt5.text.isNullOrEmpty()) {
                binding.edt1.error = "Value Required"
                Toast.makeText(this, "Enter a value", Toast.LENGTH_SHORT).show()
            }

            if( binding.edt4.text.toString()  != binding.edt5.text.toString()){
                binding.edt5.error = "Value Required"
                Toast.makeText(this,"Please the confirm the password again",Toast.LENGTH_SHORT).show()
            }


            else{

                Toast.makeText(this,"password confirmed",Toast.LENGTH_SHORT).show()
            var value = binding.edt1.text.toString()
            var value2 = binding.edt2.text.toString()
            var value3 = binding.edt3.text.toString()
            var value4 = binding.edt4.text.toString()
            var value5 = binding.edt5.text.toString()
            var intent = Intent(this, Get_data::class.java)
            intent.putExtra("key", value)
            intent.putExtra("key2", value2)
            intent.putExtra("key3", value3)
            intent.putExtra("key4", value4)
            intent.putExtra("key5", value5)
            startActivity(intent)
        }

            }

        }
    }