package stragety;

public class Tester {

    public static void main(String[] args) {
        ImageStorage image = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());
        image.store("My Selfie");
    }
}
