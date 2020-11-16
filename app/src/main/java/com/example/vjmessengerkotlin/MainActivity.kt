package com.example.vjmessengerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.setMargins
import androidx.core.view.updateLayoutParams
import android.util.Log;
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private lateinit var drawer: View;
    private var marginEnd = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen);
        val drawer_toggle_button = findViewById<View>(R.id.bars_solid);
        drawer = findViewById<View>(R.id.drawer_solid);
        Log.e("ERROR","hello world");
        val layout_params = drawer.layoutParams as ViewGroup.MarginLayoutParams;
        marginEnd = layout_params.getMarginEnd();
        drawer_toggle_button.setOnClickListener{drawer_toggle()};
    }
    fun drawer_toggle(){
        val layout_params = drawer.layoutParams as ViewGroup.MarginLayoutParams;
        if(layout_params.getMarginEnd() == marginEnd){
            layout_params.setMarginEnd(420);
        }else{
            layout_params.setMarginEnd(marginEnd);
        }
        drawer.layoutParams = layout_params;
    }
}