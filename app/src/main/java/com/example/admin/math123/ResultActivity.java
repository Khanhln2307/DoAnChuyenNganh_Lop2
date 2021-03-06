package com.example.admin.math123;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResultActivity extends AppCompatActivity {
    int point;
    int Layout;
    TextView textPoint;
    TextView textFalse;
    TextView textTrue;
    Button btnNext;
    String[] temp = new String[10];
    String Filename;
    String b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        temp[0] = "";
        temp[1] = "";
        temp[2] = "";
        temp[3] = "";
        temp[4] = "";
        temp[5] = "";
        temp[6] = "";
        temp[7] = "";
        temp[8] = "";
        temp[9] = "";

        Intent intent = this.getIntent();
        point = Integer.parseInt(intent.getStringExtra("point"));
        Layout = Integer.parseInt(intent.getStringExtra("LayoutBaiTap"));
        textPoint = (TextView) findViewById(R.id.textPointResult);
        textFalse = (TextView) findViewById(R.id.textFalseResult);
        textTrue = (TextView) findViewById(R.id.textTrueResult);
        int True = point / 10;
        int False = 10 - True;
        textPoint.setText(String.valueOf(point));
        textFalse.setText(String.valueOf(False));
        textTrue.setText(String.valueOf(True));
        btnNext = (Button) findViewById(R.id.btnNextResult);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NextIntent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(NextIntent);
            }
        });
        temp[0] = temp[0];
        GetFileName();
        readData();
        temp[0] = temp[0];
        KiemTraDiem();
        temp[0] = temp[0];
        saveData();
        readData();
        b = temp[0];
    }

    public void saveData() {
        try {
            FileOutputStream f = openFileOutput(Filename, MODE_PRIVATE);
            String S = temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3] + " " + temp[4] + " " + temp[5]
                    + " " + temp[6] + " " + temp[7] + " " + temp[8] + " " + temp[9];
            f.write(S.getBytes());
            f.close();
        } catch (IOException e) {
        }
    }

    private void readData() {
        try {
            FileInputStream fin = openFileInput(Filename);
            int c;
            int i = 0;
            String a = " ";
            while ((c = fin.read()) != -1) {
                if (Character.toString((char) c).equals(a))
                    i++;
                else
                    temp[i] = temp[i] + Character.toString((char) c);
            }

            fin.close();
        } catch (IOException io) {
        }
    }

    public void KiemTraDiem() {
        if (point > Integer.parseInt(temp[0])) {
            temp[9] = temp[8];
            temp[8] = temp[7];
            temp[7] = temp[6];
            temp[6] = temp[5];
            temp[5] = temp[4];
            temp[4] = temp[3];
            temp[3] = temp[2];
            temp[2] = temp[1];
            temp[1] = temp[0];
            temp[0] = String.valueOf(point);
        } else if (point > Integer.parseInt(temp[1])) {
            temp[9] = temp[8];
            temp[8] = temp[7];
            temp[7] = temp[6];
            temp[6] = temp[5];
            temp[5] = temp[4];
            temp[4] = temp[3];
            temp[3] = temp[2];
            temp[2] = temp[1];
            temp[1] = String.valueOf(point);
        } else if (point > Integer.parseInt(temp[2])) {
            temp[9] = temp[8];
            temp[8] = temp[7];
            temp[7] = temp[6];
            temp[6] = temp[5];
            temp[5] = temp[4];
            temp[4] = temp[3];
            temp[3] = temp[2];
            temp[2] = String.valueOf(point);
        } else if (point > Integer.parseInt(temp[3])) {
            temp[9] = temp[8];
            temp[8] = temp[7];
            temp[7] = temp[6];
            temp[6] = temp[5];
            temp[5] = temp[4];
            temp[4] = temp[3];
            temp[3] = String.valueOf(point);
        } else if (point > Integer.parseInt(temp[4])) {
            temp[9] = temp[8];
            temp[8] = temp[7];
            temp[7] = temp[6];
            temp[6] = temp[5];
            temp[5] = temp[4];
            temp[4] = String.valueOf(point);
        } else if (point > Integer.parseInt(temp[5])) {
            temp[9] = temp[8];
            temp[8] = temp[7];
            temp[7] = temp[6];
            temp[6] = temp[5];
            temp[5] = String.valueOf(point);
        } else if (point > Integer.parseInt(temp[6])) {
            temp[9] = temp[8];
            temp[8] = temp[7];
            temp[7] = temp[6];
            temp[6] = String.valueOf(point);
        } else if (point > Integer.parseInt(temp[7])) {
            temp[9] = temp[8];
            temp[8] = temp[7];
            temp[7] = String.valueOf(point);
        } else if (point > Integer.parseInt(temp[8])) {
            temp[9] = temp[8];
            temp[8] = String.valueOf(point);
        } else if (point > Integer.parseInt(temp[9])) {
            temp[9] = String.valueOf(point);
        }
    }

    public void GetFileName(){
        switch (Layout){
            case 1:
                Filename = "Lop2XepHangTest.txt";
                break;
            case 2:
                Filename = "Lop2XepHangLonBe.txt";
                break;
            case 3:
                Filename = "Lop2XepHangToanHinh.txt";
                break;
            case 4:
                Filename = "Lop2XepHangTinhNham.txt";
                break;
            case 5:
                Filename = "Lop2XepHangToanDo.txt";
                break;
        }
    }
}