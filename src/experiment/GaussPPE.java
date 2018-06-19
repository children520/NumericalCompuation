package experiment;

import java.util.ArrayList;
import java.util.Scanner;

public class GaussPPE {
	int[][] wholeList;
	public void GetInput() {
		Scanner row,column,number;
		row=new Scanner(System.in);
		System.out.println("请输入行数");
		 if (row.hasNext()) {
	            int rows = row.nextInt();
	            System.out.println("输入的行数为：" + rows);
	            System.out.println("请输入列数");
	             column=new Scanner(System.in);
	            if (column.hasNext()) {
		            int columns = column.nextInt();
		            System.out.println("输入的列数为：" + columns);
		            wholeList=new int[rows][columns];
		            
		            for(int i=0;i<rows;i++) {
		            	for(int j=0;j<columns;j++) {
		            		System.out.println("请输入第"+i+"行,"+"第"+j+"列的值:");
		            		 number=new Scanner(System.in);
		            		 if(number.hasNext()) {
		            			 int numbers=number.nextInt();
		            			 wholeList[i][j]=numbers;
		            		 }
		            		System.out.print(" ");
		    
		            	}
		            	System.out.println();
		            	
		            }
		            System.out.println("你所输入的矩阵为:");
		            for(int m=0;m<rows;m++) {
		            	for(int n=0;n<columns;n++) {
		            		
		            		System.out.print(wholeList[m][n]+" ");
		            	}
		            	System.out.println();
		            }
		            
		         }
	          
	        }
}
		
	
	public static void main(String[] args) {
		
		
		
}
}
