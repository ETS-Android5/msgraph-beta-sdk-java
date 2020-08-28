// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.NetworkManagementCondition;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network IPv4Configuration Management Condition.
 */
public class NetworkIPv4ConfigurationManagementCondition extends NetworkManagementCondition implements IJsonBackedObject {


    /**
     * The Ip V4Prefix.
     * The IPv4 subnet to be connected to. e.g. 10.0.0.0/8
     */
    @SerializedName("ipV4Prefix")
    @Expose
    public String ipV4Prefix;

    /**
     * The Ip V4Gateway.
     * The IPv4 gateway address. e.g. 10.0.0.0
     */
    @SerializedName("ipV4Gateway")
    @Expose
    public String ipV4Gateway;

    /**
     * The Ip V4DHCPServer.
     * The IPv4 address of the DHCP server for the adapter.
     */
    @SerializedName("ipV4DHCPServer")
    @Expose
    public String ipV4DHCPServer;

    /**
     * The Ip V4DNSServer List.
     * The IPv4 DNS servers configured for the adapter.
     */
    @SerializedName("ipV4DNSServerList")
    @Expose
    public java.util.List<String> ipV4DNSServerList;

    /**
     * The Dns Suffix List.
     * Valid DNS suffixes for the current network. e.g. seattle.contoso.com
     */
    @SerializedName("dnsSuffixList")
    @Expose
    public java.util.List<String> dnsSuffixList;


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
