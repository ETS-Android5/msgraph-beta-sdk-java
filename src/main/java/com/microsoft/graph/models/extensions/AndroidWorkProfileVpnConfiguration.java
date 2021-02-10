// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.VpnAuthenticationMethod;
import com.microsoft.graph.models.generated.AndroidWorkProfileVpnConnectionType;
import com.microsoft.graph.models.extensions.KeyValue;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.VpnProxyServer;
import com.microsoft.graph.models.extensions.VpnServer;
import com.microsoft.graph.models.extensions.AppListItem;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCertificateProfileBase;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Vpn Configuration.
 */
public class AndroidWorkProfileVpnConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Always On.
     * Whether or not to enable always-on VPN connection.
     */
    @SerializedName(value = "alwaysOn", alternate = {"AlwaysOn"})
    @Expose
    public Boolean alwaysOn;

    /**
     * The Always On Lockdown.
     * If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     */
    @SerializedName(value = "alwaysOnLockdown", alternate = {"AlwaysOnLockdown"})
    @Expose
    public Boolean alwaysOnLockdown;

    /**
     * The Authentication Method.
     * Authentication method. Possible values are: certificate, usernameAndPassword, sharedSecret, derivedCredential, azureAD.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
    public VpnAuthenticationMethod authenticationMethod;

    /**
     * The Connection Name.
     * Connection name displayed to the user.
     */
    @SerializedName(value = "connectionName", alternate = {"ConnectionName"})
    @Expose
    public String connectionName;

    /**
     * The Connection Type.
     * Connection type. Possible values are: ciscoAnyConnect, pulseSecure, f5EdgeClient, dellSonicWallMobileConnect, checkPointCapsuleVpn, citrix, paloAltoGlobalProtect, microsoftTunnel, netMotionMobility, microsoftProtect.
     */
    @SerializedName(value = "connectionType", alternate = {"ConnectionType"})
    @Expose
    public AndroidWorkProfileVpnConnectionType connectionType;

    /**
     * The Custom Data.
     * Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     */
    @SerializedName(value = "customData", alternate = {"CustomData"})
    @Expose
    public java.util.List<KeyValue> customData;

    /**
     * The Custom Key Value Data.
     * Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     */
    @SerializedName(value = "customKeyValueData", alternate = {"CustomKeyValueData"})
    @Expose
    public java.util.List<KeyValuePair> customKeyValueData;

    /**
     * The Fingerprint.
     * Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     */
    @SerializedName(value = "fingerprint", alternate = {"Fingerprint"})
    @Expose
    public String fingerprint;

    /**
     * The Microsoft Tunnel Site Id.
     * Microsoft Tunnel site ID.
     */
    @SerializedName(value = "microsoftTunnelSiteId", alternate = {"MicrosoftTunnelSiteId"})
    @Expose
    public String microsoftTunnelSiteId;

    /**
     * The Proxy Server.
     * Proxy server.
     */
    @SerializedName(value = "proxyServer", alternate = {"ProxyServer"})
    @Expose
    public VpnProxyServer proxyServer;

    /**
     * The Realm.
     * Realm when connection type is set to Pulse Secure.
     */
    @SerializedName(value = "realm", alternate = {"Realm"})
    @Expose
    public String realm;

    /**
     * The Role.
     * Role when connection type is set to Pulse Secure.
     */
    @SerializedName(value = "role", alternate = {"Role"})
    @Expose
    public String role;

    /**
     * The Servers.
     * List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "servers", alternate = {"Servers"})
    @Expose
    public java.util.List<VpnServer> servers;

    /**
     * The Targeted Mobile Apps.
     * Targeted mobile apps. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "targetedMobileApps", alternate = {"TargetedMobileApps"})
    @Expose
    public java.util.List<AppListItem> targetedMobileApps;

    /**
     * The Targeted Package Ids.
     * Targeted App package IDs.
     */
    @SerializedName(value = "targetedPackageIds", alternate = {"TargetedPackageIds"})
    @Expose
    public java.util.List<String> targetedPackageIds;

    /**
     * The Identity Certificate.
     * Identity certificate for client authentication when authentication method is certificate.
     */
    @SerializedName(value = "identityCertificate", alternate = {"IdentityCertificate"})
    @Expose
    public AndroidWorkProfileCertificateProfileBase identityCertificate;


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
