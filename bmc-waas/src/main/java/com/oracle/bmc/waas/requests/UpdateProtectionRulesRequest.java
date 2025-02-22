/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/UpdateProtectionRulesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateProtectionRulesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpdateProtectionRulesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                java.util.List<com.oracle.bmc.waas.model.ProtectionRuleAction>> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     */
    private String waasPolicyId;

    /**
     *
     */
    private java.util.List<com.oracle.bmc.waas.model.ProtectionRuleAction> protectionRules;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource. The resource will be updated or deleted only if the etag provided matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.util.List<com.oracle.bmc.waas.model.ProtectionRuleAction> getBody$() {
        return protectionRules;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateProtectionRulesRequest,
                    java.util.List<com.oracle.bmc.waas.model.ProtectionRuleAction>> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<com.oracle.bmc.waas.model.ProtectionRuleAction> protectionRules =
                null;

        /**
         *
         * @return this builder instance
         */
        public Builder protectionRules(
                java.util.List<com.oracle.bmc.waas.model.ProtectionRuleAction> protectionRules) {
            this.protectionRules = protectionRules;
            return this;
        }

        /**
         * Singular setter.
         * @return this builder instance
         */
        public Builder protectionRules(
                com.oracle.bmc.waas.model.ProtectionRuleAction singularValue) {
            return this.protectionRules(java.util.Arrays.asList(singularValue));
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateProtectionRulesRequest o) {
            waasPolicyId(o.getWaasPolicyId());
            protectionRules(o.getProtectionRules());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateProtectionRulesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateProtectionRulesRequest
         */
        public UpdateProtectionRulesRequest build() {
            UpdateProtectionRulesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.util.List<com.oracle.bmc.waas.model.ProtectionRuleAction> body) {
            protectionRules(body);
            return this;
        }
    }
}
