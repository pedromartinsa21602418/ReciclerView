package pt.ulp.ei.recyclerviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    Linguagem[] valores;
    Context context;
    View view1;
    ViewHolder viewHolder1;

    public RecyclerViewAdapter(Context context1,Linguagem[] listaValores){

        this.valores = listaValores;
        this.context = context1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewDesignacao;
        public TextView textViewValor;

        public ViewHolder(View v){

            super(v);

            textViewDesignacao = v.findViewById(R.id.textview_item);
            textViewValor = v.findViewById(R.id.textview_item2);
        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        view1 = LayoutInflater.from(this.context).inflate(R.layout.recycleview_items,parent,false);

        viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        holder.textViewDesignacao.setText(this.valores[position].getDesignacao());
        holder.textViewValor.setText(""+this.valores[position].getValor());

    }

    @Override
    public int getItemCount(){
        return this.valores.length;
    }
}

