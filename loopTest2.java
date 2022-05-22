package day05;

import java.util.Scanner;

public class loopTest2 {
    public static void main(String[] args) {
/*
* 需求:键盘录入一个大于等于2的整数,计算并返回x的平方根,保留整数部分
* */
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入整数:");
        int num =  sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i*i == num){
                System.out.println(i+"是"+num +"的平方根");
                break;
            }else if (i*i> num){
                System.out.println((i-1)+"是"+num +"的平方根");
                break;
            }
        }
            }
}
