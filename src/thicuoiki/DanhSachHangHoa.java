package thicuoiki ;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import support.ReadAndWrite;
import support.Scanneer;


public  class DanhSachHangHoa  {
    
    
    static public Scanner input = new Scanner(System.in);
    public List<HangHoa> danhSach = new ArrayList<>();
    static Scanneer nhapThongTin = new Scanneer();
    static ReadAndWrite readAndWrite = new ReadAndWrite();
    
    public void data(){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            HangHoa hangHoa = new Food("22", "Apple", 12_000, 2, dateFormat.parse("12-04-2022"), dateFormat.parse("20-04-2022"));
            danhSach.add(hangHoa);
            HangHoa hangHoa0 = new SanhSu("21", "Bowl", 20_000, 10, dateFormat.parse("10-11-2021"), "Gom su TDC");
            danhSach.add(hangHoa0);
            HangHoa hangHoa2= new DienMay("23", "Televison", 5_100_000, 3, 12, 33);
            danhSach.add(hangHoa2);
            HangHoa hangHoa3 = new Food("41", "Banana", 8_000, 10, dateFormat.parse("21-04-2022"), dateFormat.parse("30-5-2022"));
            danhSach.add(hangHoa3);
            HangHoa hangHoa4 = new SanhSu("05", "Flower vase", 50_000, 51, dateFormat.parse("16-06-2021"), "Do su Tahs");
            danhSach.add(hangHoa4);
            HangHoa hangHoa5 = new DienMay("36", "Fridge", 2_300_000, 15, 24, 120);
            danhSach.add(hangHoa5);
            HangHoa hangHoa6 = new Food("72", "Kiwi", 35_000, 20 , dateFormat.parse("12-04-2022"), dateFormat.parse("23-05-2022"));
            danhSach.add(hangHoa6);
            HangHoa hangHoa7 = new SanhSu("88", "Stone table", 800_000, 5, dateFormat.parse("12-02-2021"), "VLXD Thanh Phong");
            danhSach.add(hangHoa7);
            HangHoa hangHoa8 = new DienMay("39", "Fan", 350_000, 1, 6, 32);
            danhSach.add(hangHoa8);
            HangHoa hangHoa9 = new Food("10", "Beef", 120_000, 3, dateFormat.parse("01-04-2022"), dateFormat.parse("23-05-2022"));
            danhSach.add(hangHoa9);
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
    }
    public void input(){
        danhSach.add(nhapThongTin.inputHangHoa(danhSach));
        
    }
    public void inThongTin() {
        for (HangHoa hangHoa : danhSach) {
            System.out.println(hangHoa);
            System.out.print("         - [ Danh gia muc do : ");
            hangHoa.kiemTraHSD();
            System.out.println();
        }
    }
    
    
    
    public void delete(){
        System.out.println("Ban muon xoa theo cach nao:");
        System.out.println("1.Xoa theo ma hang.       2.Xoa theo ten hang. ");
        System.out.print("- Nhap phuong thuc lua chon: ");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
            input.nextLine();
            System.out.print("Nhap ma hang muon xoa: " );
            String deleteCode = input.nextLine();
            HangHoa hangHoa1 = null;
            for (HangHoa hangHoa : danhSach) {
                if(hangHoa.getMaHang().equalsIgnoreCase(deleteCode)){
                    hangHoa1 =  hangHoa;
                    break;
                }
            }
            if(hangHoa1 != null){
                danhSach.remove(hangHoa1);
                System.out.println("Xoa hang theo ma hang thanh cong.");
            }else{
                System.out.println("Khong tim thay ma hang trong danh sach ");
            }
                break;
            case 2:
            input.nextLine();
            System.out.print("Nhap ten hang hoa ban muon xoa: ");
            String name = input.nextLine();
            HangHoa hangHoa5 = null;
            for (HangHoa hangHoa : danhSach) {
                if(hangHoa.getTenHang().equalsIgnoreCase(name)){
                    hangHoa5 =  hangHoa;
                    break;
                }
            }
            if(hangHoa5 != null){
                danhSach.remove(hangHoa5);
                System.out.println("Xoa hang theo ten hang thanh cong.");
            }else{
                System.out.println("Khong tim thay ten trong danh sach. ");
            } break;
            default:
                System.out.println("Loi. Vui long nhap lai !!!");
                break;
        }
        
    }
    public void search(){
        
       System.out.println("Ban muon tim kiem theo cach nao:");
       System.out.println("1.Tim theo ma     2. Tim theo ten    3 .Tim theo gia");
       System.out.print("-- Nhap su lua chon: ");
        int  choose = input.nextInt();
        switch (choose) {
            case 1:
                input.nextLine();
                System.out.print("Nhap ma hang ban muon tim: ");
                String maTim = input.nextLine();
                HangHoa hangHoa3HangHoa = null;
                for (HangHoa hangHoa : danhSach) {
                    if(hangHoa.getMaHang().equalsIgnoreCase(maTim)){
                      hangHoa3HangHoa =  hangHoa;
                    break;
                }
                } if(hangHoa3HangHoa != null){ 
                    System.out.println(hangHoa3HangHoa);
                }else{
                    System.out.println("Ma hang khong co trong danh sach !!!");
                }
                break;
            case 2:
                input.nextLine();
                System.out.print("Nhap ten san pham ban muon tim: ");
                String tenTim = input.nextLine();
                HangHoa hangHoa2HangHoa = null;
                for (HangHoa hangHoa : danhSach) {
                    if(hangHoa.getTenHang().equalsIgnoreCase(tenTim)){
                     hangHoa2HangHoa = hangHoa;
                    }
                }
                if(hangHoa2HangHoa != null){  
                    System.out.println(hangHoa2HangHoa);
                }else{
                    System.out.println("Ten hang khong co trong danh sach!!! ");
                }
                break;
            case 3: 
                input.nextLine();
                System.out.print("Nhap vao don gia ban can tim kiem: ");
                double gia = input.nextDouble() ;
                for (HangHoa hangHoa : danhSach) {
                    if(hangHoa.getDonGia() == gia){
                        System.out.println(hangHoa);
                    }
                }
                break;
            default: 
                System.out.println("Chon sai roi. Vui long chon lai!!!");break;
                
        } 
        
    }
    public int timViTri(String maHH) {
        int viTri = -1;
        for (HangHoa hh : danhSach) {
            viTri++;
            if (hh.getMaHang().equalsIgnoreCase(maHH)) {
                return viTri;
            }
        }
        return viTri;
    }
    public HangHoa timHangHoaTheoMa(String maHH) {
        HangHoa hangHoa = null;
        for (HangHoa hh : danhSach) {
            if (hh.getMaHang().equalsIgnoreCase(maHH)) {
                hangHoa = hh;
            }
        }
        if (hangHoa == null) {
            
        }
        return hangHoa;
    }
    public void suaHangHoaTheoMa(){
        HangHoa hangHoa = null;
        input.nextLine();
        System.out.print("Nhap vao ma hang ma ban can sua: ");
        String ma = input.nextLine();

        hangHoa = timHangHoaTheoMa(ma);
        int viTri = timViTri(ma);

        if (hangHoa != null) {
            System.out.println("-- >> Thong tin hang hoa can sua << --");
            System.out.println(hangHoa);
            hangHoa = danhSach.set(viTri, nhapThongTin.suaHang(hangHoa));
        } else {
            System.out.println("Ma hang hoa khong co trong danh sach!!!!");
        }
        
    }
   
    public void sortID(){
           
        Collections.sort(danhSach, ((o1, o2) -> o1.getMaHang().compareTo(o2.getMaHang())));  
        System.out.println("-Sap xep hang hoa theo ma hang thanh cong.");
        System.err.println("-- >> Danh sach sau khi sap xep. <<--");
    }
    
    public void sortHang(){
        System.out.println("____________________________________________________________________________________________________________________________________________________");
       for (HangHoa hangHoa : danhSach) {
           if(hangHoa instanceof SanhSu){
               
               System.out.println(hangHoa);
           }
       }
        System.out.println("_______________________________________________________________________________________________________________________________________________");
        for (HangHoa hangHoa : danhSach) {
           if(hangHoa instanceof DienMay){
               
               System.out.println(hangHoa);
           }
       }
        System.out.println("_____________________________________________________________________________________________________________________________________________");
        for (HangHoa hangHoa : danhSach) {
           if(hangHoa instanceof Food){
               
                System.out.println(hangHoa);
           }
       }
    }

    public void ghiFile(){
        
        ReadAndWrite.writeToFile(danhSach);
        System.out.println("Ghi thanh cong !. Vui long kiem tra file HangHoa.txt");
    }
    public void docFile(){
        readAndWrite.readFile(danhSach);
    }
    public void thongKe(){
        int quantitySS = 0;
        double moneySS = 0;
        int quantityDM = 0;
        double moneyDM = 0;
        int quantityFood = 0;
        double moneyFood = 0;
        int chose ;
        for (HangHoa hangHoa : danhSach) {
            if(hangHoa instanceof SanhSu){
                quantitySS = quantitySS + hangHoa.getSoLuongTonKho();
                moneySS = moneySS + hangHoa.getDonGia()*hangHoa.getSoLuongTonKho();
            }else if(hangHoa instanceof DienMay){
                quantityDM = quantityDM + hangHoa.getSoLuongTonKho();
                moneyDM = moneyDM + hangHoa.getDonGia()*hangHoa.getSoLuongTonKho();
            }else if(hangHoa instanceof Food){
                quantityFood = quantityFood + hangHoa.getSoLuongTonKho();
                moneyFood = moneyFood + hangHoa.getDonGia()*hangHoa.getSoLuongTonKho();
            }
        }
        do {            
        System.out.println("                  MENU THONG KE");
        System.out.println("--------------------------------------------------");
        System.out.println("1.>> Thong ke tong cac loai hang con trong kho.");
        System.out.println("2.>> Thong ke tong so luong tien hang moi loai");
        System.out.println("0.>> Thoat.");
        System.out.print("--Ban chon chuc nang nao: ");
        chose = input.nextInt() ;
        switch (chose) {
            case 1:
                System.out.println("1.>> Thong ke tong cac loai hang con trong kho.");
                System.out.println("- Hang sanh su con "+quantitySS+" san pham." );
                System.out.println("- Hang dien may con "+quantityDM+" san pham.");
                System.out.println("- Hang thuc pham con "+quantityFood+" san pham.");
                System.out.println("- Tong tat ca cac loai hang con "+(quantitySS+quantityDM+quantityFood)+" san pham.");
                break;
            case 2:
                System.out.println("2.>> Thong ke tong so luong tien hang moi loai.");
                System.out.println("- Gia tri ton kho cua hang sanh su la "+moneySS+" VND.");
                System.out.println("- Gia tri ton kho cua hang dien may la "+moneyDM+" VND.");
                System.out.println("- Gia tri ton kho cua hang thuc pham  la "+moneyFood+" VND.");
                System.out.println("- Tong gia tri ton kho cua tat ca mat hang la "+(moneySS+moneyDM+moneyFood)+" VND.");
            case 0:
                break ;
            default:
                System.out.println("- Ban chon sai roi vui long chon lai!!!");
                break;
        }
        }while(chose !=0);
       
         }

}