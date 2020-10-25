package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view)
    {
//        displayPrice(quantity * 5);
        String priceMessage = "Total: $" + quantity*5 + "\nThank You!" ;
        displayMessage(priceMessage);
    }

    private void display(int number)
    {
        TextView quantityview = (TextView) findViewById(
                R.id.quantity_text_view
        );
        quantityview.setText("" + number);
    }

    public void increment(View view)
    {
        quantity++ ;
        display(quantity);
        displayPrice(quantity*5);
    }

    public void decrement(View view)
    {
        quantity-- ;
        display(quantity) ;
        displayPrice(quantity*5);
    }

    private void displayMessage(String message)
    {
        TextView priceview = (TextView) findViewById(R.id.price_text_view) ;
        priceview.setText(message);
    }

    private void displayPrice(int number)
    {
        TextView priceview = (TextView) findViewById(R.id.price_text_view) ;
        priceview.setText("$"+number);
    }
}