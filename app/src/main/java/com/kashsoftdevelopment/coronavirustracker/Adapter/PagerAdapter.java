package com.kashsoftdevelopment.coronavirustracker.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.kashsoftdevelopment.coronavirustracker.Fragments.Corona_Overview;
import com.kashsoftdevelopment.coronavirustracker.Fragments.Prevention;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int tabs;

    public PagerAdapter(@NonNull FragmentManager fm, int tabs) {
        super(fm);
        this.tabs = tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position==0){
            Corona_Overview corona_overview = new Corona_Overview();
            return corona_overview;
        }else if(position ==1){
            Prevention prevention = new Prevention();
            return prevention;
        }else{
            return null;

        }
    }

    @Override
    public int getCount() {
        return tabs;
    }
}
