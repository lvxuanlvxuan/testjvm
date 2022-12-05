package com.example.jvm;

/**
 * @Author: lvxuan
 * @program:
 * @Date: 2022/12/3 11:33
 * @Version: 1.0
 * @motto: 而后乃将图南
 * @Description: des
 */
public class User {
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sout() {
        System.out.println("=======User1=======");
    }

}
