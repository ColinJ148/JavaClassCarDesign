public class VehicleChassis implements Chassis {
  private String chassisName;

  public VehicleChassis(String chassisName){
    this.chassisName = chassisName;
  }

  public VehicleChassis(){
    chassisName = chassis;
  }

  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  @Override
  public String toString(){
    String output;
    output = "Chassis Name:       " + chassisName;
    return output;
  }
}
