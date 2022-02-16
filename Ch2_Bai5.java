import  java.util.Scanner;
class Ch2_Bai2{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int n;
        int tong=0;        
            while(tong<100){ 
                    System.out.print("Nhap mot so: ");
                    n=scanner.nextInt();
                    tong=tong+n;                      
                }
                System.out.println("Tong cua cac so tren la: "+tong);
           }       
   }
