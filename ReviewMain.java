package Lesson05;

public class ReviewMain {
    public static void main(String[] args) {
        Review obj = new Review(11, "Shung", 55);
        obj.printReview();
        obj.id = 200;
        obj.printReview();
    }
}
