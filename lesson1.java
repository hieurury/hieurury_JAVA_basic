// import java.util.Scanner;

import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        
        //UCLN-BCNN

        //(a, b) = m | trong đó m là ức chung lớn nhất của a và b;
        //(6, 9) = m 
        // 2;3;6|6 - 3;9|9 -> (6, 9) = 3
        //(8, 4) = 4


        

        //công thức
        //(a, b) -> a = b*k + x;
        //(b, x) -> ?


        //(165, 25) -> 165 = 25*6 + 15;
        //(25, 15) -> 25 = 15*1 + 5;
        //(15, 5) -> 15 = 5*3 + 0;
        //(5, 0) -> UCLN = 5;

        //khi lấy ngược -> tự chuyển lại dạng đúng
        //(a, b)
        //(25, 165) -> 25 = 165*0 + 25;
        //(165, 25) -> như trên
        //(165, 25) = 5
        

        //(6, 9) -> chạy tới min của 2 thằng
        // int ucln = 1;
        // for(int i = 1; i <= a; i++) {
        //     if(a % i == 0 && b % i == 0) {
        //         ucln = i;
        //     }
        // }

        // while(b > 0) {
        // int tmp = b;
        //    b = a % b;
        //    a = tmp;
        // }


        //BCNN - bội chung nhỏ nhất
        //bcnn = tích trị tuyệt đối a và b * ucln;
        // [a, b] = |a*b| / (a, b)

        
        int tmpa = a; // để in ra 
        int tmpb = b;
        if(a < 0) a = -a;
        if(b < 0) b = -b;
        while(b > 0) {
        int tmp = b;
           b = a % b;
           a = tmp;
        }
        int ucln = a;
        int bcnn = Math.abs(tmpa*tmpb) / ucln;

        //khi đề kêu in kiểu này:
        //(a, b) = m -> m là ucln
        //[a, b] = n -> n là bcnn
        System.out.println("(" + tmpa + ", " + tmpb + ") = " + ucln);
        System.out.println("[" + tmpa + ", " + tmpb + "] = " + bcnn);
        input.close();
       
        
    }
}
