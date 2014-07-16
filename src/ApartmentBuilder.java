/**
 * Created by nilajapatankar on 7/15/14.
 */

//This is Concrete Builder

public class ApartmentBuilder implements IHouseBuilder {
    private House _house;

    public ApartmentBuilder() {
        _house = new House();
    }

    @Override
    public void BuildLivingRoom() {
        System.out.println("Building Apartment Living Room");
        _house.SetLivingRoom("Apartment Living Room");
    }

    @Override
    public void BuildKitchen() {
        System.out.println("Building Apartment Kitchen");
        _house.SetKitchen("Apartment Kitchen");
    }

    @Override
    public void BuildBedrooms() {
        System.out.println("Building Apartment Bedrooms");
        _house.SetBedrooms("Apartment Bedroom");
    }

    @Override
    public void BuildTerrace() {
        System.out.println("Building Apartment Terrace");
        _house.SetTerrace("Apartment Terrace");
    }

    @Override
    public House GetHouse() {
        return _house;
    }
}
