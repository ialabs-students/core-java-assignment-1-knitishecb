import java.util.*;

public class ProductRepository {

	private List<Product> plist;
	ProductRepository(){
		plist = new ArrayList<Product>();
		Product p2 = new Product(121,"facewash",200.00,"skincare");
		Product p3 = new Product(131,"samsung",15700.00,"electronic");
		Product p4 = new Product(141,"shoes",1999.00,"lifestyle");
		Product p5 = new Product(1512,"books",1000.00,"study");
		Product p6 = new Product(1061,"laptiop",300000.00,"electronics");
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);
	}
	public List<Product> getList(){
		return plist;
	}
}
