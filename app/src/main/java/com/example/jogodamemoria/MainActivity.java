package com.example.jogodamemoria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

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

    }

    @Override
    public void run() {

    }
}