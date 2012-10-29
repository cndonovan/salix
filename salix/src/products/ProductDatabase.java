package products;

import java.util.Date;
import java.util.Hashtable;

public class ProductDatabase {
	private Hashtable<Integer, Product> all_products;
	
	public ProductDatabase() {
		all_products = new Hashtable<Integer, Product>();
		Painting blue_jay = new Painting(100.00, true, (new Date()).toString(), "Blue Jay", "Acrylic", 2010, 12.0, 6.0, "Barn Wood");
		Painting blue_heron = new Painting(150.00, true, (new Date()).toString(), "Blue Heron", "Acrylic", 2010, 12.0, 6.0, "Barn Wood");
		Painting bluebird = new Painting(100.00, true, (new Date()).toString(), "Bluebird", "Acrylic", 2010, 24.0, 6.0, "Barn Wood");
		Painting northern_flicker = new Painting(100.00, true, (new Date()).toString(), "Northern Flicker", "Acrylic", 2010, 12.0, 6.0, "Barn Wood");
		Painting crested_nuthatch = new Painting(100.00, true, (new Date()).toString(), "Crested Nuthatch", "Acrylic", 2010, 12.0, 6.0, "Barn Wood");
		all_products.put(blue_jay.getId(), blue_jay);
		all_products.put(blue_heron.getId(), blue_heron);
		all_products.put(bluebird.getId(), bluebird);
		all_products.put(northern_flicker.getId(), northern_flicker);
		all_products.put(crested_nuthatch.getId(), crested_nuthatch);
	}

}
