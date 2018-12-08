public class VehicleFrame implements Chassis {

  private String vehicleFrameType;

  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;

  }


  @Override
  public String toString() {
    String output;
    output = "Chassis:       " + chassis;
    output += "Vehicle Frame:    " + vehicleFrameType;
    return output;
  }

  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }
}
