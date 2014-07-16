/**
 * Created by nilajapatankar on 7/14/14.
 */
public class BuilderDesignPatternMain {
    public static void main(String[] args) {
        System.out.println("Building Bunglow:");
        IHouseBuilder bunglowBuilder = new BunglowBuilder();
        Broker brokerForBunglow = new Broker(bunglowBuilder);
        brokerForBunglow.BuildHouse();
        House bunglow = brokerForBunglow.GetHouse();
        System.out.println("Bunglow:" + bunglow);
        System.out.println("\n\n");
        System.out.println("Building Apartments:");
        IHouseBuilder apartmentBuilder = new ApartmentBuilder();
        Broker brokerForApartments = new Broker(apartmentBuilder);
        brokerForApartments.BuildHouse();
        House apartment = brokerForApartments.GetHouse();
        System.out.println("Apartment:" + apartment);
    }
}
