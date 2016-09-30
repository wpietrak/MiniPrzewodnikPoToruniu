package pl.wojciechpietrak.miniprzewodnikpotoruniu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class TopActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.img_monuments, R.id.but_museum})
    public void monumentClick (View view) {
        Intent intent = new Intent(this, MonumentRecyclerView.class);
        startActivity(intent);
    }

    @OnClick({R.id.img_people, R.id.but_people})
    public void peopleClick (View view) {
        Intent intent = new Intent(this, PeopleRecyclerView.class);
        startActivity(intent);
    }

    @OnClick({R.id.img_dates, R.id.but_dates})
    public void dateClick (View view) {
        Intent intent = new Intent(this, DateRecyclerView.class);
        startActivity(intent);
    }

    @OnClick({R.id.but_info, R.id.img_info})
    public void infoClick (View view) {
        Intent intent = new Intent(this, InfoTorun.class);
        startActivity(intent);
    }
}
