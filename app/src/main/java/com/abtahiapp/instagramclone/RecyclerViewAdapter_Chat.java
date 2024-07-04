package com.abtahiapp.instagramclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter_Chat extends RecyclerView.Adapter<RecyclerViewAdapter_Chat.ViewHolder>{
    private ArrayList<String> mImageNames ;
    private ArrayList<String> mImages;
    private ArrayList<String> mText;
    private Context mContext;
    public RecyclerViewAdapter_Chat(Context context, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> text ) {
        mImageNames = imageNames;
        mImages = images;
        mContext = context;
        mText= text;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chatlayout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.imageName.setText(mImageNames.get(position));
        holder.text.setText(mText.get(position));
        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);
    }
    @Override
    public int getItemCount() {
        return mImageNames.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView image;
        TextView imageName,text;
        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            text=itemView.findViewById(R.id.image_text);
        }
    }
}