package com.example.foodmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

import java.util.ArrayList;

public  class MainActivity extends AppCompatActivity
        implements OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        int [] chk_id ={R.id.hamburger,R.id.fries,R.id.Coke,R.id.soup,R.id.chicken,R.id.salad};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int id:chk_id){
            CheckBox chk =(CheckBox) findViewById(id);
            chk.setOnCheckedChangeListener(this);
        }
    }




    int item =0;

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        int vis;

        if(isChecked){
            item++;
            vis = View.VISIBLE;
        }
        else
        {
            item--;
            vis = View.GONE;
        }

        switch (buttonView.getId() ){

            case R.id.hamburger:
                findViewById(R.id.imagehamburger).setVisibility(vis);
                break;

            case R.id.fries:
                findViewById(R.id.imagefries).setVisibility(vis);
                break;

            case R.id.Coke:
                findViewById(R.id.imagecoke).setVisibility(vis);
                break;

            case R.id.soup:
                findViewById(R.id.imagesoup).setVisibility(vis);
                break;

            case R.id.chicken:
                findViewById(R.id.imagechicken).setVisibility(vis);
                break;

            case R.id.salad:
                findViewById(R.id.imagesalad).setVisibility(vis);
                break;
        }


    }

}
