package th.ac.su.ict.klanarong.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private TextView Show;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Show = findViewById(R.id.Show);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Show.setText("235-255-221");
                Show.setBackgroundColor(Color.parseColor("#FFE9E1DE"));
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Show.setText("236-203-202");
                Show.setBackgroundColor(Color.parseColor("#ecbec4"));
            }
        });


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Show.setText("117-131-156");
                Show.setBackgroundColor(Color.parseColor("#6a7994"));
            }
        });


        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Show.setText("153-169-191");
                Show.setBackgroundColor(Color.parseColor("#8fa1b8"));
            }
        });


        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Show.setText("195-204-216");
                Show.setBackgroundColor(Color.parseColor("#bcc7d1"));
            }
        });


        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Show.setText("221-226-269");
                Show.setBackgroundColor(Color.parseColor("#dadfe3"));
            }
        });

    }
}
