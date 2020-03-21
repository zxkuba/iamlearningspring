package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.getTask().add("dozrobienia");
        board.doneList.getTask().add("zrobione");
        board.inProgressList.getTask().add("robie");
        //Then
        Assert.assertEquals(1,board.toDoList.getTask().size());
        System.out.println(board.toDoList.getTask());
        Assert.assertEquals(1,board.doneList.getTask().size());
        System.out.println(board.doneList.getTask());
        Assert.assertEquals(1,board.inProgressList.getTask().size());
        System.out.println(board.inProgressList.getTask());
    }

}