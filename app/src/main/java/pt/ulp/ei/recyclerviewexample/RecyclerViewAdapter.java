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
    TextView textViewDesignacao;
    TextView textViewValor;

    public RecyclerViewAdapter(Context context1,Linguagem[] listaValores){

        valores = listaValores;
        context = context1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewDesignacao;
        public TextView textViewValor;

        public ViewHolder(View v){

            super(v);

            textViewDesignacao = (TextView)v.findViewById(R.id.textview_item);
            textViewValor = (TextView)v.findViewById(R.id.textview_item2);
        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        view1 = LayoutInflater.from(context).inflate(R.layout.recycleview_items,parent,false);

        viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        holder.textViewDesignacao.setText(valores[position].getDesignacao());
        holder.textViewValor.setText(valores[position].getValor());

    }

    @Override
    public int getItemCount(){
        return valores.length;
    }
}

