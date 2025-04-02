class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    private String encrypt(String message) {
        // Simple encryption (Caesar cipher with shift 3 for demonstration)
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + 3));
        }
        return encrypted.toString();
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        super.print(encryptedMessage);
    }
}