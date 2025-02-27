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
import com.microsoft.graph.models.Windows10AssociatedApps;
import com.microsoft.graph.models.Windows10VpnAuthenticationMethod;
import com.microsoft.graph.models.Windows10VpnConnectionType;
import com.microsoft.graph.models.CryptographySuite;
import com.microsoft.graph.models.VpnDnsRule;
import com.microsoft.graph.models.Windows10VpnProfileTarget;
import com.microsoft.graph.models.Windows10VpnProxyServer;
import com.microsoft.graph.models.VpnRoute;
import com.microsoft.graph.models.ExtendedKeyUsage;
import com.microsoft.graph.models.VpnTrafficRule;
import com.microsoft.graph.models.WindowsCertificateProfileBase;
import com.microsoft.graph.models.WindowsVpnConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Vpn Configuration.
 */
public class Windows10VpnConfiguration extends WindowsVpnConfiguration implements IJsonBackedObject {


    /**
     * The Associated Apps.
     * Associated Apps. This collection can contain a maximum of 10000 elements.
     */
    @SerializedName(value = "associatedApps", alternate = {"AssociatedApps"})
    @Expose
	@Nullable
    public java.util.List<Windows10AssociatedApps> associatedApps;

    /**
     * The Authentication Method.
     * Authentication method. Possible values are: certificate, usernameAndPassword, customEapXml, derivedCredential.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
	@Nullable
    public Windows10VpnAuthenticationMethod authenticationMethod;

    /**
     * The Connection Type.
     * Connection type. Possible values are: pulseSecure, f5EdgeClient, dellSonicWallMobileConnect, checkPointCapsuleVpn, automatic, ikEv2, l2tp, pptp, citrix, paloAltoGlobalProtect, ciscoAnyConnect, unknownFutureValue, microsoftTunnel.
     */
    @SerializedName(value = "connectionType", alternate = {"ConnectionType"})
    @Expose
	@Nullable
    public Windows10VpnConnectionType connectionType;

    /**
     * The Cryptography Suite.
     * Cryptography Suite security settings for IKEv2 VPN in Windows10 and above
     */
    @SerializedName(value = "cryptographySuite", alternate = {"CryptographySuite"})
    @Expose
	@Nullable
    public CryptographySuite cryptographySuite;

    /**
     * The Dns Rules.
     * DNS rules. This collection can contain a maximum of 1000 elements.
     */
    @SerializedName(value = "dnsRules", alternate = {"DnsRules"})
    @Expose
	@Nullable
    public java.util.List<VpnDnsRule> dnsRules;

    /**
     * The Dns Suffixes.
     * Specify DNS suffixes to add to the DNS search list to properly route short names.
     */
    @SerializedName(value = "dnsSuffixes", alternate = {"DnsSuffixes"})
    @Expose
	@Nullable
    public java.util.List<String> dnsSuffixes;

    /**
     * The Eap Xml.
     * Extensible Authentication Protocol (EAP) XML. (UTF8 encoded byte array)
     */
    @SerializedName(value = "eapXml", alternate = {"EapXml"})
    @Expose
	@Nullable
    public byte[] eapXml;

    /**
     * The Enable Always On.
     * Enable Always On mode.
     */
    @SerializedName(value = "enableAlwaysOn", alternate = {"EnableAlwaysOn"})
    @Expose
	@Nullable
    public Boolean enableAlwaysOn;

    /**
     * The Enable Conditional Access.
     * Enable conditional access.
     */
    @SerializedName(value = "enableConditionalAccess", alternate = {"EnableConditionalAccess"})
    @Expose
	@Nullable
    public Boolean enableConditionalAccess;

    /**
     * The Enable Device Tunnel.
     * Enable device tunnel.
     */
    @SerializedName(value = "enableDeviceTunnel", alternate = {"EnableDeviceTunnel"})
    @Expose
	@Nullable
    public Boolean enableDeviceTunnel;

    /**
     * The Enable Dns Registration.
     * Enable IP address registration with internal DNS.
     */
    @SerializedName(value = "enableDnsRegistration", alternate = {"EnableDnsRegistration"})
    @Expose
	@Nullable
    public Boolean enableDnsRegistration;

    /**
     * The Enable Single Sign On With Alternate Certificate.
     * Enable single sign-on (SSO) with alternate certificate.
     */
    @SerializedName(value = "enableSingleSignOnWithAlternateCertificate", alternate = {"EnableSingleSignOnWithAlternateCertificate"})
    @Expose
	@Nullable
    public Boolean enableSingleSignOnWithAlternateCertificate;

    /**
     * The Enable Split Tunneling.
     * Enable split tunneling.
     */
    @SerializedName(value = "enableSplitTunneling", alternate = {"EnableSplitTunneling"})
    @Expose
	@Nullable
    public Boolean enableSplitTunneling;

    /**
     * The Microsoft Tunnel Site Id.
     * ID of the Microsoft Tunnel site associated with the VPN profile.
     */
    @SerializedName(value = "microsoftTunnelSiteId", alternate = {"MicrosoftTunnelSiteId"})
    @Expose
	@Nullable
    public String microsoftTunnelSiteId;

    /**
     * The Only Associated Apps Can Use Connection.
     * Only associated Apps can use connection (per-app VPN).
     */
    @SerializedName(value = "onlyAssociatedAppsCanUseConnection", alternate = {"OnlyAssociatedAppsCanUseConnection"})
    @Expose
	@Nullable
    public Boolean onlyAssociatedAppsCanUseConnection;

    /**
     * The Profile Target.
     * Profile target type. Possible values are: user, device, autoPilotDevice.
     */
    @SerializedName(value = "profileTarget", alternate = {"ProfileTarget"})
    @Expose
	@Nullable
    public Windows10VpnProfileTarget profileTarget;

    /**
     * The Proxy Server.
     * Proxy Server.
     */
    @SerializedName(value = "proxyServer", alternate = {"ProxyServer"})
    @Expose
	@Nullable
    public Windows10VpnProxyServer proxyServer;

    /**
     * The Remember User Credentials.
     * Remember user credentials.
     */
    @SerializedName(value = "rememberUserCredentials", alternate = {"RememberUserCredentials"})
    @Expose
	@Nullable
    public Boolean rememberUserCredentials;

    /**
     * The Routes.
     * Routes (optional for third-party providers). This collection can contain a maximum of 1000 elements.
     */
    @SerializedName(value = "routes", alternate = {"Routes"})
    @Expose
	@Nullable
    public java.util.List<VpnRoute> routes;

    /**
     * The Single Sign On Eku.
     * Single sign-on Extended Key Usage (EKU).
     */
    @SerializedName(value = "singleSignOnEku", alternate = {"SingleSignOnEku"})
    @Expose
	@Nullable
    public ExtendedKeyUsage singleSignOnEku;

    /**
     * The Single Sign On Issuer Hash.
     * Single sign-on issuer hash.
     */
    @SerializedName(value = "singleSignOnIssuerHash", alternate = {"SingleSignOnIssuerHash"})
    @Expose
	@Nullable
    public String singleSignOnIssuerHash;

    /**
     * The Traffic Rules.
     * Traffic rules. This collection can contain a maximum of 1000 elements.
     */
    @SerializedName(value = "trafficRules", alternate = {"TrafficRules"})
    @Expose
	@Nullable
    public java.util.List<VpnTrafficRule> trafficRules;

    /**
     * The Trusted Network Domains.
     * Trusted Network Domains
     */
    @SerializedName(value = "trustedNetworkDomains", alternate = {"TrustedNetworkDomains"})
    @Expose
	@Nullable
    public java.util.List<String> trustedNetworkDomains;

    /**
     * The Windows Information Protection Domain.
     * Windows Information Protection (WIP) domain to associate with this connection.
     */
    @SerializedName(value = "windowsInformationProtectionDomain", alternate = {"WindowsInformationProtectionDomain"})
    @Expose
	@Nullable
    public String windowsInformationProtectionDomain;

    /**
     * The Identity Certificate.
     * Identity certificate for client authentication when authentication method is certificate.
     */
    @SerializedName(value = "identityCertificate", alternate = {"IdentityCertificate"})
    @Expose
	@Nullable
    public WindowsCertificateProfileBase identityCertificate;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
