package thicuoiki;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SanhSu extends HangHoa {
    private Date inputDate;
    private String producer;
   
    public SanhSu(String maHang, String tenHang, double donGia, int soLuongTonKho, Date inputDate, String producer) {
        super(maHang, tenHang, donGia, soLuongTonKho);
        this.inputDate = inputDate;
        this.producer = producer;
    }

    public SanhSu() {}

    public Date getInputDate() {
        return inputDate;
    }
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
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
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        return "Sanh Su  -" + super.toString()+ ", Ngay nhap kho: " + ngayVietNam.format(inputDate) + ", Nha san xuat: " + producer + ", Thue: " + tinhTien()+ " ]";
    }
    @Override
    public void kiemTraHSD() {
        // TODO Auto-generated method stubs
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        HangHoa hangHoa = new SanhSu();
        SanhSu hangSanhSu  = (SanhSu) hangHoa;
        
        Date ngayHienTai = new Date();
        Date date1 = null;
        Date date2 = null;
        try {
            String startDate = simpleDateFormat.format(inputDate);
            String endDate = simpleDateFormat.format(ngayHienTai);
            date1 = simpleDateFormat.parse(startDate);
            date2 = simpleDateFormat.parse(endDate);
            long getDiff = date2.getTime() - date1.getTime();
          
            long getDaysDiff = getDiff / (24 * 60 * 60 * 1000);
            if(this.getSoLuongTonKho() > 50 && getDaysDiff > 10){
                System.out.println("Hang hoa ban cham. ]");
            }else{
                System.out.println("Hang hoa ban chay. ]");
            }  
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
       
        
    }
   
    
    
}

