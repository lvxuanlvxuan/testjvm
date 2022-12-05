package com.example.jvm;

/**
 * @Author: lvxuan
 * @program:
 * @Date: 2022/12/4 23:49
 * @Version: 1.0
 * @Description: des
 */
/**
 * 逃逸分析、标量替换
 * 不会产生GC
 * -Xmx20m -Xms20m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 * 产生GC
 * -Xmx20m -Xms20m -XX:-DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 * -Xmx20m -Xms20m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 */
public class AllotOnStack {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void alloc() {
        User user = new User();
        user.setId(1);
        user.setName("xiaolv");
    }
}
