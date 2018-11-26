package com.example.secondapplication;


/**
 * 代表要被注入的任何东西，无特殊要求，反正需要你自己在MainModule增加对应的方法并在方法中把他new出来
 *
 * */
public class User {
    String name = "waj";
    String age = "28";

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
