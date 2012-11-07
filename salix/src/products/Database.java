package products;

import java.util.Hashtable;
import java.util.Date;
import java.util.Enumeration;

public class Database {
	private Hashtable<String, Painting> all_products;
	
	public Database() {
		all_products = new Hashtable<String, Painting>();
		Painting blue_jay = new Painting("blue_jay", 100.00, true, (new Date()).toString(), "Blue Jay", "Acrylic", 2010, 12.0, 6.0, "Barn Wood");
		Painting blue_heron = new Painting("blue_heron", 150.00, true, (new Date()).toString(), "Blue Heron", "Acrylic", 2010, 12.0, 6.0, "Barn Wood");
		Painting bluebird = new Painting("bluebird", 100.00, true, (new Date()).toString(), "Bluebird", "Acrylic", 2010, 24.0, 6.0, "Barn Wood");
		Painting northern_flicker = new Painting("northern_flicker", 100.00, true, (new Date()).toString(), "Northern Flicker", "Acrylic", 2010, 12.0, 6.0, "Barn Wood");
		Painting crested_nuthatch = new Painting("crested_nuthatch", 100.00, true, (new Date()).toString(), "Crested Nuthatch", "Acrylic", 2010, 12.0, 6.0, "Barn Wood");
		all_products.put(blue_jay.getId(), blue_jay);
		all_products.put(blue_heron.getId(), blue_heron);
		all_products.put(bluebird.getId(), bluebird);
		all_products.put(northern_flicker.getId(), northern_flicker);
		all_products.put(crested_nuthatch.getId(), crested_nuthatch);
	}
	
	public Enumeration<String> keys() {
		return all_products.keys();
	}
	
	public Painting get(String id) {
		return all_products.get(id);
	}
}
