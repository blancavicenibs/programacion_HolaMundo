package com.example.blanca.a2019_02_05_holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button2;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        button2 = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);



        Log.d( "prueba",  "estoy en onCreate()" ); //debug



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d( "enelboton",  "esto se escribe cuando pulso el boton" );
                

                String resultado = editText.getText().toString();
                textView.setText(String.valueOf(resultado.length()));

            }
        });



    }
}
