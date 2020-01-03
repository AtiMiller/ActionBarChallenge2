package com.example.actionbarchallenge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder>
{
    private ArrayList<Book> books;

    ItemClicked activity;

    public interface ItemClicked
    {
        void onItemClicked(int index);
    }

    public BookAdapter (Context context, ArrayList<Book> list)
    {
        books = list;
        activity = (ItemClicked) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivType;
        TextView tvWriter, tvTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivType = itemView.findViewById(R.id.ivType);
            tvWriter = itemView.findViewById(R.id.tvWriter);
            tvTitle = itemView.findViewById(R.id.tvTitle);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    activity.onItemClicked(books.indexOf((Book)view.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.ViewHolder holder, int position) {

        holder.itemView.setTag(books.get(position));

        holder.tvWriter.setText(books.get(position).getWriter());
        holder.tvTitle.setText(books.get(position).getTitle());


        if (books.get(position).getType().equals("SciFi"))
        {
            holder.ivType.setImageResource(R.drawable.scfi);
        } else if (books.get(position).getType().equals("Drama"))
        {
            holder.ivType.setImageResource(R.drawable.drama);
        }else
        {
            holder.ivType.setImageResource(R.drawable.romance);
        }

    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
