public class Main {
    public static void main(String[] args) {
        Address obj1 = new Address("Baker st. 221B", "London");
        Appartment appartment = new Appartment("Avangard", obj1, BuildingType.RESIDENTIAL, 20);

        Address obj2 = new Address("456 Main St", "Townsville");
        Room room1 = new Room("Tech Hub", obj2, BuildingType.COMMERCIAL, 78, 3);

        Address obj3 = new Address("Shonjin st. 12", "Kyoto");
        Room room2 = new Room("Sakura", obj3, BuildingType.MIXED, 78, 3);

        appartment.printInfo();
        appartment.printInfo(140);
        System.out.println("-------------");

        room1.printInfo();
        System.out.println("-------------");
        room2.printInfo();
    }
}