package day7.study2;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader c1 = ClassLoader.getSystemClassLoader();
        System.out.println(c1); //AppClassLoader

        ClassLoader c2 = c1.getParent();
        System.out.println(c2); //PlatformClassLoader

        ClassLoader c3 = c2.getParent();
        System.out.println(c3); //null
    }
}
