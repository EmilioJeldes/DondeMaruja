package command;

import java.util.ArrayList;
import java.util.List;

public class ProductCommand {

	private Integer productId;
	private String productName;
	private List<CategoryCommand> categories;
	private BrandCommand brandId;

	public ProductCommand() {
		productId = 0;
		categories = new ArrayList<>();
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) throws RuntimeException {
		if (productId > 0) {
			this.productId = productId;
		} else {
			throw new RuntimeException("Id de producto vacio");
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) throws RuntimeException {
		if (productName.length() > 2) {
			this.productName = productName;
		} else {
			throw new RuntimeException("Ingrese un nombre de producto real");
		}
	}

	public List<CategoryCommand> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryCommand> categories) {
		if (categories == null) {
			throw new RuntimeException("Category list null");
		} else {
			this.categories = categories;
		}
	}

	public BrandCommand getBrandId() {
		return brandId;
	}

	public void setBrandId(BrandCommand brandId) {
		this.brandId = brandId;
	}

}
