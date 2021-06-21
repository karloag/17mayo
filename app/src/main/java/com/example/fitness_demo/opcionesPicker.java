package com.example.fitness_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class opcionesPicker extends AppCompatActivity {

public static boolean swB;
public static  final String SWITCH1="switch1";
    public static  final String SHARED_PREFS="sharedPrefs";
   public Switch swTips;
    private boolean switchOnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_picker);

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

        loadData();
        updateViews();


    }

    public void saveData(){

        SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean(SWITCH1,swTips.isChecked());
        editor.apply();
     }

    public void loadData(){

        SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        switchOnOff=sharedPreferences.getBoolean(SWITCH1, false);
    }

    public void updateViews(){

        swTips.setChecked(switchOnOff);
    }
}