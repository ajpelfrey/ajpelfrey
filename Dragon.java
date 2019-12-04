public class Dragon extends Cow
{
    public Dragon(String name, String image)
    {
        super(name);
        setImage(image);
        canBreatheFire();
    }



    public boolean canBreatheFire()
    {
        return true;
    }
}
