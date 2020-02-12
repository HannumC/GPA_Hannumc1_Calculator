package edu.montclair.www.gpa_hannumc1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView dspGPA = findViewById(R.id.DispGPA);
        final Button calcGPA = findViewById(R.id.CalcGPA);
        calcGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get values from textviews
                TextView gpa1 = findViewById(R.id.GPAInput1);
                TextView gpa2 = findViewById(R.id.GPAInput2);
                TextView gpa3 = findViewById(R.id.GPAInput3);
                TextView gpa4 = findViewById(R.id.GPAInput4);
                TextView gpa5 = findViewById(R.id.GPAInput5);

                gpa1.setBackgroundColor(Color.WHITE);
                gpa2.setBackgroundColor(Color.WHITE);
                gpa3.setBackgroundColor(Color.WHITE);
                gpa4.setBackgroundColor(Color.WHITE);
                gpa5.setBackgroundColor(Color.WHITE);

                // convert textview values to string
                String strGPA1 = gpa1.getText().toString();
                String strGPA2 = gpa2.getText().toString();
                String strGPA3 = gpa3.getText().toString();
                String strGPA4 = gpa4.getText().toString();
                String strGPA5 = gpa5.getText().toString();


                if (strGPA1.matches("")) {
                    gpa1.setBackgroundColor(Color.RED);
                } else if (strGPA2.matches("")) {
                    gpa2.setBackgroundColor(Color.RED);
                } else if (strGPA3.matches("")) {
                    gpa3.setBackgroundColor(Color.RED);
                } else if (strGPA4.matches("")) {
                    gpa4.setBackgroundColor(Color.RED);
                } else if (strGPA5.matches("")) {
                    gpa5.setBackgroundColor(Color.RED);
                } else {
                    // convert textview values to int
                    int intGPA1 = Integer.parseInt(strGPA1);
                    int intGPA2 = Integer.parseInt(strGPA2);
                    int intGPA3 = Integer.parseInt(strGPA3);
                    int intGPA4 = Integer.parseInt(strGPA4);
                    int intGPA5 = Integer.parseInt(strGPA5);

                    // calculate GPA
                    float GPA = (intGPA1 + intGPA2 + intGPA3 + intGPA4 + intGPA5) / 5;


                    TextView dspGPA = findViewById(R.id.DispGPA);
                    dspGPA.setText(Float.toString(GPA));

                    calcGPA.setText("clear form");

                    View background = findViewById(R.id.InputView);
                    View root = background.getRootView();

                    if (GPA < 61) {
                        root.setBackgroundColor(Color.RED);
                    } else if (GPA >= 61 && GPA < 80) {
                        root.setBackgroundColor(Color.YELLOW);
                    } else {
                        root.setBackgroundColor(Color.GREEN);
                    }
                }
            }
        });
    }
}
