package estrutural.adapter;

import estrutural.adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter { // adapter
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
