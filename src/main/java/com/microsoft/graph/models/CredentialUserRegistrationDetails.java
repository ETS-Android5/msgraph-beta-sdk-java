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
import com.microsoft.graph.models.RegistrationAuthMethod;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Credential User Registration Details.
 */
public class CredentialUserRegistrationDetails extends Entity implements IJsonBackedObject {


    /**
     * The Auth Methods.
     * Represents the authentication method that the user has registered. Possible values are: email, mobilePhone, officePhone,  securityQuestion (only used for self-service password reset), appNotification,  appCode, alternateMobilePhone (supported only in registration),  fido,  appPassword,  unknownFutureValue.
     */
    @SerializedName(value = "authMethods", alternate = {"AuthMethods"})
    @Expose
	@Nullable
    public java.util.List<RegistrationAuthMethod> authMethods;

    /**
     * The Is Capable.
     * Indicates whether the user is ready to perform self-service password reset or MFA.
     */
    @SerializedName(value = "isCapable", alternate = {"IsCapable"})
    @Expose
	@Nullable
    public Boolean isCapable;

    /**
     * The Is Enabled.
     * Indicates whether the user enabled to perform self-service password reset.
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
	@Nullable
    public Boolean isEnabled;

    /**
     * The Is Mfa Registered.
     * Indicates whether the user is registered for MFA.
     */
    @SerializedName(value = "isMfaRegistered", alternate = {"IsMfaRegistered"})
    @Expose
	@Nullable
    public Boolean isMfaRegistered;

    /**
     * The Is Registered.
     * Indicates whether the user has registered any authentication methods for self-service password reset.
     */
    @SerializedName(value = "isRegistered", alternate = {"IsRegistered"})
    @Expose
	@Nullable
    public Boolean isRegistered;

    /**
     * The User Display Name.
     * Provides the user name of the corresponding user.
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
	@Nullable
    public String userDisplayName;

    /**
     * The User Principal Name.
     * Provides the user principal name of the corresponding user.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
