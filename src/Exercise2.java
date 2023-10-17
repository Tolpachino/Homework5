public class Exercise2 {
    public static void main(String[] args) {
        int a = 5;
        int resa;
        resa = a-- - --a + ++a + a++ + a;

        int b = 8;
        int resb;
        resb = ++b - b++ + ++b - --b;
        System.out.println(resa);
        System.out.println(resb);
    }
}
