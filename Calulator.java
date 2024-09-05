package Lesson05;

public class Calulator {
    /*
    add
    sub
    null
    div
     */
    public void add(int a, int b) {
        int kq = a + b;
        System.out.printf("\n %d + %d = %d", a, b, kq);
    }

    public void add(float a, float b) {
        float kq = a + b;
        System.out.printf("\n %.1f + %.1f = %.1f", a, b, kq);
    }

    public void add(int a, int b, int c) {
        int kq = a + b + c;
        System.out.printf("\n %d + %d + %d = %d", a, b, c, kq);
    }

    public int sub(int a, int b) {
        int kq = a - b;
        return kq;
    }

    public void mul(int a, int b) {
        int kq = a * b;
        System.out.printf("\n %d x %d = %d", a, b, kq);
    }

    public void div(int a, int b) {
        int kq = 0;
        if (b == 0) {
            System.out.println("Khong thuc hien duoc phep chia");
        } else {
            kq = a / b;
            System.out.printf("\n %d / %d = %d", a, b, kq);
        }
    }

    public static void main(String[] args) {
        Calulator calc = new Calulator();
        calc.add(100, 200);

        int kqua = calc.sub(200, 150);
        System.out.printf("\n %d x %d = %d", 200, 150, kqua);
    }
}
