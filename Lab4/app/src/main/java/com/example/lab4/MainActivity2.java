package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


public class MainActivity2 extends AppCompatActivity {

    private Button send_btn;
    private EditText set_drink;
    private RadioGroup rg1,rg2;

    private String suger = "無糖";
    private String ice_opt = "去冰";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rg1 = findViewById(R.id.sweet);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case R.id.none:
                        suger = "無糖";
                        break;
                    case R.id.few:
                        suger = "少糖";
                        break;
                    case R.id.half:
                        suger = "半糖";
                        break;
                    case R.id.normal:
                        suger = "全糖";
                        break;
                }
            }
        });

        rg2 = findViewById(R.id.ice);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case R.id.noneice:
                        ice_opt = "去冰";
                        break;
                    case R.id.fewice:
                        ice_opt = "微冰";
                        break;
                    case R.id.halfice:
                        ice_opt = "少冰";
                        break;
                    case R.id.normalice:
                        ice_opt = "正常冰";
                        break;
                }
            }
        });

        send_btn = findViewById(R.id.send);
        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set_drink = findViewById(R.id.drink);
                String drink = set_drink.getText().toString();
                Intent i = new Intent();
                Bundle b = new Bundle();
                b.putString("suger",suger);
                b.putString("drink",drink);
                b.putString("ice",ice_opt);
                i.putExtras(b);
                setResult(101,i);
                finish();
            }
        });
    }
}