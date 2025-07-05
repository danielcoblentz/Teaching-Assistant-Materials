// Demonstrates static vs instance method usage
public class StaticVsInstance {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        staticMethod();

        StaticVsInstance obj = new StaticVsInstance();
        obj.instanceMethod();
    }
}
