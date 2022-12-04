package UseClass;

import BuildClass.ManagementStudent;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        ManagementStudent qlhs = new ManagementStudent();

        // Nhap
        qlhs.enterList(sc);

        // Hien thi
        System.out.println("Danh sach hoc sinh vua nhap la:");
        qlhs.displayList();

        sc.close();
    }
}