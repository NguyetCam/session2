package session2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x;
        SinhVien sv = new SinhVien();
        sv.age=20;
        x=10;
        SinhVien nguyetcam = new SinhVien();
//        sv.name = "Đỗ Hà Linh";
//        nguyetcam.name = "Vũ Châu Nguyệt Cầm";
        sv.inputname();
        nguyetcam.inputname();

        //sv.myClass = new Classroom();
        Classroom cl = new Classroom();
        cl.input();
        cl.output();
        sv.myClass = cl;
        nguyetcam.myClass = cl;
        sv.study();
        nguyetcam.study();
    }
}
