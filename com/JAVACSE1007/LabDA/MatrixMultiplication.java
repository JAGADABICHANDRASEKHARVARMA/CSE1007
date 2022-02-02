package com.JAVACSE1007.LabDA;
import java.util.Scanner;                     //Name:- Jagadabi chandrasekhar varma
public class MatrixMultiplication             //RegNo:- 18BCE0100
{
    public static void main(String args[])
    {
        int r1, r2,c1,c2,i,j,k,sum;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows of matrix A: ");
        r1 = in.nextInt();

        System.out.println("Enter the number columns of matrix A: ");
        c1 = in.nextInt();
        System.out.println("Enter the number of rows of matrix B: ");
        r2 = in.nextInt();

        System.out.println("Enter the number of columns of matrix B: ");
        c2 = in.nextInt();
        if(c1==r2)
        {
            int mat1[][] = new int[r1][c1];
            int mat2[][] = new int[r2][c2];
            int res[][] = new int[r1][c2];
            System.out.println("Enter the elements of matrix A: ");
            for ( i= 0 ; i < r1 ; i++ )
            {
                for ( j= 0 ; j < c1 ;j++ )
                    mat1[i][j] = in.nextInt();
            }
            System.out.println("Enter the elements of matrix B: ");

            for ( i= 0 ; i < r2 ; i++ )
            {

                for ( j= 0 ; j < c2 ;j++ )
                    mat2[i][j] = in.nextInt();

            }

            System.out.println("\n\nThe result after Matrix Multiplication , Matric C is:-");
            for ( i= 0 ; i < r1 ; i++ )

                for ( j= 0 ; j <c2;j++)
                {
                    sum=0;
                    for ( k= 0 ; k <r2;k++ )
                    {
                        sum +=mat1[i][k]*mat2[k][j] ;

                    }
                    res[i][j]=sum;
                }
            for ( i= 0 ; i < r1; i++ )
            {
                for ( j=0 ; j < c2;j++ )
                    System.out.print(res[i][j]+" ");
                System.out.println();
            }
            System.out.println(" ");
        }
        else
            System.out.print("multipication does not exist ");
    }

}
