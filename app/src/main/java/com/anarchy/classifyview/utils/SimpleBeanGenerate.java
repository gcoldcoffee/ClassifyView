package com.anarchy.classifyview.utils;

import com.anarchy.classifyview.core.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * User:  Anarchy
 * Email:  rsshinide38@163.com
 * CreateTime: 十二月/25/2016  11:57.
 * Description:
 */

public class SimpleBeanGenerate {
    public static List<List<Bean>> generateBean(){
        List<List<Bean>> data = new ArrayList<>();
        for(int i=0;i<30;i++){
            List<Bean> inner = new ArrayList<>();
            if(i>10) {
                int c = (int) (Math.random() * 15+1);
                for(int j=0;j<c;j++){
                    inner.add(new Bean());
                }
            }else {
                inner.add(new Bean());
            }
            data.add(inner);
        }
        return data;
    }
}
