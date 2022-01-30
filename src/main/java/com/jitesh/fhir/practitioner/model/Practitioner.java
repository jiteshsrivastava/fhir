
package com.jitesh.fhir.practitioner.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "id",
    "text",
    "identifier",
    "active",
    "name",
    "address",
    "qualification"
})
@Generated("jsonschema2pojo")
@Document("practitioner")
public class Practitioner {

    @JsonProperty("resourceType")
    public String resourceType;
    @JsonProperty("id")
    @Id
    public String id;
    @JsonProperty("text")
    public Text text;
    @JsonProperty("identifier")
    public List<Identifier> identifier = null;
    @JsonProperty("active")
    public Boolean active;
    @JsonProperty("name")
    public List<Name> name = null;
    @JsonProperty("address")
    public List<Address> address = null;
    @JsonProperty("qualification")
    public List<Qualification> qualification = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
