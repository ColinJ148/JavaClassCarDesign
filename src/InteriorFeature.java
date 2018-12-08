public class InteriorFeature implements Feature {

  private String interiorFeature;

  public InteriorFeature() {
    interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  @Override
  public String getFeature() {
    return interiorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  @Override
  public String toString() {
    String output;
    output = "Interior [" + interiorFeature + "]";
    return output;

  }

}
