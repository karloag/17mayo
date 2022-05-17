package com.example.fitness_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Galeria extends AppCompatActivity {
    ImageView iVGBench ;
    ImageView iVGCalve ;
    ImageView iVGChin ;
    ImageView iVGDiddy ;
    ImageView iVGKick ;
    ImageView iVGLat ;
    ImageView iVGOhp ;
    ImageView iVGPull ;
    ImageView iVGSide ;
    ImageView iVGSquat ;
    ImageView iVGPlank ;
    ImageView iVGAir ;
    ImageView iVGEllie ;
    TextView txtPlank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        iVGBench=findViewById(R.id.imageViewGalBench);
        iVGCalve=findViewById(R.id.imageViewGalCalve);
        iVGChin=findViewById(R.id.imageViewGalChin);
        iVGDiddy=findViewById(R.id.imageViewGalDiddy);
        iVGKick=findViewById(R.id.imageViewGalKick);
        iVGLat=findViewById(R.id.imageViewGalLat);
        iVGOhp=findViewById(R.id.imageViewGalOhp);
        iVGPull=findViewById(R.id.imageViewGalpull);
        iVGSide=findViewById(R.id.imageViewGalSide);
        iVGSquat=findViewById(R.id.imageViewGalSquat);
        if (!opcionesPicker.swC){
            iVGAir=findViewById(R.id.imgAirbike);
            iVGEllie=findViewById(R.id.imgElli);
            iVGEllie.setVisibility(View.GONE);
            iVGAir.setVisibility(View.GONE);
        }
        if (!opcionesPicker.swI){
            iVGPlank=findViewById(R.id.imgPlank);
            txtPlank=findViewById(R.id.textPlank);
            iVGPlank.setVisibility(View.GONE);
            txtPlank.setVisibility(View.GONE);
        }



    }
}