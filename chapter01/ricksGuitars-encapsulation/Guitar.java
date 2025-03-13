public class Guitar {
/* We've extracted the specifications into a separate class to encapsulate them properly. This helps maintain
a more structured and modular design, allowing for easier code expansion and flexibility. This approach follows
the Separation of Concerns principle, ensuring that different parts of the application handle distinct responsibilities.
 Encapsulation isn't just about making members private; it's also about organizing logic efficiently to improve
  maintainability and scalability.
  */
  private String serialNumber;
  private double price;
  GuitarSpecs spec;

  public Guitar(String serialNumber, double price, 
                Builder builder, String model, Type type,
                Wood backWood, Wood topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.spec = new GuitarSpecs(builder, model, type, backWood, topWood);
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

  public GuitarSpecs getSpec() {
    return spec;
  }
}
