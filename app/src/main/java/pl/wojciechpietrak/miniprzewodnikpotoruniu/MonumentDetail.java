package pl.wojciechpietrak.miniprzewodnikpotoruniu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MonumentDetail extends AppCompatActivity {

    public int monumentLon;
    public int monumentLat;

    @BindView(R.id.mon_name)
    public TextView mMonName;
    @BindView(R.id.mon_img)
    public ImageView mMonImg;
    @BindView(R.id.mon_info)
    public TextView mMonInfo;
    @BindView(R.id.goToMap)
    public Button mGoToMap;

    public static final String EXTRA_MONUMENT_NO = "monumentNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monument_detail);
        ButterKnife.bind(this);

       int monumentNo = (Integer) getIntent().getExtras().get(EXTRA_MONUMENT_NO);


        String monumentName = Monument.dates[monumentNo].getMonName();
        mMonName.setText(monumentName);

        int monumentImg = Monument.dates[monumentNo].getMonResourceId();
        mMonImg.setImageDrawable(getResources().getDrawable(monumentImg));
        mMonImg.setContentDescription(monumentName);

        String monumentInfo = Monument.dates[monumentNo].getMonInfo();
        mMonInfo.setText(monumentInfo);
      //  mMonInfo.setMovementMethod(new ScrollingMovementMethod());

    }

    @OnClick(R.id.goToMap)
    public void buttonClick(View view) {
        ButterKnife.bind(this);
        int monumentNo = (Integer) getIntent().getExtras().get(EXTRA_MONUMENT_NO);
        double monumentLon = Monument.dates[monumentNo].getMonLon();
        double monumentLat = Monument.dates[monumentNo].getMonLat();
        String monumentName = Monument.dates[monumentNo].getMonName();

        Intent intent = new Intent(this, Map.class);
        intent.putExtra("Lat", monumentLat);
        intent.putExtra("Lon", monumentLon);
        intent.putExtra("marker", monumentName);
        startActivity(intent);
    }


}
