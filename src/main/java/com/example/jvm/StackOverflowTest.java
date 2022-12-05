package com.example.jvm;

/**
 * @Author: lvxuan
 * @program:
 * @Date: 2022/12/4 21:01
 * @Version: 1.0
 * @Description: des
 */
//-Xss128k
public class StackOverflowTest {

    static int count = 0;

    static void redo() {
        count++;
        redo();
    }

    public static void main(String[] args) {
        try {
            redo();
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println(count);
        }
    }
}
