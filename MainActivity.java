package org.axel.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText euroInput = findViewById(R.id.EuroInput);
        Button usdButton = findViewById(R.id.USDButton);
        Button gdpButton = findViewById(R.id.GDPButton);
        TextView resultText = findViewById(R.id.ResultText);

        usdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String euroValue = euroInput.getText().toString();
                if (!euroValue.isEmpty()) {
                    double euros = Double.parseDouble(euroValue);
                    double dollars = euros * 1.05;
                    resultText.setText(String.format("$%.2f", dollars));
                } else {
                    resultText.setText("Please enter a value.");
                }
            }
        });

        gdpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String euroValue = euroInput.getText().toString();
                if (!euroValue.isEmpty()) {
                    double euros = Double.parseDouble(euroValue);
                    double pounds = euros * 0.83;
                    resultText.setText(String.format("£%.2f", pounds));
                } else {
                    return;
                }
            }
        });
    }
}
