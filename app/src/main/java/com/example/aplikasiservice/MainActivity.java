package com.example.aplikasiservice;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppComatActivity {
    private Button mSetBtn;
    private Button mUnset;
    private RadioButton mMenitRadio;
    private RadioButton mLimaRadio;
    private RadioButton mTigapuluhRadio;
    private RadioButton mJamRadio;
    private RadioGroup mTimeRadioGrup;
    public int mChangeTime = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

    }
}
