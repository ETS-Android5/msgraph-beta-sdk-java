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
import com.microsoft.graph.models.FileHash;
import com.microsoft.graph.models.MalwareState;
import com.microsoft.graph.models.SecurityVendorInformation;
import com.microsoft.graph.models.VulnerabilityState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Security Profile.
 */
public class FileSecurityProfile extends Entity implements IJsonBackedObject {


    /**
     * The Activity Group Names.
     * 
     */
    @SerializedName(value = "activityGroupNames", alternate = {"ActivityGroupNames"})
    @Expose
	@Nullable
    public java.util.List<String> activityGroupNames;

    /**
     * The Azure Subscription Id.
     * 
     */
    @SerializedName(value = "azureSubscriptionId", alternate = {"AzureSubscriptionId"})
    @Expose
	@Nullable
    public String azureSubscriptionId;

    /**
     * The Azure Tenant Id.
     * 
     */
    @SerializedName(value = "azureTenantId", alternate = {"AzureTenantId"})
    @Expose
	@Nullable
    public String azureTenantId;

    /**
     * The Certificate Thumbprint.
     * 
     */
    @SerializedName(value = "certificateThumbprint", alternate = {"CertificateThumbprint"})
    @Expose
	@Nullable
    public String certificateThumbprint;

    /**
     * The Extensions.
     * 
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public java.util.List<String> extensions;

    /**
     * The File Type.
     * 
     */
    @SerializedName(value = "fileType", alternate = {"FileType"})
    @Expose
	@Nullable
    public String fileType;

    /**
     * The First Seen Date Time.
     * 
     */
    @SerializedName(value = "firstSeenDateTime", alternate = {"FirstSeenDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime firstSeenDateTime;

    /**
     * The Hashes.
     * 
     */
    @SerializedName(value = "hashes", alternate = {"Hashes"})
    @Expose
	@Nullable
    public java.util.List<FileHash> hashes;

    /**
     * The Last Seen Date Time.
     * 
     */
    @SerializedName(value = "lastSeenDateTime", alternate = {"LastSeenDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastSeenDateTime;

    /**
     * The Malware States.
     * 
     */
    @SerializedName(value = "malwareStates", alternate = {"MalwareStates"})
    @Expose
	@Nullable
    public java.util.List<MalwareState> malwareStates;

    /**
     * The Names.
     * 
     */
    @SerializedName(value = "names", alternate = {"Names"})
    @Expose
	@Nullable
    public java.util.List<String> names;

    /**
     * The Risk Score.
     * 
     */
    @SerializedName(value = "riskScore", alternate = {"RiskScore"})
    @Expose
	@Nullable
    public String riskScore;

    /**
     * The Size.
     * 
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public Long size;

    /**
     * The Tags.
     * 
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
	@Nullable
    public java.util.List<String> tags;

    /**
     * The Vendor Information.
     * 
     */
    @SerializedName(value = "vendorInformation", alternate = {"VendorInformation"})
    @Expose
	@Nullable
    public SecurityVendorInformation vendorInformation;

    /**
     * The Vulnerability States.
     * 
     */
    @SerializedName(value = "vulnerabilityStates", alternate = {"VulnerabilityStates"})
    @Expose
	@Nullable
    public java.util.List<VulnerabilityState> vulnerabilityStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
