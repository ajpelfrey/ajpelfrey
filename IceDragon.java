public class IceDragon extends Dragon{

    public IceDragon(String name, String image) {
        super(name, image);
        setImage(image);
    }

    public boolean canBreatheFire()
    {
        return false;
    }
}

