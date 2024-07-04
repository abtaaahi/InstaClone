package com.abtahiapp.instagramclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import java.util.ArrayList;
public class Grid extends Fragment implements GridAdapter.OnItemClickListener{
    private static final int NUM_COLUMNS = 3;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    View root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_grid, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        GridAdapter adapter = new GridAdapter(getActivity(), mImageUrls,this);
        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

        mImageUrls.add("https://e0.pxfuel.com/wallpapers/676/771/desktop-wallpaper-neymar-jr-wp-sports-uniform-neymar-jr-soccer-sports-gear-neymarjr.jpg");
        mImageUrls.add("https://images.prothomalo.com/prothomalo-english%2F2023-07%2F189bd66e-8e6f-42cb-acba-9f007ac9be0b%2Fprothomalo_bangla_2023_07_b221b13b_295e_4db2_94a4_2f1c17882e5f_b2498b8a_86c1_4f5e_a029_acd28e235300_.webp?rect=0%2C0%2C1280%2C720&auto=format%2Ccompress&fmt=webp&dpr=1.0&format=webp&w=480");
        mImageUrls.add("https://cdn.britannica.com/34/212134-050-A7289400/Lionel-Messi-2018.jpg");
        mImageUrls.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/media_bank/202310/tamim-iqbals-controversial-omission--blessing-in-disguise-for-bangladesh-courtesy-reuters-09322294-3x4.jpg?VersionId=V6mPve0QKZZ3cZF3xotnKhkv0cfkoprN");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/d/d7/Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg");
        mImageUrls.add("https://www.fcbarcelona.com/fcbarcelona/photo/2020/04/08/9da2ff96-4cc4-4c22-9526-0cbb54b95221/INIESTA.png");
        mImageUrls.add("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt4006aa4324d537f4/60da723d0401cb0ebfa64256/79f3ed1268bb523d98923c0fbb6f73ef46243bfe.jpg?auto=webp&format=pjpg&width=3840&quality=60");
        mImageUrls.add("https://p.imgci.com/db/PICTURES/CMS/223900/223989.6.jpg");
        mImageUrls.add("https://images.prothomalo.com/prothomalo-english/2023-09/353553ac-af38-4763-b9eb-77fe30df054f/prothomalo_bangla_2023_07_0439fc2f_8f42_40a8_9f42_26e796c22b77_Mushfiq_during_Practice_at_Mirpur___1.webp?w=1200&h=674");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/d/d7/Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg");
        mImageUrls.add("https://e0.pxfuel.com/wallpapers/676/771/desktop-wallpaper-neymar-jr-wp-sports-uniform-neymar-jr-soccer-sports-gear-neymarjr.jpg");
        mImageUrls.add("https://p.imgci.com/db/PICTURES/CMS/223900/223989.6.jpg");
        mImageUrls.add("https://www.fcbarcelona.com/fcbarcelona/photo/2020/04/08/9da2ff96-4cc4-4c22-9526-0cbb54b95221/INIESTA.png");
        mImageUrls.add("https://images.prothomalo.com/prothomalo-english%2F2023-07%2F189bd66e-8e6f-42cb-acba-9f007ac9be0b%2Fprothomalo_bangla_2023_07_b221b13b_295e_4db2_94a4_2f1c17882e5f_b2498b8a_86c1_4f5e_a029_acd28e235300_.webp?rect=0%2C0%2C1280%2C720&auto=format%2Ccompress&fmt=webp&dpr=1.0&format=webp&w=480");
        mImageUrls.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/media_bank/202310/tamim-iqbals-controversial-omission--blessing-in-disguise-for-bangladesh-courtesy-reuters-09322294-3x4.jpg?VersionId=V6mPve0QKZZ3cZF3xotnKhkv0cfkoprN");
        mImageUrls.add("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt4006aa4324d537f4/60da723d0401cb0ebfa64256/79f3ed1268bb523d98923c0fbb6f73ef46243bfe.jpg?auto=webp&format=pjpg&width=3840&quality=60");
        mImageUrls.add("https://cdn.britannica.com/34/212134-050-A7289400/Lionel-Messi-2018.jpg");
        mImageUrls.add("https://images.prothomalo.com/prothomalo-english/2023-09/353553ac-af38-4763-b9eb-77fe30df054f/prothomalo_bangla_2023_07_0439fc2f_8f42_40a8_9f42_26e796c22b77_Mushfiq_during_Practice_at_Mirpur___1.webp?w=1200&h=674");

        mImageUrls.add("https://p.imgci.com/db/PICTURES/CMS/223900/223989.6.jpg");
        mImageUrls.add("https://www.fcbarcelona.com/fcbarcelona/photo/2020/04/08/9da2ff96-4cc4-4c22-9526-0cbb54b95221/INIESTA.png");
        mImageUrls.add("https://images.prothomalo.com/prothomalo-english%2F2023-07%2F189bd66e-8e6f-42cb-acba-9f007ac9be0b%2Fprothomalo_bangla_2023_07_b221b13b_295e_4db2_94a4_2f1c17882e5f_b2498b8a_86c1_4f5e_a029_acd28e235300_.webp?rect=0%2C0%2C1280%2C720&auto=format%2Ccompress&fmt=webp&dpr=1.0&format=webp&w=480");
        mImageUrls.add("https://cdn.britannica.com/34/212134-050-A7289400/Lionel-Messi-2018.jpg");
        mImageUrls.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/media_bank/202310/tamim-iqbals-controversial-omission--blessing-in-disguise-for-bangladesh-courtesy-reuters-09322294-3x4.jpg?VersionId=V6mPve0QKZZ3cZF3xotnKhkv0cfkoprN");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/d/d7/Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg");
        mImageUrls.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/media_bank/202310/tamim-iqbals-controversial-omission--blessing-in-disguise-for-bangladesh-courtesy-reuters-09322294-3x4.jpg?VersionId=V6mPve0QKZZ3cZF3xotnKhkv0cfkoprN");
        mImageUrls.add("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt4006aa4324d537f4/60da723d0401cb0ebfa64256/79f3ed1268bb523d98923c0fbb6f73ef46243bfe.jpg?auto=webp&format=pjpg&width=3840&quality=60");
        mImageUrls.add("https://cdn.britannica.com/34/212134-050-A7289400/Lionel-Messi-2018.jpg");

        mImageUrls.add("https://media.istockphoto.com/id/185117485/photo/multitasking-and-usablity-of-tablet.jpg?s=612x612&w=0&k=20&c=7LqKNK35gvLJgcJAn6TiIBVURWqY4h0JKhdB8Fum3IU=");
        mImageUrls.add("https://media.istockphoto.com/id/1456330562/photo/3d-rendering-of-light-bulb-covered-with-grass.jpg?s=612x612&w=0&k=20&c=Q8mHtoiNbrVX8rJhSXX24ONwtihcWkqnj7Wq-LcTQAY=");
        mImageUrls.add("https://media.istockphoto.com/id/1422090298/photo/real-life-young-female-aircraft-engineer-apprentice-at-work.jpg?s=612x612&w=0&k=20&c=cuZyrFykDubLR3bxJzlcRhBrXNyu2AsjXxzAwywAAuk=");
        mImageUrls.add("https://media.istockphoto.com/id/1411382784/photo/smart-mobile-phone-with-applications.jpg?s=612x612&w=0&k=20&c=zkYxOPkJP4-TRE13CiYxI-mibNow9nLQ1wkA8pDlrn0=");
        mImageUrls.add("https://media.istockphoto.com/id/509464671/photo/smart-watch.jpg?s=612x612&w=0&k=20&c=RDYfeSMutwJ778pweCYQwIvFKAcNCni5_m5B-iLkDZs=");
        mImageUrls.add("https://media.istockphoto.com/id/1473220071/photo/tangled-paper-tapes-with-arrows-pointing-different-ways-inside-human-head-shape-choice-and.jpg?s=612x612&w=0&k=20&c=GVAK3TH-4kcHVh5tL6NoGBOZzZbM_-205fzhs8d-Yyw=");

        mImageUrls.add("https://media.istockphoto.com/id/1460840877/photo/young-male-teacher-teaching-a-programing-class.jpg?s=612x612&w=0&k=20&c=RjzL35cS9oMbfI3Od5_ogh8ow0KK2-ZQc_tHChCbs7g=");
        mImageUrls.add("https://media.istockphoto.com/id/1279152430/photo/online-shopping-at-smartphone-with-flying-yellow-wallet-clutch-bag-and-shoe-background.jpg?s=612x612&w=0&k=20&c=G-q_kLZt4oVlq0SNnDxMgM5cSfHRt034_GWxFoEmaA0=");
        mImageUrls.add("https://media.istockphoto.com/id/1356503404/photo/space-capsule-astronaut.jpg?s=612x612&w=0&k=20&c=uK52uZrqDkVGV4iyYzno6tkcYJpQY_EWrziUeqbDkd8=");
        return root;
    }

    @Override
    public void onItemClick(String imageUrl) {
        Intent intent = new Intent(getActivity(), DetailsActivity.class);
        intent.putExtra("IMAGE_URL", imageUrl);
        startActivity(intent);
    }
}