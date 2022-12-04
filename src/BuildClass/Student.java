package BuildClass;

import java.util.Scanner;

public class Student extends Person {
    // Thuoc tinh
    private double math, physics, chemistry, average;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Student() {

    }

    // Ham khoi tao co doi so
    public Student(String name, int age,String address, double math, double physics, double chemistry) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        average = (math + physics + chemistry) / 3;
    }

    // getter cho average
    public double getAverage() {
        return average;
    }

    // getter cho math
    public double getMath() {
        return math;
    }

    // Ham hien thi
    public void display() {
        super.display();
        System.out.println("\tDiem toan: " + math);
        System.out.println("\tDiem vat ly: " + physics);
        System.out.println("\tDiem hoa hoc: " + chemistry);
        System.out.println("\tDiem trung binh: " + average);
    }

    // Ham nhap thong tin
    public void enter(Scanner sc) {
        super.enter(sc);
        System.out.print("\tNhap diem toan: ");
        math = sc.nextDouble();
        System.out.print("\tNhap diem ly: ");
        physics = sc.nextDouble();
        System.out.print("\tNhap diem hoa: ");
        chemistry = sc.nextDouble();
        average = (math + physics + chemistry) / 3;
    }
}
