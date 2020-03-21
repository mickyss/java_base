package base_06;

/**
 * @Author yanyc
 * @Description //TODO $
 * @Date 2020/3/15  10:11
 **/
public class Test01 {

//   public static void sample(int a){
//        a+=20;
//        System.out.println("a:" + a);
//   }
//
//    public static void main(String[] args) {
//       int b = 10 ;
//       sample(b);
//       System.out.println("b:" + b);
//
//    }
//    public static void swap(String a){
//        a += " world";
//        System.out.println(a);
//    }
//
//    public static void main(String[] args){
//        String a = "hello ";
//        swap(a);
//        System.out.print(a);
//    }

    public static void swap(int[] a){
        int c = a[0];
        a[0] = a[1];
        a[1] = c;
//        System.out.println(a[0]);
//        System.out.println(a[1]);
    }

    public static void main(String[] args){
        int[] a = new int[2];
        a[0] = 10;
        a[1] = 20;
        swap(a);
        System.out.println("------------------");
        System.out.println(a[0]);
        System.out.println(a[1]);

    }
}

