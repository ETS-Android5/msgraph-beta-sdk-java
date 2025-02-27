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
import com.microsoft.graph.models.DeviceManagementConfigurationPlatforms;
import com.microsoft.graph.models.DeviceManagementConfigurationSettingUsage;
import com.microsoft.graph.models.DeviceManagementConfigurationTechnologies;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Category.
 */
public class DeviceManagementConfigurationCategory extends Entity implements IJsonBackedObject {


    /**
     * The Category Description.
     * Description of the category header
     */
    @SerializedName(value = "categoryDescription", alternate = {"CategoryDescription"})
    @Expose
	@Nullable
    public String categoryDescription;

    /**
     * The Child Category Ids.
     * List of child ids of the category.
     */
    @SerializedName(value = "childCategoryIds", alternate = {"ChildCategoryIds"})
    @Expose
	@Nullable
    public java.util.List<String> childCategoryIds;

    /**
     * The Description.
     * Description of the item
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Display name of the item
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Help Text.
     * Help text of the item
     */
    @SerializedName(value = "helpText", alternate = {"HelpText"})
    @Expose
	@Nullable
    public String helpText;

    /**
     * The Name.
     * Name of the item
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Parent Category Id.
     * Parent id of the category.
     */
    @SerializedName(value = "parentCategoryId", alternate = {"ParentCategoryId"})
    @Expose
	@Nullable
    public String parentCategoryId;

    /**
     * The Platforms.
     * Platforms types, which settings in the category have. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue.
     */
    @SerializedName(value = "platforms", alternate = {"Platforms"})
    @Expose
	@Nullable
    public EnumSet<DeviceManagementConfigurationPlatforms> platforms;

    /**
     * The Root Category Id.
     * Root id of the category.
     */
    @SerializedName(value = "rootCategoryId", alternate = {"RootCategoryId"})
    @Expose
	@Nullable
    public String rootCategoryId;

    /**
     * The Setting Usage.
     * Indicates that the category contains settings that are used for Compliance or Configuration. Possible values are: none, configuration, compliance.
     */
    @SerializedName(value = "settingUsage", alternate = {"SettingUsage"})
    @Expose
	@Nullable
    public EnumSet<DeviceManagementConfigurationSettingUsage> settingUsage;

    /**
     * The Technologies.
     * Technologies types, which settings in the category have. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue.
     */
    @SerializedName(value = "technologies", alternate = {"Technologies"})
    @Expose
	@Nullable
    public EnumSet<DeviceManagementConfigurationTechnologies> technologies;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
