package thicuoiki;


public abstract class HangHoa  {    
    private String maHang;
    private String tenHang;
    private double donGia;
    private int soLuongTonKho;
    
    public abstract double tinhTien();
    public abstract void kiemTraHSD();

    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTonKho) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuongTonKho = soLuongTonKho;
    }
    public HangHoa() {}
    @Override
    public String toString() {
        return " [ Ma Hang: " + maHang + ", Ton Kho: " + soLuongTonKho + ", Ten Hang: " + tenHang + ", Don Gia: " + donGia+ " VND.";
    }

    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        if(maHang != null  ){
            this.maHang = maHang;
        }else{
            System.out.println("Ma hang khong duoc de rong. !!!");
        }
    }
    
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        if(tenHang != null || tenHang == " "){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten san pham khong duoc de trong. !!!");
        }
        
    }
    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        if(soLuongTonKho >= 0){
            this.soLuongTonKho = soLuongTonKho;
        }else{
            System.out.println("So luong hang hoa phai lon hon 0!!!");
        }
           
    }
   

    public double getDonGia() {
        return donGia;
    }


    public void setDonGia(double donGia) {
        if(donGia >0){
            this.donGia = donGia;
        }else{
            System.out.println("Don gia hang hoa khong duoc nho hon 0. !!!");
        }
    }
    
    
    

    
   
    

    
    
}
