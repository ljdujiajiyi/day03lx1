package com.example.dell_pc.day03lx1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ViewPagerView mzViewpager=findViewById(R.id.mzViewpager);
        List<String> stringList=new ArrayList<>();
        stringList.add("https://img.huxiucdn.com/article/cover/201809/28/075950038970.jpg?imageView2/1/w/710/h/400/|imageMogr2/strip/interlace/1/quality/85/format/jpg");
        stringList.add("https://img.huxiucdn.com/article/cover/201809/28/092402415399.jpg?imageView2/1/w/710/h/400/|imageMogr2/strip/interlace/1/quality/85/format/jpg");
        stringList.add("https://img.huxiucdn.com/article/cover/201809/28/080420659171.jpg?imageView2/1/w/710/h/400/|imageMogr2/strip/interlace/1/quality/85/format/jpg");
        mzViewpager.setImageList(stringList);
    }
}
