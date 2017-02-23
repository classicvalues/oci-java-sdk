/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateInternetGatewayDetails.Builder.class)
public class CreateInternetGatewayDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("isEnabled")
        private Boolean isEnabled;

        @JsonProperty("vcnId")
        private String vcnId;

        public CreateInternetGatewayDetails build() {
            return new CreateInternetGatewayDetails(compartmentId, displayName, isEnabled, vcnId);
        }

        @JsonIgnore
        public Builder copy(CreateInternetGatewayDetails o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .isEnabled(o.getIsEnabled())
                    .vcnId(o.getVcnId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment to contain the Internet Gateway.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * Whether the gateway is enabled upon creation.
     **/
    @JsonProperty("isEnabled")
    @Valid
    @NotNull
    Boolean isEnabled;

    /**
     * The OCID of the VCN the Internet Gateway is attached to.
     **/
    @JsonProperty("vcnId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String vcnId;
}
