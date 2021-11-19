// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.GroupPolicySettingScope;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

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
	@Nullable
    public String extensionType;

    /**
     * The Namespace Url.
     * Namespace Url of the unsupported extension.
     */
    @SerializedName(value = "namespaceUrl", alternate = {"NamespaceUrl"})
    @Expose
	@Nullable
    public String namespaceUrl;

    /**
     * The Node Name.
     * Node name of the unsupported extension.
     */
    @SerializedName(value = "nodeName", alternate = {"NodeName"})
    @Expose
	@Nullable
    public String nodeName;

    /**
     * The Setting Scope.
     * Setting Scope of the unsupported extension.
     */
    @SerializedName(value = "settingScope", alternate = {"SettingScope"})
    @Expose
	@Nullable
    public GroupPolicySettingScope settingScope;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
