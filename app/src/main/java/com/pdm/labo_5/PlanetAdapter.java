package com.pdm.labo_5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by uca on 04-16-18.
 */

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>{

    Context myContext;
    List<Planets> planetsList;

    public PlanetAdapter(Context myContext, List<Planets> planetsList) {
        this.myContext = myContext;
        this.planetsList = planetsList;
    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(myContext);
        View view=inflater.inflate(R.layout.activity_cardview, null);
        return new PlanetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {
        holder.textViewTitle.setText(planetsList.get(position).getNombre());
        holder.textViewContent.setText(planetsList.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return planetsList.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{

        TextView textViewTitle, textViewContent;
        ImageView imageViewPhoto;

        public PlanetViewHolder(View itemView) {
            super(itemView);
            imageViewPhoto=itemView.findViewById(R.id.imageViewPhoto);
            textViewTitle=itemView.findViewById(R.id.textViewTitle);
            textViewContent=itemView.findViewById(R.id.textViewContent);
        }
    }

}
