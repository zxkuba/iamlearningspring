package com.kodilla.spring.calculator;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuit {

    @Test
    public void testCalculator(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(7.5, 7.5);
        double sub = calculator.sub(10.0, 5.5);
        double mul = calculator.mul(2.5, 2.5);
        double div = calculator.div(14.0, 2.0);
        //Then
        Assert.assertEquals(15.0, add, 0.0);
        Assert.assertEquals(4.5, sub, 0.0);
        Assert.assertEquals(6.25, mul, 0.0);
        Assert.assertEquals(7.0, div, 0.0);
    }
}