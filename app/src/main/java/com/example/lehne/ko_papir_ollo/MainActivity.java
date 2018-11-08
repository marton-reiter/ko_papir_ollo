package com.example.lehne.ko_papir_ollo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button Button_ko; Button Button_papir; Button Button_ollo;
    private TextView Text_1; TextView Text_2; TextView eredmeny;
    private ImageView Im_1; ImageView Im_2;
    int ember =0; int computer=0; int randomszam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



        Button_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Im_1.setBackgroundResource(R.drawable.rock);
                randomszam = new Random().nextInt(3) + 1;
                switch (randomszam)
                {
                    case 3:
                        Im_2.setBackgroundResource(R.drawable.scissors);
                        Toast.makeText(MainActivity.this, "Kő erősebb, mint az olló. Nyertél!", Toast.LENGTH_SHORT).show();
                        ember++;
                        break;
                    case 2:
                        Im_2.setBackgroundResource(R.drawable.paper);
                        Toast.makeText(MainActivity.this, "Papír erősebb, mint a kő. Robot nyert!", Toast.LENGTH_SHORT).show();
                        computer++;
                        break;
                    case 1:
                        Im_2.setBackgroundResource(R.drawable.rock);
                        Toast.makeText(MainActivity.this, "Döntetlen. Senki nem nyert!", Toast.LENGTH_SHORT).show();
                        break;
                }
                eredmeny.setText("Eredmény: Ember:"+ember+" Computer:"+ computer);
            }
        });

        Button_papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Im_1.setBackgroundResource(R.drawable.paper);
                randomszam = new Random().nextInt(3) + 1;
                switch (randomszam)
                {
                    case 3:
                        Im_2.setBackgroundResource(R.drawable.scissors);
                        Toast.makeText(MainActivity.this, "Olló erősebb, mint a papír. Robot nyert!", Toast.LENGTH_SHORT).show();
                        computer++;
                        break;
                    case 2:
                        Im_2.setBackgroundResource(R.drawable.paper);
                        Toast.makeText(MainActivity.this, "Döntetlen. Senki nem nyert!", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Im_2.setBackgroundResource(R.drawable.rock);
                        Toast.makeText(MainActivity.this, "Papír erősebb, mint a kő. Nyertél!", Toast.LENGTH_SHORT).show();
                        ember++;
                        break;
                }
                eredmeny.setText("Eredmény: Ember:"+ember+" Computer:"+ computer);
            }
        });

        Button_ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Im_1.setBackgroundResource(R.drawable.scissors);
                randomszam = new Random().nextInt(3) + 1;
                switch (randomszam)
                {
                    case 3:
                        Im_2.setBackgroundResource(R.drawable.scissors);
                        Toast.makeText(MainActivity.this, "Döntetlen. Senki nem nyert!", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Im_2.setBackgroundResource(R.drawable.paper);
                        Toast.makeText(MainActivity.this, "Olló erősebb, mint a papír. Nyertél!", Toast.LENGTH_SHORT).show();
                        ember++;
                        break;
                    case 1:
                        Im_2.setBackgroundResource(R.drawable.rock);
                        Toast.makeText(MainActivity.this, "Kő erősebb, mint az olló. Robot nyert!", Toast.LENGTH_SHORT).show();
                        computer++;
                        break;
                }
                eredmeny.setText("Eredmény: Ember:"+ember+" Computer:"+ computer);
            }
        });
    }

    private void init() {
        Button_ko = (Button) findViewById(R.id.Button_ko);
        Button_papir = (Button) findViewById(R.id.Button_papir);
        Button_ollo = (Button) findViewById(R.id.Button_ollo);
        Text_1 = (TextView) findViewById(R.id.Text_1);
        Text_2 = (TextView) findViewById(R.id.Text_2);
        eredmeny = (TextView) findViewById(R.id.eredmeny);
        Im_1 = (ImageView) findViewById(R.id.Im_1);
        Im_2 = (ImageView) findViewById(R.id.Im_2);
    }
}


