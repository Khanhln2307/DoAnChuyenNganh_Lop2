package com.example.admin.math123.core;

import android.widget.Button;

import java.util.Random;

public class tinhnham {
    int numbera;
    int numberb;
    int numberc;

    String Sign ="";
    Random rd=new Random();
    int x;
    int y = rd.nextInt((2-0+1)+0);
    int TempResult;
    int type = rd.nextInt((3-0+1)+0);
    int result;
    public void randomResult() {
        if(type == 3 && (y == 0 || y == 1))
            result = x;
        else if(type == 3 && y == 2)
            result = 2;
        else
            result = rd.nextInt((3-0+1)+0);
    }

    public int getResult() {
        return result;
    }

    public void setSign() {
        if(y == 0 || y == 1)
            switch (x) {
                case 0:
                    Sign = "+";
                    break;
                case 1:
                    Sign = "-";
                    break;
            }
        else if(y == 2)
            Sign = "x";
    }

    public void setData(){
        if(y == 0 || y == 1) {
            this.numberc = rd.nextInt((100 - 0 + 1) + 0);
            this.numbera = rd.nextInt((100 - 1 + 1) + 1);
            while (numbera == 0) {
                this.numbera = rd.nextInt((100 - 0 + 1) + 0);
            }
            if (numbera > numberc) {
                x = 1;
                numberb = numbera - numberc;
            } else {
                x = 0;
                numberb = numberc - numbera;
            }
            TempResult = 101;
        }else if(y == 2){
            this.numbera = rd.nextInt((9 - 1 + 1) + 1);
            while (numbera == 0) {
                this.numbera = rd.nextInt((9 - 0 + 1) + 0);
            }
            this.numberb = rd.nextInt((4-2+1)+2);
            this.numberc = this.numbera * this.numberb;
            TempResult = 36;
        }
    }

    public String getA() {
        return String.valueOf(numbera);
    }

    public String getB() {

        return String.valueOf(numberb);
    }

    public String getC(){
        return String.valueOf(numberc);
    }

    public String getSign(){
        return Sign;
    }

    public int getType(){
        return type;
    }

    public void setResultToButton(Button A, Button B,Button C,Button D)
        {
            int a;
            int b;
            int c;
            int d;
            if (type == 0){
                switch (result){
                    case 0:
                        A.setText(String.valueOf(numberc));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numberc);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numberc||b==c);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numberc||c==d||b==d);
                        break;
                    case 1:
                        B.setText(String.valueOf(numberc));
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numberc);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numberc||a==c);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numberc||c==d||a==d);
                        break;
                    case 2:
                        C.setText(String.valueOf(numberc));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numberc);
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numberc||b==a);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numberc||a==d||b==d);
                        break;
                    case 3:
                        D.setText(String.valueOf(numberc));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numberc);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numberc||b==c);
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numberc||c==a||b==a);
                        break;
                }
                }
            else if(type == 1){
                switch (result){
                    case 0:
                        A.setText(String.valueOf(numbera));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numbera);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numbera||b==c);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numbera||c==d||b==d);
                        break;
                    case 1:
                        B.setText(String.valueOf(numbera));
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numbera);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numbera||a==c);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numbera||c==d||a==d);
                        break;
                    case 2:
                        C.setText(String.valueOf(numbera));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numbera);
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numbera||b==a);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numbera||a==d||b==d);
                        break;
                    case 3:
                        D.setText(String.valueOf(numbera));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numbera);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numbera||b==c);
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numbera||c==a||b==a);
                        break;
                }
            }
            else if (type == 2){
                switch (result){
                    case 0:
                        A.setText(String.valueOf(numberb));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numberb);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numberb||b==c);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numberb||c==d||b==d);
                        break;
                    case 1:
                        B.setText(String.valueOf(numberb));
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numberb);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numberb||a==c);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numberb||c==d||a==d);
                        break;
                    case 2:
                        C.setText(String.valueOf(numberb));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numberb);
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numberb||b==a);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numberb||a==d||b==d);
                        break;
                    case 3:
                        D.setText(String.valueOf(numberb));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numberb);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numberb||b==c);
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numberb||c==a||b==a);
                        break;
                }
            }
            else if (type == 3)
            {
                A.setText(String.valueOf("+"));
                B.setText(String.valueOf("-"));
                C.setText(String.valueOf("x"));
            }
            else if (type == 4){
                switch (result){
                    case 0:
                        A.setText(String.valueOf(numberc));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numberc);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numberc||b==c);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numberc||c==d||b==d);
                        break;
                    case 1:
                        B.setText(String.valueOf(numberc));
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numberc);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numberc||a==c);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numberc||c==d||a==d);
                        break;
                    case 2:
                        C.setText(String.valueOf(numberc));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numberc);
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numberc||b==a);
                        do{
                            d = (int) (TempResult*Math.random());
                            D.setText(String.valueOf(d));
                        }while(d==numberc||a==d||b==d);
                        break;
                    case 3:
                        D.setText(String.valueOf(numberc));
                        do{
                            b = (int) (TempResult*Math.random());
                            B.setText(String.valueOf(b));
                        }while(b==numberc);
                        do{
                            c = (int) (TempResult*Math.random());
                            C.setText(String.valueOf(c));
                        }while(c==numberc||b==c);
                        do{
                            a = (int) (TempResult*Math.random());
                            A.setText(String.valueOf(a));
                        }while(a==numberc||c==a||b==a);
                        break;
                }
            }
        }
}



