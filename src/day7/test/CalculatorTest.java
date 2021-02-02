package day7.test;

import day7.study3.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 初始化方法
     * 用于资源申请，所有执行方法之前都会执行此方法
     */
    @Before
    public void init() {
        System.out.println("初始化成功...");
    }

    /**
     * 释放资源的方法
     * 所有的方法执行之后，都会执行此方法
     */
    @After
    public void close() {
        System.out.println("释放资源成功...");
    }

    @Test
    public void testAdd() {
        System.out.println("测试中");
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        Assert.assertEquals(4, result);
    }
}
