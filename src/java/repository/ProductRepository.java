package repository;

import java.util.Optional;
import model.Product;

public class ProductRepository implements CrudRepository<Product, Integer> {

	public static int ID_PRODUCT = 0;

	public ProductRepository() {
	}

	@Override
	public Product save(Product entity) throws RuntimeException {
		if (entity == null) {
			throw new RuntimeException("Entidad  null no se puede guardar");
		}
		Product savedProduct = null;
		if (entity.getProductId() == 0) {
			ID_PRODUCT++;
			entity.setProductId(ID_PRODUCT);
			utilities.Utilities.products.add(entity);
			System.out.println(entity.getProductId());
			savedProduct = utilities.Utilities.products.stream().filter(p -> p.getProductId().equals(entity.getProductId())).findFirst().get();
		} else {
			Product get = utilities.Utilities.products.stream().filter(p -> p.getProductId().equals(entity.getProductId())).findFirst().get();
			utilities.Utilities.products.remove(get);
			utilities.Utilities.products.add(entity);
			savedProduct = utilities.Utilities.products.stream().filter(p -> p.getProductId().equals(entity.getProductId())).findFirst().get();
		}
		return savedProduct;
	}

	@Override
	public Optional<Product> findById(Integer id) {
		return utilities.Utilities.products.stream().filter(p -> p.getBrandId().equals(id)).findFirst();
	}

	@Override
	public Iterable<Product> findAll() {
		return utilities.Utilities.products;
	}

	@Override
	public void deleteById(Integer id) {
		Optional<Product> optionalProduct = utilities.Utilities.products.stream().filter(p -> p.getBrandId().equals(id)).findFirst();
		if (optionalProduct.isPresent()) {
			utilities.Utilities.products.remove(optionalProduct.get());
		}
	}

	@Override
	public void delete(Product entity) throws RuntimeException {
		if (entity == null) {
			throw new RuntimeException("No se puede eliminar producto null");
		}
		utilities.Utilities.products.remove(entity);
	}

}
