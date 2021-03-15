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
import com.microsoft.graph.models.NetworkManagementCondition;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network IPv4Configuration Management Condition.
 */
public class NetworkIPv4ConfigurationManagementCondition extends NetworkManagementCondition implements IJsonBackedObject {


    /**
     * The Dns Suffix List.
     * Valid DNS suffixes for the current network. e.g. seattle.contoso.com
     */
    @SerializedName(value = "dnsSuffixList", alternate = {"DnsSuffixList"})
    @Expose
	@Nullable
    public java.util.List<String> dnsSuffixList;

    /**
     * The Ip V4DHCPServer.
     * The IPv4 address of the DHCP server for the adapter.
     */
    @SerializedName(value = "ipV4DHCPServer", alternate = {"IpV4DHCPServer"})
    @Expose
	@Nullable
    public String ipV4DHCPServer;

    /**
     * The Ip V4DNSServer List.
     * The IPv4 DNS servers configured for the adapter.
     */
    @SerializedName(value = "ipV4DNSServerList", alternate = {"IpV4DNSServerList"})
    @Expose
	@Nullable
    public java.util.List<String> ipV4DNSServerList;

    /**
     * The Ip V4Gateway.
     * The IPv4 gateway address. e.g. 10.0.0.0
     */
    @SerializedName(value = "ipV4Gateway", alternate = {"IpV4Gateway"})
    @Expose
	@Nullable
    public String ipV4Gateway;

    /**
     * The Ip V4Prefix.
     * The IPv4 subnet to be connected to. e.g. 10.0.0.0/8
     */
    @SerializedName(value = "ipV4Prefix", alternate = {"IpV4Prefix"})
    @Expose
	@Nullable
    public String ipV4Prefix;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
