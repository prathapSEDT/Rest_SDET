package pojo.Post.CreateOrder;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "createdAt",
        "updatedAt",
        "state",
        "customer_url",
        "actions",
        "items_url"
})
public class CreateOrder {

    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("state")
    private String state;
    @JsonProperty("customer_url")
    private String customerUrl;
    @JsonProperty("actions")
    private Actions actions;
    @JsonProperty("items_url")
    private String itemsUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("customer_url")
    public String getCustomerUrl() {
        return customerUrl;
    }

    @JsonProperty("customer_url")
    public void setCustomerUrl(String customerUrl) {
        this.customerUrl = customerUrl;
    }

    @JsonProperty("actions")
    public Actions getActions() {
        return actions;
    }

    @JsonProperty("actions")
    public void setActions(Actions actions) {
        this.actions = actions;
    }

    @JsonProperty("items_url")
    public String getItemsUrl() {
        return itemsUrl;
    }

    @JsonProperty("items_url")
    public void setItemsUrl(String itemsUrl) {
        this.itemsUrl = itemsUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "CreateOrder{" +
                "createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", state='" + state + '\'' +
                ", customerUrl='" + customerUrl + '\'' +
                ", actions=" + actions +
                ", itemsUrl='" + itemsUrl + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}