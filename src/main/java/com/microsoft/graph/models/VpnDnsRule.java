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


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpn Dns Rule.
 */
public class VpnDnsRule implements IJsonBackedObject {

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
     * The Auto Trigger.
     * Automatically connect to the VPN when the device connects to this domain: Default False.
     */
    @SerializedName(value = "autoTrigger", alternate = {"AutoTrigger"})
    @Expose
	@Nullable
    public Boolean autoTrigger;

    /**
     * The Name.
     * Name.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Persistent.
     * Keep this rule active even when the VPN is not connected: Default False
     */
    @SerializedName(value = "persistent", alternate = {"Persistent"})
    @Expose
	@Nullable
    public Boolean persistent;

    /**
     * The Proxy Server Uri.
     * Proxy Server Uri.
     */
    @SerializedName(value = "proxyServerUri", alternate = {"ProxyServerUri"})
    @Expose
	@Nullable
    public String proxyServerUri;

    /**
     * The Servers.
     * Servers.
     */
    @SerializedName(value = "servers", alternate = {"Servers"})
    @Expose
	@Nullable
    public java.util.List<String> servers;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
