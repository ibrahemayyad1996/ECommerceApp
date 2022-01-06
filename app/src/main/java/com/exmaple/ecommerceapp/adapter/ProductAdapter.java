package com.exmaple.ecommerceapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.exmaple.ecommerceapp.R;
import com.exmaple.ecommerceapp.model.Product;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {


    ArrayList<Product> data = new ArrayList<Product>();


    public ProductAdapter(ArrayList<Product> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_product,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, int position) {
        holder.name.setText(data.get(position).getTitle());
        holder.category.setText(data.get(position).getCategory());
        holder.price.setText("$"+data.get(position).getPrice());
        holder.ratingBar.setRating(data.get(position).getRating().getRate());

        Glide.with(holder.image.getContext())
                .load(data.get(position).getImage())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return  data.size();
    }

    class ViewHolder extends  RecyclerView.ViewHolder{

        AppCompatImageView  image;
        TextView name;
        TextView category;
        TextView price;
        RatingBar ratingBar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            category = itemView.findViewById(R.id.category);
            price = itemView.findViewById(R.id.price);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }
    }
}
