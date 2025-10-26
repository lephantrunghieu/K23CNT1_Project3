package lpth_pkg_default_method;

public class MultiInheristance  implements Interface1, Interface1.Interface2 {
    @Override
    public void method1(){
        Interface1.super.method1();
    }

    @Override
    public void method2() {
        System.out.println("Interface2.method2");
    }
    public static void main(String[] args) {
        MultiInheristance mi = new MultiInheristance();
        mi.method1();
        mi.method2();
    }
}