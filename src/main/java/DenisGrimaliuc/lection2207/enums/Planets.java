package DenisGrimaliuc.lection2207.enums;

public enum Planets {
    MERCURY(0.38),
    VENUS(0.91),
    EARTH(1.0),
    MARS(0.38),
    JUPITER(2.34),
    SATURN(1.06),
    URANUS(0.92),
    NEPTUNE(1.19);


    private final double relativeGravity;


    Planets(double relativeGravity) {
        this.relativeGravity = relativeGravity;
    }

    public static void main(String[] args) {
        for (Planets planet : Planets.values()) {
//            System.out.println(planet + " " + planet.relativeGravity);
            System.out.println(planet + " " + planet.calculateWeightOnPlanet(100));
        }
    }


    public double calculateWeightOnPlanet(double weightOnEarth) {
        return weightOnEarth * relativeGravity;
    }
}
