package com.example.fitness_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class opcionesPicker extends AppCompatActivity {
public static boolean swB;
public static boolean swC;
public static boolean swI;
public static  final String SWITCH1="switch1";
public static  final String SWITCH2="switch2";
public static  final String SWITCH3="switch3";
public static  final String SHARED_PREFS="sharedPrefs";
public Switch swTips;
public Switch swCardio;
public Switch swIso;
private boolean switchOnOff;
private boolean switchOnOff2;
private boolean switchOnOff3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_picker);
        //
        swTips = findViewById(R.id.switchTips);
        swTips.setChecked(false);
        swTips.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                swB=true;
                saveData();
            } else {
                swB=false;
                Toast.makeText(getApplicationContext()," NO TIPS",Toast.LENGTH_SHORT).show();
                saveData();
            }
        });
        //

        swCardio = findViewById(R.id.switchCardio);
        swCardio.setChecked(false);
        swCardio.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                swC=true;
                saveData();
            } else {
                swC=false;
                Toast.makeText(getApplicationContext(),"NO CARDIO",Toast.LENGTH_SHORT).show();
                saveData();
            }
        });

        swIso = findViewById(R.id.switchIso);
        swIso.setChecked(false);
        swIso.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                swI=true;
                saveData();
            } else {
                swI=false;
                Toast.makeText(getApplicationContext(),"NO ISOMETRIA",Toast.LENGTH_SHORT).show();
                saveData();
            }
        });
        loadData();
        updateViews();


    }

    public void saveData(){
        SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean(SWITCH1,swTips.isChecked());
        editor.putBoolean(SWITCH2,swCardio.isChecked());
        editor.putBoolean(SWITCH3,swIso.isChecked());
        editor.apply();
     }

    public void loadData(){
        SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        switchOnOff=sharedPreferences.getBoolean(SWITCH1, false);
        switchOnOff2=sharedPreferences.getBoolean(SWITCH2, false);
        switchOnOff3=sharedPreferences.getBoolean(SWITCH3, false);
    }

    public void updateViews(){
        swCardio.setChecked(switchOnOff2);
        swIso.setChecked(switchOnOff3);
        swTips.setChecked(switchOnOff);
    }
}