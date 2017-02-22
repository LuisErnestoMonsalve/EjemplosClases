package co.edu.udea.compumovil.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.button);
        btn2.setOnClickListener(this);




    /*    btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "onClick Button");
                Toast.makeText(MainActivity.this, "Mensaje", Toast.LENGTH_SHORT).show();

            }
        });*/
    }
/*
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Log.d("MainActivity", "onClick Button1");
                Toast.makeText(MainActivity.this, "Mensaje", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Log.d("MainActivity", "onClick Button2");
                Toast.makeText(MainActivity.this, "Otro Mensaje", Toast.LENGTH_SHORT).show();

                break;
        }
    }*/

    public void onClickButton(View v){
        Log.d("MainActivity", "onClick Button1");
        Toast.makeText(MainActivity.this, "Mensaje", Toast.LENGTH_SHORT).show();
    }
    public void onClickButton2(View v){
        Log.d("MainActivity", "onClick Button1");
        Toast.makeText(MainActivity.this, "Otro Mensaje", Toast.LENGTH_SHORT).show();
    }
}
