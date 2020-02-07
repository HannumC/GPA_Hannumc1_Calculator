package edu.montclair.www.gpa_hannumc1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate_gpa(View v)
    {
        TextView gpa1 = findViewById(R.id.GPAInput1);
        TextView gpa2 = findViewById(R.id.GPAInput2);
        TextView gpa3 = findViewById(R.id.GPAInput3);
        TextView gpa4 = findViewById(R.id.GPAInput4);
        TextView gpa5 = findViewById(R.id.GPAInput5);




//        TextView tv = findViewById(R.id.msg);
//        tv.setText("clicked");
//
//        if (counter%2 == 1)
//        {
//            tv.setText("counter is" +counter + "and it is odd");
//        }else
//        {
//            tv.setText("counter is" +counter + "and it is even");
//        }
//
//        counter++;
    }
}
