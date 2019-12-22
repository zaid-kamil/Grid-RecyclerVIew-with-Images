package com.zbk.catgrid;

import java.util.ArrayList;
import java.util.List;

public class DummyDataGenerator {

    public static List<DataModel> create() {
        List<DataModel> modelList = new ArrayList<>();
        modelList.add(new DataModel("rose", R.drawable.pic_01));
        modelList.add(new DataModel("mary", R.drawable.pic_02));
        modelList.add(new DataModel("tuffy", R.drawable.pic_03));
        modelList.add(new DataModel("luffy", R.drawable.pic_04));
        modelList.add(new DataModel("goldy", R.drawable.pic_05));
        modelList.add(new DataModel("soni", R.drawable.pic_06));
        modelList.add(new DataModel("billu", R.drawable.pic_07));
        modelList.add(new DataModel("lady", R.drawable.pic_08));
        modelList.add(new DataModel("sam", R.drawable.pic_09));
        modelList.add(new DataModel("tom", R.drawable.pic_10));
        modelList.add(new DataModel("garfield", R.drawable.pic_11));
        modelList.add(new DataModel("max", R.drawable.pic_12));
        modelList.add(new DataModel("juliet", R.drawable.pic_13));
        modelList.add(new DataModel("rebecca", R.drawable.pic_14));
        modelList.add(new DataModel("samuel", R.drawable.pic_15));
        modelList.add(new DataModel("bucky", R.drawable.pic_16));
        modelList.add(new DataModel("snowbell", R.drawable.pic_17));
        return modelList;
    }
}
