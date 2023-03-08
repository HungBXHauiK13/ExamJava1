package Bai3;

public class TestMain {
    public static void main(String[] args) {
        VanBan chuoi1 = new VanBan();
        chuoi1.setChuoiKyTu("fanBoySomi");
        System.out.println(chuoi1);
        System.out.println(chuoi1.chuyenDoiVietHoa());
        System.out.println(chuoi1.chuyenDoiVietThuong());
        System.out.println(chuoi1.demSoTu());
    }
}
