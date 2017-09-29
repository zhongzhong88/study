package functionaltests.cukes.data.redskyproduct;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import cukes.framework.MRScenario;
import gherkin.deps.com.google.gson.Gson;
import gherkin.formatter.model.DataTableRow;
import junit.framework.Assert;

public class RedSkyProductStepDefinition {
	
	@Autowired
	MRScenario loginScenario;

	public MRScenario getLoginScenario() {
		return loginScenario;
	}
	
	@Given("^Product ID to search redsky product summary$")
	public void Product_ID_to_search_redsky_product_summary(DataTable productAttributes) {
		List<DataTableRow> productAttributesRow = productAttributes
				.getGherkinRows();
		Map<String, String> productAttributesMap = new LinkedHashMap<String, String>();

		for (int i = 0; i < productAttributesRow.size(); i++) {
			productAttributesMap.put(productAttributesRow.get(i).getCells()
					.get(0), productAttributesRow.get(i).getCells().get(1));
		}
		Set<String> prodcutAttributesKeySet = productAttributesMap.keySet();
		List<Integer> desiredAttributes = new ArrayList<Integer>();

		for (Iterator<String> iterator = prodcutAttributesKeySet.iterator(); iterator
				.hasNext();) {
			{
				String key = iterator.next();
				if (!key.equals("Test Case Data")) {
					desiredAttributes.add(Integer.valueOf(productAttributesMap.get(key)));
				}
			}
		}

		System.out.println("Product ID..." + desiredAttributes);
		if (desiredAttributes == null) {
			System.out.println("No Test Data be setup !!!");
		} else {
			getLoginScenario().saveBean(
					"RedSkyProductBean", desiredAttributes);
			System.out.println("Selected Product >>>> " + desiredAttributes.size());
		}
	}
	
	
	@SuppressWarnings("deprecation")
	@When("^the user performs a redsky product search$")
	public void the_user_performs_a_redsky_product_search(DataTable pnumAttributes) {		
		List<Integer> testDataList = (List<Integer>) getLoginScenario().getBean("RedSkyProductBean");
		int productNumber =0;
		for(Integer pnum:testDataList){
			productNumber= pnum;			
		}
		Gson gs = new Gson();
		System.out.println("createRedSkyProduct for Product ID: "
				+ gs.toJson(productNumber));		
		RedSkyProductRestResponse productActual = given()
				.request()
				.expect()
				.statusCode(200)
				.when()
				.get("products?productNumber="+productNumber)
				.as(RedSkyProductRestResponse.class);
		
		Gson gson = new Gson();		
		System.out.println("RedSkyProductResponse :::: "+gson.toJson(productActual));
		Assert.assertEquals("Product Name: "+productActual.getItem().getName(), productActual.getItem().getName(), "SpongeBob SquarePants: SpongeBob's Frozen Face-off");

		getLoginScenario().saveBean("RedSkyProductBean",productActual);
		
		
	}

}
