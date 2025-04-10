package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");

        Demo d1 = context.getBean("demo", Demo.class);
        System.out.println(d1);

        // SpEL expression evaluation
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("22 + 44");
        System.out.println("SpEL Result: " + expression.getValue()); // Output: SpEL Result: 66
    }
}
