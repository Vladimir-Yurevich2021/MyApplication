package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Numbers numbers;
    private TextView text_enter;
    private TextView text_rezult;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_division;
    private Button button_multiplication;
    private Button button_addition;
    private Button button_subtraction;
    private Button button_c;
    private Button button_delete;
    private Button button_proc;
    private Button button_point;
    private Button button_equally;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers = new Numbers();
        initView();
    }

    private void initView() {
        text_enter = findViewById(R.id.tv_enter_number);
        text_rezult = findViewById(R.id.rezult);
        initButton();
    }

    private void initButton() {
        button_0 = findViewById(R.id.b_0);
        button_0.setOnClickListener(clicbutton_0);
        button_1 = findViewById(R.id.b_1);
        button_1.setOnClickListener(clicbutton_1);
        button_2 = findViewById(R.id.b_2);
        button_2.setOnClickListener(clicbutton_2);
        button_3 = findViewById(R.id.b_3);
        button_3.setOnClickListener(clicbutton_3);
        button_4 = findViewById(R.id.b_4);
        button_4.setOnClickListener(clicbutton_4);
        button_5 = findViewById(R.id.b_5);
        button_5.setOnClickListener(clicbutton_5);
        button_6 = findViewById(R.id.b_6);
        button_6.setOnClickListener(clicbutton_6);
        button_7 = findViewById(R.id.b_7);
        button_7.setOnClickListener(clicbutton_7);
        button_8 = findViewById(R.id.b_8);
        button_8.setOnClickListener(clicbutton_8);
        button_9 = findViewById(R.id.b_9);
        button_9.setOnClickListener(clicbutton_9);
        button_division = findViewById(R.id.b_division);
        button_division.setOnClickListener(clicbutton_division);
//        button_multiplication = findViewById(R.id.b_multiplication);
//        button_addition = findViewById(R.id.b_addition);
//        button_subtraction = findViewById(R.id.b_subtraction);
        button_c = findViewById(R.id.b_c);
        button_c.setOnClickListener(clicbutton_c);
        button_delete = findViewById(R.id.b_delete);
        button_delete.setOnClickListener(clicbutton_delete);
//      button_proc = findViewById(R.id.b_proc);
        button_point = findViewById(R.id.b_point);
        button_point.setOnClickListener(clicbutton_point);
        // button_equally = findViewById(R.id.b_equally);
    }

    public void setTextViewAndSetNumber1(Button button) {
        double number = numbers.getNumber1();
        if (number != 0) {
            text_enter.append(button.getText());
            numbers.setNumber1(Double.parseDouble(String.valueOf(text_enter.getText())));
        } else text_enter.setText(button.getText());
        numbers.setNumber1(Double.parseDouble(String.valueOf(text_enter.getText())));
    }


    View.OnClickListener clicbutton_0 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_0);
        }
    };
    View.OnClickListener clicbutton_1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_1);
        }
    };
    View.OnClickListener clicbutton_2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_2);
        }
    };
    View.OnClickListener clicbutton_3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_3);
        }
    };
    View.OnClickListener clicbutton_4 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_4);
        }
    };
    View.OnClickListener clicbutton_5 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_5);
        }
    };
    View.OnClickListener clicbutton_6 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_6);
        }
    };
    View.OnClickListener clicbutton_7 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_7);
        }
    };
    View.OnClickListener clicbutton_8 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_8);
        }
    };
    View.OnClickListener clicbutton_9 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setTextViewAndSetNumber1(button_9);
        }
    };
    View.OnClickListener clicbutton_division = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double number = numbers.getNumber1();
            if (number != 0) {
                text_enter.append(button_division.getText());

            }
        }
    };
    View.OnClickListener clicbutton_c = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            text_enter.setText("0");
            numbers.setNumber1(0);
            numbers.setNumber2(0);
            numbers.setNumber_rezult(0);
        }

    };

    View.OnClickListener clicbutton_delete = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            CharSequence chars = text_enter.getText();
            int count = chars.length();
            if (count == 1) {
                text_enter.setText("0");
                numbers.setNumber1(0);
            } else

                text_enter.setText(chars.subSequence(0, count - 1));
            numbers.setNumber1(Double.parseDouble(String.valueOf(text_enter.getText())));
        }

    };
    View.OnClickListener clicbutton_point = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            CharSequence chars = text_enter.getText();
            char ch = '.';
            for (int i = 0; i < chars.length(); i++) {
                if (ch == chars.charAt(i)) {
                    return;//Возможная ошибка
                }
            }
            text_enter.append(button_point.getText());
            numbers.setNumber1(1);// ошибка в будущих операциях с числами
        }

    };
}