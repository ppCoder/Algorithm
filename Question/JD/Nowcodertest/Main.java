package test.JDtest.Nowcodertest;

//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=in.nextInt();
//        }
//        int i;
//        for (int j = 0; j < m; j++) {
//            int min = a[0];
//            int max = 0;
//            for (i = 0; i < a.length; i++) {
//                if (a[i] > max) max = a[i];
//                if (a[i] < min) min = a[i];
//            }
//            for (i = 0; i < a.length; i++) {
//                if (a[i] != max) {a[0] = a[i] * 2;break;}
//            }
//            if(i==a.length){System.out.println("YES");break;}
//        }
//    }
//}

/*public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type=in.nextLine();
        String model=in.nextLine();
        char[] t=type.toCharArray();
        char[] m=model.toCharArray();
        boolean skip=false;
        int i;
        for (i= 0; i < t.length; i++) {
            if(!skip&&t[i]!='?'&&t[i]!='*'&&t[i]!=m[i]) {System.out.println(false);break;}
            if(skip&&t[i]==m[i])skip=false;
            if(t[i]=='*')skip=true;
        }
        if(i==t.length) System.out.println(true);
    }
}*/
