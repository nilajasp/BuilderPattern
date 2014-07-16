import java.util.Scanner;

/**
 * Created by nilajapatankar on 7/14/14.
 */

//This is a director

public class Broker {

    private IHouseBuilder _houseBuilder;

    public Broker(IHouseBuilder houseBuilder) {
        _houseBuilder = houseBuilder;
    }

    public void BuildHouse() {
        _houseBuilder.BuildLivingRoom();
        _houseBuilder.BuildKitchen();
        _houseBuilder.BuildBedrooms();
        _houseBuilder.BuildTerrace();
    }

    public House GetHouse() {
        return _houseBuilder.GetHouse();
    }
}
