// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network Interface.
 */
public class NetworkInterface implements IJsonBackedObject {

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
     * The Description.
     * Description of the NIC (e.g. Ethernet adapter, Wireless LAN adapter Local Area Connection &amp;lt;#&amp;gt;, etc.).
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Ip V4Address.
     * Last IPv4 address associated with this NIC.
     */
    @SerializedName(value = "ipV4Address", alternate = {"IpV4Address"})
    @Expose
	@Nullable
    public String ipV4Address;

    /**
     * The Ip V6Address.
     * Last Public (aka global) IPv6 address associated with this NIC.
     */
    @SerializedName(value = "ipV6Address", alternate = {"IpV6Address"})
    @Expose
	@Nullable
    public String ipV6Address;

    /**
     * The Local Ip V6Address.
     * Last local (link-local or site-local) IPv6 address associated with this NIC.
     */
    @SerializedName(value = "localIpV6Address", alternate = {"LocalIpV6Address"})
    @Expose
	@Nullable
    public String localIpV6Address;

    /**
     * The Mac Address.
     * MAC address of the NIC on this host.
     */
    @SerializedName(value = "macAddress", alternate = {"MacAddress"})
    @Expose
	@Nullable
    public String macAddress;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
