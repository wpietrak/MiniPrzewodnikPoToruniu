package pl.wojciechpietrak.miniprzewodnikpotoruniu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DateDetail extends AppCompatActivity {

    @BindView(R.id.name)
    public TextView mName;
    @BindView(R.id.img)
    public ImageView mImg;
    @BindView(R.id.info)
    public TextView mInfo;

    public static final String EXTRA_DATE_NO = "dateNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_detail);
        ButterKnife.bind(this);

        int dateNo = (Integer) getIntent().getExtras().get(EXTRA_DATE_NO);

        String dateName = Date.dates[dateNo].getName();
        mName.setText(dateName);

        int dateImg = Date.dates[dateNo].getResourceId();
        mImg.setImageDrawable(getResources().getDrawable(dateImg));
        mImg.setContentDescription(dateName);

        String dateInfo = Date.dates[dateNo].getInfo();
        mInfo.setText(dateInfo);
    }
}
