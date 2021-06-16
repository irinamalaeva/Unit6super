
public abstract class Air extends Transport {
    public int wings;
    public int length;

    public String describe() {
        super.describe();
        return super.describe() + "; Length of wings = " + wings + " m " + "; Runway length (min) = " +
                length + " m ;";
    }
}

