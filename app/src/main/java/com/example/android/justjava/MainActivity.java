package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view)
    {
        display(32) ;
    }

    private void display(int number)
    {
        TextView quantityview = (TextView) findViewById(
                R.id.quantity_text_view
        );
        quantityview.setText("" + number);
    }
}