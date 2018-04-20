package service;

import java.util.List;
import model.Product;
import repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	ProductRepository productRepository = new ProductRepository();

	@Override
	public List<Product> listProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}

}
