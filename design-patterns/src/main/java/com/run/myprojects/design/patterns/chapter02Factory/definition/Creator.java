package com.run.myprojects.design.patterns.chapter02Factory.definition;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/9
 */
public abstract class Creator {
    /**
     * 创建一个产品对象，期输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
