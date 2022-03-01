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
import com.microsoft.graph.models.MacOSSingleSignOnExtension;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSKerberos Single Sign On Extension.
 */
public class MacOSKerberosSingleSignOnExtension extends MacOSSingleSignOnExtension implements IJsonBackedObject {


    /**
     * The Active Directory Site Code.
     * Gets or sets the Active Directory site.
     */
    @SerializedName(value = "activeDirectorySiteCode", alternate = {"ActiveDirectorySiteCode"})
    @Expose
	@Nullable
    public String activeDirectorySiteCode;

    /**
     * The Block Active Directory Site Auto Discovery.
     * Enables or disables whether the Kerberos extension can automatically determine its site name.
     */
    @SerializedName(value = "blockActiveDirectorySiteAutoDiscovery", alternate = {"BlockActiveDirectorySiteAutoDiscovery"})
    @Expose
	@Nullable
    public Boolean blockActiveDirectorySiteAutoDiscovery;

    /**
     * The Block Automatic Login.
     * Enables or disables Keychain usage.
     */
    @SerializedName(value = "blockAutomaticLogin", alternate = {"BlockAutomaticLogin"})
    @Expose
	@Nullable
    public Boolean blockAutomaticLogin;

    /**
     * The Cache Name.
     * Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     */
    @SerializedName(value = "cacheName", alternate = {"CacheName"})
    @Expose
	@Nullable
    public String cacheName;

    /**
     * The Credential Bundle Id Access Control List.
     * Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     */
    @SerializedName(value = "credentialBundleIdAccessControlList", alternate = {"CredentialBundleIdAccessControlList"})
    @Expose
	@Nullable
    public java.util.List<String> credentialBundleIdAccessControlList;

    /**
     * The Credentials Cache Monitored.
     * When set to True, the credential is requested on the next matching Kerberos challenge or network state change. When the credential is expired or missing, a new credential is created. Available for devices running macOS versions 12 and later.
     */
    @SerializedName(value = "credentialsCacheMonitored", alternate = {"CredentialsCacheMonitored"})
    @Expose
	@Nullable
    public Boolean credentialsCacheMonitored;

    /**
     * The Domain Realms.
     * Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     */
    @SerializedName(value = "domainRealms", alternate = {"DomainRealms"})
    @Expose
	@Nullable
    public java.util.List<String> domainRealms;

    /**
     * The Domains.
     * Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     */
    @SerializedName(value = "domains", alternate = {"Domains"})
    @Expose
	@Nullable
    public java.util.List<String> domains;

    /**
     * The Is Default Realm.
     * When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     */
    @SerializedName(value = "isDefaultRealm", alternate = {"IsDefaultRealm"})
    @Expose
	@Nullable
    public Boolean isDefaultRealm;

    /**
     * The Kerberos Apps In Bundle Id ACLIncluded.
     * When set to True, the Kerberos extension allows any apps entered with the app bundle ID, managed apps, and standard Kerberos utilities, such as TicketViewer and klist, to access and use the credential. Available for devices running macOS versions 12 and later.
     */
    @SerializedName(value = "kerberosAppsInBundleIdACLIncluded", alternate = {"KerberosAppsInBundleIdACLIncluded"})
    @Expose
	@Nullable
    public Boolean kerberosAppsInBundleIdACLIncluded;

    /**
     * The Managed Apps In Bundle Id ACLIncluded.
     * When set to True, the Kerberos extension allows managed apps, and any apps entered with the app bundle ID to access the credential. When set to False, the Kerberos extension allows all apps to access the credential. Available for devices running iOS and iPadOS versions 14 and later.
     */
    @SerializedName(value = "managedAppsInBundleIdACLIncluded", alternate = {"ManagedAppsInBundleIdACLIncluded"})
    @Expose
	@Nullable
    public Boolean managedAppsInBundleIdACLIncluded;

    /**
     * The Mode Credential Used.
     * Select how other processes use the Kerberos Extension credential.
     */
    @SerializedName(value = "modeCredentialUsed", alternate = {"ModeCredentialUsed"})
    @Expose
	@Nullable
    public String modeCredentialUsed;

    /**
     * The Password Block Modification.
     * Enables or disables password changes.
     */
    @SerializedName(value = "passwordBlockModification", alternate = {"PasswordBlockModification"})
    @Expose
	@Nullable
    public Boolean passwordBlockModification;

    /**
     * The Password Change Url.
     * Gets or sets the URL that the user will be sent to when they initiate a password change.
     */
    @SerializedName(value = "passwordChangeUrl", alternate = {"PasswordChangeUrl"})
    @Expose
	@Nullable
    public String passwordChangeUrl;

    /**
     * The Password Enable Local Sync.
     * Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     */
    @SerializedName(value = "passwordEnableLocalSync", alternate = {"PasswordEnableLocalSync"})
    @Expose
	@Nullable
    public Boolean passwordEnableLocalSync;

    /**
     * The Password Expiration Days.
     * Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationDays;

    /**
     * The Password Expiration Notification Days.
     * Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     */
    @SerializedName(value = "passwordExpirationNotificationDays", alternate = {"PasswordExpirationNotificationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationNotificationDays;

    /**
     * The Password Minimum Age Days.
     * Gets or sets the minimum number of days until a user can change their password again.
     */
    @SerializedName(value = "passwordMinimumAgeDays", alternate = {"PasswordMinimumAgeDays"})
    @Expose
	@Nullable
    public Integer passwordMinimumAgeDays;

    /**
     * The Password Minimum Length.
     * Gets or sets the minimum length of a password.
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer passwordMinimumLength;

    /**
     * The Password Previous Password Block Count.
     * Gets or sets the number of previous passwords to block.
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Require Active Directory Complexity.
     * Enables or disables whether passwords must meet Active Directory's complexity requirements.
     */
    @SerializedName(value = "passwordRequireActiveDirectoryComplexity", alternate = {"PasswordRequireActiveDirectoryComplexity"})
    @Expose
	@Nullable
    public Boolean passwordRequireActiveDirectoryComplexity;

    /**
     * The Password Requirements Description.
     * Gets or sets a description of the password complexity requirements.
     */
    @SerializedName(value = "passwordRequirementsDescription", alternate = {"PasswordRequirementsDescription"})
    @Expose
	@Nullable
    public String passwordRequirementsDescription;

    /**
     * The Preferred KDCs.
     * Add creates an ordered list of preferred Key Distribution Centers (KDCs) to use for Kerberos traffic. This list is used when the servers are not discoverable using DNS. When the servers are discoverable, the list is used for both connectivity checks, and used first for Kerberos traffic. If the servers don’t respond, then the device uses DNS discovery. Delete removes an existing list, and devices use DNS discovery. Available for devices running macOS versions 12 and later.
     */
    @SerializedName(value = "preferredKDCs", alternate = {"PreferredKDCs"})
    @Expose
	@Nullable
    public java.util.List<String> preferredKDCs;

    /**
     * The Realm.
     * Gets or sets the case-sensitive realm name for this profile.
     */
    @SerializedName(value = "realm", alternate = {"Realm"})
    @Expose
	@Nullable
    public String realm;

    /**
     * The Require User Presence.
     * Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     */
    @SerializedName(value = "requireUserPresence", alternate = {"RequireUserPresence"})
    @Expose
	@Nullable
    public Boolean requireUserPresence;

    /**
     * The Sign In Help Text.
     * Text displayed to the user at the Kerberos sign in window. Available for devices running iOS and iPadOS versions 14 and later.
     */
    @SerializedName(value = "signInHelpText", alternate = {"SignInHelpText"})
    @Expose
	@Nullable
    public String signInHelpText;

    /**
     * The Tls For LDAPRequired.
     * When set to True, LDAP connections are required to use Transport Layer Security (TLS). Available for devices running macOS versions 11 and later.
     */
    @SerializedName(value = "tlsForLDAPRequired", alternate = {"TlsForLDAPRequired"})
    @Expose
	@Nullable
    public Boolean tlsForLDAPRequired;

    /**
     * The Username Label Custom.
     * This label replaces the user name shown in the Kerberos extension. You can enter a name to match the name of your company or organization. Available for devices running macOS versions 11 and later.
     */
    @SerializedName(value = "usernameLabelCustom", alternate = {"UsernameLabelCustom"})
    @Expose
	@Nullable
    public String usernameLabelCustom;

    /**
     * The User Principal Name.
     * Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The User Setup Delayed.
     * When set to True, the user isn’t prompted to set up the Kerberos extension until the extension is enabled by the admin, or a Kerberos challenge is received. Available for devices running macOS versions 11 and later.
     */
    @SerializedName(value = "userSetupDelayed", alternate = {"UserSetupDelayed"})
    @Expose
	@Nullable
    public Boolean userSetupDelayed;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
