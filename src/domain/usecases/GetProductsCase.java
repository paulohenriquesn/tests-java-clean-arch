package domain.usecases;

import java.util.ArrayList;

import domain.entities.Product;
import domain.repositories.IGetProductsRepository;

public class GetProductsCase {
	private IGetProductsRepository getProductsRepository;
	
	public GetProductsCase(IGetProductsRepository getProductsRepository) {
		this.getProductsRepository = getProductsRepository;
	}
	
	public ArrayList<Product> execute() {
		return this.getProductsRepository.execute();
	}
}
