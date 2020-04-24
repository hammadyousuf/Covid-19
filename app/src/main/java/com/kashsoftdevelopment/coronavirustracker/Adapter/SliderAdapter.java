package com.kashsoftdevelopment.coronavirustracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.kashsoftdevelopment.coronavirustracker.Model.SliderItem;
import com.kashsoftdevelopment.coronavirustracker.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SlidViewHolder> {

    private List<SliderItem> slide_item;
    private ViewPager2 viewPager2;

    public SliderAdapter(List<SliderItem> slide_item, ViewPager2 viewPager2) {
        this.slide_item = slide_item;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SlidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SlidViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slide_item,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SlidViewHolder holder, int position) {
        holder.setImage(slide_item.get(position));
        if(position == slide_item.size()-2){
            viewPager2.post(runnable);
        }

    }

    @Override
    public int getItemCount() {
        return slide_item.size();
    }

    class SlidViewHolder extends RecyclerView.ViewHolder{
        private RoundedImageView imageView;

        public SlidViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageSlider);
        }
        void setImage(SliderItem sliderItem){
            imageView.setImageResource(sliderItem.getImage());
        }

    }
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            slide_item.addAll(slide_item);
            notifyDataSetChanged();
        }
    };

}
