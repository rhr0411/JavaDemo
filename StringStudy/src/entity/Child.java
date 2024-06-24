package entity;

public class Child extends Parent{

    void getPro(){
        System.out.println(super.proName+"同一包下，继承关系字段访问");
    }

    void getInstancePro() {
        System.out.println(new Parent().proName+"同一包下，继承关系字段访问");

    }
}
