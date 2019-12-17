package JavaLab2;

public class Address {
     String Street;
     int BuildingCode;
     int RoomNum;





    public void setStreet(String Street){
        this.Street = Street;
    }

    public void setNumberBuilding(int BuildingCode){
        this.BuildingCode = BuildingCode;
    }

    public void setNumberFlat(int RoomNum){
        this.RoomNum = RoomNum;
    }



    public String getStreet(){
        return this.Street;
    }

    public int getNumberBuilding(){
        return this.BuildingCode;
    }

    public int getNumberFlat(){
        return this.RoomNum;
    }

    @Override
    public String toString()
    {

        return "Улица " + this.Street + " " + this.BuildingCode + " номер квартиры " + this.RoomNum;

    }


}
