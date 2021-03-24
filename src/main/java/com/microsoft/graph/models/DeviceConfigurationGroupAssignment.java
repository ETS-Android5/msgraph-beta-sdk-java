// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceConfiguration;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Group Assignment.
 */
public class DeviceConfigurationGroupAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Exclude Group.
     * Indicates if this group is should be excluded. Defaults that the group should be included
     */
    @SerializedName(value = "excludeGroup", alternate = {"ExcludeGroup"})
    @Expose
	@Nullable
    public Boolean excludeGroup;

    /**
     * The Target Group Id.
     * The Id of the AAD group we are targeting the device configuration to.
     */
    @SerializedName(value = "targetGroupId", alternate = {"TargetGroupId"})
    @Expose
	@Nullable
    public String targetGroupId;

    /**
     * The Device Configuration.
     * The navigation link to the Device Configuration being targeted.
     */
    @SerializedName(value = "deviceConfiguration", alternate = {"DeviceConfiguration"})
    @Expose
	@Nullable
    public DeviceConfiguration deviceConfiguration;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
