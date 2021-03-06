package com.anarchy.classifyview.sample.normal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anarchy.classify.ClassifyView;
import com.anarchy.classifyview.R;
import com.anarchy.classifyview.core.MyAdapter;
import com.anarchy.classifyview.utils.SimpleBeanGenerate;

/**
 * <p/>
 * Date: 16/6/12 09:51
 * Author: zhendong.wu@shoufuyou.com
 * <p/>
 */
public class NormalFragment extends Fragment{
    private ClassifyView mClassifyView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.normal,container,false);
        mClassifyView = (ClassifyView) view.findViewById(R.id.classify_view);
        mClassifyView.setAdapter(new MyAdapter(SimpleBeanGenerate.generateBean()));
        mClassifyView.setDebugAble(true);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
