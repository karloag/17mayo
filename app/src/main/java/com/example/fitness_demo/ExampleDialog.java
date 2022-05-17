package com.example.fitness_demo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
       //objeto dialogo
        AlertDialog.Builder bildr = new AlertDialog.Builder(getActivity());
        bildr.setTitle("Atención ");
        bildr.setMessage("Consulte siempre a su medico antes de cambiar su dieta o empezar un programa de ejercicios.\n Por este medio asumo completa responsabilidad de cualquier y toda lesión, perdida o daños en las que incurra como consecuencia de el uso de esta aplicación, renuncio a cualquier acción legal en contra de los desarrolladores de esta aplicación.");

        //boton
        bildr.setPositiveButton("Acepto", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            // se cierra solo
            }
        });

        //objeto
return bildr.create();
    }
}
