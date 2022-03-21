package fraction;

public class fraction {
    int a,b;

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

    boolean kiemtra(){
        if(getB()==0) return true;
        return false;
    }

    void rutgon(){
        System.out.println("Hàm rút gọn phân số");
    }
    void nghichdao(){
        System.out.println("Hàm nghịch đảo phân số");
    }
    void add(){
        System.out.println("Hàm cộng phân số");
    }
    void sub(){
        System.out.println("Hàm trừ phân số");
    }
    void multi(){
        System.out.println("Hàm nhân phân số");
    }
    void div(){
        System.out.println("Hàm chia phân số");
    }
}
