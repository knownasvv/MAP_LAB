package id.ac.umn.week04fragment_40923;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button halaman1, halaman2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        halaman1 = findViewById(R.id.main_button_change_1);
        halaman2 = findViewById(R.id.main_button_change_2);

        halaman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDua = new Intent(MainActivity.this,
                        SecondActivity.class);
                startActivityForResult(intentDua, 1);
            }
        });

        halaman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTiga = new Intent(MainActivity.this,
                        ThirdActivity.class);
                startActivityForResult(intentTiga, 1);
            }
        });
    }


}