import java.util.Date;

public class ManufacturedEngine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine() {
    engineManufacturer = "none";
    engineManufacturedDate = new Date();
    engineMake = "company";
    engineModel = "Model #";
    engineCylinders = 0;
    engineType = "gas";
    driveTrain = "none";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, int engineCylinders,
      String engineType, String driveTrain) {

    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  public String toString(){
    String output;
    output = "Engine Manufacturer: " + engineManufacturer + "\n";
    output += "Engine Manufactured: " + engineManufacturedDate + "\n";
    output += "Engine Make: " + engineMake + "\n";
    output += "Engine Model: " + engineModel + "\n";
    output += "Engine Type: " + engineType + "\n";
    output += "Engine Cylinders" + engineCylinders + "\n";
    output += "Drive Train: " + driveTrain + "\n";
    return output;

  }

  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }


  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }


  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }


  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }


  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }


  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }
}
