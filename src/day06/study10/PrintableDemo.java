package day06.study10;

public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable(Integer::parseInt);
    }

    private static void usePrintable(Printable p) {
        int number= p.printString("123");
        System.out.println(number);
    }
}
