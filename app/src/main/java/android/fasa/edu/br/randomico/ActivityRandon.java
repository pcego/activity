package android.fasa.edu.br.randomico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class ActivityRandon extends AppCompatActivity {

    TextView numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randon);
    }

    public void geraRandom(View v){
        Random num = new Random();
        numero = (TextView) findViewById(R.id.numero);
        numero.setText(""+num.nextInt(99));

    }
}
