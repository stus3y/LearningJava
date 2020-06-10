/*
  直接打印数组名称，得到的是内存地址哈希值
 */


public class DemoArray {
    public static void main(String[] args) {
        int[] arr     = { 10, 20, 30 };
        int[] arr2    = new int[43];
        String[] arr3 = new String[10];
        char[] arr4   = new char[10];
        double[] arr5 = new double[1];

        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);
        System.out.println(arr5[0]);
    }
}
