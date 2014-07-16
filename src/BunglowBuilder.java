/**
 * Created by nilajapatankar on 7/15/14.
 */

//This is Concrete Builder

public class BunglowBuilder implements IHouseBuilder {

    private House _house;

    public BunglowBuilder() {
        _house = new House();
    }

    @Override
    public void BuildLivingRoom() {
        System.out.println("Building Bunglow Living Room");
        _house.SetLivingRoom("Bunglow Living Room");
    }

    @Override
    public void BuildKitchen() {
        System.out.println("Building Bunglow Kitchen");
        _house.SetKitchen("Bunglow Kitchen");
    }

    @Override
    public void BuildBedrooms() {
        System.out.println("Building Bunglow Bedrooms");
        _house.SetBedrooms("Bunglow Bedroom");
    }

    @Override
    public void BuildTerrace() {
        System.out.println("Building Bunglow Terrace");
        _house.SetTerrace("Bunglow Terrace");
    }

    @Override
    public House GetHouse() {
        return _house;
    }
}
