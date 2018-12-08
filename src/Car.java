import java.util.Date;

public class Car extends Vehicle {

  private Feature[] interoirfeature = new Feature[10];
  private Feature[] exteriorfeature = new Feature[10];


  private int carAxle;

  public Car() {
    super();
    this.carAxle = 2;
  }

  public Car(Date date, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame,
      String vehicleType, String driveTrain, ManufacturedEngine vehicleEngine) {
    super(date, vehicleManufacturer,
        vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    this.carAxle = 2;
  }

  @Override
  public String toString() {
    String output;
    output = super.toString();
    output += getExteriorFeature();
    output += getInteriorFeature() + "\n";
    output += "Car Axle:     " + carAxle;
    return output;
  }

  public String getExteriorFeature() {
    String output = "Interior Freatures:  ";
    try {
      for (int i = 0; i < interoirfeature.length; i++) {
        if (!interoirfeature[i].equals("")) {
          output += interoirfeature[i] + "\n";
        }
      }
    }catch(NullPointerException ex){
      System.out.println("no exterior Features");
    }

    return output;
  }


  public String getInteriorFeature() {
    String output = "Exterior Freatures:  ";
    try {
      for (int i = 0; i < exteriorfeature.length; i++) {
        if (!exteriorfeature[i].equals("")) {
          output += exteriorfeature[i] + "\n";
        }
      }
    }catch (NullPointerException e){
      System.out.println("no interior Features");
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
