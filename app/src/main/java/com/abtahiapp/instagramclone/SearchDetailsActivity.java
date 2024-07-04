package com.abtahiapp.instagramclone;
import static java.security.AccessController.getContext;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class SearchDetailsActivity extends AppCompatActivity {
    ImageButton heartButton,saveButton;
    boolean isHeartClicked = false;
    boolean isSaveClicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_details);
        getSupportActionBar().hide();

        ImageButton BackButton = findViewById(R.id.backButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchDetailsActivity.this, Search.class));
            }
        });

        String imageUrl = getIntent().getStringExtra("IMAGE_URL");
        String username = getIntent().getStringExtra("USERNAME");
        TextView imagename=findViewById(R.id.image_name);
        TextView imageid_name=findViewById(R.id.imageidname);
        imagename.setText(username);
        imageid_name.setText(username);
        ImageView imageView = findViewById(R.id.imageView);
        ImageView imagecircle=findViewById(R.id.image);
        Glide.with(this)
                .load(imageUrl)
                .into(imageView);
        Glide.with(this)
                .load(imageUrl)
                .into(imagecircle);

        heartButton = findViewById(R.id.heart);
        saveButton = findViewById(R.id.save);
        heartButton.setImageResource(R.drawable.heart);
        saveButton.setImageResource(R.drawable.save);

        heartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isHeartClicked) {
                    heartButton.setImageResource(R.drawable.heart);
                } else {
                    heartButton.setImageResource(R.drawable.redheart);
                }
                isHeartClicked = !isHeartClicked;
            }
        });
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isSaveClicked) {
                    saveButton.setImageResource(R.drawable.save);
                } else {
                    saveButton.setImageResource(R.drawable.saveful);
                }
                isSaveClicked = !isSaveClicked;
            }
        });
        int sizeInDp = 26;
        int sizeInPixels = dpToPx(this, sizeInDp);
        heartButton.setLayoutParams(new LinearLayout.LayoutParams(sizeInPixels, sizeInPixels));
        heartButton.setScaleType(ImageView.ScaleType.FIT_XY);
        saveButton.setLayoutParams(new LinearLayout.LayoutParams(sizeInPixels, sizeInPixels));
        saveButton.setScaleType(ImageView.ScaleType.FIT_XY);
    }
    private int dpToPx(Context context, int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }
}
