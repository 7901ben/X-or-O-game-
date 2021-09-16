package com.hfad.xoro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int player=0;
    // 0=X 1=O;
    public void mistakeClick(View view){

    }
public void dropIn(View view){
    ImageView counter = (ImageView) view ;
    counter.setTranslationY(-1500);
    if(player==0) {
        counter.setImageResource(R.drawable.x);
        player=1;
    } else if(player==1){
        counter.setImageResource(R.drawable.o);
        player=0;
    }
    counter.animate().translationYBy(1500).rotation(360).setDuration(500);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}