// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DomainNameSource;
import com.microsoft.graph.models.UsernameSource;
import com.microsoft.graph.models.UserEmailSource;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Eas Email Profile Configuration Base.
 */
public class EasEmailProfileConfigurationBase extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Custom Domain Name.
     * Custom domain name value used while generating an email profile before installing on the device.
     */
    @SerializedName(value = "customDomainName", alternate = {"CustomDomainName"})
    @Expose
	@Nullable
    public String customDomainName;

    /**
     * The User Domain Name Source.
     * UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName(value = "userDomainNameSource", alternate = {"UserDomainNameSource"})
    @Expose
	@Nullable
    public DomainNameSource userDomainNameSource;

    /**
     * The Username AADSource.
     * Name of the AAD field, that will be used to retrieve UserName for email profile.
     */
    @SerializedName(value = "usernameAADSource", alternate = {"UsernameAADSource"})
    @Expose
	@Nullable
    public UsernameSource usernameAADSource;

    /**
     * The Username Source.
     * Username attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName(value = "usernameSource", alternate = {"UsernameSource"})
    @Expose
	@Nullable
    public UserEmailSource usernameSource;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
