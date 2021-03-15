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
import com.microsoft.graph.models.UserEmailSource;
import com.microsoft.graph.models.AndroidUsernameSource;
import com.microsoft.graph.models.AndroidWorkProfileCertificateProfileBase;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Eas Email Profile Base.
 */
public class AndroidWorkProfileEasEmailProfileBase extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Authentication method for Exchange ActiveSync. Possible values are: usernameAndPassword, certificate, derivedCredential.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
	@Nullable
    public EasAuthenticationMethod authenticationMethod;

    /**
     * The Duration Of Email To Sync.
     * Duration of time email should be synced to. Possible values are: userDefined, oneDay, threeDays, oneWeek, twoWeeks, oneMonth, unlimited.
     */
    @SerializedName(value = "durationOfEmailToSync", alternate = {"DurationOfEmailToSync"})
    @Expose
	@Nullable
    public EmailSyncDuration durationOfEmailToSync;

    /**
     * The Email Address Source.
     * Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress.
     */
    @SerializedName(value = "emailAddressSource", alternate = {"EmailAddressSource"})
    @Expose
	@Nullable
    public UserEmailSource emailAddressSource;

    /**
     * The Host Name.
     * Exchange location (URL) that the mail app connects to.
     */
    @SerializedName(value = "hostName", alternate = {"HostName"})
    @Expose
	@Nullable
    public String hostName;

    /**
     * The Require Ssl.
     * Indicates whether or not to use SSL.
     */
    @SerializedName(value = "requireSsl", alternate = {"RequireSsl"})
    @Expose
	@Nullable
    public Boolean requireSsl;

    /**
     * The Username Source.
     * Username attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: username, userPrincipalName, samAccountName, primarySmtpAddress.
     */
    @SerializedName(value = "usernameSource", alternate = {"UsernameSource"})
    @Expose
	@Nullable
    public AndroidUsernameSource usernameSource;

    /**
     * The Identity Certificate.
     * Identity certificate.
     */
    @SerializedName(value = "identityCertificate", alternate = {"IdentityCertificate"})
    @Expose
	@Nullable
    public AndroidWorkProfileCertificateProfileBase identityCertificate;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
