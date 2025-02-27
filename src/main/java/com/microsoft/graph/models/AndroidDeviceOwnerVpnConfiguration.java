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
import com.microsoft.graph.models.AndroidVpnConnectionType;
import com.microsoft.graph.models.KeyValue;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.VpnProxyServer;
import com.microsoft.graph.models.AppListItem;
import com.microsoft.graph.models.DeviceManagementDerivedCredentialSettings;
import com.microsoft.graph.models.AndroidDeviceOwnerCertificateProfileBase;
import com.microsoft.graph.models.VpnConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Vpn Configuration.
 */
public class AndroidDeviceOwnerVpnConfiguration extends VpnConfiguration implements IJsonBackedObject {


    /**
     * The Always On.
     * Whether or not to enable always-on VPN connection.
     */
    @SerializedName(value = "alwaysOn", alternate = {"AlwaysOn"})
    @Expose
	@Nullable
    public Boolean alwaysOn;

    /**
     * The Always On Lockdown.
     * If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     */
    @SerializedName(value = "alwaysOnLockdown", alternate = {"AlwaysOnLockdown"})
    @Expose
	@Nullable
    public Boolean alwaysOnLockdown;

    /**
     * The Connection Type.
     * Connection type. Possible values are: ciscoAnyConnect, pulseSecure, f5EdgeClient, dellSonicWallMobileConnect, checkPointCapsuleVpn, citrix, microsoftTunnel, netMotionMobility, microsoftProtect.
     */
    @SerializedName(value = "connectionType", alternate = {"ConnectionType"})
    @Expose
	@Nullable
    public AndroidVpnConnectionType connectionType;

    /**
     * The Custom Data.
     * Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     */
    @SerializedName(value = "customData", alternate = {"CustomData"})
    @Expose
	@Nullable
    public java.util.List<KeyValue> customData;

    /**
     * The Custom Key Value Data.
     * Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     */
    @SerializedName(value = "customKeyValueData", alternate = {"CustomKeyValueData"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> customKeyValueData;

    /**
     * The Microsoft Tunnel Site Id.
     * Microsoft Tunnel site ID.
     */
    @SerializedName(value = "microsoftTunnelSiteId", alternate = {"MicrosoftTunnelSiteId"})
    @Expose
	@Nullable
    public String microsoftTunnelSiteId;

    /**
     * The Proxy Server.
     * Proxy server.
     */
    @SerializedName(value = "proxyServer", alternate = {"ProxyServer"})
    @Expose
	@Nullable
    public VpnProxyServer proxyServer;

    /**
     * The Targeted Mobile Apps.
     * Targeted mobile apps. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "targetedMobileApps", alternate = {"TargetedMobileApps"})
    @Expose
	@Nullable
    public java.util.List<AppListItem> targetedMobileApps;

    /**
     * The Targeted Package Ids.
     * Targeted App package IDs.
     */
    @SerializedName(value = "targetedPackageIds", alternate = {"TargetedPackageIds"})
    @Expose
	@Nullable
    public java.util.List<String> targetedPackageIds;

    /**
     * The Derived Credential Settings.
     * Tenant level settings for the Derived Credentials to be used for authentication.
     */
    @SerializedName(value = "derivedCredentialSettings", alternate = {"DerivedCredentialSettings"})
    @Expose
	@Nullable
    public DeviceManagementDerivedCredentialSettings derivedCredentialSettings;

    /**
     * The Identity Certificate.
     * Identity certificate for client authentication when authentication method is certificate.
     */
    @SerializedName(value = "identityCertificate", alternate = {"IdentityCertificate"})
    @Expose
	@Nullable
    public AndroidDeviceOwnerCertificateProfileBase identityCertificate;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
