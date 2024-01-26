// import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
       
        //VÒNG LẶP




            //=======================
        //1. FOR
        // for(khai báo biến lặp; điều kiện lặp; thực thi sau khi lặp) {

            //câu lệnh
        //}

        // -> chạy 10 chữ hello
        // for(int i = 1; i <= 10; i++) {
        //     System.out.println("hello");
        // }
        // 1. xét i
        // 2. kiểm tra i và điều kiện
        // 3. thực thi câu lệnh
        // 4. thực thi i++
        // 5. quay lại kiểm tra




            //=====================================================
        //2.while
        // while(điều kiện) {
            //câu lệnh
        //}

        //trường hợp bị lặp vô tận
        // while(number <= 5) {
        //     System.out.println("true");
        //     number = number + 1;
        // }

            //======================
        //do while
        // thực thi điều kiện ít nhất 1 lần
            // do {
            //     System.out.println("hello");
            //     number++;
            // } while(number < 1);

        //ví dụ: thuật toán kiểm tra số có bao nhiêu chữ số
        //         int number = 0;
        //         int numbertmp = number;
        // int tmp = 0;
        // do {
        //     tmp++; //-> 1 -> 2
        //     number /= 10; // number = 1 -> number = 0
        // }
        // while(number > 0);
        // System.out.println("so " + numbertmp + " co " + tmp + " chu so");

        
        // số nguyên tố là số chỉ chia hết cho 1 và chia hết chính nó;
        long  n = 1000000000;
        boolean flag = true;
        for(int i = 2; i < (n); i++) {
            if(n % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("la so nguyen to");
        } else {
            System.out.println("khong la so nguyen to");
        }

        //cho một đoạn bắt đầu từ a và kết thúc ở b [a, b]
        //in ra các số nguyên tố trong đoạn đó 
}
