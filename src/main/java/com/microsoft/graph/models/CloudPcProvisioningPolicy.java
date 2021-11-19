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
import com.microsoft.graph.models.CloudPcDomainJoinConfiguration;
import com.microsoft.graph.models.CloudPcProvisioningPolicyImageType;
import com.microsoft.graph.models.MicrosoftManagedDesktop;
import com.microsoft.graph.models.CloudPcProvisioningPolicyAssignment;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.CloudPcProvisioningPolicyAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc Provisioning Policy.
 */
public class CloudPcProvisioningPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Domain Join Configuration.
     * 
     */
    @SerializedName(value = "domainJoinConfiguration", alternate = {"DomainJoinConfiguration"})
    @Expose
	@Nullable
    public CloudPcDomainJoinConfiguration domainJoinConfiguration;

    /**
     * The Image Display Name.
     * 
     */
    @SerializedName(value = "imageDisplayName", alternate = {"ImageDisplayName"})
    @Expose
	@Nullable
    public String imageDisplayName;

    /**
     * The Image Id.
     * 
     */
    @SerializedName(value = "imageId", alternate = {"ImageId"})
    @Expose
	@Nullable
    public String imageId;

    /**
     * The Image Type.
     * 
     */
    @SerializedName(value = "imageType", alternate = {"ImageType"})
    @Expose
	@Nullable
    public CloudPcProvisioningPolicyImageType imageType;

    /**
     * The Microsoft Managed Desktop.
     * 
     */
    @SerializedName(value = "microsoftManagedDesktop", alternate = {"MicrosoftManagedDesktop"})
    @Expose
	@Nullable
    public MicrosoftManagedDesktop microsoftManagedDesktop;

    /**
     * The On Premises Connection Id.
     * 
     */
    @SerializedName(value = "onPremisesConnectionId", alternate = {"OnPremisesConnectionId"})
    @Expose
	@Nullable
    public String onPremisesConnectionId;

    /**
     * The Assignments.
     * 
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public CloudPcProvisioningPolicyAssignmentCollectionPage assignments;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), CloudPcProvisioningPolicyAssignmentCollectionPage.class);
        }
    }
}
