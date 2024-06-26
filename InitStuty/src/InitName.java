public class InitName {


    //字段
    private static int a=10;

    //初始化代码块
    {
        System.out.println("类初始化代码块");
        int aInit=10;
        //显示字段值
        System.out.println("类初始化代码块"+a);
    }

    //静态初始化代码块
    static {
        System.out.println("类初始化代码块"+a);
        System.out.println("类静态代码块");
        int aStatic=20;
    }

    public InitName(){

        System.out.println("类实例");
    }


}
