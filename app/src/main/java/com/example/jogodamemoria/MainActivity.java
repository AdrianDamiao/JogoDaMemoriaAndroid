package com.example.jogodamemoria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Runnable{

    private Button button1, button2, button3, button4,
                   button5, button6, button7, button8, tempButton;

    private ArrayList<Element> elementList;
    private Handler handler;
    private int control;
    private String firstClickedButtonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

        tempButton = new Button(this);
        elementList = new ArrayList<Element>();
        control = 0;

        loadElements();
        handler = new Handler();
        handler.postDelayed(this, 10000);
        
    }

    public void loadElements(){
        Element bike1 = new Element();
        bike1.setImage(R.drawable.ic_action_bike);
        bike1.setImageText("Bike");
        elementList.add(bike1);

        Element bike2 = new Element();
        bike2.setImage(R.drawable.ic_action_bike);
        bike2.setImageText("Bike");
        elementList.add(bike2);

        Element boat1 = new Element();
        boat1.setImage(R.drawable.ic_action_boat);
        boat1.setImageText("Boat");
        elementList.add(boat1);

        Element boat2 = new Element();
        boat2.setImage(R.drawable.ic_action_boat);
        boat2.setImageText("Boat");
        elementList.add(boat2);

        Element car1 = new Element();
        car1.setImage(R.drawable.ic_action_car);
        car1.setImageText("Car");
        elementList.add(car1);

        Element car2 = new Element();
        car2.setImage(R.drawable.ic_action_car);
        car2.setImageText("Car");
        elementList.add(car2);

        Element airplane1 = new Element();
        airplane1.setImage(R.drawable.ic_action_plane);
        airplane1.setImageText("Airplane");
        elementList.add(airplane1);

        Element airplane2 = new Element();
        airplane2.setImage(R.drawable.ic_action_plane);
        airplane2.setImageText("Airplane");
        elementList.add(airplane2);

        Collections.shuffle(elementList);

        button1.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(0).getImage()), null, null);
        button1.setText(elementList.get(0).getImageText());
        button1.setEnabled(false);

        button2.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(1).getImage()), null, null);
        button2.setText(elementList.get(1).getImageText());
        button2.setEnabled(false);

        button3.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(2).getImage()), null, null);
        button3.setText(elementList.get(2).getImageText());
        button3.setEnabled(false);

        button4.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(3).getImage()), null, null);
        button4.setText(elementList.get(3).getImageText());
        button4.setEnabled(false);

        button5.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(4).getImage()), null, null);
        button5.setText(elementList.get(4).getImageText());
        button5.setEnabled(false);

        button6.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(5).getImage()), null, null);
        button6.setText(elementList.get(5).getImageText());
        button6.setEnabled(false);

        button7.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(6).getImage()), null, null);
        button7.setText(elementList.get(6).getImageText());
        button7.setEnabled(false);

        button8.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(7).getImage()), null, null);
        button8.setText(elementList.get(7).getImageText());
        button8.setEnabled(false);

    }
    @Override
    public void onClick(View view) {
        control++;
        if(control <= 2){
            if(view == button1){
                button1.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(0).getImage()), null, null);
                button1.setText(elementList.get(0).getImageText());
                MatchCheck(button1.getText().toString(), button1);
            }
            else if(view == button2){
                button2.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(1).getImage()), null, null);
                button2.setText(elementList.get(1).getImageText());
                MatchCheck(button2.getText().toString(), button2);
            }
            else if(view == button3){
                button3.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(2).getImage()), null, null);
                button3.setText(elementList.get(2).getImageText());
                MatchCheck(button3.getText().toString(), button3);
            }
            else if(view == button4){
                button4.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(3).getImage()), null, null);
                button4.setText(elementList.get(3).getImageText());
                MatchCheck(button4.getText().toString(), button4);
            }
            else if(view == button5){
                button5.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(4).getImage()), null, null);
                button5.setText(elementList.get(4).getImageText());
                MatchCheck(button5.getText().toString(), button5);
            }
            else if(view == button6){
                button6.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(5).getImage()), null, null);
                button6.setText(elementList.get(5).getImageText());
                MatchCheck(button6.getText().toString(), button6);
            }
            else if(view == button7){
                button7.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(6).getImage()), null, null);
                button7.setText(elementList.get(6).getImageText());
                MatchCheck(button7.getText().toString(), button7);
            }
            else if(view == button8){
                button8.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(elementList.get(7).getImage()), null, null);
                button8.setText(elementList.get(7).getImageText());
                MatchCheck(button8.getText().toString(), button8);
            }
        }
    }

    @Override
    public void run() {
        Drawable top = getResources().getDrawable(R.drawable.ic_action_android);
        button1.setCompoundDrawablesWithIntrinsicBounds(null, top, null, null);
        button2.setCompoundDrawablesWithIntrinsicBounds(null, top, null, null);
        button3.setCompoundDrawablesWithIntrinsicBounds(null, top, null, null);
        button4.setCompoundDrawablesWithIntrinsicBounds(null, top, null, null);
        button5.setCompoundDrawablesWithIntrinsicBounds(null, top, null, null);
        button6.setCompoundDrawablesWithIntrinsicBounds(null, top, null, null);
        button7.setCompoundDrawablesWithIntrinsicBounds(null, top, null, null);
        button8.setCompoundDrawablesWithIntrinsicBounds(null, top, null, null);

        button1.setText("Android");
        button2.setText("Android");
        button3.setText("Android");
        button4.setText("Android");
        button5.setText("Android");
        button6.setText("Android");
        button7.setText("Android");
        button8.setText("Android");

        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
    }

    public void MatchCheck(String text, Button button){
        if(control == 1){
            firstClickedButtonText = text;
            tempButton = button;
        } else if(control == 2) {
            if(firstClickedButtonText.compareToIgnoreCase(text)==0){
                button.setEnabled(false);
                tempButton.setEnabled(false);
                control = 0;
            } else {
                Handler h = new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Drawable top = getResources().getDrawable(R.drawable.ic_action_android);
                        button.setCompoundDrawablesRelativeWithIntrinsicBounds(null, top, null, null);
                        tempButton.setCompoundDrawablesRelativeWithIntrinsicBounds(null, top, null, null);
                        button.setText("Android");
                        tempButton.setText("Android");
                        control = 0;
                    }
                }, 1000);
            }
        }
    }
}