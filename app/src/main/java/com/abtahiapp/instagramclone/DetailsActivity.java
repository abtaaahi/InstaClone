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

public class DetailsActivity extends AppCompatActivity {
    ImageButton heartButton,saveButton;
    boolean isHeartClicked = false;
    boolean isSaveClicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().hide();

        ImageButton BackButton = findViewById(R.id.backButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailsActivity.this, MyAccount.class));
            }
        });

        String imageUrl = getIntent().getStringExtra("IMAGE_URL");
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this)
                .load(imageUrl)
                .into(imageView);

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
