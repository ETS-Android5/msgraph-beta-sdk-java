// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileIntent;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentTarget;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Resource Access Profile Assignment.
 */
public class DeviceManagementResourceAccessProfileAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Intent.
     * The assignment intent for the resource access profile. Possible values are: apply, remove.
     */
    @SerializedName(value = "intent", alternate = {"Intent"})
    @Expose
	@Nullable
    public DeviceManagementResourceAccessProfileIntent intent;

    /**
     * The Source Id.
     * The identifier of the source of the assignment.
     */
    @SerializedName(value = "sourceId", alternate = {"SourceId"})
    @Expose
	@Nullable
    public String sourceId;

    /**
     * The Target.
     * The assignment target for the resource access profile.
     */
    @SerializedName(value = "target", alternate = {"Target"})
    @Expose
	@Nullable
    public DeviceAndAppManagementAssignmentTarget target;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
