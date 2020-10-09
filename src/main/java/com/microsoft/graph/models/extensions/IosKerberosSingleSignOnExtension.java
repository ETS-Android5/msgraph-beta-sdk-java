// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IosSingleSignOnExtension;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Kerberos Single Sign On Extension.
 */
public class IosKerberosSingleSignOnExtension extends IosSingleSignOnExtension implements IJsonBackedObject {


    /**
     * The Active Directory Site Code.
     * Gets or sets the Active Directory site.
     */
    @SerializedName(value = "activeDirectorySiteCode", alternate = {"ActiveDirectorySiteCode"})
    @Expose
    public String activeDirectorySiteCode;

    /**
     * The Block Active Directory Site Auto Discovery.
     * Enables or disables whether the Kerberos extension can automatically determine its site name.
     */
    @SerializedName(value = "blockActiveDirectorySiteAutoDiscovery", alternate = {"BlockActiveDirectorySiteAutoDiscovery"})
    @Expose
    public Boolean blockActiveDirectorySiteAutoDiscovery;

    /**
     * The Block Automatic Login.
     * Enables or disables Keychain usage.
     */
    @SerializedName(value = "blockAutomaticLogin", alternate = {"BlockAutomaticLogin"})
    @Expose
    public Boolean blockAutomaticLogin;

    /**
     * The Cache Name.
     * Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     */
    @SerializedName(value = "cacheName", alternate = {"CacheName"})
    @Expose
    public String cacheName;

    /**
     * The Credential Bundle Id Access Control List.
     * Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     */
    @SerializedName(value = "credentialBundleIdAccessControlList", alternate = {"CredentialBundleIdAccessControlList"})
    @Expose
    public java.util.List<String> credentialBundleIdAccessControlList;

    /**
     * The Domain Realms.
     * Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     */
    @SerializedName(value = "domainRealms", alternate = {"DomainRealms"})
    @Expose
    public java.util.List<String> domainRealms;

    /**
     * The Domains.
     * Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     */
    @SerializedName(value = "domains", alternate = {"Domains"})
    @Expose
    public java.util.List<String> domains;

    /**
     * The Is Default Realm.
     * When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     */
    @SerializedName(value = "isDefaultRealm", alternate = {"IsDefaultRealm"})
    @Expose
    public Boolean isDefaultRealm;

    /**
     * The Password Block Modification.
     * Enables or disables password changes.
     */
    @SerializedName(value = "passwordBlockModification", alternate = {"PasswordBlockModification"})
    @Expose
    public Boolean passwordBlockModification;

    /**
     * The Password Change Url.
     * Gets or sets the URL that the user will be sent to when they initiate a password change.
     */
    @SerializedName(value = "passwordChangeUrl", alternate = {"PasswordChangeUrl"})
    @Expose
    public String passwordChangeUrl;

    /**
     * The Password Enable Local Sync.
     * Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     */
    @SerializedName(value = "passwordEnableLocalSync", alternate = {"PasswordEnableLocalSync"})
    @Expose
    public Boolean passwordEnableLocalSync;

    /**
     * The Password Expiration Days.
     * Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Expiration Notification Days.
     * Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     */
    @SerializedName(value = "passwordExpirationNotificationDays", alternate = {"PasswordExpirationNotificationDays"})
    @Expose
    public Integer passwordExpirationNotificationDays;

    /**
     * The Password Minimum Age Days.
     * Gets or sets the minimum number of days until a user can change their password again.
     */
    @SerializedName(value = "passwordMinimumAgeDays", alternate = {"PasswordMinimumAgeDays"})
    @Expose
    public Integer passwordMinimumAgeDays;

    /**
     * The Password Minimum Length.
     * Gets or sets the minimum length of a password.
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Previous Password Block Count.
     * Gets or sets the number of previous passwords to block.
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Require Active Directory Complexity.
     * Enables or disables whether passwords must meet Active Directory's complexity requirements.
     */
    @SerializedName(value = "passwordRequireActiveDirectoryComplexity", alternate = {"PasswordRequireActiveDirectoryComplexity"})
    @Expose
    public Boolean passwordRequireActiveDirectoryComplexity;

    /**
     * The Password Requirements Description.
     * Gets or sets a description of the password complexity requirements.
     */
    @SerializedName(value = "passwordRequirementsDescription", alternate = {"PasswordRequirementsDescription"})
    @Expose
    public String passwordRequirementsDescription;

    /**
     * The Realm.
     * Gets or sets the case-sensitive realm name for this profile.
     */
    @SerializedName(value = "realm", alternate = {"Realm"})
    @Expose
    public String realm;

    /**
     * The Require User Presence.
     * Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     */
    @SerializedName(value = "requireUserPresence", alternate = {"RequireUserPresence"})
    @Expose
    public Boolean requireUserPresence;

    /**
     * The User Principal Name.
     * Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;


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
