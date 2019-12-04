public class Cow {
    private String name;
    private String image;

    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Cow(String name, String image) {
        this.name = name;
        this.image = image;


    }

    public String getImage() {

        return image;
    }


    public void setImage(String _image) {
        this.image = _image;
    }
}
