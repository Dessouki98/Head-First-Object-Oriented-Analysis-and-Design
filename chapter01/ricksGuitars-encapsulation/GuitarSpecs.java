public class GuitarSpecs {
    private Builder builder;
    private Type type;
    private String model;
    private Wood backWood;
    private Wood frontWood;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public GuitarSpecs(Builder builder, String model,Type type, Wood backWood, Wood frontWood) {
        this.builder = builder;
        this.type = type;
        this.model = model;
        this.backWood = backWood;
        this.frontWood = frontWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getFrontWood() {
        return frontWood;
    }

    public void setFrontWood(Wood frontWood) {
        this.frontWood = frontWood;
    }
}
