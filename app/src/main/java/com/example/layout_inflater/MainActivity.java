package com.example.layout_inflater;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.click1);
        click1();
    }

    /* public void click1() {
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 LayoutInflater layoutInflater = getLayoutInflater();
                 LinearLayout linearLayout = findViewById(R.id.linearLayout);
                 View view1 = layoutInflater.inflate(R.layout.new_statement, null);

                 try {

                     linearLayout.addView(view1);
                 }
                 catch (Exception e){
                     Toast.makeText(MainActivity.this,"Exception",Toast.LENGTH_SHORT).show();
                 }
             }
         });
     }
 */
   /* public void click1() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater = getLayoutInflater();
                LinearLayout linearLayout = findViewById(R.id.linearLayout);
                View view1 = layoutInflater.inflate(R.layout.test, linearLayout);
            }
        });
    }*/
    public void click1() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater = getLayoutInflater();
                LinearLayout linearLayout = findViewById(R.id.linearLayout);
                View view1 = layoutInflater.inflate(R.layout.new_statement, linearLayout,true);
            }
        });
    }
}