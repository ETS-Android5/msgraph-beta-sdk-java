// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ExternalAuthenticationType;
import com.microsoft.graph.models.OnPremisesPublishingSingleSignOn;
import com.microsoft.graph.models.VerifiedCustomDomainCertificatesMetadata;
import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Publishing.
 */
public class OnPremisesPublishing implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Alternate Url.
     * If you are configuring a traffic manager in front of multiple App Proxy applications, the alternateUrl is the user-friendly URL that will point to the traffic manager.
     */
    @SerializedName(value = "alternateUrl", alternate = {"AlternateUrl"})
    @Expose
	@Nullable
    public String alternateUrl;

    /**
     * The Application Server Timeout.
     * The duration the connector will wait for a response from the backend application before closing the connection. Possible values are default, long. When set to default, the backend application timeout has a length of 85 seconds. When set to long, the backend timeout is increased to 180 seconds. Use long if your server takes more than 85 seconds to respond to requests or if you are unable to access the application and the error status is 'Backend Timeout'. Default value is default.
     */
    @SerializedName(value = "applicationServerTimeout", alternate = {"ApplicationServerTimeout"})
    @Expose
	@Nullable
    public String applicationServerTimeout;

    /**
     * The Application Type.
     * Indicates if this application is an Application Proxy configured application. This is pre-set by the system. Read-only.
     */
    @SerializedName(value = "applicationType", alternate = {"ApplicationType"})
    @Expose
	@Nullable
    public String applicationType;

    /**
     * The External Authentication Type.
     * Details the pre-authentication setting for the application. Pre-authentication enforces that users must authenticate before accessing the app. Passthru does not require authentication. Possible values are: passthru, aadPreAuthentication.
     */
    @SerializedName(value = "externalAuthenticationType", alternate = {"ExternalAuthenticationType"})
    @Expose
	@Nullable
    public ExternalAuthenticationType externalAuthenticationType;

    /**
     * The External Url.
     * The published external url for the application. For example, https://intranet-contoso.msappproxy.net/.
     */
    @SerializedName(value = "externalUrl", alternate = {"ExternalUrl"})
    @Expose
	@Nullable
    public String externalUrl;

    /**
     * The Internal Url.
     * The internal url of the application. For example, https://intranet/.
     */
    @SerializedName(value = "internalUrl", alternate = {"InternalUrl"})
    @Expose
	@Nullable
    public String internalUrl;

    /**
     * The Is Backend Certificate Validation Enabled.
     * 
     */
    @SerializedName(value = "isBackendCertificateValidationEnabled", alternate = {"IsBackendCertificateValidationEnabled"})
    @Expose
	@Nullable
    public Boolean isBackendCertificateValidationEnabled;

    /**
     * The Is Http Only Cookie Enabled.
     * Indicates if the HTTPOnly cookie flag should be set in the HTTP response headers. Set this value to true to have Application Proxy cookies include the HTTPOnly flag in the HTTP response headers. If using Remote Desktop Services, set this value to False. Default value is false.
     */
    @SerializedName(value = "isHttpOnlyCookieEnabled", alternate = {"IsHttpOnlyCookieEnabled"})
    @Expose
	@Nullable
    public Boolean isHttpOnlyCookieEnabled;

    /**
     * The Is On Prem Publishing Enabled.
     * Indicates if the application is currently being published via Application Proxy or not. This is pre-set by the system. Read-only.
     */
    @SerializedName(value = "isOnPremPublishingEnabled", alternate = {"IsOnPremPublishingEnabled"})
    @Expose
	@Nullable
    public Boolean isOnPremPublishingEnabled;

    /**
     * The Is Persistent Cookie Enabled.
     * Indicates if the Persistent cookie flag should be set in the HTTP response headers. Keep this value set to false. Only use this setting for applications that can't share cookies between processes. For more information about cookie settings, see Cookie settings for accessing on-premises applications in Azure Active Directory. Default value is false.
     */
    @SerializedName(value = "isPersistentCookieEnabled", alternate = {"IsPersistentCookieEnabled"})
    @Expose
	@Nullable
    public Boolean isPersistentCookieEnabled;

    /**
     * The Is Secure Cookie Enabled.
     * Indicates if the Secure cookie flag should be set in the HTTP response headers. Set this value to true to transmit cookies over a secure channel such as an encrypted HTTPS request. Default value is true.
     */
    @SerializedName(value = "isSecureCookieEnabled", alternate = {"IsSecureCookieEnabled"})
    @Expose
	@Nullable
    public Boolean isSecureCookieEnabled;

    /**
     * The Is Translate Host Header Enabled.
     * Indicates if the application should translate urls in the reponse headers. Keep this value as true unless your application required the original host header in the authentication request. Default value is true.
     */
    @SerializedName(value = "isTranslateHostHeaderEnabled", alternate = {"IsTranslateHostHeaderEnabled"})
    @Expose
	@Nullable
    public Boolean isTranslateHostHeaderEnabled;

    /**
     * The Is Translate Links In Body Enabled.
     * Indicates if the application should translate urls in the application body. Keep this value as false unless you have hardcoded HTML links to other on-premises applications and don't use custom domains. For more information, see Link translation with Application Proxy. Default value is false.
     */
    @SerializedName(value = "isTranslateLinksInBodyEnabled", alternate = {"IsTranslateLinksInBodyEnabled"})
    @Expose
	@Nullable
    public Boolean isTranslateLinksInBodyEnabled;

    /**
     * The Single Sign On Settings.
     * Represents the single sign-on configuration for the on-premises application.
     */
    @SerializedName(value = "singleSignOnSettings", alternate = {"SingleSignOnSettings"})
    @Expose
	@Nullable
    public OnPremisesPublishingSingleSignOn singleSignOnSettings;

    /**
     * The Use Alternate Url For Translation And Redirect.
     * 
     */
    @SerializedName(value = "useAlternateUrlForTranslationAndRedirect", alternate = {"UseAlternateUrlForTranslationAndRedirect"})
    @Expose
	@Nullable
    public Boolean useAlternateUrlForTranslationAndRedirect;

    /**
     * The Verified Custom Domain Certificates Metadata.
     * Details of the certificate associated with the application when a custom domain is in use. null when using the default domain. Read-only.
     */
    @SerializedName(value = "verifiedCustomDomainCertificatesMetadata", alternate = {"VerifiedCustomDomainCertificatesMetadata"})
    @Expose
	@Nullable
    public VerifiedCustomDomainCertificatesMetadata verifiedCustomDomainCertificatesMetadata;

    /**
     * The Verified Custom Domain Key Credential.
     * The associated key credential for the custom domain used.
     */
    @SerializedName(value = "verifiedCustomDomainKeyCredential", alternate = {"VerifiedCustomDomainKeyCredential"})
    @Expose
	@Nullable
    public KeyCredential verifiedCustomDomainKeyCredential;

    /**
     * The Verified Custom Domain Password Credential.
     * The associated password credential for the custom domain used.
     */
    @SerializedName(value = "verifiedCustomDomainPasswordCredential", alternate = {"VerifiedCustomDomainPasswordCredential"})
    @Expose
	@Nullable
    public PasswordCredential verifiedCustomDomainPasswordCredential;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
