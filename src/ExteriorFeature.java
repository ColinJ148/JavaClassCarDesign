public class ExteriorFeature implements Feature {

  private String exteriorFeature;

  public ExteriorFeature() {
    exteriorFeature = "Generic";
  }

  public ExteriorFeature(String interiorFeature) {
    this.exteriorFeature = interiorFeature;
  }

  @Override
  public String getFeature() {
    return exteriorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  @Override
  public String toString() {
    String output;
    output = "Interior [" + exteriorFeature + "]";
    return output;

  }
}
