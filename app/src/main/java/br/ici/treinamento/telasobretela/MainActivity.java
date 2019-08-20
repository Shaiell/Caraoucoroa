package br.ici.treinamento.telasobretela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            buttonJogar =findViewById(R.id.buttonJogar);

            buttonJogar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);

                    int num = new Random().nextInt(2);
                    intent.putExtra("numero",num);

                    startActivity(intent);
                }
            });

    }


}