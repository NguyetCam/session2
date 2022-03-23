package session2;

import java.util.Scanner;

public class Classroom {
    String name,room,school,begin,subject,end;
    public Classroom(){
        System.out.println("Input your classroom detail: ");
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.room = sc.nextLine();
        this.school = sc.nextLine();
        this.begin = sc.nextLine();
        this.subject = sc.nextLine();
        this.end = sc.nextLine();
    }
    void output(){
        System.out.println("Class name: " + this.name);
        System.out.println("Classroom: " + this.room);
        System.out.println("School: " + this.school);
        System.out.println("Begin date: " + this.begin);
        System.out.println("Subject: " + this.subject);
        System.out.println("End date: " + this.end);
    }
}
