package Lesson05;

public class Lab05_BT2 {
    /*
    public static final int SHAPE_RECTANGLE = 1;
    public static final int SHAPE_CICLE = 2;
    public static final int SHAPE_TRITANGLE = 3;

    public int shareCode = 0;
    */
    public void tinhDienTich(float width, float height) {
        float kq = width * height;
        System.out.printf("%.1f x %.1f = %.1f", width, height, kq);
    }

    public void tinhDienTich(float radius) {
        double kq = 3.14 * radius * radius;
        System.out.printf("\n%.1f", kq);
    }

    public void tinhDienTich(float height, double bottom) {
        double kq = (bottom * height) / 2;
        System.out.printf("\n%.1f", kq);
    }

    public void tinhChuVi(float width, float height) {
        float kq = width + height;
        System.out.printf("\n%.1f + %.1f = %.1f", width, height, kq);
    }

    public void tinhChuVi(float radius) {
        double kq = 2 * 3.14 * radius;
        System.out.printf("\n%.1f", kq);
    }

    public void tinhChuVi(float edge1, float edge2, float edge3) {
        float kq = edge1 + edge2 + edge3;
        System.out.printf("\n%.1f + %.1f + %.1f = %.1f", edge1, edge2, edge3, kq);
    }

    public static void main(String[] args) {
        Lab05_BT2 shape = new Lab05_BT2();
        shape.tinhDienTich(3, 3);
        shape.tinhDienTich(3);
        shape.tinhDienTich(3, 3.5);
        shape.tinhChuVi(3, 5);
        shape.tinhChuVi(6.9f);
        shape.tinhChuVi(3, 4, 5);
    }

}
