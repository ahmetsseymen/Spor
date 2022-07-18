package com.nexis.spor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<btn> extends AppCompatActivity {

    Button btn;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item_home:
                Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item_profil:
                Toast.makeText(getApplicationContext(), "Profil", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimlama();


    }
        @SuppressLint("WrongViewCast")
        public void tanimlama()
        {
            btn=findViewById(R.id.ustbtn);
        }

        btn = (Button) findViewById(R.id.ustbtn);
        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent ustvucut = new Intent(MainActivity.this,ustvucutt.class);
            startActivity();
        }
    });
        Button btnn =(Button) findViewById(R.id.altbtn);
        btnn.setOnClickListener(new View.OnClickListener()){
            @Override
                    public void onClick(View v) {
                Intent altvucut = new Intent(MainActivity.this,altvucutt.class);
                startActivity();
        }
    });
}