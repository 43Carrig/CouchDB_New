import java.util.List;

public class Car {

    private String _id;
    private String _rev;
    private Boolean isSold;
    private String registration;
    private String carMake;
    private String carModel;
    private String year;
    private String price;
    private String fuelType;
    private String engineSizeCC;
    private String transmission;
    private String color;
    private String numberOfDoors;

    public Car()
    {

    }

    public Car(String _id) {

        this._id = _id;
    }

    public Car(String _id, Boolean isSold,String registration)
    {
        this._id = _id;
        this.isSold = isSold;
        this.registration = registration;
    }

    public Car(String _id, String _rev, Boolean isSold,String registration)
    {
        this._id = _id;
        this._rev = _rev;
        this.isSold = isSold;
        this.registration = registration;
    }

    public Car(String _id, String _rev, Boolean isSold, String registration, String carMake, String carModel, String year, String price, String fuelType, String engineSizeCC, String transmission, String color, String numberOfDoors) {
        this._id = _id;
        this._rev = _rev;
        this.isSold = isSold;
        this.registration = registration;
        this.carMake = carMake;
        this.carModel = carModel;
        this.year = year;
        this.price = price;
        this.fuelType = fuelType;
        this.engineSizeCC = engineSizeCC;
        this.transmission = transmission;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineSizeCC() {
        return engineSizeCC;
    }

    public void setEngineSizeCC(String engineSizeCC) {
        this.engineSizeCC = engineSizeCC;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public Boolean getSold() {
        return isSold;
    }

    public void setSold(Boolean sold) {
        this.isSold = sold;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }


    @Override
    public String toString() {
        return "Car{" +
                "_id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", isSold=" + isSold +
                ", registration='" + registration + '\'' +
                ", carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineSizeCC='" + engineSizeCC + '\'' +
                ", transmission='" + transmission + '\'' +
                ", color='" + color + '\'' +
                ", numberOfDoors='" + numberOfDoors + '\'' +
                '}';
    }
}
