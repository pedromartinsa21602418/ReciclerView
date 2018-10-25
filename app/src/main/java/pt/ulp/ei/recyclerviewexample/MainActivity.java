package pt.ulp.ei.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager recyclerViewLinearLayoutManager;

    RecyclerView.Adapter recyclerViewAdapter;
    String[] linguagens = {"C", "Java", "Python"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewLinguagens);
        recyclerViewLinearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLinearLayoutManager);

        recyclerViewAdapter= new RecyclerViewAdapter(getApplicationContext(), linguagens);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
