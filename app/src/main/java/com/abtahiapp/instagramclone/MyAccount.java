package com.abtahiapp.instagramclone;
import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
public class MyAccount extends Fragment {
    int[] tabIcons = {R.drawable.grid, R.drawable.tag };
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    View root; private NavController navController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root= inflater.inflate(R.layout.fragment_my_account, container, false);
        navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_activity_main);
        RecyclerView recyclerView = root.findViewById(R.id.recycler_view_highlight);
        RecyclerViewAdapter_Story_Highlight adapter = new RecyclerViewAdapter_Story_Highlight(getActivity(), mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        mImageUrls.add("https://e0.pxfuel.com/wallpapers/676/771/desktop-wallpaper-neymar-jr-wp-sports-uniform-neymar-jr-soccer-sports-gear-neymarjr.jpg");
        mNames.add("✨");
        mImageUrls.add("https://images.prothomalo.com/prothomalo-english%2F2023-07%2F189bd66e-8e6f-42cb-acba-9f007ac9be0b%2Fprothomalo_bangla_2023_07_b221b13b_295e_4db2_94a4_2f1c17882e5f_b2498b8a_86c1_4f5e_a029_acd28e235300_.webp?rect=0%2C0%2C1280%2C720&auto=format%2Ccompress&fmt=webp&dpr=1.0&format=webp&w=480");
        mNames.add("📌");
        mImageUrls.add("https://cdn.britannica.com/34/212134-050-A7289400/Lionel-Messi-2018.jpg");
        mNames.add("☁️");
        mImageUrls.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/media_bank/202310/tamim-iqbals-controversial-omission--blessing-in-disguise-for-bangladesh-courtesy-reuters-09322294-3x4.jpg?VersionId=V6mPve0QKZZ3cZF3xotnKhkv0cfkoprN");
        mNames.add("🍕");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/d/d7/Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg");
        mNames.add("🎀");
        mImageUrls.add("https://www.fcbarcelona.com/fcbarcelona/photo/2020/04/08/9da2ff96-4cc4-4c22-9526-0cbb54b95221/INIESTA.png");
        mNames.add("🎬");
        mImageUrls.add("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt4006aa4324d537f4/60da723d0401cb0ebfa64256/79f3ed1268bb523d98923c0fbb6f73ef46243bfe.jpg?auto=webp&format=pjpg&width=3840&quality=60");
        mNames.add("✈️");
        mImageUrls.add("https://p.imgci.com/db/PICTURES/CMS/223900/223989.6.jpg");
        mNames.add("🎞️");

        TabLayout tabLayout = root.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setIcon(tabIcons[0]));
        tabLayout.addTab(tabLayout.newTab().setIcon(tabIcons[1]));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = root.findViewById(R.id.pager);
        final PagerAdapter adapterpage = new PagerAdapter(getChildFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapterpage);
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        ImageButton imageButton = root.findViewById(R.id.menubutton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View bottomSheetView = getLayoutInflater().inflate(R.layout.bottom_sheet_dialog_layout, null);
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getContext());
                bottomSheetDialog.setContentView(bottomSheetView);
                SharedPreferences sharedPref = getActivity().getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean(getString(R.string.logged_in_key), false);
                editor.apply();
                TextView logoutTextView = bottomSheetView.findViewById(R.id.logout);
                logoutTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), LoginActivity.class);
                        startActivity(intent);
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.show();
            }
        });
        ImageButton addButton = root.findViewById(R.id.addbutton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_myAccount_to_add);
            }
        });
        return root;
    }
}