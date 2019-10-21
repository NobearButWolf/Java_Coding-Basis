/*
* @Author:2017110342_吴谭波
* @Description:【任务二】：实现菜单功能。
要求：
1. 当程序开始运行时，显示一个功能菜单给用户选择，例如：
1. 登录系统；
2. 系统设置；
3. 写日记；
4. 查找日记；
5. 退出系统；
请选择： 2. 当用户选择功能 4 时，需要显示第二个菜单，内容如下：
1. 按标题查找；
2. 按内容查找；
3. 按日期查找；
4. 按心情查找；
5. 按天气查找；
6. 返回上一层菜单；
请选择：
3. 当用户选择其他某一个菜单项时，打印“正在执行某功能”，不需要实现该功能。执行完成之后，再次显示其他
一级菜单供用户选择。
4. 当用户选择二级菜单的第 6 项时，返回上一级菜单。
5. 当用户选择一次菜单项 5 时，显示“谢谢使用，再见！”，并退出程序。
* @Date: 2019/09/18
* @Modified By:2017110342_吴谭波
 */

package tanbo.wu.menue;

import java.util.Scanner;

public class Menue {
    public static void main(String[] args) {
        mainMenue();
    }

    public static void mainMenue () {
        Scanner input = new Scanner(System.in);
        System.out.println("1.系统登陆");
        System.out.println("2.系统设置");
        System.out.println("3.写日记");
        System.out.println("4.查找日记");
        System.out.println("5.退出系统");
        System.out.println("请选择：");
        int option = input.nextInt();
        while (!(option >= 1 && option <= 5)) {
            System.out.println("Input Error,input again");
            option = input.nextInt();
        }
        switch (option) {
            case 1:
                System.out.println("正在执行系统登录功能");
                break;
            case 2:
                System.out.println("正在执行系统设置功能");
                break;
            case 3:
                System.out.println("正在执行写日记功能");
                break;
            case 4:
                secondMenue();
                break;
            case 5:
                System.out.println("谢谢使用,再见!");
                System.exit(0);
                break;
        }
    }

    public static void secondMenue () {
        System.out.println("1.按标题查找");
        System.out.println("2.按内容查找");
        System.out.println("3.按日期查找");
        System.out.println("4.按心情查找");
        System.out.println("5.按天气查找");
        System.out.println("6.返回上一层菜单");
        System.out.println("请选择：");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        while (!(option >= 1 && option <= 6)) {
            System.out.println("Input Error,input again");
            option = input.nextInt();
        }
        switch (option) {
            case 1:
                System.out.println("正在执行按标题查找功能");
                break;
            case 2:
                System.out.println("正在执行按内容查找功能");
                break;
            case 3:
                System.out.println("正在执行按日期查找功能");
                break;
            case 4:
                System.out.println("正在执行按心情查找功能");
                break;
            case 5:
                System.out.println("正在执行按天气查找功能");
                break;
            case 6:
                mainMenue();
                break;
        }
    }
}
