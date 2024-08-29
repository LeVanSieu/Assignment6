
package arrays;

import java.util.Scanner;
import java.util.Arrays;
public class TBcong {
    public static void main(String[] args) {
        Scanner nhap= new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int phantu= nhap.nextInt();
        int[] mang= new int[phantu];
        int sum=0;
        for (int i=0;i<phantu;i++){
            System.out.print("Nhap phan tu vi tri "+i+" : ");
            mang[i]=nhap.nextInt();
            sum+=mang[i];
        }
            System.out.println("Mang "+Arrays.toString(mang));
            float Tbcong= (float) sum/ phantu;
            System.out.println("Trung binh cong cua mang: "+ Tbcong);
    }     
}
