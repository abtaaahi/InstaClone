package com.abtahiapp.instagramclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Notifications extends AppCompatActivity {
    private ArrayList<String> notidetails=new ArrayList<>();private ArrayList<String> idimage=new ArrayList<>();private ArrayList<String> postimage=new ArrayList<>();
    private ArrayList<String> notidetails2=new ArrayList<>();private ArrayList<String> idimage2=new ArrayList<>();private ArrayList<String> postimage2=new ArrayList<>();
    private ArrayList<String> notidetails3 = new ArrayList<>();private ArrayList<String> idimage3=new ArrayList<>();private ArrayList<String> postimage3=new ArrayList<>();
    private ArrayList<String> notidetails4 = new ArrayList<>();private ArrayList<String> idimage4=new ArrayList<>();private ArrayList<String> postimage4=new ArrayList<>();
    private ArrayList<String> notidetails5 = new ArrayList<>();private ArrayList<String> idimage5=new ArrayList<>();private ArrayList<String> postimage5=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        getSupportActionBar().hide();

        ImageButton BackButton = findViewById(R.id.backButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Notifications.this, MainActivity.class));
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter_Noti adapter = new RecyclerViewAdapter_Noti(this, notidetails, idimage,postimage);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        notidetails.add("_alex_40 liked your story. 57m");
        idimage.add("https://media.istockphoto.com/id/1485546774/photo/bald-man-smiling-at-camera-standing-with-arms-crossed.jpg?s=612x612&w=0&k=20&c=9vuq6HxeSZfhZ7Jit_2HPVLyoajffb7h_SbWssh_bME=");
        postimage.add("https://media.istockphoto.com/id/185117485/photo/multitasking-and-usablity-of-tablet.jpg?s=612x612&w=0&k=20&c=7LqKNK35gvLJgcJAn6TiIBVURWqY4h0JKhdB8Fum3IU=");

        notidetails.add("williamson liked your story. 1h");
        idimage.add("https://media.istockphoto.com/id/1425262386/photo/portrait-of-handsome-smiling-young-man-with-crossed-arms.jpg?s=612x612&w=0&k=20&c=vZ2QIJnLqjXMt4BY4dpPNjAU3ir1GLxoCHpS-3lnTrk=");
        postimage.add("https://media.istockphoto.com/id/1456330562/photo/3d-rendering-of-light-bulb-covered-with-grass.jpg?s=612x612&w=0&k=20&c=Q8mHtoiNbrVX8rJhSXX24ONwtihcWkqnj7Wq-LcTQAY=");


        RecyclerView recyclerView2 = findViewById(R.id.recycler_view2);
        RecyclerViewAdapter_Noti adapter2 = new RecyclerViewAdapter_Noti(this, notidetails2, idimage2,postimage2);
        recyclerView2.setAdapter(adapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

        notidetails2.add("brett_lee liked your story. 13h");
        idimage2.add("https://media.istockphoto.com/id/1498992722/photo/portrait-of-smiling-entrepreneur-showing-thumbs-up-and-messaging-on-smartphone-on-yellow.jpg?s=612x612&w=0&k=20&c=X1rBwaBXebL-fxc__LuNaFKQh92bFPgdZDFaB5P-Fo8=");
        postimage2.add("https://media.istockphoto.com/id/1411382784/photo/smart-mobile-phone-with-applications.jpg?s=612x612&w=0&k=20&c=zkYxOPkJP4-TRE13CiYxI-mibNow9nLQ1wkA8pDlrn0=");

        notidetails2.add("gayle.333 liked your story. 17h");
        idimage2.add("https://media.istockphoto.com/id/1490616593/photo/portrait-of-pleased-young-man.jpg?s=612x612&w=0&k=20&c=rKLj2WrKwZIo9_3DJksAbMXBp5yJuX0ybMe35nLg8rU=");
        postimage2.add("https://media.istockphoto.com/id/1422090298/photo/real-life-young-female-aircraft-engineer-apprentice-at-work.jpg?s=612x612&w=0&k=20&c=cuZyrFykDubLR3bxJzlcRhBrXNyu2AsjXxzAwywAAuk=");


        RecyclerView recyclerView3 = findViewById(R.id.recycler_view3);
        RecyclerViewAdapter_Noti adapter3 = new RecyclerViewAdapter_Noti(this, notidetails3, idimage3,postimage3);
        recyclerView3.setAdapter(adapter3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));

        notidetails3.add("shakib_75 liked your post. 2d");
        idimage3.add("https://media.istockphoto.com/id/1197834451/photo/portrait-of-men-smiling-at-the-beach.jpg?s=612x612&w=0&k=20&c=OxOAreW7spYJeQdQgMySALAaA1NY3LvexVlQP3yUVyk=");
        postimage3.add("https://media.istockphoto.com/id/1460840877/photo/young-male-teacher-teaching-a-programing-class.jpg?s=612x612&w=0&k=20&c=RjzL35cS9oMbfI3Od5_ogh8ow0KK2-ZQc_tHChCbs7g=");

        notidetails3.add("virat_kohli liked your post. 4d");
        idimage3.add("https://media.istockphoto.com/id/1451087401/photo/happy-male-farmer-using-mobile-phone-in-field.jpg?s=612x612&w=0&k=20&c=gh1MGIJBfFJEmUpVaKlQ_FN40VEjlCEYdSp5LNgDGHE=");
        postimage3.add("https://media.istockphoto.com/id/1279152430/photo/online-shopping-at-smartphone-with-flying-yellow-wallet-clutch-bag-and-shoe-background.jpg?s=612x612&w=0&k=20&c=G-q_kLZt4oVlq0SNnDxMgM5cSfHRt034_GWxFoEmaA0=");
        notidetails3.add("lio_messi liked your post. 4d");
        idimage3.add("https://media.istockphoto.com/id/1447889583/photo/portrait-of-mature-businessman-working-on-laptop-at-desk-in-office.jpg?s=612x612&w=0&k=20&c=kp6LaD6UmT-oVpihKKENRMakaFP2IpZX8BmfFV9SRWg=");
        postimage3.add("https://media.istockphoto.com/id/1356503404/photo/space-capsule-astronaut.jpg?s=612x612&w=0&k=20&c=uK52uZrqDkVGV4iyYzno6tkcYJpQY_EWrziUeqbDkd8=");

        notidetails3.add("neyyyyy_10 liked your post. 6d");
        idimage3.add("https://media.istockphoto.com/id/1327603929/photo/portrait-of-mature-businessman.jpg?s=612x612&w=0&k=20&c=fwbWa60d9B_u1-7wwUHUq-XS6PVk-xv7ZpemD8KC2_g=");
        postimage3.add("https://media.istockphoto.com/id/1473220071/photo/tangled-paper-tapes-with-arrows-pointing-different-ways-inside-human-head-shape-choice-and.jpg?s=612x612&w=0&k=20&c=GVAK3TH-4kcHVh5tL6NoGBOZzZbM_-205fzhs8d-Yyw=");


        RecyclerView recyclerView4 = findViewById(R.id.recycler_view4);
        RecyclerViewAdapter_Noti adapter4 = new RecyclerViewAdapter_Noti(this, notidetails4, idimage4,postimage4);
        recyclerView4.setAdapter(adapter4);
        recyclerView4.setLayoutManager(new LinearLayoutManager(this));

        notidetails4.add("ms_dhoni liked your post. 2w");
        idimage4.add("https://media.istockphoto.com/id/1161094484/photo/face-of-handsome-senior-man-sitting-at-the-park.jpg?s=612x612&w=0&k=20&c=_Sdh5smPTHvW3SkrkLMN9-J94Thk6PObNQ7kB5402zA=");
        postimage4.add("https://upload.wikimedia.org/wikipedia/commons/d/d7/Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg");

        notidetails4.add("sergioRamos liked your post. 3w");
        idimage4.add("https://media.istockphoto.com/id/1329031407/photo/young-man-with-backpack-taking-selfie-portrait-on-a-mountain-smiling-happy-guy-enjoying.jpg?s=612x612&w=0&k=20&c=WvjAEx3QlWoAn49drp0N1vmxAgGObxWDpoXtaU2iB4Q=");
        postimage4.add("https://www.fcbarcelona.com/fcbarcelona/photo/2020/04/08/9da2ff96-4cc4-4c22-9526-0cbb54b95221/INIESTA.png");

        notidetails4.add("41_maldini liked your post. 4w");
        idimage4.add("https://media.istockphoto.com/id/2000672702/photo/happy-smiling-mature-indian-or-latin-business-man-ceo-trader-using-computer-typing-working-in.jpg?s=612x612&w=0&k=20&c=cQ7M4YxnYYDTKzYMS6pKjmZAH-9LpXjcMmJJyhT6LE0=");
        postimage4.add("https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt4006aa4324d537f4/60da723d0401cb0ebfa64256/79f3ed1268bb523d98923c0fbb6f73ef46243bfe.jpg?auto=webp&format=pjpg&width=3840&quality=60");

        notidetails4.add("cristiano liked your post. 4w");
        idimage4.add("https://media.istockphoto.com/id/1040964930/photo/opportunity-doesnt-hang-around-neither-should-you.jpg?s=612x612&w=0&k=20&c=7VX1J5vcwhVB55O7eNcb6J-Mp9O7Y7llMMiR9O8zIcU=");
        postimage4.add("https://p.imgci.com/db/PICTURES/CMS/223900/223989.6.jpg");


        RecyclerView recyclerView5 = findViewById(R.id.recycler_view5);
        RecyclerViewAdapter_Noti adapter5 = new RecyclerViewAdapter_Noti(this, notidetails5, idimage5,postimage5);
        recyclerView5.setAdapter(adapter5);
        recyclerView5.setLayoutManager(new LinearLayoutManager(this));

        notidetails5.add("mustafiz_23 liked your post. 5w");
        idimage5.add("https://media.istockphoto.com/id/693275072/photo/the-next-best-triumph-could-be-around-the-corner.jpg?s=612x612&w=0&k=20&c=WbckWskyVP9dpG_xZqhe_59QbbifKtEJ5YfoRW5RW58=");
        postimage5.add("https://e0.pxfuel.com/wallpapers/676/771/desktop-wallpaper-neymar-jr-wp-sports-uniform-neymar-jr-soccer-sports-gear-neymarjr.jpg");

        notidetails5.add("mushfik_15 liked your post. 5w");
        idimage5.add("https://media.istockphoto.com/id/1448418038/photo/studio-portrait-of-a-young-man.jpg?s=612x612&w=0&k=20&c=bWsAX1LM381ubLlYTl16BOuxhMA0MYZT4ne3qX_oElk=");
        postimage5.add("https://images.prothomalo.com/prothomalo-english%2F2023-07%2F189bd66e-8e6f-42cb-acba-9f007ac9be0b%2Fprothomalo_bangla_2023_07_b221b13b_295e_4db2_94a4_2f1c17882e5f_b2498b8a_86c1_4f5e_a029_acd28e235300_.webp?rect=0%2C0%2C1280%2C720&auto=format%2Ccompress&fmt=webp&dpr=1.0&format=webp&w=480");

        notidetails5.add("mahmudullah liked your post. 6w");
        idimage5.add("https://media.istockphoto.com/id/1392990621/photo/smart-handsome-positive-indian-or-arabian-guy-with-glasses-in-casual-wear-student-or.jpg?s=612x612&w=0&k=20&c=qyj5Dh8_uN5Xue9aICOI0z_OYyzNh_f1pFeAhRA4FQA=");
        postimage5.add("https://cdn.britannica.com/34/212134-050-A7289400/Lionel-Messi-2018.jpg");

        notidetails5.add("van_dijk liked your post. 6w");
        idimage5.add("https://media.istockphoto.com/id/944300692/photo/cheerful-young-athlete-outdoors-by-the-river.jpg?s=612x612&w=0&k=20&c=9Cxf4INOF558cWhE1LAOmXM1RMaUBw8zp8YVIcSkN8M=");
        postimage5.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/media_bank/202310/tamim-iqbals-controversial-omission--blessing-in-disguise-for-bangladesh-courtesy-reuters-09322294-3x4.jpg?VersionId=V6mPve0QKZZ3cZF3xotnKhkv0cfkoprN");

    }
}