package pl.sdacademy.inheritance.jeweler;

public class WomanJewellery extends Jewellery {
    private String type;
    private String material;
    private int materialTest;

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public int getMaterialTest() {
        return materialTest;
    }

    public WomanJewellery(String state, String color, int prize, String type, String material, int materialTest) {
        super(state, color, prize);
        this.type = type;
        this.material = material;
        this.materialTest = materialTest;

    }

    @Override
    public String toString() {
        String womanJewellery = super.toString() + " WomanJewellery{ " +
                " type=' " + type + '\'' +
                ", material=' " + material + '\'' +
                ", materialTest= " + materialTest +
                '}';
        return womanJewellery;
    }
}
