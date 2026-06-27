package hw01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void test1() {
        Task1.buyChick();
    }

    @Test
    void test2() {
        int[] a={16,13,15,18};
        int[] b={29,36,18};
        int[] c={16,13,15,18,29,36,18};
        int[] result = Task2.arrayMerge(a,b);
        assertArrayEquals(c, result);
    }

    @Test
    void test4() {
       Task4.Compute();
    }

    @Test
    void test5() {
        Task5.PrintFibonacci();
    }

    @Test
    void test6() {
       String binary= Task6.toBinary(99);
       System.out.println(binary);
    }
}