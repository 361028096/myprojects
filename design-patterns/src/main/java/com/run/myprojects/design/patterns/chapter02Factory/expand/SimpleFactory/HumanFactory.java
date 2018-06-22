package com.run.myprojects.design.patterns.chapter02Factory.expand.SimpleFactory;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
