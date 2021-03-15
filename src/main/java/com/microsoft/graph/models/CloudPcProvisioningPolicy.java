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
import com.microsoft.graph.models.CloudPcProvisioningPolicyImageType;
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
     * The provisioning policy description.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name for the provisioning policy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Image Display Name.
     * The display name for the OS image you’re provisioning.
     */
    @SerializedName(value = "imageDisplayName", alternate = {"ImageDisplayName"})
    @Expose
	@Nullable
    public String imageDisplayName;

    /**
     * The Image Id.
     * The ID of the OS image you want to provision on cloud PCs. The format for a gallery type image is: {publisher_offer_sku}.
     */
    @SerializedName(value = "imageId", alternate = {"ImageId"})
    @Expose
	@Nullable
    public String imageId;

    /**
     * The Image Type.
     * The type of OS image (custom or gallery) you want to provision on cloud PCs. Possible values are: gallery, custom.
     */
    @SerializedName(value = "imageType", alternate = {"ImageType"})
    @Expose
	@Nullable
    public CloudPcProvisioningPolicyImageType imageType;

    /**
     * The On Premises Connection Id.
     * The ID of the cloudPcOnPremisesConnection. To ensure that cloud PCs have network connectivity and that they domain join, choose a connection with a virtual network that’s validated by the cloud PC service.
     */
    @SerializedName(value = "onPremisesConnectionId", alternate = {"OnPremisesConnectionId"})
    @Expose
	@Nullable
    public String onPremisesConnectionId;

    /**
     * The Assignments.
     * A defined collection of provisioning policy assignments. Returned only on $expand. See an example of getting the assignments relationship.
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
