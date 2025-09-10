package comportamental.strategy;

public class _Main {

	public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("SOMEGFILE");
	}

}
