package com.test7;
public class Tst1 {  
	  
    public static void main(String[] args) {   
        int []p = {30,35,15,5,10,20,25};//两组数据做测试  
    //p[i]的含义有两层指的是：  
    //1. 第i个矩阵的列  
    //2. 第i+1个矩阵的行  
        int [][]m = new int [p.length+1][p.length+1];//记录连乘次数  
        int [][]s = new int [p.length+1][p.length+1];//记录最佳分割位置  
        MatrixChain(p,m,s);  
        System.out.println("矩阵计算量最小次数矩阵");  
        PrintMatrixMul(m,p.length);  
        System.out.println("相对于M矩阵的最优断开位置矩阵S");  
        PrintMatrixMul(s,p.length);  
        System.out.println("乘法的最优次序：");  
        traceback(s,1,p.length-1);  
    }  
    private static void PrintMatrixMul(int[][] m,int n) {  
        //打印数组  
        for(int i = 1;i<=n-1;i++){  
            for(int j =1;j<=n-1;j++){  
                System.out.print(m[i][j]+"\t");  
                if(j % (n-1) ==0)System.out.print("\n");  
            }  
        }  
          
    }  
    public static void MatrixChain(int []p,int [][]m,int [][]s){  
        //计算最优值  
        for(int i=1;i<=p.length;i++){  
            m[i][i]=0;  
        }         
        for(int r = 2; r<= p.length;r++){  
            for(int i=1;i<=p.length-r;i++){  
               int j = i+r-1;  
               m[i][j] = m[i+1][j]+p[i-1]*p[i]*p[j];  
               s[i][j] = i;  
               for(int k =i+1;k<j;k++){  
                   int t = m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];  
                   if(t<m[i][j]){  
                       m[i][j] = t;  
                       s[i][j]=k;  
                   }  
               }  
            }  
              
        }  
    }  
    private static void traceback(int[][] s, int i, int j) {  
        //输出最优计算次序  
                //观察解的格式，发现如果只有单个的A，那么只要输出Ai，前后会有括号  
                //如果是连续的A，则规律是i+1=j，那么此时不要使用括号    
                //在分割点左边是用“（”，在分割点右边是用“）”,此时采用递归去求解使用括号的位置   
                if(i==j)   
                    System.out.print("A"+i);      
                else if(i+1==j)   
                    System.out.print(" (A"+i+" * "+" A"+j+") ");     
                else{       
                    System.out.print(" (");     
                    traceback(s,i,s[i][j]);     
                    traceback(s,s[i][j]+1,j);        
                    System.out.print(") ");      
                }  
                  
                  
    }  
} 