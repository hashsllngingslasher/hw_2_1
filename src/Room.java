public final class Room extends Appartment{
    private int numRooms;

    public Room(String name, Address address, BuildingType buildingType, int numApartments, int numRooms) {
        super(name, address, buildingType, numApartments);
        this.numRooms = numRooms;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Appartment Rooms:" + getNumRooms());
    }

    public int getNumRooms() {
        return numRooms;
    }
}
