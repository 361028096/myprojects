package com.run.myprojects.design.patterns.chapter02Factory;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/9
 */
public class ConcreteCreateor extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
