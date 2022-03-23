package fraction;

import java.util.Scanner;

public class fraction {
    int a,b,c,d;

    fraction(){
        System.out.println("Nhập tử số và mẫu số");
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    boolean kiemtra(int ms){
        if(ms==0) return true;
        return false;
    }

    int UCLN(int a,int b){
        int i;
        if(a==0) return b;
        if(Math.abs(a)==Math.abs(b)) return Math.abs(b);
        else {
            if(Math.abs(a)>Math.abs(b)){
                for(i=Math.abs(b);i>=1;i--){
                    if(a%i==0&&b%i==0) return i;
                }
            } else {
                for (i=Math.abs(a);i>=1;i--) {
                    if (a%i==0&&b%i==0) return i;
                }
            }
            return i;
        }
    }
    int BCNN(int a,int b){
        int ucln = UCLN(a,b);
        return (a*b)/ucln;
    }
    void rutgon(int a,int b){
        int ucln = UCLN(a,b);
        int ts=a/ucln;
        int ms=b/ucln;
        if(ts==0) System.out.println("Phân số rút gọn: 0");
        if(ms==1) System.out.println("Rút gọn: " + ts);
        if(ms==-1) System.out.println("Rút gọn: " + ts*(-1));
        else {
            if(ts<0&&ms<0){
                ts=Math.abs(ts);
                ms=Math.abs(ms);
                System.out.println("Rút gọn: " + ts + "/" + ms);
            }
            if(ts>0&&ms<0){
                ts=ts*(-1);
                ms=Math.abs(ms);
                System.out.println("Rút gọn: " + ts + "/" + ms);
            } else {
                System.out.println("Rút gọn: " + ts + "/" + ms);
            }
        }
    }
    void nghichdao(int a,int b){
        if(a==0){
            System.out.println("Phân số không thể nghịch đảo vì tử số cần khác 0");
        }else {
            System.out.println("Phân số nghịch đảo: " + b + "/" + a);
            rutgon(b,a);
        }
    }
    void pso2(){
        System.out.println("Nhập phân số thứ hai");
        Scanner sc = new Scanner(System.in);
        setC(sc.nextInt());
        setD(sc.nextInt());
        if(kiemtra(getD())) System.out.println("Mẫu số phải khác 0");
        else {
            add(getA(), getB(), getC(), getD());
            sub(getA(), getB(), getC(), getD());
            multi(getA(), getB(), getC(), getD());
            div(getA(), getB(), getC(), getD());
        }
    }
    void add(int a, int b, int c, int d){
        int x,y,ts,ms;
        int bcnn = BCNN(b,d);
        x = bcnn/b;
        y = bcnn/d;
        ts = a*x + c*y;
        ms = bcnn;
        System.out.println("Tổng hai phân số: " + a + "/" + b + " + " + c + "/" + d + " = " + ts + "/" + ms);
        rutgon(ts,ms);
    }
    void sub(int a, int b, int c, int d){
        int x,y,ts,ms;
        int bcnn = BCNN(b,d);
        x = bcnn/b;
        y = bcnn/d;
        ts = a*x - c*y;
        ms = bcnn;
        System.out.println("Hiệu hai phân số: " + a + "/" + b + " - " + c + "/" + d + " = " + ts + "/" + ms);
        rutgon(ts,ms);
    }
    void multi(int a, int b, int c, int d){
        int ts,ms;
        ts = a*c;
        ms = b*d;
        System.out.println("Tích hai phân số: " + a + "/" + b + " * " + c + "/" + d + " = " + ts + "/" + ms);
        rutgon(ts,ms);
    }
    void div(int a, int b, int c, int d){
        int ts,ms;
        if(c==0) System.out.println("Số bị chia phải khác 0");
        else {
            ts = a*d;
            ms = b*c;
            System.out.println("Thương hai phân số: " + a + "/" + b + " / " + c + "/" + d + " = " + ts + "/" + ms);
            rutgon(ts,ms);
        }
    }
}
