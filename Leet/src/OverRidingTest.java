class Parent{
    public void test(){
        System.out.println("PARENT");
    }
}
class Child1 extends Parent{
    public void test(){
        System.out.println("CHILD1");
    }

}
class Child2 extends Parent{
    public void test(){
        System.out.println("CHILD2");
    }

}
public class OverRidingTest {
    public static void main(String[] args) {
        Parent p ;
        p = new Child1();
        p.test();
        p = new Child2();
        p.test();

    }
}
