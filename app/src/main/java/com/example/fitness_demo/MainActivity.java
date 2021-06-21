package com.example.fitness_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button nuevaR;
    private Button opciones;
    private Button mButtonGal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //metodo dialogo
        openDialog();
        //metodos de botones
        clicknuevaR();
        clickGal();
        clickopciones();
    }

    private void openDialog() {

        //objeto de la clase ExampleDialog
        ExampleDialog exmDlg=new ExampleDialog();
        exmDlg.show(getSupportFragmentManager(),"DIALOGO");
    }

    private void clicknuevaR(){
        //envia hacia las cajitas
        nuevaR=findViewById(R.id.button1);
        nuevaR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,nuevaPicker.class));
            }
        });
    }

    private void clickGal(){
        //envia a galeria
        mButtonGal=findViewById(R.id.button3);
        mButtonGal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Galeria.class));
            }
        });
    }


    private void clickopciones(){
       // envia a opciones
        opciones=findViewById(R.id.button2);
        opciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,opcionesPicker.class));
            }
        });
    }






}