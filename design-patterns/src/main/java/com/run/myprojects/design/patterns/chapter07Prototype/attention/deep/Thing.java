package com.run.myprojects.design.patterns.chapter07Prototype.attention.deep;

import java.util.ArrayList;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Thing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public Thing clone() {
        Thing thing = null;


        try {
            thing = (Thing) super.clone();
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }
}
