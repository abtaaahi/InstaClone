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

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter_Noti extends RecyclerView.Adapter<RecyclerViewAdapter_Noti.ViewHolder>{
    private ArrayList<String> notidetails ;
    private ArrayList<String> idimage;
    private ArrayList<String> postimage;
    private Context mContext;
    public RecyclerViewAdapter_Noti(Context context, ArrayList<String> noti, ArrayList<String> id, ArrayList<String> post ) {
        notidetails = noti;
        idimage = id;
        mContext = context;
        postimage= post;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notilayout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.notidetailstext.setText(notidetails.get(position));
        Glide.with(mContext)
                .asBitmap()
                .load(idimage.get(position))
                .into(holder.idimage);
        Glide.with(mContext)
                .asBitmap()
                .load(postimage.get(position))
                .into(holder.postimage);
    }
    @Override
    public int getItemCount() {
        return notidetails.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView idimage;
        ImageView postimage;
        TextView notidetailstext;
        public ViewHolder(View itemView) {
            super(itemView);
            idimage = itemView.findViewById(R.id.idimage);
            postimage = itemView.findViewById(R.id.postimage);
            notidetailstext = itemView.findViewById(R.id.notidetails);
        }
    }
}