package com.carlos.cartelera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView movieImageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieImageview = findViewById(R.id.imagenPelicula);

        Button btnGravity = findViewById(R.id.btnGravity);
        Button btnJumanji = findViewById(R.id.btnJumanji);
        Button btnLion = findViewById(R.id.btnReyLeon);
        Button btnStar = findViewById(R.id.btnStarWars);
        Button btnOrigen = findViewById(R.id.btnOrigen);
        Button btnToy = findViewById(R.id.btnToyStori);

        btnGravity.setOnClickListener(this);
        btnJumanji.setOnClickListener(this);
        btnLion.setOnClickListener(this);
        btnStar.setOnClickListener(this);
        btnOrigen.setOnClickListener(this);
        btnToy.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int buttonId = view.getId();
        int imageId;

        switch (buttonId){
            case R.id.btnGravity:
                imageId = R.drawable.gravity;
                break;
            case R.id.btnJumanji:
                imageId = R.drawable.jumanju;
                break;
            case R.id.btnReyLeon:
                imageId = R.drawable.reyleon;
                break;
            case R.id.btnStarWars:
                imageId = R.drawable.starwars;
                break;
            case R.id.btnOrigen:
                imageId = R.drawable.origen;
                break;
            case R.id.btnToyStori:
                imageId = R.drawable.toystory;
                break;

        }


        if(imageId != 0){
            movieImageview.setImageDrawable(ContextCompat.getDrawable(this,imageId));
        }

    }
}