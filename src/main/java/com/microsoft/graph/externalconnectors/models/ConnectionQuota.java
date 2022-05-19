// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;
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
 * The class for the Connection Quota.
 */
public class ConnectionQuota extends Entity implements IJsonBackedObject {


    /**
     * The Items Remaining.
     * Returns the minimum number in a range that contains the following data: items remaining in the connection and remaining items at tenant-level. The following equation represents the formula used to calculate the minimum number: min(max capacity in the connection – number of items in the connection, tenant quota – number of items indexed in all connections). If the connection is nonmonetized (preview connector or preview content experience), then it returns the number of remaining items in the connection.
     */
    @SerializedName(value = "itemsRemaining", alternate = {"ItemsRemaining"})
    @Expose
	@Nullable
    public Long itemsRemaining;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
