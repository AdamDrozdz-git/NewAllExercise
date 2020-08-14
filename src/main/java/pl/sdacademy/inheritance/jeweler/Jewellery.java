package pl.sdacademy.inheritance.jeweler;

public class Jewellery {
    private String state;
    private String color;
    private int prize;

    public Jewellery(String state, String color, int prize) {
        this.state = state;
        this.color = color;
        this.prize = prize;
    }

    public String getState() {
        return state;
    }

    public String getColor() {
        return color;
    }

    public int getPrize() {
        return prize;
    }

    @Override
    public String toString() {
        return "Jewellery{ " +
                " state=' " + state + '\'' +
                ", color=' " + color + '\'' +
                ", prize= " + prize +
                '}';
    }


}


