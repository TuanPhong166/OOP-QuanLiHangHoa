package thicuoiki;

public class DienMay extends HangHoa {
    private int timeBaoHanh;
    private double wattage;
    
    
    

    
    public DienMay(String maHang, String tenHang, double donGia, int soLuongTonKho, int timeBaoHanh,
            double wattage) {
        super(maHang, tenHang, donGia, soLuongTonKho);
        this.timeBaoHanh = timeBaoHanh;
        this.wattage = wattage;
    }



    public DienMay(int timeBaoHanh, double wattage) {
        this.timeBaoHanh = timeBaoHanh;
        this.wattage = wattage;
    }



    public DienMay() {
    }
    
    

    public int getTimeBaoHanh() {
        return timeBaoHanh;
    }

    public void setTimeBaoHanh(int timeBaoHanh) {
        if(timeBaoHanh >= 0){
            this.timeBaoHanh = timeBaoHanh;
        }else{
            System.out.println("Thoi gian bao hanh phai lon hon 0   !!!");
        }
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        if(wattage > 0){
            this.wattage = wattage;
        }else{
            System.out.println("Cong suat phai lon hon 0 !!!");
        }
    }

    @Override
    public double tinhTien() {
        // TODO Auto-generated method stub
        double tien = 0;
        tien = this.getDonGia() * 0.1;
        return tien;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Dien May  - " + super.toString() + ", Bao Hanh: " +timeBaoHanh +" thang, Cong suat: " + wattage + " kWh, Thue: " + tinhTien()  + " ]";
    }

    @Override
    public void kiemTraHSD() {
        // TODO Auto-generated method stub
        
        if(this.getSoLuongTonKho() < 3){
            System.out.println("Hang hoa ban chay. ]");
        }else{
            System.out.println("Hang hoa ban cham. ]");
        }
    }



   
    
    
    
    
}

