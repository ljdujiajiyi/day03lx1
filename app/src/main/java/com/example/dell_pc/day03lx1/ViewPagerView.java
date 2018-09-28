package com.example.dell_pc.day03lx1;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/*
 * 作者：秦永聪
 *日期：2018/9/28
 * */public class ViewPagerView extends RelativeLayout {
    private ViewPager mviewpager;
    private  MyAdpater myAdpater;
    public ViewPagerView(Context context) {
        super(context);
        init(context);
    }


    public ViewPagerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ViewPagerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    Context context;
    private void init(Context context) {
        this.context=context;
        View view = View.inflate(context, R.layout.viewpager, null);
        mviewpager=view.findViewById(R.id.mviewpager);
        myAdpater=new MyAdpater();
        mviewpager.setAdapter(myAdpater);
        addView(view);

    }
    private List<String> imageList=new ArrayList<>();
    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
        myAdpater.notifyDataSetChanged();
    }

    class MyAdpater extends PagerAdapter{

        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
           ImageView view=new ImageView(context);
//            View view = View.inflate(context, R.layout.item, null);
//            ImageView img=view.findViewById(R.id.image);
            Picasso.with(context).load(imageList.get(position%imageList.size())).fit().into(view);
            container.addView(view);
            return view;
        }
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
   }

}
