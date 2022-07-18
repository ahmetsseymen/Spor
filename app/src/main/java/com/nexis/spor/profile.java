package com.nexis.spor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);

        Button btn = (Button) findViewById(R.id.btn_bmi);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bmi = new Intent(MainActivity.this,bm_hesapla.class);
                startActivity();
            }

            private void startActivity() {
            }
        });

    }
}
