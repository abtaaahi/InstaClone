
package com.abtahiapp.instagramclone;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter_Post extends RecyclerView.Adapter<RecyclerViewAdapter_Post.ViewHolder> {
    private ArrayList<String> mImageNames, mimageidname;
    private ArrayList<String> mImages, mimagepost;
    private Context mContext;

    public RecyclerViewAdapter_Post(Context context, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> imageidname, ArrayList<String> imagepost) {
        mImageNames = imageNames;
        mimageidname = imageidname;
        mimagepost = imagepost;
        mImages = images;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postlayout, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.imageName.setText(mImageNames.get(position));
        holder.imageidname.setText(mimageidname.get(position));

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);
        Glide.with(mContext)
                .asBitmap()
                .load(mimagepost.get(position))
                .into(holder.im);

        holder.heartButton.setImageResource(R.drawable.heart);
        holder.saveButton.setImageResource(R.drawable.save);

        holder.heartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle between the two icons
                if (holder.isHeartClicked) {
                    holder.heartButton.setImageResource(R.drawable.heart);
                } else {
                    holder.heartButton.setImageResource(R.drawable.redheart);
                }
                // Update icon state
                holder.isHeartClicked = !holder.isHeartClicked;
            }
        });
        holder.saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle between the two icons
                if (holder.isSaveClicked) {
                    holder.saveButton.setImageResource(R.drawable.save);
                } else {
                    holder.saveButton.setImageResource(R.drawable.saveful);
                }
                // Update icon state
                holder.isSaveClicked = !holder.isSaveClicked;
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        ImageView im;
        TextView imageName, imageidname;
        ImageButton heartButton,saveButton;
        boolean isHeartClicked = false;
        boolean isSaveClicked = false;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            im = itemView.findViewById(R.id.imageView);
            imageidname = itemView.findViewById(R.id.imageidname);
            imageName = itemView.findViewById(R.id.image_name);
            heartButton = itemView.findViewById(R.id.heart);
            saveButton = itemView.findViewById(R.id.save);

            int sizeInDp = 26; // Set the size in dp
            int sizeInPixels = dpToPx(itemView.getContext(), sizeInDp);

            heartButton.setLayoutParams(new LinearLayout.LayoutParams(sizeInPixels, sizeInPixels));
            heartButton.setScaleType(ImageView.ScaleType.FIT_XY);
            saveButton.setLayoutParams(new LinearLayout.LayoutParams(sizeInPixels, sizeInPixels));
            saveButton.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        private int dpToPx(Context context, int dp) {
            return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
        }
    }
}
