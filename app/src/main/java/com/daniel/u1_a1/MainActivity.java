package com.daniel.u1_a1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Inicializar primer textview con Id tv
        TextView tv = findViewById(R.id.tv);
        //Ingresar texto dentro del primer textview
        tv.setText("Daniel Sanchez Rosales");

        //Inicializar segundo textview con id alumno
        TextView alumno = findViewById(R.id.alumno);
        //Ingresar texto al segundo textview haciendo llamada al contenido de String.xml
        alumno.setText(R.string.id_al);
    }
}
