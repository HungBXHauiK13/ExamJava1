package Bai2;

public class KyThuat extends NhanVien{
    protected String chuyenNganh;

    public KyThuat() {
    }


    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String moTaCongViec() {
        return "Dev Java in SDS";
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                ", congViec='" + moTaCongViec() + '\'' +
                '}';
    }
}
