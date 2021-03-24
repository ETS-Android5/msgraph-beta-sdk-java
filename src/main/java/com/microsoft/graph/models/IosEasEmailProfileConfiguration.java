// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EasAuthenticationMethod;
import com.microsoft.graph.models.EmailSyncDuration;
import com.microsoft.graph.models.EasServices;
import com.microsoft.graph.models.UserEmailSource;
import com.microsoft.graph.models.EmailCertificateType;
import com.microsoft.graph.models.DeviceManagementDerivedCredentialSettings;
import com.microsoft.graph.models.IosCertificateProfileBase;
import com.microsoft.graph.models.IosCertificateProfile;
import com.microsoft.graph.models.EasEmailProfileConfigurationBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Eas Email Profile Configuration.
 */
public class IosEasEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements IJsonBackedObject {


    /**
     * The Account Name.
     * Account name.
     */
    @SerializedName(value = "accountName", alternate = {"AccountName"})
    @Expose
	@Nullable
    public String accountName;

    /**
     * The Authentication Method.
     * Authentication method for this Email profile. Possible values are: usernameAndPassword, certificate, derivedCredential.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
	@Nullable
    public EasAuthenticationMethod authenticationMethod;

    /**
     * The Block Moving Messages To Other Email Accounts.
     * Indicates whether or not to block moving messages to other email accounts.
     */
    @SerializedName(value = "blockMovingMessagesToOtherEmailAccounts", alternate = {"BlockMovingMessagesToOtherEmailAccounts"})
    @Expose
	@Nullable
    public Boolean blockMovingMessagesToOtherEmailAccounts;

    /**
     * The Block Sending Email From Third Party Apps.
     * Indicates whether or not to block sending email from third party apps.
     */
    @SerializedName(value = "blockSendingEmailFromThirdPartyApps", alternate = {"BlockSendingEmailFromThirdPartyApps"})
    @Expose
	@Nullable
    public Boolean blockSendingEmailFromThirdPartyApps;

    /**
     * The Block Syncing Recently Used Email Addresses.
     * Indicates whether or not to block syncing recently used email addresses, for instance - when composing new email.
     */
    @SerializedName(value = "blockSyncingRecentlyUsedEmailAddresses", alternate = {"BlockSyncingRecentlyUsedEmailAddresses"})
    @Expose
	@Nullable
    public Boolean blockSyncingRecentlyUsedEmailAddresses;

    /**
     * The Duration Of Email To Sync.
     * Duration of time email should be synced back to. . Possible values are: userDefined, oneDay, threeDays, oneWeek, twoWeeks, oneMonth, unlimited.
     */
    @SerializedName(value = "durationOfEmailToSync", alternate = {"DurationOfEmailToSync"})
    @Expose
	@Nullable
    public EmailSyncDuration durationOfEmailToSync;

    /**
     * The Eas Services.
     * Exchange data to sync. Possible values are: none, calendars, contacts, email, notes, reminders.
     */
    @SerializedName(value = "easServices", alternate = {"EasServices"})
    @Expose
	@Nullable
    public EnumSet<EasServices> easServices;

    /**
     * The Eas Services User Override Enabled.
     * Allow users to change sync settings.
     */
    @SerializedName(value = "easServicesUserOverrideEnabled", alternate = {"EasServicesUserOverrideEnabled"})
    @Expose
	@Nullable
    public Boolean easServicesUserOverrideEnabled;

    /**
     * The Email Address Source.
     * Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress.
     */
    @SerializedName(value = "emailAddressSource", alternate = {"EmailAddressSource"})
    @Expose
	@Nullable
    public UserEmailSource emailAddressSource;

    /**
     * The Encryption Certificate Type.
     * Encryption Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     */
    @SerializedName(value = "encryptionCertificateType", alternate = {"EncryptionCertificateType"})
    @Expose
	@Nullable
    public EmailCertificateType encryptionCertificateType;

    /**
     * The Host Name.
     * Exchange location that (URL) that the native mail app connects to.
     */
    @SerializedName(value = "hostName", alternate = {"HostName"})
    @Expose
	@Nullable
    public String hostName;

    /**
     * The Per App VPNProfile Id.
     * Profile ID of the Per-App VPN policy to be used to access emails from the native Mail client
     */
    @SerializedName(value = "perAppVPNProfileId", alternate = {"PerAppVPNProfileId"})
    @Expose
	@Nullable
    public String perAppVPNProfileId;

    /**
     * The Require Smime.
     * Indicates whether or not to use S/MIME certificate.
     */
    @SerializedName(value = "requireSmime", alternate = {"RequireSmime"})
    @Expose
	@Nullable
    public Boolean requireSmime;

    /**
     * The Require Ssl.
     * Indicates whether or not to use SSL.
     */
    @SerializedName(value = "requireSsl", alternate = {"RequireSsl"})
    @Expose
	@Nullable
    public Boolean requireSsl;

    /**
     * The Signing Certificate Type.
     * Signing Certificate type for this Email profile. Possible values are: none, certificate, derivedCredential.
     */
    @SerializedName(value = "signingCertificateType", alternate = {"SigningCertificateType"})
    @Expose
	@Nullable
    public EmailCertificateType signingCertificateType;

    /**
     * The Smime Enable Per Message Switch.
     * Indicates whether or not to allow unencrypted emails.
     */
    @SerializedName(value = "smimeEnablePerMessageSwitch", alternate = {"SmimeEnablePerMessageSwitch"})
    @Expose
	@Nullable
    public Boolean smimeEnablePerMessageSwitch;

    /**
     * The Smime Encrypt By Default Enabled.
     * If set to true S/MIME encryption is enabled by default.
     */
    @SerializedName(value = "smimeEncryptByDefaultEnabled", alternate = {"SmimeEncryptByDefaultEnabled"})
    @Expose
	@Nullable
    public Boolean smimeEncryptByDefaultEnabled;

    /**
     * The Smime Encrypt By Default User Override Enabled.
     * If set to true, the user can toggle the encryption by default setting.
     */
    @SerializedName(value = "smimeEncryptByDefaultUserOverrideEnabled", alternate = {"SmimeEncryptByDefaultUserOverrideEnabled"})
    @Expose
	@Nullable
    public Boolean smimeEncryptByDefaultUserOverrideEnabled;

    /**
     * The Smime Encryption Certificate User Override Enabled.
     * If set to true the user can select the S/MIME encryption identity.
     */
    @SerializedName(value = "smimeEncryptionCertificateUserOverrideEnabled", alternate = {"SmimeEncryptionCertificateUserOverrideEnabled"})
    @Expose
	@Nullable
    public Boolean smimeEncryptionCertificateUserOverrideEnabled;

    /**
     * The Smime Signing Certificate User Override Enabled.
     * If set to true, the user can select the signing identity.
     */
    @SerializedName(value = "smimeSigningCertificateUserOverrideEnabled", alternate = {"SmimeSigningCertificateUserOverrideEnabled"})
    @Expose
	@Nullable
    public Boolean smimeSigningCertificateUserOverrideEnabled;

    /**
     * The Smime Signing Enabled.
     * If set to true S/MIME signing is enabled for this account
     */
    @SerializedName(value = "smimeSigningEnabled", alternate = {"SmimeSigningEnabled"})
    @Expose
	@Nullable
    public Boolean smimeSigningEnabled;

    /**
     * The Smime Signing User Override Enabled.
     * If set to true, the user can toggle S/MIME signing on or off.
     */
    @SerializedName(value = "smimeSigningUserOverrideEnabled", alternate = {"SmimeSigningUserOverrideEnabled"})
    @Expose
	@Nullable
    public Boolean smimeSigningUserOverrideEnabled;

    /**
     * The Use OAuth.
     * Specifies whether the connection should use OAuth for authentication.
     */
    @SerializedName(value = "useOAuth", alternate = {"UseOAuth"})
    @Expose
	@Nullable
    public Boolean useOAuth;

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
     * Identity certificate.
     */
    @SerializedName(value = "identityCertificate", alternate = {"IdentityCertificate"})
    @Expose
	@Nullable
    public IosCertificateProfileBase identityCertificate;

    /**
     * The Smime Encryption Certificate.
     * S/MIME encryption certificate.
     */
    @SerializedName(value = "smimeEncryptionCertificate", alternate = {"SmimeEncryptionCertificate"})
    @Expose
	@Nullable
    public IosCertificateProfile smimeEncryptionCertificate;

    /**
     * The Smime Signing Certificate.
     * S/MIME signing certificate.
     */
    @SerializedName(value = "smimeSigningCertificate", alternate = {"SmimeSigningCertificate"})
    @Expose
	@Nullable
    public IosCertificateProfile smimeSigningCertificate;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
