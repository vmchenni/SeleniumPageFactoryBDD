package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

public class SampleSteps {

    private static final Logger LOGGER = LogManager.getLogger(SampleSteps.class);

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("User is on the home page");
        LOGGER.info("User is on the home page");
    }
    @When("User enters username and password")
    public void user_enters_username_and_password(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<String> rowData = dataTable.row(0);
        String username = rowData.get(0);
        String password = rowData.get(1);
        System.out.println("User is " + username + " and Password is " + password + "\nUser enters username and password");
    }

}
