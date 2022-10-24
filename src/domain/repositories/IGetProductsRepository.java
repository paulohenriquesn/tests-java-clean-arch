package domain.repositories;

import java.util.ArrayList;
import domain.entities.Product;

public interface IGetProductsRepository {
	ArrayList<Product> execute();
}
