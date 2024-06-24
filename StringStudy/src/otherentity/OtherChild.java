package otherentity;

import entity.Child;
import entity.Parent;

public class OtherChild extends Parent{

    protected String proName;

    @Override
    protected void get() {
        super.get();
    }

    void getPro(){
        System.out.println(super.proName+this.proName);
    }

    void getInstancePro(){

        //总结就是protected 字段中同一包内可以访问，在不同包下访问不到
        //在不同包下的继承关系中，可以访问到
        //
        System.out.println(new OtherChild().proName);
    }
}
