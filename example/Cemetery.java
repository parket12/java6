
package org.example;

public class Cemetery {
    private int occupiedGraves;
    private int numberOfPlaces;

    public Cemetery(int occupiedGraves, int numberOfPlaces) {
        this.occupiedGraves = occupiedGraves;
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getOccupiedGraves() {
        return occupiedGraves;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setOccupiedGraves(int occupiedGraves) {
        this.occupiedGraves = occupiedGraves;
    }
}
