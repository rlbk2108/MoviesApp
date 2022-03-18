package com.example.movies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imgView;
    TextView Title;
    TextView Genre;
    TextView Rating;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imgView = itemView.findViewById(R.id.imageView);
        Title = itemView.findViewById(R.id.title);
        Genre = itemView.findViewById(R.id.genre);
        Rating = itemView.findViewById(R.id.rating);
    }
}
