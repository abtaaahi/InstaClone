package com.abtahiapp.instagramclone;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs; }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Grid tab1 = new Grid();
                return tab1;
            case 1:
                Tag tab2 = new Tag();
                return tab2;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}