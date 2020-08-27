package com.vinaylogics.playwithjava.datastructures.collection.list;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("To test implementation of the singly linked list")
class MyLinkedListTest {
    MyLinkedList myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new MyLinkedList();
    }

    @DisplayName("Test for insertion")
    @Test
    void testInsert(){
        assertNotNull(myLinkedList);
        assertNull(myLinkedList.head);
        IntStream.rangeClosed(1,10).forEach(myLinkedList::insert);
        assertNotNull(myLinkedList.head);
    }

    @DisplayName("Test for print")
    @Test
    void testPrint(){
        testInsert();
        myLinkedList.printList();
    }


    @AfterEach
    void tearDown() {
    }
}