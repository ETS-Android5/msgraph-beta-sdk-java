// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office365Activations User Counts.
 */
public class Office365ActivationsUserCounts extends Entity implements IJsonBackedObject {


    /**
     * The Activated.
     * The number of users who have activated the product.
     */
    @SerializedName(value = "activated", alternate = {"Activated"})
    @Expose
	@Nullable
    public Long activated;

    /**
     * The Assigned.
     * The number of users have been assigned for the product license.
     */
    @SerializedName(value = "assigned", alternate = {"Assigned"})
    @Expose
	@Nullable
    public Long assigned;

    /**
     * The Product Type.
     * The product type such as 'Microsoft 365 ProPlus' or 'Project Client'.
     */
    @SerializedName(value = "productType", alternate = {"ProductType"})
    @Expose
	@Nullable
    public String productType;

    /**
     * The Report Refresh Date.
     * The latest date of the content.
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly reportRefreshDate;

    /**
     * The Shared Computer Activation.
     * The number of users who have used the product on a shared computer.
     */
    @SerializedName(value = "sharedComputerActivation", alternate = {"SharedComputerActivation"})
    @Expose
	@Nullable
    public Long sharedComputerActivation;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
