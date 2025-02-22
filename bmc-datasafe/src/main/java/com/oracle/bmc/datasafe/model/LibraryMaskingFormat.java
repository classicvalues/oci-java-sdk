/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A library masking format is a masking format stored in an Oracle Cloud Infrastructure compartment and can be used in
 * multiple masking policies. If you want to use the same masking logic for multiple masking columns or even in multiple
 * masking policies, you can create a library masking format and assign it to masking columns as needed. It helps you
 * avoid defining the same masking logic again and again.
 * <p>
 * Oracle Data Safe provides a set of predefined library masking formats to mask common sensitive and personal data,
 * such as names, national identifiers, credit card numbers, and phone numbers. To meet your specific requirements, you
 * can easily create new library masking formats and use them in your masking policies.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LibraryMaskingFormat.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LibraryMaskingFormat {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MaskingLifecycleState lifecycleState;

        public Builder lifecycleState(MaskingLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIds")
        private java.util.List<String> sensitiveTypeIds;

        public Builder sensitiveTypeIds(java.util.List<String> sensitiveTypeIds) {
            this.sensitiveTypeIds = sensitiveTypeIds;
            this.__explicitlySet__.add("sensitiveTypeIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private LibraryMaskingFormatSource source;

        public Builder source(LibraryMaskingFormatSource source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("formatEntries")
        private java.util.List<FormatEntry> formatEntries;

        public Builder formatEntries(java.util.List<FormatEntry> formatEntries) {
            this.formatEntries = formatEntries;
            this.__explicitlySet__.add("formatEntries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LibraryMaskingFormat build() {
            LibraryMaskingFormat __instance__ =
                    new LibraryMaskingFormat(
                            id,
                            compartmentId,
                            displayName,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            description,
                            sensitiveTypeIds,
                            source,
                            formatEntries,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LibraryMaskingFormat o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .description(o.getDescription())
                            .sensitiveTypeIds(o.getSensitiveTypeIds())
                            .source(o.getSource())
                            .formatEntries(o.getFormatEntries())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the library masking format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment that contains the library masking format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The display name of the library masking format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The date and time the library masking format was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the library masking format was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the library masking format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    MaskingLifecycleState lifecycleState;

    /**
     * The description of the library masking format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * An array of OCIDs of the sensitive types compatible with the library masking format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIds")
    java.util.List<String> sensitiveTypeIds;

    /**
     * Specifies whether the library masking format is user-defined or predefined.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    LibraryMaskingFormatSource source;

    /**
     * An array of format entries. The combined output of all the format entries is used for masking.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("formatEntries")
    java.util.List<FormatEntry> formatEntries;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
