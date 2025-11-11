package DesignPattern.Structural.Adapter.ex2;

//The Adapter (The Dongle) This allows the old headphones to look like a USB-C device to the phone.
public class HeadphoneAdapter implements USB_C_port {
    private OldHeadphones oldHeadphones;

    public HeadphoneAdapter(OldHeadphones headphones) {
        this.oldHeadphones = headphones;
    }
    @Override
    public void insertUSBC() {
        // The adapter translates the "USB-C" action into a "3.5mm" action
        System.out.println("Adapter converting signal...");
        oldHeadphones.insert35mmJack();
    }
}
