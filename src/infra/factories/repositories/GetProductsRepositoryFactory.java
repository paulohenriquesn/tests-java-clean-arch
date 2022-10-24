package infra.factories.repositories;

import infra.repositories.GetProductsRepository;

public class GetProductsRepositoryFactory {
	static GetProductsRepository instance;
	
	public static GetProductsRepository getInstance() {
		if (instance == null) {
			instance = new GetProductsRepository();
		}
		return instance;
	}
}