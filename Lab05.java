package Lesson05;

import java.util.Scanner;

public class Lab05 {
    private float temperNum;

    private float convertC2F() {
        return (float) (temperNum * 1.8 + 32);
    }

    private float convertF2C() {
        return (float) ((temperNum - 32) / 1.8);
    }

    public void convert(float nhietDo, boolean isToC) {
        this.temperNum = nhietDo;
        if (isToC) {
            System.out.println("Nhiet do: " + nhietDo + "C= " + convertC2F() + "F");
        } else {
            System.out.println("Nhiet do: " + nhietDo + "F= " + convertC2F() + "C");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap nhiet do can chuyen doi:");
        Scanner input = new Scanner(System.in);
        float nhietDo = input.nextFloat();
        input.nextLine();
        System.out.println("Nhiet do ban vua nhap la: (bam C hoac F):");
        char type = input.nextLine().charAt(0);
        Lab05 convert = new Lab05();
        switch (type) {
            case 'C':
                convert.convert(nhietDo, true);
                break;
            case 'F':
                convert.convert(nhietDo, false);
                break;
        }

    }
}
