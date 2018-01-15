package com.alodokter.arfirman.myshunsineiak.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alodokter.arfirman.myshunsineiak.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.detail_humidity) TextView mHumadity;
    @BindView(R.id.detail_pressure) TextView mPressure;
    @BindView(R.id.detail_wind) TextView mWind;
    @BindView(R.id.main_weather_desc) TextView mMainDesc;
    @BindView(R.id.main_weather_temp) TextView mMainTemp;
    @BindView(R.id.main_today) TextView mMainDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();
    }

    private void initView() {
        ButterKnife.bind(this);

        mMainDay.setText("Senin");
        mMainDesc.setText("Berawan");
        mMainTemp.setText("30" + getResources().getString(R.string.degree));
        mHumadity.setText("40%");
        mPressure.setText("120 hPa");
        mWind.setText("1.5 km/h NE");


    }
}
