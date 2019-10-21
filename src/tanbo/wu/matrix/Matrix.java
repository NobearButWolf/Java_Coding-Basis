/*
* @Author:2017110342_吴谭波
* @Description:【任务一】：编写程序完成矩阵的乘法运算。
要求：程序运行后要求用户分别输入两个矩阵的行数和列数，然后判断两个矩阵是否可以相乘，如果可以相乘，则
计算矩阵相乘后的结果，并按矩阵的格式输出；若不能相乘，则提示用户矩阵不相容，并退出程序。
* @Date: 2019/09/18
* @Modified By:2017110342_吴谭波
 */

package tanbo.wu.matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrixA = new int[100][100];
        int[][] matrixB = new int[100][100];
        int[][] matrixC = new int[100][100];
        Scanner input = new Scanner(System.in);
        System.out.println("Input the line number of MatrixA:");
        int m = input.nextInt();
        System.out.println("Input the row number of MatrixA:");
        int n = input.nextInt();
        System.out.println("Input the line number of MatrixB:");
        int k = input.nextInt();
        System.out.println("Input the row number of MatrixB:");
        int r = input.nextInt();
        if (m == r) {
            System.out.println("Input A's numbers:");
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    matrixA[i][j] = input.nextInt();
                }
            }
            System.out.println("Input B's numbers:");
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= r; j++) {
                    matrixB[i][j] = input.nextInt();
                }
            }
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= r; j++) {
                    matrixC[i][j] += matrixA[i][j] * matrixB[j][i];
                    System.out.print(matrixC[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("This is illegal!");
        }
    }
}
