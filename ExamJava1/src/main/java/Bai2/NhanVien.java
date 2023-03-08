package Bai2;

public abstract class NhanVien {
    protected String maNhanVien;
    protected String hoTen;
    protected String namSinh;
    protected String diaChi;
    public NhanVien() {

    }

    public NhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public NhanVien(String maNhanVien, String hoTen, String namSinh, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }


    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public abstract String moTaCongViec();

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
