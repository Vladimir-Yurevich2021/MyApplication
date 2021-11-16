package com.example.myapplication;

public class Numbers {
    private int number1;
    private int number2;
    private int number_rezult;

    Numbers(){
        number1=0;
        number2=0;
        number_rezult=0;

    }
    public void addition(){
        number_rezult=number1+number2;
    }
    public void subtraction(){
        number_rezult=number1-number2;
    }
    public void multiplication(){
        if (number1!=0||number2!=0){
            number_rezult=number1*number2;
        }else number_rezult=0;
    }
    public void division(){
        if (number1!=0||number2!=0){
            number_rezult=number1/number2;
        }else number_rezult=0;
    }
}
