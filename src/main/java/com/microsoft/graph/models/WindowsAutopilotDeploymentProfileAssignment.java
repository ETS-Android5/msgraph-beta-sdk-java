// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentSource;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentTarget;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Deployment Profile Assignment.
 */
public class WindowsAutopilotDeploymentProfileAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Source.
     * Type of resource used for deployment to a group, direct or parcel/policySet. Possible values are: direct, policySets.
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public DeviceAndAppManagementAssignmentSource source;

    /**
     * The Source Id.
     * Identifier for resource used for deployment to a group
     */
    @SerializedName(value = "sourceId", alternate = {"SourceId"})
    @Expose
	@Nullable
    public String sourceId;

    /**
     * The Target.
     * The assignment target for the Windows Autopilot deployment profile.
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
