package support;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import thicuoiki.HangHoa;
import thicuoiki.Food;
import thicuoiki.DienMay;
import thicuoiki.SanhSu;

public class Scanneer {
    
  
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public Scanner input = new Scanner(System.in);
    private String tenHang;
    private String maHang;
    private int tonKho ;
    private Double donGia;
    private  int timeBaoHanh;
    private double congSuat;
    private String producer ;
    public HangHoa inputHangHoa(List<HangHoa> hangHoas)  {  
        
        int choose;
        HangHoa hangHoa = null;
        System.out.println("Chon loai hang ban muon them");
        System.out.println("-------------------------------------");
        System.out.println("1.>> Hang Sanh Su. ");
        System.out.println("2.>> Hang Dien May.");
        System.out.println("3.>> Hang Thuc Pham.");
        System.out.println("4.>> Thoat.");
        System.out.print("Vui long chon chuc nang: ");
        choose = input.nextInt();
        switch(choose){
            case 1:
            input.nextLine();
            System.out.print("Nhap vao ma hang hoa: ");
            maHang = input.nextLine();
            for (HangHoa hangHoa2 : hangHoas) {
                if(hangHoa2.getMaHang().equalsIgnoreCase(maHang)){
                    System.out.println("Ma hang da ton tai.");
                    return null;
                } break ;
            } 
            System.out.print("Nhap vao ten hang hoa: ");
            tenHang = input.nextLine();
           try {
            System.out.print("Nhap vao gia hang hoa: ");
           donGia = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so");
           }
            
            try {
                System.out.print("Nhap vao so luong hang hoa ton kho: ");
                tonKho = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhap bi loi.");
                System.out.println("Vui long chi nhap so.");
            }
            
            System.out.print("Nhap ngay nhap kho theo dinh dang dd/MM/yyyy: ");
            
            String date = input.next();
           
            Date date2 = null;
            try {
                //Parsing the String
                date2 = dateFormat.parse(date);
                input.nextLine();
                System.out.print("Nhap nha san xuat: ");
                String nhaSX = input.nextLine(); 
                hangHoa = new SanhSu(maHang, tenHang,donGia, tonKho, dateFormat.parse(date), nhaSX);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            break;
            case 2: 
            input.nextLine();
            System.out.print("Nhap ma hang hoa:");
            maHang = input.nextLine();
            for (HangHoa hangHoa2 : hangHoas) {
                if(hangHoa2.getMaHang().equalsIgnoreCase(maHang)){
                    System.out.println("Ma hang nay da ton tai.");
                    return null;
                }
            }
            System.out.print("Nhap vao ten san pham:");
            tenHang = input.nextLine();
           try {
            System.out.print("Nhap vao don gia san pham:");
           donGia = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
           }
            
            try {
                System.out.print("Nhap so luong ton kho cua hang hoa:");
                tonKho = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
            }
            try {
                System.out.print("Nhap thoi gian bao hanh:");
                timeBaoHanh = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
            }
            try {
                System.out.print("Nhap vao cong suat hang hoa:");
                congSuat = input.nextDouble();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
            }
           
            hangHoa = new DienMay(maHang, tenHang,donGia, tonKho, timeBaoHanh, congSuat);
            
            break;
            case 3:
            input.nextLine();
            System.out.print("Nhap ma hang hoa:");
            maHang = input.nextLine();
            for (HangHoa hangHoa2 : hangHoas) {
                if(hangHoa2.getMaHang().equalsIgnoreCase(maHang)){
                    System.out.println("Ma hang nay da ton tai.");
                    return null;
                }
            }
            System.out.print("Nhap vao ten san pham:");
            tenHang = input.nextLine();
           try {
            System.out.print("Nhap vao don gia san pham:");
           donGia = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
           }
            
            try {
                System.out.print("Nhap so luong ton kho cua hang hoa:");
                tonKho = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
            }
            System.out.print("Nhap ngay san xuat theo dinh dang dd/MM/yyyy: ");
            String ngaySX = input.nextLine();
            Date date3 = null;
            try {
                //Parsing the String
                date3 = dateFormat.parse(ngaySX);
               } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print("Nhap ngay het han hang hoa theo dinh dang dd/MM/yyyy: ");
            String ngayHetHan = input.nextLine();
            try {
                date2 = dateFormat.parse(ngayHetHan);
               
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            try {
                hangHoa = new Food(maHang, tenHang,donGia, tonKho, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            } catch (Exception e) {
                //TODO: handle exception
            }
          
            break;
            case 4: 
                break;
            default: 
                System.out.println("Ban da nhap sai. Vui long nhap lai!!!");
        }
            return hangHoa;
       
    }
    public HangHoa suaHang(HangHoa hangHoa){
        maHang = hangHoa.getMaHang();
        int choose;

        System.out.println("Ban muon sua thanh loai hang nao");
        System.out.println("-------------------------------------");
        System.out.println("1.>> Hang Sanh Su. ");
        System.out.println("2.>> Hang Dien May.");
        System.out.println("3.>> Hang Thuc Pham.");
        System.out.println("4.>> Thoat. ");
        System.out.print("- Nhap vao su lua chon: ");
        choose = input.nextInt();
        switch(choose){
            case 1:
            input.nextLine();
            System.out.print("Nhap vao ten san pham: ");
            tenHang = input.nextLine();
           try {
            System.out.print("Nhap vao don gia san pham: ");
           donGia = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
           }
            
            try {
                System.out.print("Nhap so luong ton kho cua hang hoa: ");
                tonKho = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
            }
            
            System.out.print("Nhap ngay nhap kho theo dinh dang dd/MM/yyyy: ");
            
            String date = input.next();
           
            Date date2 = null;
            try {
                //Parsing the String
                date2 = dateFormat.parse(date);
                input.nextLine();
                System.out.print("Nhap vao nha san xuat: ");
                producer = input.nextLine();
                hangHoa = new SanhSu(maHang, tenHang,donGia, tonKho, dateFormat.parse(date), producer);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("-- Sua hang thanh cong.");
            System.out.println("-- >> Thong tin hang hoa sau khi sua << --");
            System.out.println(hangHoa);
             break;
            case 2: 
             System.out.print("Nhap vao ten san pham: ");
            tenHang = input.nextLine();
           try {
            System.out.print("Nhap vao don gia san pham: ");
           donGia = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
           }
            
            try {
                System.out.print("Nhap so luong ton kho cua hang hoa: ");
                tonKho = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
            }
            try {
                System.out.print("Nhap thoi gian bao hanh: ");
                timeBaoHanh = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.print("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
            }
            try {
                System.out.print("Nhap vao cong suat hang hoa: " );
                congSuat = input.nextDouble();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
            }
           
            hangHoa = new DienMay(maHang, tenHang,donGia, tonKho, timeBaoHanh, congSuat);
            System.out.println("-- Sua hang thanh cong.");
            System.out.println("-- >> Thong tin hang hoa sau khi sua << --");
            System.out.println(hangHoa);
            break;
            case 3:
            input.nextLine();
            System.out.print("Nhap vao ten san pham: ");
            tenHang = input.nextLine();
           try {
            System.out.print("Nhap vao don gia san pham: ");
            donGia = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
           }
            
            try {
                System.out.print("Nhap so luong ton kho cua hang hoa: ");
                tonKho = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Nhap bi loi");
                System.out.println("Vui long chi nhap so.");
            }
                System.out.println("Nhap ngay san xuat theo dinh dang dd/MM/yyyy: ");
                String ngaySX = input.nextLine();
                Date date3 = null;
            try {
                //Parsing the String
                date3 = dateFormat.parse(ngaySX);
               } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print("Nhap ngay het han hang hoa theo dinh dang dd/MM/yyyy: ");
            String ngayHetHan = input.nextLine();
            try {
                date2 = dateFormat.parse(ngayHetHan);
               
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            try {
                hangHoa = new Food(maHang, tenHang,donGia, tonKho, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            } catch (Exception e) {
                //TODO: handle exception
            }
            System.out.println("-- Sua hang thanh cong");    
            System.out.println("-- >> Thong tin hang hoa sau khi sua << --");
                System.out.println(hangHoa);
                break;
            case 4:
                break;
            default: 
                System.out.println("Ban da nhap sai. Vui long nhap lai!!!");
        }
            return hangHoa;
    }
    
}
