// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.LogonUser;
import com.microsoft.graph.models.extensions.NetworkInterface;
import com.microsoft.graph.models.extensions.SecurityVendorInformation;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Security Profile.
 */
public class HostSecurityProfile extends Entity implements IJsonBackedObject {


    /**
     * The Azure Subscription Id.
     * 
     */
    @SerializedName(value = "azureSubscriptionId", alternate = {"AzureSubscriptionId"})
    @Expose
    public String azureSubscriptionId;

    /**
     * The Azure Tenant Id.
     * 
     */
    @SerializedName(value = "azureTenantId", alternate = {"AzureTenantId"})
    @Expose
    public String azureTenantId;

    /**
     * The First Seen Date Time.
     * 
     */
    @SerializedName(value = "firstSeenDateTime", alternate = {"FirstSeenDateTime"})
    @Expose
    public java.util.Calendar firstSeenDateTime;

    /**
     * The Fqdn.
     * 
     */
    @SerializedName(value = "fqdn", alternate = {"Fqdn"})
    @Expose
    public String fqdn;

    /**
     * The Is Azure Ad Joined.
     * 
     */
    @SerializedName(value = "isAzureAdJoined", alternate = {"IsAzureAdJoined"})
    @Expose
    public Boolean isAzureAdJoined;

    /**
     * The Is Azure Ad Registered.
     * 
     */
    @SerializedName(value = "isAzureAdRegistered", alternate = {"IsAzureAdRegistered"})
    @Expose
    public Boolean isAzureAdRegistered;

    /**
     * The Is Hybrid Azure Domain Joined.
     * 
     */
    @SerializedName(value = "isHybridAzureDomainJoined", alternate = {"IsHybridAzureDomainJoined"})
    @Expose
    public Boolean isHybridAzureDomainJoined;

    /**
     * The Last Seen Date Time.
     * 
     */
    @SerializedName(value = "lastSeenDateTime", alternate = {"LastSeenDateTime"})
    @Expose
    public java.util.Calendar lastSeenDateTime;

    /**
     * The Logon Users.
     * 
     */
    @SerializedName(value = "logonUsers", alternate = {"LogonUsers"})
    @Expose
    public java.util.List<LogonUser> logonUsers;

    /**
     * The Net Bios Name.
     * 
     */
    @SerializedName(value = "netBiosName", alternate = {"NetBiosName"})
    @Expose
    public String netBiosName;

    /**
     * The Network Interfaces.
     * 
     */
    @SerializedName(value = "networkInterfaces", alternate = {"NetworkInterfaces"})
    @Expose
    public java.util.List<NetworkInterface> networkInterfaces;

    /**
     * The Os.
     * 
     */
    @SerializedName(value = "os", alternate = {"Os"})
    @Expose
    public String os;

    /**
     * The Os Version.
     * 
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
    public String osVersion;

    /**
     * The Parent Host.
     * 
     */
    @SerializedName(value = "parentHost", alternate = {"ParentHost"})
    @Expose
    public String parentHost;

    /**
     * The Related Host Ids.
     * 
     */
    @SerializedName(value = "relatedHostIds", alternate = {"RelatedHostIds"})
    @Expose
    public java.util.List<String> relatedHostIds;

    /**
     * The Risk Score.
     * 
     */
    @SerializedName(value = "riskScore", alternate = {"RiskScore"})
    @Expose
    public String riskScore;

    /**
     * The Tags.
     * 
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
    public java.util.List<String> tags;

    /**
     * The Vendor Information.
     * 
     */
    @SerializedName(value = "vendorInformation", alternate = {"VendorInformation"})
    @Expose
    public SecurityVendorInformation vendorInformation;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
