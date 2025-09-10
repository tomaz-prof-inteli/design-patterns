package estrutural.adapter.avaFilters;

import estrutural.adapter.Image;

public class Caramel {
    public void init() {
    	System.out.println("initiating caramel filter...");
    }

    public void render(Image image) {
        System.out.println("applying caramel filter...");
    }
}
