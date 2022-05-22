package day05;

public class loopTest1 {
    public static void main(String[] args) {
        /*
         * 逢7过游戏
         * 规则:从任意一个数字开始报数,当你要报的数字含有7,或者是7的倍数就要说:过
         * 需求:要求打印1-100之间的满足逢7过的数据
         * */

        //1.得到1-100之间的数字
        for (int i = 1; i <= 100; i++) {
            //2.判断数字 符合规则打印过,不符合打印数字
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

    }
}
