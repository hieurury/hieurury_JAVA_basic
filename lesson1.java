// import java.util.Scanner;

import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // **** 4
        //  *** 3
        //   ** 2
        //    * 1
        // số dấu cách = i | số dấu sao = n - i
        // for(int i = 0; i < n; i++) {
        //     //in ra dấu cách
        //     for(int j = 0; j < i; j++) { 
        //         System.out.print(" ");
        //     }
        //     //in ra dấu sao
        //     for(int j = 0; j < n-i; j++) { 
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        



        // **** 4
        // *** 3
        // ** 2
        // * 1


        //in xuôi
        // for(int i = 1; i <= n; i++) { // i = 1, -> 2
        //     for(int j = 0; j <= n - i ; j++) { // j: 1->4 -> *
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        
        //tam giác số
        //1
        //2 2
        //3 3 3
        //4 4 4 4
        // in ngược
        int n = input.nextInt();
        for(int i = 1; i <= n; i++) { // i = 1, -> 2
            for(int j = 1; j <= i ; j++) { // j: 1->4 -> *4
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }


        
        //===============================================================
        //tam giác số - dạng 2
        //1
        //2 3
        //4 5 6
        //7 8 9 10


        //bài tập if
        //nhập vào số giây. tính số ngày, số giờ, số phút, số giây.
        //ví dụ: nhập 86400 -> in ra 1day 00h00m00s
        //gợi ý: 1 giờ = 3600 giây
        // 1 phút = 60 giây
        // 1 ngày = 86400 giây

        //==============================================================





        //In bang cuu chuong
        // System.out.println("Nhap bang cuu chuong muon hien thi: ");
        // int n = input.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(n + " x " + i + " = " + (n*i));
        // }
        input.close();
       
        
    }
}
