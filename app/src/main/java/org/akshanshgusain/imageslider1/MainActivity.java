package org.akshanshgusain.imageslider1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ss.com.bannerslider.Slider;

public class MainActivity extends AppCompatActivity {
private Slider slider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Slider.init(new PicassoImageLoadingService(this));
        setupViews();
    }

    private void setupViews() {
        slider=findViewById(R.id.banner_slider1);
        slider.postDelayed(new Runnable() {
            @Override
            public void run() {
                slider.setAdapter(new MainSliderAdapter());
                slider.setSelectedSlide(0);
            }
        }, 1000);
    }
}
