package com.abtahiapp.instagramclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Chat extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mText = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        getSupportActionBar().hide();

        ImageButton BackButton = findViewById(R.id.backButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this, MainActivity.class));
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter_Chat adapter = new RecyclerViewAdapter_Chat(this, mNames, mImageUrls,mText);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView recyclerView2 = findViewById(R.id.recycler_view_story);
        RecyclerViewAdapter_Story adapter2 = new RecyclerViewAdapter_Story(this, mNames, mImageUrls);
        recyclerView2.setAdapter(adapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        mImageUrls.add("https://media.istockphoto.com/id/1497142431/photo/portrait-of-a-successful-male-businessman-banker-financial-director-sitting-in-the-office-at.jpg?s=612x612&w=0&k=20&c=OD3XQzvX7pUWR_5PonlQnhbGehy1u8z40VCPivGbRxA=");
        mNames.add("Satya Nadella");
        mText.add("Hey There!");

        mImageUrls.add("https://media.istockphoto.com/id/1460218857/photo/interview-strategy-and-corporate-people-or-manager-in-b2b-discussion-speaking-and-business.jpg?s=612x612&w=0&k=20&c=HIc2q6_bTaARK78OXTGwxrz6t4nLIaIo8uxKncvWMeE=");
        mNames.add("Sundar Pichai");
        mText.add("Google running nice?");

        mImageUrls.add("https://media.istockphoto.com/id/1513285157/photo/leader-ceo-and-manager-in-a-boardroom-meeting-with-his-team-for-planning-strategy-and.jpg?s=612x612&w=0&k=20&c=5pazFxAN8yRzwVdhNsyxtSEqLfEdMlGVGdDbbe7L5Ec=");
        mNames.add("Tim Cook");
        mText.add("Change to apple");

        mImageUrls.add("https://media.istockphoto.com/id/1934527441/photo/portrait-of-mid-aged-businessman-standing-at-the-office.jpg?s=612x612&w=0&k=20&c=u3D7JaRHsEQjC_f1F27j39YgzRcxTwszGklMd3Vwb34=");
        mNames.add("Lisa Su");
        mText.add("Ryzen is fast");

        mImageUrls.add("https://media.istockphoto.com/id/1450340623/photo/portrait-of-successful-mature-boss-senior-businessman-in-glasses-asian-looking-at-camera-and.jpg?s=612x612&w=0&k=20&c=f0EqWiUuID5VB_NxBUEDn92W2HLENR15CFFPzr-I4XE=");
        mNames.add("Jensen Huang");
        mText.add("Coding is a must!");

        mImageUrls.add("https://media.istockphoto.com/id/1435745704/photo/portrait-of-smiling-mid-adult-businessman-standing-at-corporate-office.jpg?s=612x612&w=0&k=20&c=NtTebZxpAfw964hJJut8WFa__eZEfO07CAKdqeFBrFU=");
        mNames.add("Sheryl Sandberg");
        mText.add("Keep Distance");

        mImageUrls.add("https://media.istockphoto.com/id/1477057174/photo/business-man-phone-and-thinking-at-window-of-communication-for-proposal-idea-black-male-smile.jpg?s=612x612&w=0&k=20&c=ST844JieXaHpKvnswXbKikG96IRNj41o7YTsouhDN0o=");
        mNames.add("Elon Musk");
        mText.add("Want to time travel?");

        mImageUrls.add("https://media.istockphoto.com/id/1450789095/photo/confident-young-businessman-standing-in-office-lobby.jpg?s=612x612&w=0&k=20&c=fVowYhOy7YDe4NtmdWNLz71zkxFndJjTXYgs5MeEHWY=");
        mNames.add("Parag Agrawal");
        mText.add("Make a tweeeeet!");

        mImageUrls.add("https://media.istockphoto.com/id/1391004450/photo/portrait-of-a-successful-businessman-working-in-a-classic-office-asian-smiling-and-happy.jpg?s=612x612&w=0&k=20&c=bOtnJCcdfs99VsTJpttghF0adb_ru-FzvGGw5GH4L4I=");
        mNames.add("Lei Jun");
        mText.add("Don't buy my things");

        mImageUrls.add("https://media.istockphoto.com/id/1437190522/photo/portrait-of-happy-succeffsul-young-business-man-leader-ceo-manager-using-digital-tablet-to.jpg?s=612x612&w=0&k=20&c=fzC0NniYC67tqxUG8eC90Rsgctvws3C3u4z2m_58P-4=");
        mNames.add("Mark Zuckerberg ");
        mText.add("How can you forget me?");
    }
}