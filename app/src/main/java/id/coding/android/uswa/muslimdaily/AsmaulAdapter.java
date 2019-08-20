package id.coding.android.uswa.muslimdaily;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AsmaulAdapter extends RecyclerView.Adapter<AsmaulAdapter.AsmaHusnaViewHolder> {

    private ArrayList<AsmaHusna> dataList;

    public AsmaulAdapter( ArrayList<AsmaHusna> dataList){
        this.dataList= dataList;
    }

    @NonNull
    @Override
    public  AsmaulAdapter.AsmaHusnaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.asmaul_list_item, parent, false);
        return new AsmaHusnaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AsmaulAdapter.AsmaHusnaViewHolder holder, int position) {
        holder.txtNo.setText(dataList.get(position).getNo());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtArti.setText(dataList.get(position).getArti());
        holder.txtArab.setText(dataList.get(position).getArab());
    }

    @Override
    public int getItemCount() {
        return (dataList != null)? dataList.size(): 0 ;
    }

    public class AsmaHusnaViewHolder extends  RecyclerView.ViewHolder{
        private TextView txtNo, txtNama, txtArti, txtArab;

        public AsmaHusnaViewHolder(@NonNull View itemView){
            super(itemView);
            txtNo = (TextView) itemView.findViewById(R.id.getno);
            txtNama = (TextView) itemView.findViewById(R.id.getas);
            txtArti = (TextView) itemView.findViewById(R.id.getartias);
            txtArab = (TextView) itemView.findViewById(R.id.getarabas);
        }
    }
}

