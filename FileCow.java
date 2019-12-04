public class FileCow extends Cow {
    public FileCow(String name, String filename) {
        super(name, filename);
        if (getImage() == "") {

            throw new RuntimeException("MOOOOO!!!!!!");

        }
    }
    public void setImage() {
        throw new RuntimeException("Cannot reset FileCow Image");
    }
}
