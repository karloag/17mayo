package com.example.fitness_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class nuevaPicker extends AppCompatActivity {
    CheckedTextView checkedTextView1;
    CheckedTextView checkedTextView2;
    CheckedTextView checkedTextView3;
    CheckedTextView checkedTextView4;
    CheckedTextView checkedTextView5;
    CheckedTextView checkedTextView6;
    CheckedTextView checkedTextView7;
    Button mButtonOk;
    String st;
    public  int total;
    String[] dias = new String[]{"yyyyy","","","","","",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_picker);
        checkedTextView1= (CheckedTextView)findViewById(R.id.checkedTextView1);
        checkedTextView2= (CheckedTextView)findViewById(R.id.checkedTextView2);
        checkedTextView3= (CheckedTextView)findViewById(R.id.checkedTextView3);
        checkedTextView4= (CheckedTextView)findViewById(R.id.checkedTextView4);
        checkedTextView5= (CheckedTextView)findViewById(R.id.checkedTextView5);
        checkedTextView6= (CheckedTextView)findViewById(R.id.checkedTextView6);
        checkedTextView7= (CheckedTextView)findViewById(R.id.checkedTextView7);
        mButtonOk=(Button)findViewById(R.id.buttonOk);
        mButtonOk.setEnabled(false);
         TextView textView3= this.findViewById(R.id.textView3);
         textView3.setVisibility(TextView.INVISIBLE);
        checkedTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkedTextView1.isChecked())
                {
                    checkedTextView1.setChecked(false);
                    //textView2.setText("OFF");
                    dias[0]=".";
                    decrease();
                }
                else{
                    checkedTextView1.setChecked(true);
                   // textView2.setText("ON");
                    dias[0]="Lunes";
                    increase();

                }
               // printarray();
            }
        });
        checkedTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkedTextView2.isChecked())
                {
                    checkedTextView2.setChecked(false);
                 //   textView2.setText("OFF");
                    dias[1]=".";
                    decrease();
                }
                else{
                    checkedTextView2.setChecked(true);
                  //  textView2.setText("ON");
                    dias[1]="Martes";
                    increase();
                }
               // printarray();
            }
        });
        checkedTextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkedTextView3.isChecked())
                {
                    checkedTextView3.setChecked(false);
                  //  textView2.setText("OFF");
                    dias[2]=".";
                    decrease();
                }
                else{
                    checkedTextView3.setChecked(true);
                   // textView2.setText("ON");
                    dias[2]="Miercoles";
                    increase();
                }
               // printarray();
            }
        });
        checkedTextView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkedTextView4.isChecked())
                {
                    checkedTextView4.setChecked(false);
                   // textView2.setText("OFF");
                    dias[3]=".";
                    decrease();
                }
                else{
                    checkedTextView4.setChecked(true);
                  //  textView2.setText("ON");
                    dias[3]="Jueves";
                    increase();
                }
              //  printarray();
            }
        });
        checkedTextView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkedTextView5.isChecked())
                {
                    checkedTextView5.setChecked(false);
                    //textView2.setText("OFF");
                    dias[4]=".";
                    decrease();
                }
                else{
                    checkedTextView5.setChecked(true);
                   // textView2.setText("ON");
                    dias[4]="Viernes";
                    increase();
                }
              //  printarray();
            }
        });
        checkedTextView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkedTextView6.isChecked())
                {
                    checkedTextView6.setChecked(false);
                  //  textView2.setText("OFF");
                    dias[5]=".";
                    decrease();
                }
                else{
                    checkedTextView6.setChecked(true);
                  //  textView2.setText("ON");
                    dias[5]="Sabado";
                    increase();
                }
              //  printarray();
            }
        });
        checkedTextView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkedTextView7.isChecked())
                {
                    checkedTextView7.setChecked(false);
                   // textView2.setText("OFF");
                    dias[6]=".";
                    decrease();

                }
                else{
                    checkedTextView7.setChecked(true);
                  //  textView2.setText("ON");
                    dias[6]="Domingo";
                    increase();
                }
              //  printarray();
            }
        });

        mButtonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i=new Intent(nuevaPicker.this,Time.class);

                st=textView3.getText().toString();
                i.putExtra("Value",st);
                startActivity(i);

            }
        });
    }

    private void increase() {
       TextView textView3=this.findViewById(R.id.textView3);
        total++;
       // textView3.setText(String.valueOf(total));
        int x = total;
        switch (x) {
            case 1:
                textView3.setText("Fullbody");
                break;
            case 2:
                textView3.setText("Upper/Lower");
                break;
            case 3:
                textView3.setText("ABA&BAB");
                break;
            case 4:
                textView3.setText("Pecho-Brazos / Cadena Posterior / Hombro-Espalda / Squat");
                break;
            case 5:
                textView3.setText("ABxAB");
                break;
            case 6:
                textView3.setText("xABxAB");
                break;
            case 7:
                textView3.setText("ABCABC");
                break;

            default:     textView3.setText(" ");
        }

        if (total!=0){
            mButtonOk.setEnabled(true);

        }
        else{ mButtonOk.setEnabled(false);}


    }
    private void decrease() {



        TextView textView3=(TextView) this.findViewById(R.id.textView3);
        total--;
        //textView3.setText(String.valueOf(total));
        int x = total;
        if (total!=0){
            mButtonOk.setEnabled(true);

        }
        else{ mButtonOk.setEnabled(false);}
        switch (x) {
            case 1:
                textView3.setText("Fullbody");
                break;
            case 2:
                textView3.setText("Upper/Lower");
                break;
            case 3:
                textView3.setText("ABA&BAB");
                break;
            case 4:
                textView3.setText("Pecho-Brazos / Cadena Posterior / Hombro-Espalda / Squat");
                break;
            case 5:
                textView3.setText("ABxAB");
                break;
            case 6:
                textView3.setText("xABxAB");
                break;
            case 7:
                textView3.setText("ABCABC");
                break;

            default:     textView3.setText(" ");
        }

    }

}