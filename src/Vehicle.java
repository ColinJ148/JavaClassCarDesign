import java.util.Date;

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private ManufacturedEngine vehicleEngine;

  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleType = "None";
    this.driveTrain = "2WD: Two-Wheel Drive";
    this.vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame,
      String vehicleType, String driveTrain, ManufacturedEngine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;


  }

  public String toString() {
    String output;
    output = "Manufacturer Name: " + vehicleManufacturer + "\n";
    output += "manufacturer Date: " + vehicleManufacturedDate + "\n";
    output += "Vehicle Make: " + vehicleMake + "\n";
    output += "Vehicle Model: " + vehicleModel + "\n";
    output += "Vehicle Type: " + vehicleType + "\n";
    output += vehicleEngine.toString();
    return output;
  }


  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    vehicleEngine.setEngineManufacturer(manufacturer);
  }

  @Override
  public void setEngineMake(String engineMake) {
    vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
    vehicleEngine.setEngineType(fuel);
  }

  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    System.out.println(v1.toString());
  }
}

