package com.nexis.spor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bm_hesapla {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);

        Button btn = (Button) findViewById(R.id.btn_hesapla);
        final EditText boy=(EditText)findViewById(R.id.txt_boy);
        final EditText kilo=(EditText)findViewById(R.id.txt_kilo);

        final TextView label1=(TextView) findViewById (R.id.sonuc);
        final TextView label2=(TextView) findViewById (R.id.sonuc2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1= Integer.parseInt(boy.getText().toString());
                int sayi2= Integer.parseInt(kilo.getText().toString());

                int bc = sayi1*sayi1;
                int end= sayi2/bc;
                label1.setText(end);
                if (end<18.5){
                    label2.setText("Zayıf");
                }else if(18.5<end || end<25){
                    label2.setText("Normal");
                }else if (25<end || end<30){
                    label2.setText("Kilolu");
                }else{
                    label2.setText("Obez");
                }
            }
        });
    }

    private void setContentView(int bmi) {
    }
}
