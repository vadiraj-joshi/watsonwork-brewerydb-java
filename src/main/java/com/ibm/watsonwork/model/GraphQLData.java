package com.ibm.watsonwork.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "createTargetedMessage"
})
@Data
public class GraphQLData {

    @JsonProperty("createTargetedMessage")
    private Object createTargetedMessage;

}