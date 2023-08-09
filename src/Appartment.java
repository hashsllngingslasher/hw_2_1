public class Appartment extends Building{
    private int numApartments;

    public Appartment(String name, Address address, BuildingType buildingType, int numApartments) {
        super(name, address, buildingType);
        this.numApartments = numApartments;
    }

    public int getNumApartments() {
        return numApartments;
    }
    public void printInfo() {
        System.out.println("Building Name: " + getName());
        System.out.println("Building Type: " + getBuildingType());
        System.out.println("Address: " + getAddress().getStreet() + ", " + getAddress().getCity());
        System.out.println("Number of Apartments: " + getNumApartments());
    }

    public final void printInfo(int square){
        System.out.println("Appartment square: " + square);
    }
}
