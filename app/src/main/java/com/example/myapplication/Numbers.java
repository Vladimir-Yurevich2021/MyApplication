package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Numbers implements Parcelable {
    private double number1;
    private double number2;
    private double number_rezult;

    Numbers(){
        number1=0;
        number2=0;
        number_rezult=0;

    }

    public static final Creator<Numbers> CREATOR = new Creator<Numbers>() {
        @Override
        public Numbers createFromParcel(Parcel in) {
            return new Numbers(in);
        }

        @Override
        public Numbers[] newArray(int size) {
            return new Numbers[size];
        }
    };

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumber_rezult() {
        return number_rezult;
    }

    public void setNumber_rezult(double number_rezult) {
        this.number_rezult = number_rezult;
    }

    protected Numbers(Parcel in) {
        number1 = in.readInt();
        number2 = in.readInt();
        number_rezult = in.readInt();
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(number1);
        parcel.writeDouble(number2);
        parcel.writeDouble(number_rezult);
    }
}
