package pl.wojciechpietrak.miniprzewodnikpotoruniu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PeopleDetail extends AppCompatActivity {

    @BindView(R.id.name)
    public TextView mName;
    @BindView(R.id.img)
    public ImageView mImg;
    @BindView(R.id.info)
    public TextView mInfo;

    public static final String EXTRA_PEOPLE_NO = "peopleNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_detail);
        ButterKnife.bind(this);

        int dateNo = (Integer) getIntent().getExtras().get(EXTRA_PEOPLE_NO);

        String dateName = People.peoples[dateNo].getName();
        mName.setText(dateName);

        int dateImg = People.peoples[dateNo].getResourceId();
        mImg.setImageDrawable(getResources().getDrawable(dateImg));
        mImg.setContentDescription(dateName);

        String dateInfo = People.peoples[dateNo].getInfo();
        mInfo.setText(dateInfo);
    }

}
