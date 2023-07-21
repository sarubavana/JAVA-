import java.util.*;
abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void normal_method() {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends AbstractClass {
    @Override
    public void a_method() {
        System.out.println("This is abstract method");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        SubClass subClassObj = new SubClass();
        subClassObj.a_method();         
        subClassObj.normal_method();   
    }
}
