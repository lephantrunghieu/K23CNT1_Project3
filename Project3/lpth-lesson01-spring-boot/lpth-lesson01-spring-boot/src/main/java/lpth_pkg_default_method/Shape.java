package lpth_pkg_default_method;

public interface Shape {
    void draw();
    default void setcolor(String color) {
        System.out.println("Ve hinh voi mau"+color);
    }
}
