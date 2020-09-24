package es.iessaladilo.jgvg.pr01_what_time_is_it_jgvg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asigno a variables Ids en JAVA las Ids de mis textViews.
        TextView lblDate = findViewById(R.id.lbl_date_id);
        TextView lblTime = findViewById(R.id.lbl_time_id);

        //Creo las fechas y la hora.



    }
}