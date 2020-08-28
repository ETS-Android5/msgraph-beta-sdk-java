// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.VpnTunnelConfigurationType;
import com.microsoft.graph.models.generated.VpnServiceExceptionAction;
import com.microsoft.graph.models.extensions.SpecifiedCaptiveNetworkPlugins;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Vpn Always On Configuration.
 */
public class AppleVpnAlwaysOnConfiguration implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Tunnel Configuration.
     * Determines what connections the specific tunnel configuration applies to
     */
    @SerializedName("tunnelConfiguration")
    @Expose
    public VpnTunnelConfigurationType tunnelConfiguration;

    /**
     * The User Toggle Enabled.
     * Allow the user to toggle the VPN configuration using the UI
     */
    @SerializedName("userToggleEnabled")
    @Expose
    public Boolean userToggleEnabled;

    /**
     * The Voicemail Exception Action.
     * Determine whether voicemail service will be exempt from the always-on VPN connection
     */
    @SerializedName("voicemailExceptionAction")
    @Expose
    public VpnServiceExceptionAction voicemailExceptionAction;

    /**
     * The Air Print Exception Action.
     * Determine whether AirPrint service will be exempt from the always-on VPN connection
     */
    @SerializedName("airPrintExceptionAction")
    @Expose
    public VpnServiceExceptionAction airPrintExceptionAction;

    /**
     * The Cellular Exception Action.
     * Determine whether Cellular service will be exempt from the always-on VPN connection
     */
    @SerializedName("cellularExceptionAction")
    @Expose
    public VpnServiceExceptionAction cellularExceptionAction;

    /**
     * The Allow All Captive Network Plugins.
     * Specifies whether traffic from all captive network plugins should be allowed outside the vpn
     */
    @SerializedName("allowAllCaptiveNetworkPlugins")
    @Expose
    public Boolean allowAllCaptiveNetworkPlugins;

    /**
     * The Allowed Captive Network Plugins.
     * Determines whether all, some, or no non-native captive networking apps are allowed
     */
    @SerializedName("allowedCaptiveNetworkPlugins")
    @Expose
    public SpecifiedCaptiveNetworkPlugins allowedCaptiveNetworkPlugins;

    /**
     * The Allow Captive Web Sheet.
     * Determines whether traffic from the Websheet app is allowed outside of the VPN
     */
    @SerializedName("allowCaptiveWebSheet")
    @Expose
    public Boolean allowCaptiveWebSheet;

    /**
     * The Nat Keep Alive Interval In Seconds.
     * Specifies how often in seconds to send a network address translation keepalive package through the VPN
     */
    @SerializedName("natKeepAliveIntervalInSeconds")
    @Expose
    public Integer natKeepAliveIntervalInSeconds;

    /**
     * The Nat Keep Alive Offload Enable.
     * Enable hardware offloading of NAT keepalive signals when the device is asleep
     */
    @SerializedName("natKeepAliveOffloadEnable")
    @Expose
    public Boolean natKeepAliveOffloadEnable;


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
