// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.GroupPolicySettingScope;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unsupported Group Policy Extension.
 */
public class UnsupportedGroupPolicyExtension extends Entity implements IJsonBackedObject {


    /**
     * The Extension Type.
     * ExtensionType of the unsupported extension.
     */
    @SerializedName(value = "extensionType", alternate = {"ExtensionType"})
    @Expose
    public String extensionType;

    /**
     * The Namespace Url.
     * Namespace Url of the unsupported extension.
     */
    @SerializedName(value = "namespaceUrl", alternate = {"NamespaceUrl"})
    @Expose
    public String namespaceUrl;

    /**
     * The Node Name.
     * Node name of the unsupported extension.
     */
    @SerializedName(value = "nodeName", alternate = {"NodeName"})
    @Expose
    public String nodeName;

    /**
     * The Setting Scope.
     * Setting Scope of the unsupported extension.
     */
    @SerializedName(value = "settingScope", alternate = {"SettingScope"})
    @Expose
    public GroupPolicySettingScope settingScope;


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
