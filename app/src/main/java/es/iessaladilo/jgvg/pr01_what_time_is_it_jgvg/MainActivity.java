package es.iessaladilo.jgvg.pr01_what_time_is_it_jgvg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView lblDate = findViewById(R.id.lbl_date_id);
        TextView lblTime = findViewById(R.id.lbl_time_id);

        Date date = new Date();

        SimpleDateFormat patternDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat patternTime = new SimpleDateFormat("H:mm");

        lblDate.setText(patternDate.format( date.getTime()));
        lblTime.setText(patternTime.format( date.getTime()));

    }
}