import entity.ObjClone;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        ObjClone objClone =new ObjClone();
//        Object clone = objClone.clone();

//        System.out.println(clone);

        /*本次对protected关键字做实验，发现protected关键字是控制当前类字段
        1、只能被同一包下访问，或者是他所在的子类访问。
            在不同的包中且不是继承关系不能访问。
        2、在子类重写了该字段后，可以改变访问控制范围
         */
        /*本次还对Object clone()方法做了实验，发现protected关键字控制clone()方法的访问范围
        1、可以避免protected范围以外的字段调用clone()方法，随意浅克隆对象
        2、在每次想完成深克隆的时候会让后续开发者必须implements cloneable 并且重写clone方法才能完成克隆，
        其中重写的clone方法可以改变访问域
        总结： 用protected声明的方法可以有效降低该方法的可被访问范围。个人觉得protected方法类似与接口方法，用户实现。
         */
    }
}