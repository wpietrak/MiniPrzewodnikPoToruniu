package pl.wojciechpietrak.miniprzewodnikpotoruniu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class PeopleRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        RecyclerView peopleRecycler = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        peopleRecycler.setLayoutManager(layoutManager);


        String[] peopleName = new String[People.peoples.length];
        for (int i = 0; i < peopleName.length; i++) {
            peopleName[i] = People.peoples[i].getName();
        }

        String[] peopleDescription = new String[People.peoples.length];
        for (int i = 0; i < peopleName.length; i++) {
            peopleDescription[i] = People.peoples[i].getDescription();
        }

        int[] peopleResourceId = new int[People.peoples.length];
        for (int i = 0; i < peopleName.length; i++) {
            peopleResourceId[i] = People.peoples[i].getResourceId();
        }


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(peopleName, peopleDescription, peopleResourceId);
        peopleRecycler.setAdapter(adapter);

        adapter.setListener(new RecyclerViewAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getApplicationContext(), PeopleDetail.class);
                intent.putExtra(PeopleDetail.EXTRA_PEOPLE_NO, position);
                startActivity(intent);
            }
        });

    }

}
