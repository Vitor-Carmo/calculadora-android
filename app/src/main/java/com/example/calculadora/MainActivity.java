package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private boolean is_second_number = false;
    private double Fist_number = 0;
    private int second_number_index = 0;
    private char operation;
    private boolean operation_check = false;
    private boolean will_come_back_to_the_origin = false;
    private boolean dot_on_screen = false;
    private int how_many_dots = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);

        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button division = findViewById(R.id.division);
        final Button multiplication = findViewById(R.id.multiplication);
        final Button subtraction = findViewById(R.id.subtraction);
        final Button addition = findViewById(R.id.addition);
        final Button dot = findViewById(R.id.dot);
        final Button equals = findViewById(R.id.equals);
        final Button negative = findViewById(R.id.negative);
        final Button comma = findViewById(R.id.comma);
        final Button delete = findViewById(R.id.clear);


        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id){

                    case R.id.n0:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("0");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("0");
                        }

                        break;

                    case R.id.n1:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("1");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("1");
                        }

                        break;

                    case R.id.n2:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("2");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("2");
                        }

                        break;

                    case R.id.n3:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("3");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("3");
                        }

                        break;

                    case R.id.n4:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("4");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("4");
                        }

                        break;

                    case R.id.n5:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("5");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("5");
                        }

                        break;

                    case R.id.n6:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("6");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("6");
                        }

                        break;

                    case R.id.n7:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("7");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("7");
                        }

                        break;

                    case R.id.n8:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("8");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("8");
                        }

                        break;

                    case R.id.n9:
                        if(will_come_back_to_the_origin && !operation_check){
                            calculatorScreen.setText("9");
                            will_come_back_to_the_origin = false;
                        }else{
                            calculatorScreen.append("9");
                        }


                        break;

                    case R.id.dot: case R.id.comma:
                        if (how_many_dots < 2 && !dot_on_screen){
                            if (calculatorScreen.length() != 0 && calculatorScreen.length() - second_number_index != 0){

                                calculatorScreen.append(".");
                                dot_on_screen = true;
                                how_many_dots++;
                            }
                        }

                        break;

                    case R.id.negative:
                        if (calculatorScreen.length() == 0){break;}

                        double screen = Double.parseDouble(calculatorScreen.getText().toString());
                        screen = screen * -1;
                        calculatorScreen.setText(String.valueOf(screen));


                    case R.id.equals:
                        if(is_second_number && operation_check){
                            if(operation == '+'){
                                String screenContent = calculatorScreen.getText().toString();
                                int length = screenContent.length();
                                String second_number_String = screenContent.substring(second_number_index, length);
                                double second_number = Double.parseDouble(second_number_String);


                                second_number = Fist_number + second_number;

                                int int_second_number = (int) second_number;

                                if(int_second_number == second_number){
                                    calculatorScreen.setText(String.valueOf(int_second_number));
                                }else {
                                    calculatorScreen.setText(String.valueOf(second_number));
                                }


                            }else if(operation == '-'){
                                String screenContent = calculatorScreen.getText().toString();
                                int length = screenContent.length();
                                String second_number_String = screenContent.substring(second_number_index, length);
                                double second_number = Double.parseDouble(second_number_String);

                                second_number = Fist_number - second_number;

                                int int_second_number = (int) second_number;

                                if(int_second_number == second_number){
                                    calculatorScreen.setText(String.valueOf(int_second_number));
                                }else {
                                    calculatorScreen.setText(String.valueOf(second_number));
                                }


                            }else if(operation == '*'){
                                String screenContent = calculatorScreen.getText().toString();
                                int length = screenContent.length();
                                String second_number_String = screenContent.substring(second_number_index, length);
                                double second_number = Double.parseDouble(second_number_String);

                                second_number = Fist_number * second_number;

                                int int_second_number = (int) second_number;

                                if(int_second_number == second_number){
                                    calculatorScreen.setText(String.valueOf(int_second_number));
                                }else {
                                    calculatorScreen.setText(String.valueOf(second_number));
                                }


                            }else{
                                String screenContent = calculatorScreen.getText().toString();
                                int length = screenContent.length();
                                String second_number_String = screenContent.substring(second_number_index, length);
                                double second_number = Double.parseDouble(second_number_String);

                                second_number = Fist_number / second_number;

                                int int_second_number = (int) second_number;

                                if(int_second_number == second_number){
                                    calculatorScreen.setText(String.valueOf(int_second_number));
                                }else {
                                    calculatorScreen.setText(String.valueOf(second_number));
                                }

                            }

                            operation_check = false;
                            will_come_back_to_the_origin = true;
                            dot_on_screen = false;
                            how_many_dots--;

                        }

                        break;

                    case R.id.multiplication:
                        if (!operation_check){
                            if (calculatorScreen.length() == 0){break;}
                            String screenContent = calculatorScreen.getText().toString();
                            second_number_index = screenContent.length() + 1;
                            calculatorScreen.append("*");
                            Fist_number  = Double.parseDouble(screenContent);
                            is_second_number = true;
                            operation = '*';
                            operation_check = true;
                            dot_on_screen = false;
                        }

                        break;

                    case R.id.addition:

                        if (!operation_check){
                            if (calculatorScreen.length() == 0){break;}
                            String screenContent = calculatorScreen.getText().toString();
                            second_number_index = screenContent.length() + 1;
                            calculatorScreen.append("+");
                            Fist_number  = Double.parseDouble(screenContent);
                            is_second_number = true;
                            operation = '+';
                            operation_check = true;
                            dot_on_screen = false;


                        }

                        break;

                    case R.id.subtraction:
                        if (!operation_check){
                            if (calculatorScreen.length() == 0){break;}
                            String screenContent = calculatorScreen.getText().toString();
                            second_number_index = screenContent.length() + 1;
                            calculatorScreen.append("-");
                            Fist_number  = Double.parseDouble(screenContent);
                            is_second_number = true;
                            operation = '-';
                            operation_check = true;
                            dot_on_screen = false;
                        }

                        break;

                    case R.id.division:
                        if (!operation_check){
                            if (calculatorScreen.length() == 0){break;}
                            String screenContent = calculatorScreen.getText().toString();
                            second_number_index = screenContent.length() + 1;
                            calculatorScreen.append("/");
                            Fist_number  = Double.parseDouble(screenContent);
                            is_second_number = true;
                            operation = '/';
                            operation_check = true;
                            dot_on_screen = false;

                        }

                        break;

                }

            }

        };

        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        addition.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        subtraction.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        comma.setOnClickListener(calculatorListener);
        negative.setOnClickListener(calculatorListener);



        delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String displayedElements = calculatorScreen.getText().toString();
                int length = displayedElements.length();

                if (length > 0){

                    String last_String = displayedElements.substring(length-1, length);

                    if(last_String.equals(".")){
                        how_many_dots--;
                        if(how_many_dots < 2){

                            dot_on_screen = false;


                        }
                    }

                    if (last_String.equals("+") ||
                        last_String.equals("-") ||
                        last_String.equals("*") ||
                        last_String.equals("/")){

                        operation_check = false;
                        dot_on_screen = true;


                    }




                    displayedElements = displayedElements.substring(0,length - 1);
                    calculatorScreen.setText(displayedElements);

                }
            }
        });

        final Button clearEverything = findViewById(R.id.clear_everything);
        clearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText("");
                operation_check = false;
                is_second_number = false;
                dot_on_screen = false;
                how_many_dots = 0;
            }
        });


    }
}

