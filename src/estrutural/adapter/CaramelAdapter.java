package estrutural.adapter;

import estrutural.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter { // not as flexible, limited to one parent...
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
