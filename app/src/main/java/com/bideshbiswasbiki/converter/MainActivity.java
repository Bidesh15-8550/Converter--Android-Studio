package com.bideshbiswasbiki.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12;
    Button btnn, aboutBtn;
    Double res;
    TextView tvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvv = findViewById(R.id.tv);
        edt = findViewById(R.id.edt);
        r1 = findViewById(R.id.b1);
        r2 = findViewById(R.id.b2);
        r3 = findViewById(R.id.b3);
        r4 = findViewById(R.id.b4);
        r5 = findViewById(R.id.b5);
        r6 = findViewById(R.id.b6);
        r7 = findViewById(R.id.b7);
        r8 = findViewById(R.id.b8);
        r9 = findViewById(R.id.b9);
        r10 = findViewById(R.id.b10);
        r11 = findViewById(R.id.b11);
        r12 = findViewById(R.id.b12);
        btnn = findViewById(R.id.btn);
        aboutBtn=findViewById(R.id.aboutBtn);

        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double value = new Double(edt.getText().toString());

                if (r1.isChecked()) {
                    res = converterr.cm(value);
                    tvv.setText(new Double(res).toString());
                }
                else if (r2.isChecked()) {
                    res = converterr.m(value);
                    tvv.setText(new Double(res).toString());
                }
                else if (r3.isChecked()) {
                    res = converterr.f(value);
                    tvv.setText(new Double(res).toString());
                }
                else if (r4.isChecked()) {
                    res = converterr.cl(value);
                    tvv.setText(new Double(res).toString());
                }
                else if (r5.isChecked()) {
                    res = converterr.doller(value);
                    tvv.setText(new Double(res).toString());
                }
                else if (r6.isChecked()) {
                    res = converterr.taka(value);
                    tvv.setText(new Double(res).toString());
                }

                else if (r7.isChecked()) {
                    res = converterr.km(value);
                    tvv.setText(new Double(res).toString());
                }
                else if (r8.isChecked()) {
                    res = converterr.me(value);
                    tvv.setText(new Double(res).toString());
                }

                else if (r9.isChecked()) {
                    res = converterr.kg(value);
                    tvv.setText(new Double(res).toString());
                }
                else if (r10.isChecked()) {
                    res = converterr.gm(value);
                    tvv.setText(new Double(res).toString());
                }
                else if (r11.isChecked()) {
                    res = converterr.tk(value);
                    tvv.setText(new Double(res).toString());
                }
                else if (r12.isChecked()) {
                    res = converterr.euro(value);
                    tvv.setText(new Double(res).toString());
                }

                else {
                    System.out.println("Invalid Input");

                }
            }
        });


    }
}
