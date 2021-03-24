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
import com.microsoft.graph.models.KeyTypedValuePair;
import com.microsoft.graph.models.MacOSSingleSignOnExtension;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSCredential Single Sign On Extension.
 */
public class MacOSCredentialSingleSignOnExtension extends MacOSSingleSignOnExtension implements IJsonBackedObject {


    /**
     * The Configurations.
     * Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "configurations", alternate = {"Configurations"})
    @Expose
	@Nullable
    public java.util.List<KeyTypedValuePair> configurations;

    /**
     * The Domains.
     * Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     */
    @SerializedName(value = "domains", alternate = {"Domains"})
    @Expose
	@Nullable
    public java.util.List<String> domains;

    /**
     * The Extension Identifier.
     * Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     */
    @SerializedName(value = "extensionIdentifier", alternate = {"ExtensionIdentifier"})
    @Expose
	@Nullable
    public String extensionIdentifier;

    /**
     * The Realm.
     * Gets or sets the case-sensitive realm name for this profile.
     */
    @SerializedName(value = "realm", alternate = {"Realm"})
    @Expose
	@Nullable
    public String realm;

    /**
     * The Team Identifier.
     * Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     */
    @SerializedName(value = "teamIdentifier", alternate = {"TeamIdentifier"})
    @Expose
	@Nullable
    public String teamIdentifier;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
