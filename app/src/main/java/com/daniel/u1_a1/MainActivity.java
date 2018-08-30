package com.daniel.u1_a1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = findViewById(R.id.tv);
        tv.setText("Daniel Sanchez Rosales");
        setContentView(R.layout.activity_main);
    }
}
