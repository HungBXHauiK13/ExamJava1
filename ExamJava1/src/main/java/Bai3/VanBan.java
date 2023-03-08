package Bai3;


import java.util.StringTokenizer;

public class VanBan {
    private String chuoiKyTu;

    public VanBan() {
    }

    public VanBan(String chuoiKyTu) {
        this.chuoiKyTu = chuoiKyTu;
    }

    public long demSoTu(){
        long soTu = 0;
        StringTokenizer tokenizer = new StringTokenizer(chuoiKyTu);
        soTu = Long.parseLong(tokenizer.nextToken());
        System.out.println("Số từ có trong chuỗi \"" + chuoiKyTu + "\" = " + soTu);
        return soTu;
    }


    public String getChuoiKyTu() {
        return chuoiKyTu;
    }

    public void setChuoiKyTu(String chuoiKyTu) {
        this.chuoiKyTu = chuoiKyTu;
    }

    public String chuyenDoiVietHoa(){
        return chuoiKyTu.toUpperCase();
    }

    public String chuyenDoiVietThuong(){
        return chuoiKyTu.toLowerCase();
    }

    /*public String vietHoaChuCaiDau(){

    }*/

    @Override
    public String toString() {
        return "VanBan{" +
                "chuoiKyTu='" + chuoiKyTu + '\'' +
                '}';
    }
}
