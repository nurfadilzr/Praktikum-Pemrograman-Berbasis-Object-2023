package no04;
class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        double volume = height * width * length;
        return volume;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 18;
        cuboid.width = 25;
        cuboid.length = 10;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}