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
import com.microsoft.graph.models.WifiAuthenticationType;
import com.microsoft.graph.models.EapType;
import com.microsoft.graph.models.NonEapAuthenticationMethodForEapTtlsType;
import com.microsoft.graph.models.NetworkSingleSignOnType;
import com.microsoft.graph.models.WindowsCertificateProfileBase;
import com.microsoft.graph.models.Windows81TrustedRootCertificate;
import com.microsoft.graph.models.WindowsWifiConfiguration;
import com.microsoft.graph.requests.Windows81TrustedRootCertificateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Wifi Enterprise EAPConfiguration.
 */
public class WindowsWifiEnterpriseEAPConfiguration extends WindowsWifiConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
	@Nullable
    public WiFiAuthenticationMethod authenticationMethod;

    /**
     * The Authentication Period In Seconds.
     * Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.
     */
    @SerializedName(value = "authenticationPeriodInSeconds", alternate = {"AuthenticationPeriodInSeconds"})
    @Expose
	@Nullable
    public Integer authenticationPeriodInSeconds;

    /**
     * The Authentication Retry Delay Period In Seconds.
     * Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.
     */
    @SerializedName(value = "authenticationRetryDelayPeriodInSeconds", alternate = {"AuthenticationRetryDelayPeriodInSeconds"})
    @Expose
	@Nullable
    public Integer authenticationRetryDelayPeriodInSeconds;

    /**
     * The Authentication Type.
     * Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you’re using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest.
     */
    @SerializedName(value = "authenticationType", alternate = {"AuthenticationType"})
    @Expose
	@Nullable
    public WifiAuthenticationType authenticationType;

    /**
     * The Cache Credentials.
     * Specify whether to cache user credentials on the device so that users don’t need to keep entering them each time they connect.
     */
    @SerializedName(value = "cacheCredentials", alternate = {"CacheCredentials"})
    @Expose
	@Nullable
    public Boolean cacheCredentials;

    /**
     * The Disable User Prompt For Server Validation.
     * Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.
     */
    @SerializedName(value = "disableUserPromptForServerValidation", alternate = {"DisableUserPromptForServerValidation"})
    @Expose
	@Nullable
    public Boolean disableUserPromptForServerValidation;

    /**
     * The Eapol Start Period In Seconds.
     * Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.
     */
    @SerializedName(value = "eapolStartPeriodInSeconds", alternate = {"EapolStartPeriodInSeconds"})
    @Expose
	@Nullable
    public Integer eapolStartPeriodInSeconds;

    /**
     * The Eap Type.
     * Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: eapTls, leap, eapSim, eapTtls, peap, eapFast.
     */
    @SerializedName(value = "eapType", alternate = {"EapType"})
    @Expose
	@Nullable
    public EapType eapType;

    /**
     * The Enable Pairwise Master Key Caching.
     * Specify whether the wifi connection should enable pairwise master key caching.
     */
    @SerializedName(value = "enablePairwiseMasterKeyCaching", alternate = {"EnablePairwiseMasterKeyCaching"})
    @Expose
	@Nullable
    public Boolean enablePairwiseMasterKeyCaching;

    /**
     * The Enable Pre Authentication.
     * Specify whether pre-authentication should be enabled.
     */
    @SerializedName(value = "enablePreAuthentication", alternate = {"EnablePreAuthentication"})
    @Expose
	@Nullable
    public Boolean enablePreAuthentication;

    /**
     * The Inner Authentication Protocol For EAPTTLS.
     * Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     */
    @SerializedName(value = "innerAuthenticationProtocolForEAPTTLS", alternate = {"InnerAuthenticationProtocolForEAPTTLS"})
    @Expose
	@Nullable
    public NonEapAuthenticationMethodForEapTtlsType innerAuthenticationProtocolForEAPTTLS;

    /**
     * The Maximum Authentication Failures.
     * Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.
     */
    @SerializedName(value = "maximumAuthenticationFailures", alternate = {"MaximumAuthenticationFailures"})
    @Expose
	@Nullable
    public Integer maximumAuthenticationFailures;

    /**
     * The Maximum Authentication Timeout In Seconds.
     * Specify maximum authentication timeout (in seconds).  Valid range: 1-120
     */
    @SerializedName(value = "maximumAuthenticationTimeoutInSeconds", alternate = {"MaximumAuthenticationTimeoutInSeconds"})
    @Expose
	@Nullable
    public Integer maximumAuthenticationTimeoutInSeconds;

    /**
     * The Maximum EAPOLStart Messages.
     * Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     */
    @SerializedName(value = "maximumEAPOLStartMessages", alternate = {"MaximumEAPOLStartMessages"})
    @Expose
	@Nullable
    public Integer maximumEAPOLStartMessages;

    /**
     * The Maximum Number Of Pairwise Master Keys In Cache.
     * Specify maximum number of pairwise master keys in cache.  Valid range: 1-255
     */
    @SerializedName(value = "maximumNumberOfPairwiseMasterKeysInCache", alternate = {"MaximumNumberOfPairwiseMasterKeysInCache"})
    @Expose
	@Nullable
    public Integer maximumNumberOfPairwiseMasterKeysInCache;

    /**
     * The Maximum Pairwise Master Key Cache Time In Minutes.
     * Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440
     */
    @SerializedName(value = "maximumPairwiseMasterKeyCacheTimeInMinutes", alternate = {"MaximumPairwiseMasterKeyCacheTimeInMinutes"})
    @Expose
	@Nullable
    public Integer maximumPairwiseMasterKeyCacheTimeInMinutes;

    /**
     * The Maximum Pre Authentication Attempts.
     * Specify maximum pre-authentication attempts.  Valid range: 1-16
     */
    @SerializedName(value = "maximumPreAuthenticationAttempts", alternate = {"MaximumPreAuthenticationAttempts"})
    @Expose
	@Nullable
    public Integer maximumPreAuthenticationAttempts;

    /**
     * The Network Single Sign On.
     * Specify the network single sign on type. Possible values are: disabled, prelogon, postlogon.
     */
    @SerializedName(value = "networkSingleSignOn", alternate = {"NetworkSingleSignOn"})
    @Expose
	@Nullable
    public NetworkSingleSignOnType networkSingleSignOn;

    /**
     * The Outer Identity Privacy Temporary Value.
     * Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     */
    @SerializedName(value = "outerIdentityPrivacyTemporaryValue", alternate = {"OuterIdentityPrivacyTemporaryValue"})
    @Expose
	@Nullable
    public String outerIdentityPrivacyTemporaryValue;

    /**
     * The Perform Server Validation.
     * Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.
     */
    @SerializedName(value = "performServerValidation", alternate = {"PerformServerValidation"})
    @Expose
	@Nullable
    public Boolean performServerValidation;

    /**
     * The Prompt For Additional Authentication Credentials.
     * Specify whether the wifi connection should prompt for additional authentication credentials.
     */
    @SerializedName(value = "promptForAdditionalAuthenticationCredentials", alternate = {"PromptForAdditionalAuthenticationCredentials"})
    @Expose
	@Nullable
    public Boolean promptForAdditionalAuthenticationCredentials;

    /**
     * The Require Cryptographic Binding.
     * Specify whether to enable cryptographic binding when EAP type is selected as PEAP.
     */
    @SerializedName(value = "requireCryptographicBinding", alternate = {"RequireCryptographicBinding"})
    @Expose
	@Nullable
    public Boolean requireCryptographicBinding;

    /**
     * The Trusted Server Certificate Names.
     * Specify trusted server certificate names.
     */
    @SerializedName(value = "trustedServerCertificateNames", alternate = {"TrustedServerCertificateNames"})
    @Expose
	@Nullable
    public java.util.List<String> trustedServerCertificateNames;

    /**
     * The User Based Virtual Lan.
     * Specifiy whether to change the virtual LAN used by the device based on the user’s credentials. Cannot be used when NetworkSingleSignOnType is set to ​Disabled.
     */
    @SerializedName(value = "userBasedVirtualLan", alternate = {"UserBasedVirtualLan"})
    @Expose
	@Nullable
    public Boolean userBasedVirtualLan;

    /**
     * The Identity Certificate For Client Authentication.
     * Specify identity certificate for client authentication.
     */
    @SerializedName(value = "identityCertificateForClientAuthentication", alternate = {"IdentityCertificateForClientAuthentication"})
    @Expose
	@Nullable
    public WindowsCertificateProfileBase identityCertificateForClientAuthentication;

    /**
     * The Root Certificate For Client Validation.
     * Specify root certificate for client validation.
     */
    @SerializedName(value = "rootCertificateForClientValidation", alternate = {"RootCertificateForClientValidation"})
    @Expose
	@Nullable
    public Windows81TrustedRootCertificate rootCertificateForClientValidation;

    /**
     * The Root Certificates For Server Validation.
     * Specify root certificate for server validation.
     */
    @SerializedName(value = "rootCertificatesForServerValidation", alternate = {"RootCertificatesForServerValidation"})
    @Expose
	@Nullable
    public Windows81TrustedRootCertificateCollectionPage rootCertificatesForServerValidation;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("rootCertificatesForServerValidation")) {
            rootCertificatesForServerValidation = serializer.deserializeObject(json.get("rootCertificatesForServerValidation"), Windows81TrustedRootCertificateCollectionPage.class);
        }
    }
}
