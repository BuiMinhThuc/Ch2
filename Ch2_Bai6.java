import java.util.Scanner;
class Ch2_Bai6{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int n;
        int gt=1;
        System.out.print("Nhap vao so nguyen duong: ");
        n=scanner.nextInt();
        do{                              
           gt=gt*n;
           n--;                   
        }while(n>0);   
        System.out.println("Giai thua cua so vua nhap la: "+gt);   
    }
}




