package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ForumUserTestSuite {

    @Test
    public void testGetUsername(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When
        String forumUser = context.getBean(ForumUser.class).username;
        //Then
        Assert.assertEquals("John Smith", forumUser);

    }


}