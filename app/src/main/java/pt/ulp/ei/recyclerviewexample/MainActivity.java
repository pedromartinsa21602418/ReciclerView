package pt.ulp.ei.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView;
        LinearLayoutManager recyclerViewLinearLayoutManager;

        RecyclerView.Adapter recyclerViewAdapter;
        String[] linguagens;

        linguagens = getResources().getStringArray(R.array.linguagens);

        Linguagem[] v = new Linguagem[linguagens.length];
        int i = 0;
        for (String strLing : linguagens) {
            v[i] = new Linguagem(strLing);
            v[i].setValor(i);
            i++;
        }

        recyclerView = findViewById(R.id.recyclerViewLinguagens);
        recyclerViewLinearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLinearLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), v);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
