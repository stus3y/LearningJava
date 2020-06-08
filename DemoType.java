public class DemoType{
    public static void main(String[] args) {
        double a = 2.5F;
        System.out.println(a);
        byte b = 20;
        byte c = 50;
        // byte/short/char/ 优先转化为int
        byte d = (byte) (b + c);
        System.out.println(d);
        char e = '中';
        System.out.println(e + 0);
        String  str = "Hello";
        String  str2 = "World";
        System.out.println(str + (20 + 30));
    }
}