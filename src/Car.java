import java.util.Date;

public class Car extends Vehicle {
  private Feature[] feature = new Feature[10];




  private int carAxle;


  public Car() {
    super();
    this.carAxle = 2;
  }

  public Car(Date date, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame,
      String vehicleType, String driveTrain, ManufacturedEngine vehicleEngine,  Feature[] features, int axle) {
    super(date, vehicleManufacturer,
        vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    this.feature = features;
    this.carAxle = axle;
  }

  @Override
  public String toString() {
    String output;
    output = super.toString();
    output += "Features : " + "\n";
    output += getInteriorFeature();
    output += getExteriorFeature();

    output += "Car Axle: " + carAxle;
    return output;
  }

  public String getExteriorFeature() {
    String output = "";
    int i = 0;
    if(feature[i] == null){
      output = "[No Exterior Features]" + "\n";
    }
    try {
    while(feature[i] != null) {
      if (feature[i] instanceof ExteriorFeature) {
        output += feature[i].toString() + "\n";
      }
      i++;
    }
    }catch (ArrayIndexOutOfBoundsException e){
    }
    return output;
  }


  public String getInteriorFeature() {
    String output = "";
    int i = 0;
    if(feature[i] == null){
      output = "[No Interior Features]" + "\n";
    }
    try {
      while(feature[i] != null) {
        if (feature[i] instanceof InteriorFeature) {
          output += feature[i].toString() + "\n";
        }

        i++;
      }
    }catch (ArrayIndexOutOfBoundsException e){

    }


    return output;
  }

  public int getCarAxle() {
    return carAxle;
  }

  public void setCarAxle(int carAxle) {
    this.carAxle = carAxle;
  }

}
