package estrutural.adapter;

import estrutural.adapter.avaFilters.*;

public class _Main {

	public static void main(String[] args) {
        Image image = new Image();
	    ImageView view = new ImageView(image);
	    view.apply(new CaramelFilter(new Caramel()));
	}

}
