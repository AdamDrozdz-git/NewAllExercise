package pl.sdacademy.inheritance.jeweler;

public class Bracelet extends WomanJewellery{
    private int size;

    public int getSize() {
        return size;
    }

    public Bracelet(String state, String color, int prize, String type, String material, int materialTest, int size) {
        super(state, color, prize, type, material, materialTest);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " Bracelet{ " +
                " size= " + size +
                '}';
    }
}
