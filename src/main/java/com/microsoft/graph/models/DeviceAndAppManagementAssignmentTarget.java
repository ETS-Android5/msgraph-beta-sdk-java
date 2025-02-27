// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilterType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Assignment Target.
 */
public class DeviceAndAppManagementAssignmentTarget implements IJsonBackedObject {

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
     * The Device And App Management Assignment Filter Id.
     * The Id of the filter for the target assignment.
     */
    @SerializedName(value = "deviceAndAppManagementAssignmentFilterId", alternate = {"DeviceAndAppManagementAssignmentFilterId"})
    @Expose
	@Nullable
    public String deviceAndAppManagementAssignmentFilterId;

    /**
     * The Device And App Management Assignment Filter Type.
     * The type of filter of the target assignment i.e. Exclude or Include. Possible values are: none, include, exclude.
     */
    @SerializedName(value = "deviceAndAppManagementAssignmentFilterType", alternate = {"DeviceAndAppManagementAssignmentFilterType"})
    @Expose
	@Nullable
    public DeviceAndAppManagementAssignmentFilterType deviceAndAppManagementAssignmentFilterType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
