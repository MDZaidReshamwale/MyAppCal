package com.example.myappcal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.editTextTextPersonName);
    }

    public void cal(View view) {
        // Toasting name of the user
        String name = nameEditText.getText().toString();
        Toast.makeText(this,"Welcome "+ name +" :)" , Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }

    public void newcal(View view) {
        String name = nameEditText.getText().toString();
        Toast.makeText(this,"Welcome "+ name +" :)" , Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Cal2.class);
        startActivity(intent);
    }
}