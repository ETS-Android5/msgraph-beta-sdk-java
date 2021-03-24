// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.VpnProxyServer;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Vpn Proxy Server.
 */
public class Windows81VpnProxyServer extends VpnProxyServer implements IJsonBackedObject {


    /**
     * The Automatically Detect Proxy Settings.
     * Automatically detect proxy settings.
     */
    @SerializedName(value = "automaticallyDetectProxySettings", alternate = {"AutomaticallyDetectProxySettings"})
    @Expose
	@Nullable
    public Boolean automaticallyDetectProxySettings;

    /**
     * The Bypass Proxy Server For Local Address.
     * Bypass proxy server for local address.
     */
    @SerializedName(value = "bypassProxyServerForLocalAddress", alternate = {"BypassProxyServerForLocalAddress"})
    @Expose
	@Nullable
    public Boolean bypassProxyServerForLocalAddress;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
