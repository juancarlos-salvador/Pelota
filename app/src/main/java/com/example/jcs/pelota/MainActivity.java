package com.example.jcs.pelota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // intent que nos hace llamar a la clase AyudaActividad
    public void ayuda(View vista){
        Intent intencion=new Intent(this, AyudaActividad.class);

        startActivity(intencion);
    }

}
