import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InventoryHandlingGuitarWithStrings {
  private List guitars;

  public InventoryHandlingGuitarWithStrings() {
    guitars = new LinkedList();
  }

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    GuitarWithAllStrings guitar = new GuitarWithAllStrings(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  public GuitarWithAllStrings getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      GuitarWithAllStrings guitar = (GuitarWithAllStrings)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  public GuitarWithAllStrings search(GuitarWithAllStrings searchGuitar) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      GuitarWithAllStrings guitar = (GuitarWithAllStrings)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getBuilder();
      if ((builder != null) && (!builder.isEmpty()) &&
          (!builder.equals(guitar.getBuilder())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.isEmpty()) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (type.isEmpty()) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.isEmpty()) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.isEmpty()) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
}
