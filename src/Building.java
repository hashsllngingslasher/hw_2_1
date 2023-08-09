public class Building {
    private String name;
    private Address address;
    private BuildingType buildingType;

    public Building(String name, Address address, BuildingType buildingType) {
        this.name = name;
        this.address = address;
        this.buildingType = buildingType;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }
}
