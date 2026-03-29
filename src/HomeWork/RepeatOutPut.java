package HomeWork;

import java.util.Scanner;

public class RepeatOutPut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一行字符串：");

        String input = sc.nextLine();

        System.out.println("--- 输出结果 ---");
        System.out.println(input);
        System.out.println(input);
        System.out.println(input);

        sc.close();
    }
}