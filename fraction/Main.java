package fraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        fraction fr = new fraction();
        Scanner sc = new Scanner(System.in);
        fr.setA(sc.nextInt());
        fr.setB(sc.nextInt());
        if(fr.kiemtra()) System.out.println("Mẫu số phải khác không");
        else {
            System.out.println("Tử số: " + fr.getA());
            System.out.println("Mẫu số: " + fr.getB());
            System.out.println("Phân số: " + fr.getA() + "/" +fr.getB());
            fr.rutgon();
            fr.nghichdao();
            fr.add();
            fr.sub();
            fr.multi();
            fr.div();
        }
    }
}
