package ro.esolutions.testing;

public class Polygon {
    private Integer numberOfSides;

    public Polygon(Integer sides) {
        if (sides < 3) {
            throw new RuntimeException("the number of sides must be min 3");
        }
        this.numberOfSides = sides;
    }

    public Integer getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(Integer numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
