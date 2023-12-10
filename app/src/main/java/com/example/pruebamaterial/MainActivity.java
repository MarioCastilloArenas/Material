package com.example.pruebamaterial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class MainActivity extends AppCompatActivity {
    //BUSCAMOS BUILDTHEME EN GOOGLE CREAMOS LA PALETA Y EXPORTAMOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView background = findViewById(R.id.frame);
        Glide.with(this)
                .load(R.drawable.backgroundpexels)
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .centerCrop()
                .into(background);


    }

    public void changeToShow(View view){
        Intent nIntent = new Intent(MainActivity.this, Pagina.class);
        startActivity(nIntent);
    }



}