package com.example.fragmentproject;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import com.example.fragmentproject.FragmentCall;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<Contacts> data;
    Dialog myDialog;

    public RecyclerViewAdapter(Context context, List<Contacts> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.items_contact, parent, false);
        final MyViewHolder viewHolder = new MyViewHolder(v);

        //  Dialog
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.dialog_contact);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        viewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView dialog_name = (TextView)myDialog.findViewById(R.id.dialog_name);
                TextView dialog_phone = (TextView)myDialog.findViewById(R.id.dialog_phone);
                ImageView dialog_photo = (ImageView)myDialog.findViewById(R.id.dialog_img);

                dialog_name.setText(data.get(viewHolder.getAdapterPosition()).getName());
                dialog_phone.setText(data.get(viewHolder.getAdapterPosition()).getPhone());
                dialog_photo.setImageResource(data.get(viewHolder.getAdapterPosition()).getPhoto());

                myDialog.show();



            }
        });


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(data.get(position).getName());
        holder.tv_phone.setText(data.get(position).getPhone());
        holder.img_photo.setImageResource(data.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout itemLayout;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img_photo;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemLayout = (LinearLayout)itemView.findViewById(R.id.contact_item_id);
            tv_name = (TextView)itemView.findViewById(R.id.name_tv);
            tv_phone = (TextView)itemView.findViewById(R.id.phone_tv);
            img_photo = (ImageView) itemView.findViewById(R.id.img);

        }
    }


}
