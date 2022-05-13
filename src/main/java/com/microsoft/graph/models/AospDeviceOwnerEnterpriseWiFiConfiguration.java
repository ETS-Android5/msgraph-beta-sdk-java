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
import com.microsoft.graph.models.WiFiAuthenticationMethod;
import com.microsoft.graph.models.AndroidEapType;
import com.microsoft.graph.models.NonEapAuthenticationMethodForEapTtlsType;
import com.microsoft.graph.models.NonEapAuthenticationMethodForPeap;
import com.microsoft.graph.models.AospDeviceOwnerCertificateProfileBase;
import com.microsoft.graph.models.AospDeviceOwnerTrustedRootCertificate;
import com.microsoft.graph.models.AospDeviceOwnerWiFiConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aosp Device Owner Enterprise Wi Fi Configuration.
 */
public class AospDeviceOwnerEnterpriseWiFiConfiguration extends AospDeviceOwnerWiFiConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
	@Nullable
    public WiFiAuthenticationMethod authenticationMethod;

    /**
     * The Eap Type.
     * Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: eapTls, eapTtls, peap.
     */
    @SerializedName(value = "eapType", alternate = {"EapType"})
    @Expose
	@Nullable
    public AndroidEapType eapType;

    /**
     * The Inner Authentication Protocol For Eap Ttls.
     * Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     */
    @SerializedName(value = "innerAuthenticationProtocolForEapTtls", alternate = {"InnerAuthenticationProtocolForEapTtls"})
    @Expose
	@Nullable
    public NonEapAuthenticationMethodForEapTtlsType innerAuthenticationProtocolForEapTtls;

    /**
     * The Inner Authentication Protocol For Peap.
     * Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. This collection can contain a maximum of 500 elements. Possible values are: none, microsoftChapVersionTwo.
     */
    @SerializedName(value = "innerAuthenticationProtocolForPeap", alternate = {"InnerAuthenticationProtocolForPeap"})
    @Expose
	@Nullable
    public NonEapAuthenticationMethodForPeap innerAuthenticationProtocolForPeap;

    /**
     * The Outer Identity Privacy Temporary Value.
     * Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.
     */
    @SerializedName(value = "outerIdentityPrivacyTemporaryValue", alternate = {"OuterIdentityPrivacyTemporaryValue"})
    @Expose
	@Nullable
    public String outerIdentityPrivacyTemporaryValue;

    /**
     * The Trusted Server Certificate Names.
     * Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network.
     */
    @SerializedName(value = "trustedServerCertificateNames", alternate = {"TrustedServerCertificateNames"})
    @Expose
	@Nullable
    public java.util.List<String> trustedServerCertificateNames;

    /**
     * The Identity Certificate For Client Authentication.
     * Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection.
     */
    @SerializedName(value = "identityCertificateForClientAuthentication", alternate = {"IdentityCertificateForClientAuthentication"})
    @Expose
	@Nullable
    public AospDeviceOwnerCertificateProfileBase identityCertificateForClientAuthentication;

    /**
     * The Root Certificate For Server Validation.
     * Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt.
     */
    @SerializedName(value = "rootCertificateForServerValidation", alternate = {"RootCertificateForServerValidation"})
    @Expose
	@Nullable
    public AospDeviceOwnerTrustedRootCertificate rootCertificateForServerValidation;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
