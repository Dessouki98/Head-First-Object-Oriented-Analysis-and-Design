public class GuitarWithAllStrings {
/* In this first approach we didn't create any enum yet, so all types where just strings, and
 we will notice in the final guitar test how this is very week as you can easily get errros because
 we can pass any type of string which can be weak approach even if we decided to pass the strings and make them into
 toLowerCase this is still not optimal. with enums it is much better as you will see directly they must pass a specific
 type instead of waiting for error to happen in the code
  */
  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;

  public GuitarWithAllStrings(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  public String getBuilder() {
    return builder;
  }
  public String getModel() {
    return model;
  }
  public String getType() {
    return type;
  }
  public String getBackWood() {
    return backWood;
  }
  public String getTopWood() {
    return topWood;
  }
}
