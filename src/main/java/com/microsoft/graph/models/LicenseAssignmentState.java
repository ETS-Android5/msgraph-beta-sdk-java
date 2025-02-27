// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the License Assignment State.
 */
public class LicenseAssignmentState implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Assigned By Group.
     * The id of the group that assigns this license. If the assignment is a direct-assigned license, this field will be Null. Read-Only.
     */
    @SerializedName(value = "assignedByGroup", alternate = {"AssignedByGroup"})
    @Expose
	@Nullable
    public String assignedByGroup;

    /**
     * The Disabled Plans.
     * The service plans that are disabled in this assignment. Read-Only.
     */
    @SerializedName(value = "disabledPlans", alternate = {"DisabledPlans"})
    @Expose
	@Nullable
    public java.util.List<java.util.UUID> disabledPlans;

    /**
     * The Error.
     * License assignment failure error. If the license is assigned successfully, this field will be Null. Read-Only. The possible values are CountViolation, MutuallyExclusiveViolation, DependencyViolation, ProhibitedInUsageLocationViolation, UniquenessViolation, and Other. For more information on how to identify and resolve license assignment errors see here.
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public String error;

    /**
     * The Last Updated Date Time.
     * The timestamp when the state of the license assignment was last updated.
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdatedDateTime;

    /**
     * The Sku Id.
     * The unique identifier for the SKU. Read-Only.
     */
    @SerializedName(value = "skuId", alternate = {"SkuId"})
    @Expose
	@Nullable
    public java.util.UUID skuId;

    /**
     * The State.
     * Indicate the current state of this assignment. Read-Only. The possible values are Active, ActiveWithError, Disabled, and Error.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public String state;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
