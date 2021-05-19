package com.example.trial4;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mcontext;
    List<Stations> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mcontext, List<Stations> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mcontext).inflate(R.layout.item_home,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);

        //dialog
        myDialog = new Dialog(mcontext);
        myDialog.setContentView(R.layout.dialog_home);

        vHolder.iem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name = (TextView) myDialog.findViewById(R.id.name);
                TextView dialog_no  =(TextView) myDialog.findViewById(R.id.number);
                ImageView dialog_image = (ImageView) myDialog.findViewById(R.id.image_dialog);
                dialog_name.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_no.setText(mData.get(vHolder.getAdapterPosition()).getNumberBikes());
                dialog_image.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());


                Toast.makeText(mcontext,"Testing"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
            myDialog.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_id.setText(mData.get(position).getNumberBikes());
        holder.img.setImageResource(mData.get(position).getPhoto());


    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout iem;
        private TextView tv_name;
        private TextView tv_id;
        private ImageView img;
        public MyViewHolder(View itemView) {
            super(itemView);

            tv_name= itemView.findViewById(R.id.name_station);
            tv_id = itemView.findViewById(R.id.no_bikes);
            img= itemView.findViewById(R.id.img_home);
            iem = (LinearLayout) itemView.findViewById(R.id.home_bikes);
        }
    }

}
