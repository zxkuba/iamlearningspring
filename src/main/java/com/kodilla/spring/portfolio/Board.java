package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {

    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

}
