package com.mine.moviedemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mine.moviedemo.R;
import com.mine.moviedemo.fragment.FragmentHome;
import com.mine.moviedemo.fragment.FragmentMovie;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mTvHome;
    private TextView mTvMovie;
    private TextView mTvDiscover;
    private TextView mTvMine;
    private FragmentHome mHome;
    private FragmentMovie mMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    private void initView() {
        mTvHome = (TextView) findViewById(R.id.tv_home);
        mTvMovie = (TextView) findViewById(R.id.tv_movie);
        mTvDiscover = (TextView) findViewById(R.id.tv_discover);
        mTvMine = (TextView) findViewById(R.id.tv_mine);
    }

    private void setListener() {
        mTvHome.setOnClickListener(this);
        mTvMovie.setOnClickListener(this);
        mTvDiscover.setOnClickListener(this);
        mTvMine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_home:
                if(mHome==null){
                    mHome = new FragmentHome();
                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_main,mHome,"home").commit();
                break;

            case R.id.tv_movie:
                if(mMovie==null){
                    mMovie = new FragmentMovie();
                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_main,mMovie,"movie").commit();
                break;

            case R.id.tv_discover:

                break;

            case R.id.tv_mine:

                break;
        }
    }
}
