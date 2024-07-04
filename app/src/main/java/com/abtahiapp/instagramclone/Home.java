package com.abtahiapp.instagramclone;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
public class Home extends Fragment {
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mimageidname = new ArrayList<>();
    private ArrayList<String> mimagepost = new ArrayList<>();

    View root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        root= inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton chatButton = root.findViewById(R.id.chat);
        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Chat.class));
            }
        });
        ImageButton notiButton = root.findViewById(R.id.notification);
        notiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Notifications.class));
            }
        });

        RecyclerView recyclerView2 = root.findViewById(R.id.recycler_view_story);
        RecyclerViewAdapter_Story adapter2 = new RecyclerViewAdapter_Story(getActivity(), mNames, mImageUrls);
        recyclerView2.setAdapter(adapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        RecyclerView recyclerView3 = root.findViewById(R.id.recycler_view_post);
        RecyclerViewAdapter_Post adapter3 = new RecyclerViewAdapter_Post(getActivity(), mNames, mImageUrls,mimageidname,mimagepost);
        recyclerView3.setAdapter(adapter3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        mImageUrls.add("https://e0.pxfuel.com/wallpapers/676/771/desktop-wallpaper-neymar-jr-wp-sports-uniform-neymar-jr-soccer-sports-gear-neymarjr.jpg");
        mNames.add("Neymar");

        mImageUrls.add("https://images.prothomalo.com/prothomalo-english%2F2023-07%2F189bd66e-8e6f-42cb-acba-9f007ac9be0b%2Fprothomalo_bangla_2023_07_b221b13b_295e_4db2_94a4_2f1c17882e5f_b2498b8a_86c1_4f5e_a029_acd28e235300_.webp?rect=0%2C0%2C1280%2C720&auto=format%2Ccompress&fmt=webp&dpr=1.0&format=webp&w=480");
        mNames.add("Shakib");

        mImageUrls.add("https://cdn.britannica.com/34/212134-050-A7289400/Lionel-Messi-2018.jpg");
        mNames.add("Messi");

        mImageUrls.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/media_bank/202310/tamim-iqbals-controversial-omission--blessing-in-disguise-for-bangladesh-courtesy-reuters-09322294-3x4.jpg?VersionId=V6mPve0QKZZ3cZF3xotnKhkv0cfkoprN");
        mNames.add("Tamim");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/d/d7/Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg");
        mNames.add("Ronaldo");

        mImageUrls.add("https://www.fcbarcelona.com/fcbarcelona/photo/2020/04/08/9da2ff96-4cc4-4c22-9526-0cbb54b95221/INIESTA.png");
        mNames.add("Iniesta");

        mImageUrls.add("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt4006aa4324d537f4/60da723d0401cb0ebfa64256/79f3ed1268bb523d98923c0fbb6f73ef46243bfe.jpg?auto=webp&format=pjpg&width=3840&quality=60");
        mNames.add("Ramos");

        mImageUrls.add("https://p.imgci.com/db/PICTURES/CMS/223900/223989.6.jpg");
        mNames.add("Mashrafee");

        mImageUrls.add("https://images.prothomalo.com/prothomalo-english/2023-09/353553ac-af38-4763-b9eb-77fe30df054f/prothomalo_bangla_2023_07_0439fc2f_8f42_40a8_9f42_26e796c22b77_Mushfiq_during_Practice_at_Mirpur___1.webp?w=1200&h=674");
        mNames.add("Mushfiq");

        mImageUrls.add("https://cdn.wisden.com/wp-content/uploads/2023/10/F5VlElMa4AALUFr-76-980x530.png");
        mNames.add("Mahmudullah");

        mimagepost.add("https://e0.pxfuel.com/wallpapers/676/771/desktop-wallpaper-neymar-jr-wp-sports-uniform-neymar-jr-soccer-sports-gear-neymarjr.jpg");
        mimageidname.add("Neymar");

        mimagepost.add("https://images.prothomalo.com/prothomalo-english%2F2023-07%2F189bd66e-8e6f-42cb-acba-9f007ac9be0b%2Fprothomalo_bangla_2023_07_b221b13b_295e_4db2_94a4_2f1c17882e5f_b2498b8a_86c1_4f5e_a029_acd28e235300_.webp?rect=0%2C0%2C1280%2C720&auto=format%2Ccompress&fmt=webp&dpr=1.0&format=webp&w=480");
        mimageidname.add("Shakib");

        mimagepost.add("https://cdn.britannica.com/34/212134-050-A7289400/Lionel-Messi-2018.jpg");
        mimageidname.add("Messi");

        mimagepost.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/media_bank/202310/tamim-iqbals-controversial-omission--blessing-in-disguise-for-bangladesh-courtesy-reuters-09322294-3x4.jpg?VersionId=V6mPve0QKZZ3cZF3xotnKhkv0cfkoprN");
        mimageidname.add("Tamim");

        mimagepost.add("https://upload.wikimedia.org/wikipedia/commons/d/d7/Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg");
        mimageidname.add("Ronaldo");

        mimagepost.add("https://www.fcbarcelona.com/fcbarcelona/photo/2020/04/08/9da2ff96-4cc4-4c22-9526-0cbb54b95221/INIESTA.png");
        mimageidname.add("Iniesta");

        mimagepost.add("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt4006aa4324d537f4/60da723d0401cb0ebfa64256/79f3ed1268bb523d98923c0fbb6f73ef46243bfe.jpg?auto=webp&format=pjpg&width=3840&quality=60");
        mimageidname.add("Ramos");

        mimagepost.add("https://p.imgci.com/db/PICTURES/CMS/223900/223989.6.jpg");
        mimageidname.add("Mashrafee");

        mimagepost.add("https://images.prothomalo.com/prothomalo-english/2023-09/353553ac-af38-4763-b9eb-77fe30df054f/prothomalo_bangla_2023_07_0439fc2f_8f42_40a8_9f42_26e796c22b77_Mushfiq_during_Practice_at_Mirpur___1.webp?w=1200&h=674");
        mimageidname.add("Mushfiq");

        mimagepost.add("https://cdn.wisden.com/wp-content/uploads/2023/10/F5VlElMa4AALUFr-76-980x530.png");
        mimageidname.add("Mahmudullah");
        return root;
    }
}