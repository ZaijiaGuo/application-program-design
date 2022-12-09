package com.example.lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_clock;
    private Button button;

    private Boolean flag = false;

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Bundle b = intent.getExtras();
            tv_clock.setText(String.format("%02d:%02d:%02d",b.getInt("H"),b.getInt("M"),b.getInt("S")));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_clock = findViewById(R.id.tv_clock);
        button = findViewById(R.id.button);

        registerReceiver(receiver,new IntentFilter("MyMessage"));

        flag = MyService.flag;
        if(flag)
            button.setText("暫停");
        else
            button.setText("開始");
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                flag=!flag;
                if(flag){
                    button.setText("暫停");
                    Toast.makeText(MainActivity.this,"計時開始",Toast.LENGTH_SHORT).show();
                }else{
                    button.setText("開始");
                    Toast.makeText(MainActivity.this,"計時暫停",Toast.LENGTH_SHORT).show();
                }

                startService(new Intent(MainActivity.this, MyService.class).putExtra("flag",flag));
            }
        });

    }

    @Override
    public void onDestroy(){
        super.onDestroy();

        unregisterReceiver(receiver);
    }
}