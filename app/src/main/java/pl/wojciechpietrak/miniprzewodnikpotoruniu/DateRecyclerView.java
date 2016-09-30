package pl.wojciechpietrak.miniprzewodnikpotoruniu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DateRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        RecyclerView peopleRecycler = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        peopleRecycler.setLayoutManager(layoutManager);


        String[] dateName = new String[Date.dates.length];
        for (int i = 0; i < dateName.length; i++) {
            dateName[i] = Date.dates[i].getName();
        }

        String[] dataDescription = new String[Date.dates.length];
        for (int i = 0; i < dateName.length; i++) {
            dataDescription[i] = Date.dates[i].getDescription();
        }

        int[] dataResourceId = new int[Date.dates.length];
        for (int i = 0; i < dateName.length; i++) {
            dataResourceId[i] = Date.dates[i].getResourceId();
        }


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(dateName, dataDescription, dataResourceId);
        peopleRecycler.setAdapter(adapter);

        adapter.setListener(new RecyclerViewAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getApplicationContext(), DateDetail.class);
                intent.putExtra(DateDetail.EXTRA_DATE_NO, position);
                startActivity(intent);
            }
        });
    }
}
