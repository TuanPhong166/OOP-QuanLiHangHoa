package thicuoiki;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Food extends HangHoa {
    private Date starDate;
    private Date endDate;
    
    public  Food(String maHang, String tenHang, double donGia, int soLuongTonKho, Date starDate,
    Date endDate) {
        super(maHang, tenHang, donGia, soLuongTonKho);
        this.setStarDate(starDate);
        this.setEndDate(endDate);
        
    }
        public Food() {

    }
    public Date getStarDate() {
        return starDate;
    }
   
   
    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
           
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        return "Thuc Pham - "+ super.toString() + ", Ngay san xuat: " + ngayVietNam.format(starDate) + ", Ngay het han: "
        +ngayVietNam.format(endDate)  + ", Thue: " + tinhTien() + " ]" ;
    }
    public boolean tinhHSD(){
        boolean endDate = false;
        Date ngayHienTai = new Date();
        if(this.endDate.before(ngayHienTai)){
            endDate = false;
        }else{
            endDate = true;
        }
        return endDate;
    }

    
  
    @Override
    public void kiemTraHSD() {
        // TODO Auto-generated method stub
        HangHoa hangHoa = new Food();
        Food food = (Food) hangHoa;
        if(this.getSoLuongTonKho() > 0 && this.tinhHSD() == false ){
            System.out.println("Hang hoa kho ban ra. ]");
        }else{
            System.out.println("Hang hoa ban chay. ]");
        }
    }
    @Override
    public double tinhTien() {
        // TODO Auto-generated method stub
        double tien = 0;
        tien = this.getDonGia() * 0.05;
        return tien;
        
    }

   
    



    
    
}
