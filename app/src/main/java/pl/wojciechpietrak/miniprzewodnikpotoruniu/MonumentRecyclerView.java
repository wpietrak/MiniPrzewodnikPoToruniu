package pl.wojciechpietrak.miniprzewodnikpotoruniu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MonumentRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        RecyclerView monumentRecycler = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        monumentRecycler.setLayoutManager(layoutManager);

        String[] monumentName = new String[Monument.dates.length];
        for (int i = 0; i < monumentName.length; i++) {
            monumentName[i] = Monument.dates[i].getMonName();
        }

        String[] monumentDescription = new String[Monument.dates.length];
        for (int i = 0; i < monumentName.length; i++) {
            monumentDescription[i] = Monument.dates[i].getMonDescription();
        }

        int[] monumentImg = new int[Monument.dates.length];
        for (int i = 0; i < monumentName.length; i++) {
            monumentImg[i] = Monument.dates[i].getMonResourceId();
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(monumentName, monumentDescription, monumentImg);
        monumentRecycler.setAdapter(adapter);

        adapter.setListener(new RecyclerViewAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getApplicationContext(), MonumentDetail.class);
                intent.putExtra(MonumentDetail.EXTRA_MONUMENT_NO, position);
                startActivity(intent);
            }
        });

    }

}
