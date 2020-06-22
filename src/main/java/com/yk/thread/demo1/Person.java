package com.yk.thread.demo1;

/**
 * @Param
 * @ClassName Person
 * @Description TODO
 * @Author yk
 * @Date 2020/6/15 0015 20:03
 * @Return
 **/
public class Person {
    private String name;

    public void run(){
        for (int i = 0; i <20 ; i++) {
            System.out.println(name+"--->"+i);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
