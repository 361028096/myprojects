package com.run.myprojects.design.patterns.chapter01Singleton.expand;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/9
 */
public class Emperor {
    // 定义最多能产生的实例数量
    private static int maxNumOfEmperor = 2;
    // 每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<String>();
    // 定义一个列表，容纳所有皇帝实例
    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
    // 当前皇帝编号
    private static int countNumOfEmperor = 0;
    // 产生所有的对象
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }
    private Emperor() {}
    private Emperor(String name) {
        nameList.add(name);
    }
    // 随机获取一个皇帝对象
    public static Emperor getInstance() {
        Random random = new Random();
        // 随机拉出一个皇帝
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
