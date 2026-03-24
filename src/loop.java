public class loop {
    public static void main(String[] args) {
        int n = 5;
//        for (int i= 1; i<=n;i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == n || j == 1 || j == n) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  "); // space inside
//                }
//            }
//            System.out.println();
//        }
//    }
//        for (int i= 1; i<=n;i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i==1 && j==3 || i==2 && j==4 ||i==2 && j==1 || i==3 && j==2 ) {
//                    System.out.print("  ");
//                } else {
//                    System.out.print("* "); // space inside
//                }
//
//            }
//            System.out.println();
//        }
//    }
//
//        for (int i= 1; i<=n;i++) {
//            for (int j = 1; j < i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//        for (int i= 1; i<=n;i++) {
//            for(int j=1;j<=n;j++){
//                int k;
//                k=i+j-1;
//                if(k>n){
//                    System.out.print(k - n + " ");
//                }
//                else {
//                    System.out.print(k + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//        for (int i = 1; i <= n; i++) {//rows
//            for (int j = 1; j <= i; j++) {//columns
//                if((i+j)%2==0){
//                    System.out.print("1" + " ");
//
//                }
//                else{
//                    System.out.print("0" + " ");
//
//                }
//            }
//            System.out.println();
//        }
//    }
        for (int i = 1; i <= n; i++) {//rows
            for (int j = 1; j <= i; j++) {//columns
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
