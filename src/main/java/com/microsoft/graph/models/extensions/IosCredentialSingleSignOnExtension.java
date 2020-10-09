// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.KeyTypedValuePair;
import com.microsoft.graph.models.extensions.IosSingleSignOnExtension;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Credential Single Sign On Extension.
 */
public class IosCredentialSingleSignOnExtension extends IosSingleSignOnExtension implements IJsonBackedObject {


    /**
     * The Configurations.
     * Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "configurations", alternate = {"Configurations"})
    @Expose
    public java.util.List<KeyTypedValuePair> configurations;

    /**
     * The Domains.
     * Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     */
    @SerializedName(value = "domains", alternate = {"Domains"})
    @Expose
    public java.util.List<String> domains;

    /**
     * The Extension Identifier.
     * Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     */
    @SerializedName(value = "extensionIdentifier", alternate = {"ExtensionIdentifier"})
    @Expose
    public String extensionIdentifier;

    /**
     * The Realm.
     * Gets or sets the case-sensitive realm name for this profile.
     */
    @SerializedName(value = "realm", alternate = {"Realm"})
    @Expose
    public String realm;

    /**
     * The Team Identifier.
     * Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     */
    @SerializedName(value = "teamIdentifier", alternate = {"TeamIdentifier"})
    @Expose
    public String teamIdentifier;


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
