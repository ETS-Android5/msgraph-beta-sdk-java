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
import com.microsoft.graph.models.VpnAuthenticationMethod;
import com.microsoft.graph.models.AppleVpnConnectionType;
import com.microsoft.graph.models.KeyValue;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.VpnOnDemandRule;
import com.microsoft.graph.models.VpnProviderType;
import com.microsoft.graph.models.VpnProxyServer;
import com.microsoft.graph.models.VpnServer;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Vpn Configuration.
 */
public class AppleVpnConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Associated Domains.
     * Associated Domains
     */
    @SerializedName(value = "associatedDomains", alternate = {"AssociatedDomains"})
    @Expose
	@Nullable
    public java.util.List<String> associatedDomains;

    /**
     * The Authentication Method.
     * Authentication method for this VPN connection. Possible values are: certificate, usernameAndPassword, sharedSecret, derivedCredential, azureAD.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
	@Nullable
    public VpnAuthenticationMethod authenticationMethod;

    /**
     * The Connection Name.
     * Connection name displayed to the user.
     */
    @SerializedName(value = "connectionName", alternate = {"ConnectionName"})
    @Expose
	@Nullable
    public String connectionName;

    /**
     * The Connection Type.
     * Connection type. Possible values are: ciscoAnyConnect, pulseSecure, f5EdgeClient, dellSonicWallMobileConnect, checkPointCapsuleVpn, customVpn, ciscoIPSec, citrix, ciscoAnyConnectV2, paloAltoGlobalProtect, zscalerPrivateAccess, f5Access2018, citrixSso, paloAltoGlobalProtectV2, ikEv2, alwaysOn, microsoftTunnel, netMotionMobility, microsoftProtect.
     */
    @SerializedName(value = "connectionType", alternate = {"ConnectionType"})
    @Expose
	@Nullable
    public AppleVpnConnectionType connectionType;

    /**
     * The Custom Data.
     * Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     */
    @SerializedName(value = "customData", alternate = {"CustomData"})
    @Expose
	@Nullable
    public java.util.List<KeyValue> customData;

    /**
     * The Custom Key Value Data.
     * Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     */
    @SerializedName(value = "customKeyValueData", alternate = {"CustomKeyValueData"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> customKeyValueData;

    /**
     * The Disable On Demand User Override.
     * Toggle to prevent user from disabling automatic VPN in the Settings app
     */
    @SerializedName(value = "disableOnDemandUserOverride", alternate = {"DisableOnDemandUserOverride"})
    @Expose
	@Nullable
    public Boolean disableOnDemandUserOverride;

    /**
     * The Disconnect On Idle.
     * Whether to disconnect after on-demand connection idles
     */
    @SerializedName(value = "disconnectOnIdle", alternate = {"DisconnectOnIdle"})
    @Expose
	@Nullable
    public Boolean disconnectOnIdle;

    /**
     * The Disconnect On Idle Timer In Seconds.
     * The length of time in seconds to wait before disconnecting an on-demand connection. Valid values 0 to 65535
     */
    @SerializedName(value = "disconnectOnIdleTimerInSeconds", alternate = {"DisconnectOnIdleTimerInSeconds"})
    @Expose
	@Nullable
    public Integer disconnectOnIdleTimerInSeconds;

    /**
     * The Enable Per App.
     * Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device.
     */
    @SerializedName(value = "enablePerApp", alternate = {"EnablePerApp"})
    @Expose
	@Nullable
    public Boolean enablePerApp;

    /**
     * The Enable Split Tunneling.
     * Send all network traffic through VPN.
     */
    @SerializedName(value = "enableSplitTunneling", alternate = {"EnableSplitTunneling"})
    @Expose
	@Nullable
    public Boolean enableSplitTunneling;

    /**
     * The Excluded Domains.
     * Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated
     */
    @SerializedName(value = "excludedDomains", alternate = {"ExcludedDomains"})
    @Expose
	@Nullable
    public java.util.List<String> excludedDomains;

    /**
     * The Identifier.
     * Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin
     */
    @SerializedName(value = "identifier", alternate = {"Identifier"})
    @Expose
	@Nullable
    public String identifier;

    /**
     * The Login Group Or Domain.
     * Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     */
    @SerializedName(value = "loginGroupOrDomain", alternate = {"LoginGroupOrDomain"})
    @Expose
	@Nullable
    public String loginGroupOrDomain;

    /**
     * The On Demand Rules.
     * On-Demand Rules. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "onDemandRules", alternate = {"OnDemandRules"})
    @Expose
	@Nullable
    public java.util.List<VpnOnDemandRule> onDemandRules;

    /**
     * The Opt In To Device Id Sharing.
     * Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation.
     */
    @SerializedName(value = "optInToDeviceIdSharing", alternate = {"OptInToDeviceIdSharing"})
    @Expose
	@Nullable
    public Boolean optInToDeviceIdSharing;

    /**
     * The Provider Type.
     * Provider type for per-app VPN. Possible values are: notConfigured, appProxy, packetTunnel.
     */
    @SerializedName(value = "providerType", alternate = {"ProviderType"})
    @Expose
	@Nullable
    public VpnProviderType providerType;

    /**
     * The Proxy Server.
     * Proxy Server.
     */
    @SerializedName(value = "proxyServer", alternate = {"ProxyServer"})
    @Expose
	@Nullable
    public VpnProxyServer proxyServer;

    /**
     * The Realm.
     * Realm when connection type is set to Pulse Secure.
     */
    @SerializedName(value = "realm", alternate = {"Realm"})
    @Expose
	@Nullable
    public String realm;

    /**
     * The Role.
     * Role when connection type is set to Pulse Secure.
     */
    @SerializedName(value = "role", alternate = {"Role"})
    @Expose
	@Nullable
    public String role;

    /**
     * The Safari Domains.
     * Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection.
     */
    @SerializedName(value = "safariDomains", alternate = {"SafariDomains"})
    @Expose
	@Nullable
    public java.util.List<String> safariDomains;

    /**
     * The Server.
     * VPN Server on the network. Make sure end users can access this network location.
     */
    @SerializedName(value = "server", alternate = {"Server"})
    @Expose
	@Nullable
    public VpnServer server;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
