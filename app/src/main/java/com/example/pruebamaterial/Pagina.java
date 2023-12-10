package com.example.pruebamaterial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Pagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina);

        ImageView background = findViewById(R.id.backgroundSplash);
        Glide.with(this)
                .load(R.drawable.backgroundpexels)
                .transition(DrawableTransitionOptions.withCrossFade(5000))
                .centerCrop()
                .into(background);

        TextView textForgotPassword = findViewById(R.id.forgotPassword);
        textForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showForgotPassword();
            }
        });
    }

    public void showForgotPassword() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //Cambia el texto que haya para clickar
        builder.setTitle("¿Desea volver atrás?");
        //Una vez clickas sale una alerta, pues te es el mensaje
        builder.setMessage("Introduce tu dirección de correo electrónico para restablecer la contraseña:");

        builder.setPositiveButton("Volver al Página principal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Aquí puedes manejar la lógica de enviar el correo electrónico o realizar cualquier otra acción necesaria
                Intent intent = new Intent(Pagina.this, MainActivity.class);
                startActivity(intent);
            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}