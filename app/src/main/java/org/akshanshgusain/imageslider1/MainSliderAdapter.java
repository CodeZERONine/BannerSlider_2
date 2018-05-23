package org.akshanshgusain.imageslider1;

import java.util.ArrayList;

import ss.com.bannerslider.adapters.SliderAdapter;
import ss.com.bannerslider.viewholder.ImageSlideViewHolder;

public class MainSliderAdapter extends SliderAdapter {
   private ArrayList<String> mUrls;

    //Constructor as Setter
    public MainSliderAdapter(ArrayList<String> mUrls) {
        this.mUrls=mUrls;
    }

    @Override
    public int getItemCount() {
        return mUrls.size();
    }

    @Override
    public void onBindImageSlide(int position, ImageSlideViewHolder viewHolder) {
       // viewHolder.bindImageSlide(mUrls.get(position));
      switch (position) {
            case 0:
                viewHolder.bindImageSlide(mUrls.get(0));
                break;
            case 1:
                viewHolder.bindImageSlide(mUrls.get(1));
                break;
            case 2:
                viewHolder.bindImageSlide(mUrls.get(2));
                break;
          case 3:viewHolder.bindImageSlide(mUrls.get(3));
             break;
        }

      /*for(int i=0;i<2;i++){
           viewHolder.bindImageSlide(mUrls.get(position));
      }*/

    }
}
