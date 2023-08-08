package vn.viettuts.qlsv.entity;

public class User {
    private String taiKhoan;
    private String matKhau;

    public User() {
    }

    public User(String taiKhoan, String matKhau) {
        super();
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getUserName() {
        return taiKhoan;
    }

    public void setUserName(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getPassword() {
        return matKhau;
    }

    public void setPassword(String matKhau) {
        this.matKhau = matKhau;
    }
}
