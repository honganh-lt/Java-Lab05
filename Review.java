package Lesson05;

public class Review {
    /* class
         field(state)
         constructor(method)
         mothod(behavior)

         object


     */
    //field()
    //  private int id;//id = 0
    int id;
    String name; //name = NULL
    int age;

    //constructor - ham khoi tao (Mạc định class sẽ có constructor không tham số)

    public Review() {

    }

    public Review(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public void printReview() {
        System.out.println("===========================");
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    public static void main(String[] args) {
        //Khoi tao doi tuong khoong tham so
        Review rw = new Review();
        rw.printReview(); //truy cap den phuong thuc cua doi tuong


        rw = new Review(100, "Devmaster", 5);
        rw.printReview(); //truy cap den phuong thuc cua doi tuong

        //truy cap den field
        rw.id = 200;
        rw.name = "Chung chung";
        rw.age = 45;

        rw.printReview();
    }
}
