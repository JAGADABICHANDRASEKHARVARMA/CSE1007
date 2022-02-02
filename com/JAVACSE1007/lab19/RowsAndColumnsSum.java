//Name:- Jagadabi Chandrasekhar Varma
//Reg.No:- 18BCE0100

package com.JAVACSE1007.lab19;

public class RowsAndColumnsSum {

        public static void main(String[] args) {

            int i, j, row_sum, column_sum;

            int[][] SumOfRowCols_arr = {{11, 21, 31}, {41, 51, 61}, {71, 81, 91}};

            System.out.println("\nThe Sum of Each Row in a Matrix");
            for(i = 0; i < SumOfRowCols_arr.length; i++)
            {
                row_sum = 0;
                for(j = 0; j < SumOfRowCols_arr[0].length; j++)
                {
                    row_sum = row_sum + SumOfRowCols_arr[i][j];
                }
                System.out.println("The Sum of Matrix Items "
                        + "in Row " + i + " = " + row_sum);
            }
            System.out.println("\nThe Sum of Each Column in a Matrix");
            for(i = 0; i < SumOfRowCols_arr.length; i++)
            {
                column_sum = 0;
                for(j = 0; j < SumOfRowCols_arr[0].length; j++)
                {
                    column_sum = column_sum + SumOfRowCols_arr[j][i];
                }
                System.out.println("The Sum of Matrix Items "
                        + "in Column " + i + " = " + column_sum);
            }
        }
}
