package day39_overriding;

public class OverridingChild extends OverridingParent {

    public static void method1() {
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {
        method1(); // Child class method1
        method2();// Parent class  method2
    }
}
