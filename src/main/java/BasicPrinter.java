interface Printer {
    void print(String message);
}

class BasicPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}