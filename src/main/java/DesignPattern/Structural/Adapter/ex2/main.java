package DesignPattern.Structural.Adapter.ex2;

public class main {
    public static void main(String[] args) {
        // 1. You have old headphones
        OldHeadphones myHeadphones = new OldHeadphones();

        // 2. You attach the adapter (The Dongle)
        USB_C_port adapter = new HeadphoneAdapter(myHeadphones);

        // 3. Now you can plug it into the USB-C phone
        adapter.insertUSBC();
    }
}
