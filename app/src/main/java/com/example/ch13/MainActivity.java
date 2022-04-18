package com.example.ch13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    Button bttnAdd;
    EditText productQuantity,productName;
    TextView productID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb= new
                productQuantity=(EditText)findViewById(R.id. productQuantity);
        productName=(EditText)findViewById(R.id.productName);
        productID=(TextView)findViewById(R.id.productID);

        bttnAdd =(Button)  findViewById(R.id.button);

        bttnAdd.setOnClickListener(new View.OnClickListener());

    }
}