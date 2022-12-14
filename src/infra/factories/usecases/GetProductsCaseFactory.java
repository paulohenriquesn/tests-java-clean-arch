package infra.factories.usecases;

import java.util.ArrayList;

import domain.entities.Product;
import domain.usecases.GetProductsCase;
import infra.factories.repositories.GetProductsRepositoryFactory;
import infra.repositories.GetProductsRepository;

public class GetProductsCaseFactory {
	public ArrayList<Product> build() {
		return new GetProductsCase(GetProductsRepositoryFactory.getInstance()).execute();
	}
}
