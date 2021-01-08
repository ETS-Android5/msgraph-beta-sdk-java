// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsVpnConnectionType;
import com.microsoft.graph.models.extensions.Windows81VpnProxyServer;
import com.microsoft.graph.models.extensions.WindowsVpnConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Vpn Configuration.
 */
public class Windows81VpnConfiguration extends WindowsVpnConfiguration implements IJsonBackedObject {


    /**
     * The Apply Only To Windows81.
     * Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     */
    @SerializedName(value = "applyOnlyToWindows81", alternate = {"ApplyOnlyToWindows81"})
    @Expose
    public Boolean applyOnlyToWindows81;

    /**
     * The Connection Type.
     * Connection type. Possible values are: pulseSecure, f5EdgeClient, dellSonicWallMobileConnect, checkPointCapsuleVpn.
     */
    @SerializedName(value = "connectionType", alternate = {"ConnectionType"})
    @Expose
    public WindowsVpnConnectionType connectionType;

    /**
     * The Enable Split Tunneling.
     * Enable split tunneling for the VPN.
     */
    @SerializedName(value = "enableSplitTunneling", alternate = {"EnableSplitTunneling"})
    @Expose
    public Boolean enableSplitTunneling;

    /**
     * The Login Group Or Domain.
     * Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     */
    @SerializedName(value = "loginGroupOrDomain", alternate = {"LoginGroupOrDomain"})
    @Expose
    public String loginGroupOrDomain;

    /**
     * The Proxy Server.
     * Proxy Server.
     */
    @SerializedName(value = "proxyServer", alternate = {"ProxyServer"})
    @Expose
    public Windows81VpnProxyServer proxyServer;


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
