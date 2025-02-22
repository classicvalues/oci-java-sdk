/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * A bucket is a container for storing objects in a compartment within a namespace. A bucket is associated with a single compartment.
 * The compartment has policies that indicate what actions a user can perform on a bucket and all the objects in the bucket. For more
 * information, see [Managing Buckets](https://docs.cloud.oracle.com/Content/Object/Tasks/managingbuckets.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Bucket.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Bucket {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        public Builder publicAccessType(PublicAccessType publicAccessType) {
            this.publicAccessType = publicAccessType;
            this.__explicitlySet__.add("publicAccessType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
        private Boolean objectEventsEnabled;

        public Builder objectEventsEnabled(Boolean objectEventsEnabled) {
            this.objectEventsEnabled = objectEventsEnabled;
            this.__explicitlySet__.add("objectEventsEnabled");
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

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectLifecyclePolicyEtag")
        private String objectLifecyclePolicyEtag;

        public Builder objectLifecyclePolicyEtag(String objectLifecyclePolicyEtag) {
            this.objectLifecyclePolicyEtag = objectLifecyclePolicyEtag;
            this.__explicitlySet__.add("objectLifecyclePolicyEtag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateCount")
        private Long approximateCount;

        public Builder approximateCount(Long approximateCount) {
            this.approximateCount = approximateCount;
            this.__explicitlySet__.add("approximateCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateSize")
        private Long approximateSize;

        public Builder approximateSize(Long approximateSize) {
            this.approximateSize = approximateSize;
            this.__explicitlySet__.add("approximateSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicationEnabled")
        private Boolean replicationEnabled;

        public Builder replicationEnabled(Boolean replicationEnabled) {
            this.replicationEnabled = replicationEnabled;
            this.__explicitlySet__.add("replicationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
        private Boolean isReadOnly;

        public Builder isReadOnly(Boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            this.__explicitlySet__.add("isReadOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versioning")
        private Versioning versioning;

        public Builder versioning(Versioning versioning) {
            this.versioning = versioning;
            this.__explicitlySet__.add("versioning");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
        private AutoTiering autoTiering;

        public Builder autoTiering(AutoTiering autoTiering) {
            this.autoTiering = autoTiering;
            this.__explicitlySet__.add("autoTiering");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Bucket build() {
            Bucket __instance__ =
                    new Bucket(
                            namespace,
                            name,
                            compartmentId,
                            metadata,
                            createdBy,
                            timeCreated,
                            etag,
                            publicAccessType,
                            storageTier,
                            objectEventsEnabled,
                            freeformTags,
                            definedTags,
                            kmsKeyId,
                            objectLifecyclePolicyEtag,
                            approximateCount,
                            approximateSize,
                            replicationEnabled,
                            isReadOnly,
                            id,
                            versioning,
                            autoTiering);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Bucket o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .metadata(o.getMetadata())
                            .createdBy(o.getCreatedBy())
                            .timeCreated(o.getTimeCreated())
                            .etag(o.getEtag())
                            .publicAccessType(o.getPublicAccessType())
                            .storageTier(o.getStorageTier())
                            .objectEventsEnabled(o.getObjectEventsEnabled())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .kmsKeyId(o.getKmsKeyId())
                            .objectLifecyclePolicyEtag(o.getObjectLifecyclePolicyEtag())
                            .approximateCount(o.getApproximateCount())
                            .approximateSize(o.getApproximateSize())
                            .replicationEnabled(o.getReplicationEnabled())
                            .isReadOnly(o.getIsReadOnly())
                            .id(o.getId())
                            .versioning(o.getVersioning())
                            .autoTiering(o.getAutoTiering());

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
     * The Object Storage namespace in which the bucket resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: my-new-bucket1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The compartment ID in which the bucket is authorized.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Arbitrary string keys and values for user-defined metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the user who created the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    String createdBy;

    /**
     * The date and time the bucket was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The entity tag (ETag) for the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    String etag;
    /**
     * The type of public access enabled on this bucket.
     * A bucket is set to {@code NoPublicAccess} by default, which only allows an authenticated caller to access the
     * bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access is allowed for the
     * {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled on the
     * bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PublicAccessType {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),
        ObjectReadWithoutList("ObjectReadWithoutList"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PublicAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublicAccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicAccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PublicAccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of public access enabled on this bucket.
     * A bucket is set to {@code NoPublicAccess} by default, which only allows an authenticated caller to access the
     * bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access is allowed for the
     * {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled on the
     * bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
    PublicAccessType publicAccessType;
    /**
     * The storage tier type assigned to the bucket. A bucket is set to {@code Standard} tier by default, which means
     * objects uploaded or copied to the bucket will be in the standard storage tier. When the {@code Archive} tier type
     * is set explicitly for a bucket, objects uploaded or copied to the bucket will be stored in archive storage.
     * The {@code storageTier} property is immutable after bucket is created.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum StorageTier {
        Standard("Standard"),
        Archive("Archive"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, StorageTier> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageTier v : StorageTier.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StorageTier(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageTier create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StorageTier', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The storage tier type assigned to the bucket. A bucket is set to {@code Standard} tier by default, which means
     * objects uploaded or copied to the bucket will be in the standard storage tier. When the {@code Archive} tier type
     * is set explicitly for a bucket, objects uploaded or copied to the bucket will be stored in archive storage.
     * The {@code storageTier} property is immutable after bucket is created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    StorageTier storageTier;

    /**
     * Whether or not events are emitted for object state changes in this bucket. By default, {@code objectEventsEnabled} is
     * set to {@code false}. Set {@code objectEventsEnabled} to {@code true} to emit events for object state changes. For more information
     * about events, see [Overview of Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
    Boolean objectEventsEnabled;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a master encryption key used to call the Key Management
     * service to generate a data encryption key or to encrypt or decrypt a data encryption key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    String kmsKeyId;

    /**
     * The entity tag (ETag) for the live object lifecycle policy on the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectLifecyclePolicyEtag")
    String objectLifecyclePolicyEtag;

    /**
     * The approximate number of objects in the bucket. Count statistics are reported periodically. You will see a
     * lag between what is displayed and the actual object count.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateCount")
    Long approximateCount;

    /**
     * The approximate total size in bytes of all objects in the bucket. Size statistics are reported periodically. You will
     * see a lag between what is displayed and the actual size of the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateSize")
    Long approximateSize;

    /**
     * Whether or not this bucket is a replication source. By default, {@code replicationEnabled} is set to {@code false}. This will
     * be set to 'true' when you create a replication policy for the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationEnabled")
    Boolean replicationEnabled;

    /**
     * Whether or not this bucket is read only. By default, {@code isReadOnly} is set to {@code false}. This will
     * be set to 'true' when this bucket is configured as a destination in a replication policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    Boolean isReadOnly;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The versioning status on the bucket. A bucket is created with versioning {@code Disabled} by default.
     * For versioning {@code Enabled}, objects are protected from overwrites and deletes, by maintaining their version history. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Versioning {
        Enabled("Enabled"),
        Suspended("Suspended"),
        Disabled("Disabled"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Versioning> map;

        static {
            map = new java.util.HashMap<>();
            for (Versioning v : Versioning.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Versioning(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Versioning create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Versioning', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The versioning status on the bucket. A bucket is created with versioning {@code Disabled} by default.
     * For versioning {@code Enabled}, objects are protected from overwrites and deletes, by maintaining their version history. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versioning")
    Versioning versioning;
    /**
     * The auto tiering status on the bucket. A bucket is created with auto tiering {@code Disabled} by default.
     * For auto tiering {@code InfrequentAccess}, objects are transitioned automatically between the 'Standard'
     * and 'InfrequentAccess' tiers based on the access pattern of the objects.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AutoTiering {
        Disabled("Disabled"),
        InfrequentAccess("InfrequentAccess"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, AutoTiering> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoTiering v : AutoTiering.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutoTiering(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoTiering create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutoTiering', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The auto tiering status on the bucket. A bucket is created with auto tiering {@code Disabled} by default.
     * For auto tiering {@code InfrequentAccess}, objects are transitioned automatically between the 'Standard'
     * and 'InfrequentAccess' tiers based on the access pattern of the objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
    AutoTiering autoTiering;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
