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
import com.microsoft.graph.models.AndroidVpnConnectionType;
import com.microsoft.graph.models.KeyValue;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.VpnServer;
import com.microsoft.graph.models.AndroidCertificateProfileBase;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Vpn Configuration.
 */
public class AndroidVpnConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Authentication method. Possible values are: certificate, usernameAndPassword, sharedSecret, derivedCredential, azureAD.
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
     * Connection type. Possible values are: ciscoAnyConnect, pulseSecure, f5EdgeClient, dellSonicWallMobileConnect, checkPointCapsuleVpn, citrix, microsoftTunnel, netMotionMobility, microsoftProtect.
     */
    @SerializedName(value = "connectionType", alternate = {"ConnectionType"})
    @Expose
	@Nullable
    public AndroidVpnConnectionType connectionType;

    /**
     * The Custom Data.
     * Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     */
    @SerializedName(value = "customData", alternate = {"CustomData"})
    @Expose
	@Nullable
    public java.util.List<KeyValue> customData;

    /**
     * The Custom Key Value Data.
     * Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     */
    @SerializedName(value = "customKeyValueData", alternate = {"CustomKeyValueData"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> customKeyValueData;

    /**
     * The Fingerprint.
     * Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     */
    @SerializedName(value = "fingerprint", alternate = {"Fingerprint"})
    @Expose
	@Nullable
    public String fingerprint;

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
     * The Servers.
     * List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "servers", alternate = {"Servers"})
    @Expose
	@Nullable
    public java.util.List<VpnServer> servers;

    /**
     * The Identity Certificate.
     * Identity certificate for client authentication when authentication method is certificate.
     */
    @SerializedName(value = "identityCertificate", alternate = {"IdentityCertificate"})
    @Expose
	@Nullable
    public AndroidCertificateProfileBase identityCertificate;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
