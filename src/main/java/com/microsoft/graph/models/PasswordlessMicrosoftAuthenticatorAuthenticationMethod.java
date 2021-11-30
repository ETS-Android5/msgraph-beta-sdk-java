// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Device;
import com.microsoft.graph.models.AuthenticationMethod;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Passwordless Microsoft Authenticator Authentication Method.
 */
public class PasswordlessMicrosoftAuthenticatorAuthenticationMethod extends AuthenticationMethod implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Creation Date Time.
     * The timestamp when this method was registered to the user.
     * @deprecated The creationDateTime property is deprecated and will stop returning data on December 31, 2020. Please use the createdDateTime property.
     */
    @Deprecated
    @SerializedName(value = "creationDateTime", alternate = {"CreationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime creationDateTime;

    /**
     * The Display Name.
     * The display name of the mobile device as given by the user.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Device.
     * 
     */
    @SerializedName(value = "device", alternate = {"Device"})
    @Expose
	@Nullable
    public Device device;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
