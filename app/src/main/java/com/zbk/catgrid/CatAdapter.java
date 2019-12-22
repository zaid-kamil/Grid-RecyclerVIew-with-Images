package com.zbk.catgrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.Holder> {

    Context c;
    List<DataModel> datalist;
    int layout;
    LayoutInflater inflater;

    public CatAdapter(Context c, List<DataModel> datalist, int layout) {
        this.c = c;
        this.datalist = datalist;
        this.layout = layout;
        inflater= LayoutInflater.from(c);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v  = inflater.inflate(layout,parent,false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        DataModel model = datalist.get(position);
        holder.textName.setText(model.name);
        Glide.with(c).load(model.image).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }


    public class Holder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView textName;
        public Holder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            textName = itemView.findViewById(R.id.textName);
        }
    }
}
