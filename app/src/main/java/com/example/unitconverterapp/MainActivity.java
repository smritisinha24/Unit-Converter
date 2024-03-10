package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextText);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "button was pressed", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pounds = kg * 2.205;
                textView.setText("The value in pounds is "+pounds);

            }
        });
    }
}
//    ------------------To use onclick using as an attribute--------------------
//        public void calculate(View view){
//        String s= editText.getText().toString();
//        int kg = Integer.parseInt(s);
//        double pounds = kg*2.205;
//        textView.setText("The value in pounds is: "+pounds);
//    }
