public class ConsolePrinter {
    public Integer printValue() {
        int intValue = 1000;
        String formattedStrValue = String.format("---<%d>---", intValue);
        System.out.println(formattedStrValue);
        return intValue;
    }
}
