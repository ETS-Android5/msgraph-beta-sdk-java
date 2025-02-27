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
import com.microsoft.graph.models.AndroidFotaDeploymentAssignment;
import com.microsoft.graph.models.ZebraFotaDeploymentSettings;
import com.microsoft.graph.models.ZebraFotaDeploymentStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Zebra Fota Deployment.
 */
public class ZebraFotaDeployment extends Entity implements IJsonBackedObject {


    /**
     * The Deployment Assignments.
     * Collection of Android FOTA Assignment
     */
    @SerializedName(value = "deploymentAssignments", alternate = {"DeploymentAssignments"})
    @Expose
	@Nullable
    public java.util.List<AndroidFotaDeploymentAssignment> deploymentAssignments;

    /**
     * The Deployment Settings.
     * Represents settings required to create a deployment such as deployment type, artifact info, download and installation
     */
    @SerializedName(value = "deploymentSettings", alternate = {"DeploymentSettings"})
    @Expose
	@Nullable
    public ZebraFotaDeploymentSettings deploymentSettings;

    /**
     * The Deployment Status.
     * Represents the deployment status from Zebra. The status is a high level status of the deployment as opposed being a detailed status per device.
     */
    @SerializedName(value = "deploymentStatus", alternate = {"DeploymentStatus"})
    @Expose
	@Nullable
    public ZebraFotaDeploymentStatus deploymentStatus;

    /**
     * The Description.
     * A human readable description of the deployment.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * A human readable name of the deployment.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
