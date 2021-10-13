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
import com.microsoft.graph.models.CloudPcAuditEvent;
import com.microsoft.graph.models.CloudPC;
import com.microsoft.graph.models.CloudPcDeviceImage;
import com.microsoft.graph.models.CloudPcGalleryImage;
import com.microsoft.graph.models.CloudPcOnPremisesConnection;
import com.microsoft.graph.models.CloudPcProvisioningPolicy;
import com.microsoft.graph.models.CloudPcServicePlan;
import com.microsoft.graph.models.CloudPcSupportedRegion;
import com.microsoft.graph.models.CloudPcUserSetting;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.CloudPcAuditEventCollectionPage;
import com.microsoft.graph.requests.CloudPCCollectionPage;
import com.microsoft.graph.requests.CloudPcDeviceImageCollectionPage;
import com.microsoft.graph.requests.CloudPcGalleryImageCollectionPage;
import com.microsoft.graph.requests.CloudPcOnPremisesConnectionCollectionPage;
import com.microsoft.graph.requests.CloudPcProvisioningPolicyCollectionPage;
import com.microsoft.graph.requests.CloudPcServicePlanCollectionPage;
import com.microsoft.graph.requests.CloudPcSupportedRegionCollectionPage;
import com.microsoft.graph.requests.CloudPcUserSettingCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Virtual Endpoint.
 */
public class VirtualEndpoint extends Entity implements IJsonBackedObject {


    /**
     * The Audit Events.
     * Cloud PC audit event.
     */
    @SerializedName(value = "auditEvents", alternate = {"AuditEvents"})
    @Expose
	@Nullable
    public CloudPcAuditEventCollectionPage auditEvents;

    /**
     * The Cloud PCs.
     * Cloud managed virtual desktops.
     */
    @SerializedName(value = "cloudPCs", alternate = {"CloudPCs"})
    @Expose
	@Nullable
    public CloudPCCollectionPage cloudPCs;

    /**
     * The Device Images.
     * The image resource on Cloud PC.
     */
    @SerializedName(value = "deviceImages", alternate = {"DeviceImages"})
    @Expose
	@Nullable
    public CloudPcDeviceImageCollectionPage deviceImages;

    /**
     * The Gallery Images.
     * 
     */
    @SerializedName(value = "galleryImages", alternate = {"GalleryImages"})
    @Expose
	@Nullable
    public CloudPcGalleryImageCollectionPage galleryImages;

    /**
     * The On Premises Connections.
     * A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     */
    @SerializedName(value = "onPremisesConnections", alternate = {"OnPremisesConnections"})
    @Expose
	@Nullable
    public CloudPcOnPremisesConnectionCollectionPage onPremisesConnections;

    /**
     * The Provisioning Policies.
     * Cloud PC provisioning policy.
     */
    @SerializedName(value = "provisioningPolicies", alternate = {"ProvisioningPolicies"})
    @Expose
	@Nullable
    public CloudPcProvisioningPolicyCollectionPage provisioningPolicies;

    /**
     * The Service Plans.
     * 
     */
    @SerializedName(value = "servicePlans", alternate = {"ServicePlans"})
    @Expose
	@Nullable
    public CloudPcServicePlanCollectionPage servicePlans;

    /**
     * The Supported Regions.
     * Cloud PC supported regions.
     */
    @SerializedName(value = "supportedRegions", alternate = {"SupportedRegions"})
    @Expose
	@Nullable
    public CloudPcSupportedRegionCollectionPage supportedRegions;

    /**
     * The User Settings.
     * Cloud PC user settings.
     */
    @SerializedName(value = "userSettings", alternate = {"UserSettings"})
    @Expose
	@Nullable
    public CloudPcUserSettingCollectionPage userSettings;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("auditEvents")) {
            auditEvents = serializer.deserializeObject(json.get("auditEvents"), CloudPcAuditEventCollectionPage.class);
        }

        if (json.has("cloudPCs")) {
            cloudPCs = serializer.deserializeObject(json.get("cloudPCs"), CloudPCCollectionPage.class);
        }

        if (json.has("deviceImages")) {
            deviceImages = serializer.deserializeObject(json.get("deviceImages"), CloudPcDeviceImageCollectionPage.class);
        }

        if (json.has("galleryImages")) {
            galleryImages = serializer.deserializeObject(json.get("galleryImages"), CloudPcGalleryImageCollectionPage.class);
        }

        if (json.has("onPremisesConnections")) {
            onPremisesConnections = serializer.deserializeObject(json.get("onPremisesConnections"), CloudPcOnPremisesConnectionCollectionPage.class);
        }

        if (json.has("provisioningPolicies")) {
            provisioningPolicies = serializer.deserializeObject(json.get("provisioningPolicies"), CloudPcProvisioningPolicyCollectionPage.class);
        }

        if (json.has("servicePlans")) {
            servicePlans = serializer.deserializeObject(json.get("servicePlans"), CloudPcServicePlanCollectionPage.class);
        }

        if (json.has("supportedRegions")) {
            supportedRegions = serializer.deserializeObject(json.get("supportedRegions"), CloudPcSupportedRegionCollectionPage.class);
        }

        if (json.has("userSettings")) {
            userSettings = serializer.deserializeObject(json.get("userSettings"), CloudPcUserSettingCollectionPage.class);
        }
    }
}
