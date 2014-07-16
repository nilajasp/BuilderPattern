/**
 * Created by nilajapatankar on 7/15/14.
 */

//This is Builder

public interface IHouseBuilder {
    void BuildLivingRoom();

    void BuildKitchen();

    void BuildBedrooms();

    void BuildTerrace();

    House GetHouse();
}
