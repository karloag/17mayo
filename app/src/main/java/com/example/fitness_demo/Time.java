package com.example.fitness_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Time extends AppCompatActivity {

    private static  String st;
    private static final Random Rndm = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_time);
        if (opcionesPicker.swB){
            String[] toastMessages = new String[] {"Respire mejor con Vick's VAPORUB®", "Despierta tus gluteos!", "El Sol es Vitamina D","Investigue sobre su flora intestinal","Duerma 8 horas continuas","Avena","Tome Lala 100®"};
            int randomMsgIndex = Rndm.nextInt(toastMessages.length - 1);
            Toast.makeText(getApplicationContext(), toastMessages[randomMsgIndex], Toast.LENGTH_LONG).show();
        }
        st=getIntent().getExtras().getString("Value");
        TextView r1=(TextView) this.findViewById(R.id.textView4);
        switch(st)
        {
            case "Fullbody":{

                r1.setText("Unico dia: Press de Banca 4x8, Sentadilla 4x8, Levantamiento pantorrilla 4xFallo, Dominada 4x8");
                ImageView iBanco=findViewById(R.id.imageView1) ;
                iBanco.setImageResource(R.drawable.bench);
                ImageView iSquat=findViewById(R.id.imageView2) ;
                iSquat.setImageResource(R.drawable.squat);
                ImageView iPant=findViewById(R.id.imageView3) ;
                iPant.setImageResource(R.drawable.calfraise);
                ImageView iDomi=findViewById(R.id.imageView4);
                iDomi.setImageResource(R.drawable.pullup);
                iBanco.setVisibility(View.VISIBLE);
                iSquat.setVisibility(View.VISIBLE);
                iPant.setVisibility(View.VISIBLE);
                iDomi.setVisibility(View.VISIBLE);
                 break;}

           case "Upper/Lower":{
                r1.setText("Dia A: Press de banca 4x8, Press sobre cabeza 4x10, Dominada 4x10\n\nDia B: Sentadilla 4x8, Patada 4x12, Levantamiento de pantorrilla 4xfallo ");

               ImageView iBanco=findViewById(R.id.imageView1) ;
               iBanco.setImageResource(R.drawable.bench);
               ImageView iMili=findViewById(R.id.imageView2) ;
               iMili.setImageResource(R.drawable.ohp);
               ImageView iDomi=findViewById(R.id.imageView3);
               iDomi.setImageResource(R.drawable.pullup);
               ImageView iSquat=findViewById(R.id.imageView4);
               iSquat.setImageResource(R.drawable.squat);
               ImageView iKick=findViewById(R.id.imageView5);
               iKick.setImageResource(R.drawable.kick);
               ImageView iPant=findViewById(R.id.imageView6) ;
               iPant.setImageResource(R.drawable.calfraise);

               iBanco.setVisibility(View.VISIBLE);
               iMili.setVisibility(View.VISIBLE);
               iDomi.setVisibility(View.VISIBLE);
               iSquat.setVisibility(View.VISIBLE);
               iKick.setVisibility(View.VISIBLE);
               iPant.setVisibility(View.VISIBLE);

               break;}


            case "ABA&BAB":{
                r1.setText("Dia A: Press de Banca 5x5,Dominada 5x5,Press sobre cabeza 4x8\n\nDia B: Sentadilla 4x8,Patada 4x12,Levantamiento de pantorrilla 4xfallo.\n\nDia C: Alterne A y B cada semana");
                ImageView iBanco=findViewById(R.id.imageView1) ;
                iBanco.setImageResource(R.drawable.bench);
                ImageView iDomi=findViewById(R.id.imageView2);
                iDomi.setImageResource(R.drawable.pullup);
                ImageView iMili=findViewById(R.id.imageView3) ;
                iMili.setImageResource(R.drawable.ohp);

                ImageView iSquat=findViewById(R.id.imageView4);
                iSquat.setImageResource(R.drawable.squat);
                ImageView iKick=findViewById(R.id.imageView5);
                iKick.setImageResource(R.drawable.kick);
                ImageView iPant=findViewById(R.id.imageView6) ;
                iPant.setImageResource(R.drawable.calfraise);

                iBanco.setVisibility(View.VISIBLE);
                iDomi.setVisibility(View.VISIBLE);
                iMili.setVisibility(View.VISIBLE);
                iSquat.setVisibility(View.VISIBLE);
                iKick.setVisibility(View.VISIBLE);
                iPant.setVisibility(View.VISIBLE);
                break;}

            case   "Pecho-Brazos / Cadena Posterior / Hombro-Espalda / Squat":{
                r1.setText("Dia A: Press banca 4x8, Chin Up 4x10, Pull over 4x12\n\nDia B:Peso muerto 1x5, Levantamiento pantorrilla 4xfallo\n\nDia C: Dominada 4x8, Press Sobre cabeza 4x8\n\n Dia D: Sentadilla 4x8  ");
                ImageView iBanco=findViewById(R.id.imageView1) ;
                iBanco.setImageResource(R.drawable.bench);
                ImageView iChin=findViewById(R.id.imageView2);
                iChin.setImageResource(R.drawable.chinup);
                ImageView iPullover=findViewById(R.id.imageView3) ;
                iPullover.setImageResource(R.drawable.pullover);
                ImageView iDiddy=findViewById(R.id.imageView4);
                iDiddy.setImageResource(R.drawable.diddy);
                ImageView iPant=findViewById(R.id.imageView5);
                iPant.setImageResource(R.drawable.calfraise);
                ImageView iDomi=findViewById(R.id.imageView6) ;
                iDomi.setImageResource(R.drawable.pullup);
                ImageView iMili=findViewById(R.id.imageView7) ;
                iMili.setImageResource(R.drawable.ohp);
                ImageView iSquat=findViewById(R.id.imageView8) ;
                iSquat.setImageResource(R.drawable.squat);
                iBanco.setVisibility(View.VISIBLE);
                iChin.setVisibility(View.VISIBLE);
                iPullover.setVisibility(View.VISIBLE);
                iDiddy.setVisibility(View.VISIBLE);
                iDomi.setVisibility(View.VISIBLE);
                iMili.setVisibility(View.VISIBLE);
                iSquat.setVisibility(View.VISIBLE);

                break;}
            case  "ABxAB" :{
               r1.setText("Dia A:Press de Banca 4x10, Dominada4x8,Press sobre cabeza 4x8,Chinup 4x8\n\nDia B: Sentadilla 4x8, Patada 4x12, Levantamiento de pantorrilla 4xfallo.");

                ImageView iBanco=findViewById(R.id.imageView1) ;
                iBanco.setImageResource(R.drawable.bench);
                ImageView iDomi=findViewById(R.id.imageView2) ;
                iDomi.setImageResource(R.drawable.pullup);
                ImageView iMili=findViewById(R.id.imageView3);
                iMili.setImageResource(R.drawable.ohp);
                ImageView iChin=findViewById(R.id.imageView4);
                iChin.setImageResource(R.drawable.chinup);
                ImageView iSquat=findViewById(R.id.imageView5) ;
                iSquat.setImageResource(R.drawable.squat);
                ImageView iKick=findViewById(R.id.imageView6);
                iKick.setImageResource(R.drawable.kick);
                ImageView iPant=findViewById(R.id.imageView7);
                iPant.setImageResource(R.drawable.calfraise);

                iBanco.setVisibility(View.VISIBLE);
                iDomi.setVisibility(View.VISIBLE);
                iMili.setVisibility(View.VISIBLE);
                iChin.setVisibility(View.VISIBLE);
                iSquat.setVisibility(View.VISIBLE);
                iKick.setVisibility(View.VISIBLE);
                iPant.setVisibility(View.VISIBLE);
                break;}

            case  "xABxAB":{
                 r1.setText("Dia A:Press de Banca 4x10, Pull up 4x8,Press sobre cabeza 4x8,Chinup 4x8,Levantamiento lateral 4x12 \n\n Dia B: Sentadilla 4x8, Patada 4x12, Levantamiento de pantorrilla 4xfallo.");

                ImageView iBanco=findViewById(R.id.imageView1) ;
                iBanco.setImageResource(R.drawable.bench);
                ImageView iDomi=findViewById(R.id.imageView2) ;
                iDomi.setImageResource(R.drawable.pullup);
                ImageView iMili=findViewById(R.id.imageView3);
                iMili.setImageResource(R.drawable.ohp);
                ImageView iChin=findViewById(R.id.imageView4);
                iChin.setImageResource(R.drawable.chinup);
                ImageView iSide=findViewById(R.id.imageView5);
                iSide.setImageResource(R.drawable.sideraise);
                ImageView iSquat=findViewById(R.id.imageView6) ;
                iSquat.setImageResource(R.drawable.squat);
                ImageView iKick=findViewById(R.id.imageView7);
                iKick.setImageResource(R.drawable.kick);
                ImageView iPant=findViewById(R.id.imageView8);
                iPant.setImageResource(R.drawable.calfraise);

                iBanco.setVisibility(View.VISIBLE);
                iDomi.setVisibility(View.VISIBLE);
                iMili.setVisibility(View.VISIBLE);
                iChin.setVisibility(View.VISIBLE);
                iSide.setVisibility(View.VISIBLE);
                iSquat.setVisibility(View.VISIBLE);
                iKick.setVisibility(View.VISIBLE);
                iPant.setVisibility(View.VISIBLE);
                break;}
            case    "ABCABC" :{
                r1.setText("Dia A: Press militar 4x10, Press banco 4x10, Chinup 4x8\n\n  Dia B: Peso Muerto, Pull up 1x5, Levantaiento lateral 4x8 \n\n Dia C: Sentadilla 4x10, Patada 4x12, Pantorilla 4xfallo");

                ImageView iMili=findViewById(R.id.imageView1);
                iMili.setImageResource(R.drawable.ohp);
                ImageView iBanco=findViewById(R.id.imageView2) ;
                iBanco.setImageResource(R.drawable.bench);
                ImageView iChin=findViewById(R.id.imageView3);
                iChin.setImageResource(R.drawable.chinup);
                ImageView iDiddy=findViewById(R.id.imageView4);
                iDiddy.setImageResource(R.drawable.diddy);
                ImageView iDomi=findViewById(R.id.imageView5) ;
                iDomi.setImageResource(R.drawable.pullup);
                ImageView iSide=findViewById(R.id.imageView6);
                iSide.setImageResource(R.drawable.sideraise);
                ImageView iSquat=findViewById(R.id.imageView7) ;
                iSquat.setImageResource(R.drawable.squat);
                ImageView iKick=findViewById(R.id.imageView8);
                iKick.setImageResource(R.drawable.kick);
                ImageView iPant=findViewById(R.id.imageView9);
                iPant.setImageResource(R.drawable.calfraise);

                iMili.setVisibility(View.VISIBLE);
                iBanco.setVisibility(View.VISIBLE);
                iChin.setVisibility(View.VISIBLE);
                iDiddy.setVisibility(View.VISIBLE);
                iDomi.setVisibility(View.VISIBLE);
                iSide.setVisibility(View.VISIBLE);
                iSquat.setVisibility(View.VISIBLE);
                iKick.setVisibility(View.VISIBLE);
                iPant.setVisibility(View.VISIBLE);}

                break;
            default:
                System.out.println("no match");

    }

}}