package com.example.zad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText sabirak1,sabirak2,zbir;
    Button saberi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sabirak1=(EditText)findViewById(R.id.sabirak1);
        sabirak2=(EditText)findViewById(R.id.sabirak2);
        zbir=(EditText)findViewById(R.id.zbir);
        saberi=(Button)findViewById(R.id.saberi);
        saberi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zbir.setText(String.valueOf(Integer.parseInt(String.valueOf(sabirak1.getText()))+Integer.parseInt(String.valueOf(sabirak2.getText()))));

            }
        });
    }
}