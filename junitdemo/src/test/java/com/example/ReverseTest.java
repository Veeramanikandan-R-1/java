package com.example;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReverseTest {

    @BeforeAll
    void beforeAll(){
        System.out.println("Before all");
    }

    @BeforeEach
    void beforeTest(){
        System.out.println("Runs before each tests");
    }

    @Test
    void test1(){
        assertEquals("inaM", new Reverse().reverseString("Mani"));
    }

    @Test
    void test2(){
        assertNotEquals("doogs si inaM", new Reverse().reverseString("Mani is good"),()->"String is not matching");
        assertEquals("doog si inaM", new Reverse().reverseString("Mani is good"),()->"String is not matching");
    }

    @Test
    void test_using_asserTrue(){
        assertTrue(true); // will pass the test case
        assertTrue("Mani".equals("Mani"));
    }

    @Test
    void testing_java_course(){
        PurchaseCourse pc = new PurchaseCourse();
        boolean status = pc.proceedWithCourse(new JavaCourse());
        assertTrue(status);
        boolean status1 = pc.proceedWithCourse(new JavaScript());
        System.out.println("status1----------- "+!status1);
        assertFalse(!status1);
    }

    @Test
    void assertArray(){
        int[] expected = {1,2,3,4};
        int[] actual = {1,2,3,4};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testingExceptions(){
        SortArray sortArr = new SortArray();
        assertThrows(NullPointerException.class, 
            ()->sortArr.sortedArray(null));
    }

    @Test
    void testingPerfomance(){
        SortArray sortArr = new SortArray();
        int[] arr2 = {6,3,5,5};
        assertTimeout(Duration.ofMillis(100), ()->sortArr.sortedArray(arr2));
    }

    @AfterEach
    void destroy(){
        System.out.println("Runs after each tests");
    }

    @AfterAll
    void afterAll(){
        System.out.println("after all");
    }
}
