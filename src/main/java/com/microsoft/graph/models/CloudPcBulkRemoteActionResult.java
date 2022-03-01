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
 * The class for the Cloud Pc Bulk Remote Action Result.
 */
public class CloudPcBulkRemoteActionResult implements IJsonBackedObject {

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
     * The Failed Device Ids.
     * A list of all the Intune managed device IDs that completed the bulk action with a failure.
     */
    @SerializedName(value = "failedDeviceIds", alternate = {"FailedDeviceIds"})
    @Expose
	@Nullable
    public java.util.List<String> failedDeviceIds;

    /**
     * The Not Found Device Ids.
     * A list of all the Intune managed device IDs that were not found when the bulk action was attempted.
     */
    @SerializedName(value = "notFoundDeviceIds", alternate = {"NotFoundDeviceIds"})
    @Expose
	@Nullable
    public java.util.List<String> notFoundDeviceIds;

    /**
     * The Not Supported Device Ids.
     * A list of all the Intune managed device IDs that were identified as unsupported for the bulk action.
     */
    @SerializedName(value = "notSupportedDeviceIds", alternate = {"NotSupportedDeviceIds"})
    @Expose
	@Nullable
    public java.util.List<String> notSupportedDeviceIds;

    /**
     * The Successful Device Ids.
     * A list of all the Intune managed device IDs that completed the bulk action successfully.
     */
    @SerializedName(value = "successfulDeviceIds", alternate = {"SuccessfulDeviceIds"})
    @Expose
	@Nullable
    public java.util.List<String> successfulDeviceIds;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
