package com.abtahiapp.instagramclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    private ArrayList<String> mImages;
    private ArrayList<String> username;
    private Context mContext;
    private OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(String imageUrl,String user);
    }
    public ImageAdapter(Context context, ArrayList<String> images,ArrayList<String> uname , OnItemClickListener listener ) {
        mImages = images;
        username = uname;
        mContext = context;
        mListener = listener;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.searchlayout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);
        final int adapterPosition = holder.getAdapterPosition();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onItemClick(mImages.get(adapterPosition),username.get(adapterPosition));
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return mImages.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image; TextView usern;
        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageview_widget);
            usern=itemView.findViewById(R.id.username);
        }
    }
}
