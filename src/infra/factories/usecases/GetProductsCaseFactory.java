package infra.factories.usecases;

import java.util.ArrayList;

import domain.entities.Product;
import domain.usecases.GetProductsCase;
import infra.repositories.GetProductsRepository;

public class GetProductsCaseFactory {
	public ArrayList<Product> build() {
		return new GetProductsCase(GetProductsRepository.getInstance()).execute();
	}
}
