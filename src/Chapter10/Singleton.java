// 懒汉单例模式，当第一次被访问到的时候才创建实例
//public class Singleton {
//    private static int count = 0;
//    private static Singleton single = null;
//
//    public static void main(String[] args) {
//        if (count == 0) {
//            single = new Singleton();
//        }
//        return single;
//    }
//}

// 饿汉单例模式，类创建时创建了实例
public class Singleton {
    private Singleton() {}
    private static final Singleton single = new Singleton();

    public static Singleton getInstance() {
        return single;
    }
}