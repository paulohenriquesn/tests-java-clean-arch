package main;

import java.util.ArrayList;
import domain.entities.Product;
import infra.factories.usecases.GetProductsCaseFactory;

public class Application {
	public static void main(String[] args) {
		ArrayList<Product> products = new GetProductsCaseFactory().build();	
		System.out.println(products.get(0).getName());
	}
}
