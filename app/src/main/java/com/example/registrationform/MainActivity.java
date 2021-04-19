package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import  android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3, et4;
    Spinner sp1, sp2;
    RadioGroup rg;
    RadioButton rb;
    CheckBox cb1, cb2, cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.name);
        et2 = findViewById(R.id.email);
        et3 = findViewById(R.id.number);
        sp1 = findViewById(R.id.year);
        sp2 = findViewById(R.id.branch);
        rg = findViewById(R.id.rg);
        cb1 = findViewById(R.id.tel);
        cb2 = findViewById(R.id.eng);
        cb3 = findViewById(R.id.hin);



    }

    public void register(View view) {

        String name = et1.getText().toString();
        String email = et2.getText().toString().trim();
        String number = et3.getText().toString().trim();
        String branch = sp2.getSelectedItem().toString();
        String year = sp1.getSelectedItem().toString();
        int id = rg.getCheckedRadioButtonId();
        rb =findViewById(id);
        StringBuilder sb = new StringBuilder();
        if (cb1.isChecked()) {
            sb.append("Telugu" + "");
        }
        if (cb2.isChecked()) {
            sb.append("English" + "");
        }
        if (cb3.isChecked()) {
            sb.append("Hindi" + "");
        }
        Toast.makeText(this, name+email+number+year+branch+rb.getText()+sb.toString(),Toast.LENGTH_SHORT).show();
        }

    }


