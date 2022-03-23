package session2;

import java.util.Scanner;

public class SinhVien {
    String name;
    int age;
    Classroom myClass;
    public SinhVien(){ //constructor: hàm khởi tạo
        System.out.println("New student is being created... Please insert student's name!");
    }
    void study() {
        System.out.println("Student: " + this.name);
        System.out.println("Class: " + this.myClass.name);
    }
    void inputname(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }
}
