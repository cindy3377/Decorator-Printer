public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello World!");

        Printer xmlPrinter = new XMLPrinter(new BasicPrinter());
        xmlPrinter.print("Hello World!");

        Printer encryptedXmlPrinter = new XMLPrinter(new EncryptedPrinter(new BasicPrinter()));
        encryptedXmlPrinter.print("Hello World!");
    }
}