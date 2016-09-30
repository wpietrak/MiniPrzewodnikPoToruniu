package pl.wojciechpietrak.miniprzewodnikpotoruniu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;

public class InfoTorun extends AppCompatActivity {

//    @BindView(R.id.info_title)
//    public TextView mTitleInfo;
//    @BindView(R.id.info_img)
//    public ImageView mImgInfo;
//    @BindView(R.id.info_text)
//    public TextView mTextInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_torun);
    }
}
