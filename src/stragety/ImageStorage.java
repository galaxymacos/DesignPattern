package stragety;

public class ImageStorage {
    Compressor compressor;
    Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){

        compressor.compress(fileName);
        filter.apply(fileName);

    }
}
