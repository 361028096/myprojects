package com.run.myprojects.design.patterns.chapter02Factory.expand.LazyInitializationFactory;

import com.run.myprojects.design.patterns.chapter02Factory.definition.ConcreteProduct1;
import com.run.myprojects.design.patterns.chapter02Factory.definition.ConcreteProduct2;
import com.run.myprojects.design.patterns.chapter02Factory.definition.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/9
 */
public class ProductFactory {
    private static final Map<String,Product> prMap = new HashMap<>();
    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            prMap.put(type,product);
        }
        return product;
    }
}
