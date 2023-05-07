package DemoBlazeAutomation.customtype;

import DemoBlazeAutomation.domainobjects.BillingDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTableType {

    @DataTableType
    public BillingDetails billingDetailsEntry(Map<String, String> entry){
        return new BillingDetails(entry.get("Name"),
                entry.get("Country"),
                entry.get("City"),
                entry.get("Card"),
                entry.get("Month"),
                entry.get("Year"));
    }
}
