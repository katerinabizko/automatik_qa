package step_defenition;

import io.cucumber.java.en.Given;
import page_object.ProductsPage;

public class ProductsStepDefs {
    ProductsPage productsPage = new ProductsPage();

    @Given("user selects {string} product from a list")
    public void selectProductFromList(String productName) {
    productsPage.selectProductFromList(productName);
    }
}
