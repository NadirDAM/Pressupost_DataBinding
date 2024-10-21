package com.example.pressupost

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import com.example.pressupost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // val calculateButton : Button = findViewById(R.id.calculate_button);
        // val editTextCostOfService : EditText = findViewById(R.id.editTextCostOfService);
        // val radioButtonTwenty : RadioButton  = findViewById(R.id.option_twenty_percent);
        // val radioButtonFifteen : RadioButton  = findViewById(R.id.option_fifteen_percent);
        // val radioButtonEigtheen : RadioButton  = findViewById(R.id.option_eigtheen_percent);

        binding.calculateButton.setOnClickListener {
            System.out.println("RadioGroupPressupost");
            val result : Float;
            if (binding.optionTwentyPercent.isChecked) {
                System.out.println(binding.editTextCostOfService.text);
               // result = Float.parseFloat(editTextCostOfService.text)
            }
            else if (binding.optionFifteenPercent.isChecked) {
                System.out.println(binding.editTextCostOfService.text);

            }
            else if (binding.optionEigtheenPercent.isChecked) {
                System.out.println(binding.editTextCostOfService.text);

            }
        }

    }
}