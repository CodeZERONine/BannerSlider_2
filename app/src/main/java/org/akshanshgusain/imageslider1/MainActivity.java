package org.akshanshgusain.imageslider1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import ss.com.bannerslider.Slider;
import ss.com.bannerslider.event.OnSlideClickListener;

public class MainActivity extends AppCompatActivity {
private Slider slider;
private ArrayList<String> urls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Slider.init(new GlideImageLoadingService(this));

        urls.add("https://assets.materialup.com/uploads/dcc07ea4-845a-463b-b5f0-4696574da5ed/preview.jpg");
        urls.add("https://assets.materialup.com/uploads/20ded50d-cc85-4e72-9ce3-452671cf7a6d/preview.jpg");
        urls.add("https://assets.materialup.com/uploads/76d63bbc-54a1-450a-a462-d90056be881b/preview.png");
        urls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        setupViews();
        }

    private void setupViews() {
        slider = findViewById(R.id.banner_slider1);
        slider.postDelayed(new Runnable() {
            @Override
            public void run() {
                MainSliderAdapter mk = new MainSliderAdapter(urls);
                slider.setAdapter(mk);
                slider.setSelectedSlide(0);
            }
        }, 1000);

        }

}
