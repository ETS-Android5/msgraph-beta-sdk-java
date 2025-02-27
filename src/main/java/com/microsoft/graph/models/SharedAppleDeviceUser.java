// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared Apple Device User.
 */
public class SharedAppleDeviceUser implements IJsonBackedObject {

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
     * The Data Quota.
     * Data quota
     */
    @SerializedName(value = "dataQuota", alternate = {"DataQuota"})
    @Expose
	@Nullable
    public Long dataQuota;

    /**
     * The Data To Sync.
     * Data to sync
     */
    @SerializedName(value = "dataToSync", alternate = {"DataToSync"})
    @Expose
	@Nullable
    public Boolean dataToSync;

    /**
     * The Data Used.
     * Data quota
     */
    @SerializedName(value = "dataUsed", alternate = {"DataUsed"})
    @Expose
	@Nullable
    public Long dataUsed;

    /**
     * The User Principal Name.
     * User name
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
