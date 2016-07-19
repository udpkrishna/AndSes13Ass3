package me.rk.andses13ass3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by airodyra on 7/19/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter{

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int noOfTabs) {
        super(fm);
        this.mNoOfTabs=noOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentAudio fragmentAudio=new FragmentAudio();
                return fragmentAudio;

            case 1:
                FragmentVideo fragmentVideo=new FragmentVideo();
                return fragmentVideo;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
