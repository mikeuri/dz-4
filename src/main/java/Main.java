public class Main {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        int returnedIntVal = consolePrinter.printValue();
        String formattedStrVal = String.format("~~~<%d>~~~", returnedIntVal);
        System.out.println(formattedStrVal);
    }
}
