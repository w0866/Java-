package day05;

import java.util.Scanner;

public class loopTest3 {
    public static void main(String[] args) {
        /*
        键盘录入一个整数,判断该整数是否为质数
        质数定义:一个数只能被一和本身整除的数就是质数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数:");
        int num = sc.nextInt();
        //定义一个标志,标志思想
        //true :代表是一个质数
        //false: 代表不是一个质数

        boolean flag = true;

        //判断
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        //判断flag标志
        if (flag){
            System.out.println(num+"是一个质数");
        }else{
            System.out.println(num+"不是一个质数");
        }
    }
}
