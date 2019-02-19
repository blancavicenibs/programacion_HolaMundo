package com.example.blanca.a2019_02_05_holamundo;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button2;
    EditText editText;
    TextView textView;


    public void alguienhatocadoelboton (View ptr){
        Log.d("org.blanca","Principio de alguienhatocadoelboton");

        String resultado = editText.getText().toString();

        Log.d( "org.blanca",  "esto se escribe cuando pulso el boton1" );


        textView.setText(String.valueOf(resultado.length()));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("org.blanca", "empieza onCreate");


        setContentView(R.layout.activity_main);



        button2 = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        Log.d("org.blanca", "creando boton 2");

        Button boton2 = new Button (this);
        boton2.setText("boton 2");

        Log.d("org.blanca", "creado ya boton 2, voy a añadirlo");

        ConstraintLayout ptr = findViewById(R.id.miLayout);

        Log.d( "org.blanca",  "ptr vale = " + ptr);

        ptr.addView(boton2);


        Log.d( "org.blanca",  "acabo de añadir boton2" ); //debug

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("org.blanca", "pulsado boton2");

                String respuesta = editText.getText().toString();

                textView.setText(String.valueOf(respuesta.length()));
            }
        });



        //
        //Para que el programa haga algo cuando pulso el boton
        //


        Log.d("org.blanca", "termina onCreate");


    } // onCreate
} // class
