package com.example.lab4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    lateinit var send_btn: Button
    lateinit var set_drink: EditText
    lateinit var rg1: RadioGroup
    lateinit var rg2: RadioGroup
    var suger = "無糖"
    var ice_opt = "去冰"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        rg1 = findViewById(R.id.sweet)
        rg1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, i ->
            when (i) {
                R.id.none -> suger = "無糖"
                R.id.few -> suger = "少糖"
                R.id.half -> suger = "半糖"
                R.id.normal -> suger = "全糖"
            }
        })
        rg2 = findViewById(R.id.ice)
        rg2.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, i ->
            when (i) {
                R.id.noneice -> ice_opt = "去冰"
                R.id.fewice -> ice_opt = "微冰"
                R.id.halfice -> ice_opt = "少冰"
                R.id.normalice -> ice_opt = "正常冰"
            }
        })
        send_btn = findViewById(R.id.send)
        send_btn.setOnClickListener(View.OnClickListener {
            set_drink = findViewById(R.id.drink)
            val drink = set_drink.getText().toString()
            val i = Intent()
            val b = Bundle()
            b.putString("suger", suger)
            b.putString("drink", drink)
            b.putString("ice", ice_opt)
            i.putExtras(b)
            setResult(101, i)
            finish()
        })
    }
}