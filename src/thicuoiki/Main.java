package thicuoiki;

public class Main {
    
    public static void main(String[] args)  {
        
        int chose;
        DanhSachHangHoa list = new DanhSachHangHoa();
        list.data();
        do{
            
            System.out.println("               MENU      ");
            System.out.println("---------------------------------");
            System.out.println("1.>> Nhap thong tin hang hoa.");
            System.out.println("2.>> Xuat thong tin danh sach. ");
            System.out.println("3.>> Sap xep danh sach hang hoa. ");
            System.out.println("4.>> Thuc hien xoa hang hoa.");
            System.out.println("5.>> Tim kiem cac mat hang. ");
            System.out.println("6.>> Thuc hien sua hang hoa. ");
            System.out.println("7.>> Thong ke danh sach quan li.");
            System.out.println("8.>> Doc file du lieu hang hoa. ");
            System.out.println("9.>> Luu file du lieu hang hoa.");
            System.out.println("0.>> Thoat chuong trinh");
            System.out.print("Ban muon thuc hien chuc nang nao?: ");
            
            chose = list.input.nextInt();
            switch(chose){
                
                case 1: 
                
                try {
                    list.input();
                    
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println("Vui long thuc hien lai.");
                }
               
                    break;
                case 2:
                    System.out.println();
                    System.out.println("2.>> Xuat thong tin danh sach. ");
                    System.out.println();
                    list.inThongTin();
                    break;
                case 3 : 
                    do{
                    System.out.println();
                    System.out.println("3.>> Sap xep danh sach hang hoa . ");
                    System.out.println("-----Menu sap xep -----");
                    System.out.println("1.>> Sap xep theo ma hang hoa");
                    System.out.println("2.>> Sap xep theo loai hang hoa");
                    System.out.println("0.>> Quay ve menu");
                    System.out.print("--Ban chon chuc nang nao?: ");
                    chose = list.input.nextInt() ;
                    switch (chose) {
                        case 1:
                            list.sortID();
                            list.inThongTin();
                            break;
                        case 2:
                            System.out.println("-->> Danh Sach Sau Khi Sap Xep <<--");
                            System.out.println();
                            list.sortHang();
                            break ;
                        case 0: 
                            break ;
                        default:
                            System.out.println("Ban nhap sai roi - Vui long nhap lai!!!!");
                            break;
                    }
                    }while(chose !=0);
                    break;

                case 4: 
                    System.out.println();
                    System.out.println("4.>> Thuc hien xoa hang hoa.");
                    System.out.println();
                    list.delete();
                   break;
                case 5:
                    System.out.println();
                    System.out.println("5.>> Tim kiem cac mat hang. ");
                    list.search();
                    break;
                case 6: 
                    System.out.println();
                    System.out.println("6.>> Thuc hien sua hang hoa. ");
                    list.suaHangHoaTheoMa();
                    break;
                case 7 : 
                    System.out.println();
                    System.out.println("7.>> Thong ke danh sach quan li.");
                    list.thongKe();
                    break;
                case 8 : 
                    System.out.println();
                    System.out.println("8.>> Doc file du lieu hang hoa. ");
                    System.out.println();
                    list.docFile();
                    break;
                case 9 : 
                    System.out.println();
                    System.out.println("9.>> Luu file du lieu hang hoa.");
                    System.out.println();
                    list.ghiFile();
                    break;
                case 0:  
                    System.out.println("Xin chao va hen gap lai.");
                    break;
                
                default: 
                    System.out.println("Ban chon sai roi, Vui long chon lai!!!");
                    break;
           
                }
       
        }while(chose != 0);
    
       
      
       
        
      
       
    }

        
    
}

