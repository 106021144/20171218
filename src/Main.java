//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scn =new Scanner(System.in);
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//        int c = scn.nextInt();
//        int max;
//        int min;
//        max=a;
//        if(max<=b)
//            max=b;
//        if(max<=c)
//            max=c;
//        min=a;
//        if(min>=b)
//            min=b;
//        if(min >=c)
//            min=c;
//        System.out.println(max);
//        System.out.println(min);
//
//    }
//}輸入三數，找出最大直和最小值


//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//        char[] data=scn.nextLine().toCharArray();
//        int n = data.length;
//        int n1=n/2;
//        boolean flag = true;
//        for(int i =0;i<n1;i++){
//            if(data[i]-data[n-1-i] !=0 ){
//                flag=false;
//            }
//        }
//        if(flag==true){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
//}

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//      int n = scn.nextInt(),m=scn.nextInt();
//      int[][] data=new int[n][m];
//      for(int i=0;i<n;i++){
//          for(int j=0;j<m;j++){
//              data[i][j]=scn.nextInt();
//          }
//      }
//        for(int j=0;j<m;j++){
//            for(int i=0;i<m;i++){
//                System.out.println(data[i][j]+"\t");
//            }
//            System.out.println();
//        }
//    }
//}


import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(),m= scn.nextInt();
        System.out.println(fun(n)/(fun(m)*(fun(n-m))));
    }
    public static int fun(int n){
        int sum=1;
        for(int i=n;i>1;i--){
            sum=sum*i;
        }
        return sum;
    }
        }