package org.example;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
public class day2
{  static void main() {
//         int a = 4;
//         if(a >=5){
//             System.out.println("pass");
//         }
//         else
//             System.out.println("Fail");
//}
//    int a = 99;
//    switch (a) {
//        case 2:
//            System.out.println("Thu hai");
//            break;
//        case 3:
//            System.out.println("Thu ba");
//            break;
//        case 4:
//            System.out.println("Thu tu");
//            break;
//        case 5:
//            System.out.println("Thu nam");
//            break;
//        case 6:
//            System.out.println("Thu sau");
//            break;
//        default:
//            System.out.println("invalid");
//
//    }

//    for (int i=1; i< 10;i++){
//        System.out.println(i);
//        if(i == 5) {
//            break;
//        }
//    }

//    for (int i=1; i<= 20;i++){
//        if(i%2==0) continue;
//        System.out.println(i);
//    }

//int n=5;
//int sum=0;
//    for (int i=1; i<= n;i++){
//        sum=sum+i;
//    }
//    System.out.println(sum);

//    int[] numbers = {3, 7, 2, 9, 4};
//    int sum = 0;
//    for(int s: numbers) {
//        sum = sum + s;
//    }
//    System.out.println(sum);
Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
//do {
//    System.out.println("nhap lai mk");
//    n = sc.nextInt();
//}
//while (n!=123456);
//    System.out.println("nhap mk thanh cong");
int cout=0 ;
    while (n>0){
        n= n/10;
        cout++;
    }
    System.out.println(cout);
}

}
