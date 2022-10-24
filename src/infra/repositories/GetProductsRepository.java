package infra.repositories;

import java.util.ArrayList;

import domain.entities.Product;
import domain.repositories.IGetProductsRepository;

public class GetProductsRepository implements IGetProductsRepository {
	static GetProductsRepository instance;
	
	public static GetProductsRepository getInstance() {
		if (instance == null) {
			instance = new GetProductsRepository();
		}
		return instance;
	}
	
	@Override()
	public ArrayList<Product> execute() {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product("Iphone", 5500.00));
		return products;
	}
}
