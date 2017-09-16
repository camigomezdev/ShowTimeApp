package co.edu.udea.mariacamilagomez.mypionerasapp;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hora = (TextView) findViewById(R.id.hora);
    }

    public void cambiarMensaje(View v){
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        Date fechaActual = Calendar.getInstance().getTime();

        String s = formato.format(fechaActual);
        hora.setText(String.format("Hora Actual: %s", s));
    }
}
