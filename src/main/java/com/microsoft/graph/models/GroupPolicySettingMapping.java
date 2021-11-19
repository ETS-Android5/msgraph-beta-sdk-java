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
import com.microsoft.graph.models.MdmSupportedState;
import com.microsoft.graph.models.GroupPolicySettingScope;
import com.microsoft.graph.models.GroupPolicySettingType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Setting Mapping.
 */
public class GroupPolicySettingMapping extends Entity implements IJsonBackedObject {


    /**
     * The Admx Setting Definition Id.
     * Admx Group Policy Id
     */
    @SerializedName(value = "admxSettingDefinitionId", alternate = {"AdmxSettingDefinitionId"})
    @Expose
	@Nullable
    public String admxSettingDefinitionId;

    /**
     * The Child Id List.
     * List of Child Ids of the group policy setting.
     */
    @SerializedName(value = "childIdList", alternate = {"ChildIdList"})
    @Expose
	@Nullable
    public java.util.List<String> childIdList;

    /**
     * The Intune Setting Definition Id.
     * The Intune Setting Definition Id
     */
    @SerializedName(value = "intuneSettingDefinitionId", alternate = {"IntuneSettingDefinitionId"})
    @Expose
	@Nullable
    public String intuneSettingDefinitionId;

    /**
     * The Intune Setting Uri List.
     * The list of Intune Setting URIs this group policy setting maps to
     */
    @SerializedName(value = "intuneSettingUriList", alternate = {"IntuneSettingUriList"})
    @Expose
	@Nullable
    public java.util.List<String> intuneSettingUriList;

    /**
     * The Is Mdm Supported.
     * Indicates if the setting is supported by Intune or not
     */
    @SerializedName(value = "isMdmSupported", alternate = {"IsMdmSupported"})
    @Expose
	@Nullable
    public Boolean isMdmSupported;

    /**
     * The Mdm Csp Name.
     * The CSP name this group policy setting maps to.
     */
    @SerializedName(value = "mdmCspName", alternate = {"MdmCspName"})
    @Expose
	@Nullable
    public String mdmCspName;

    /**
     * The Mdm Minimum OSVersion.
     * The minimum OS version this mdm setting supports.
     */
    @SerializedName(value = "mdmMinimumOSVersion", alternate = {"MdmMinimumOSVersion"})
    @Expose
	@Nullable
    public Integer mdmMinimumOSVersion;

    /**
     * The Mdm Setting Uri.
     * The MDM CSP URI this group policy setting maps to.
     */
    @SerializedName(value = "mdmSettingUri", alternate = {"MdmSettingUri"})
    @Expose
	@Nullable
    public String mdmSettingUri;

    /**
     * The Mdm Supported State.
     * Indicates if the setting is supported in Mdm or not
     */
    @SerializedName(value = "mdmSupportedState", alternate = {"MdmSupportedState"})
    @Expose
	@Nullable
    public MdmSupportedState mdmSupportedState;

    /**
     * The Parent Id.
     * Parent Id of the group policy setting.
     */
    @SerializedName(value = "parentId", alternate = {"ParentId"})
    @Expose
	@Nullable
    public String parentId;

    /**
     * The Setting Category.
     * The category the group policy setting is in.
     */
    @SerializedName(value = "settingCategory", alternate = {"SettingCategory"})
    @Expose
	@Nullable
    public String settingCategory;

    /**
     * The Setting Display Name.
     * The display name of this group policy setting.
     */
    @SerializedName(value = "settingDisplayName", alternate = {"SettingDisplayName"})
    @Expose
	@Nullable
    public String settingDisplayName;

    /**
     * The Setting Display Value.
     * The display value of this group policy setting.
     */
    @SerializedName(value = "settingDisplayValue", alternate = {"SettingDisplayValue"})
    @Expose
	@Nullable
    public String settingDisplayValue;

    /**
     * The Setting Display Value Type.
     * The display value type of this group policy setting.
     */
    @SerializedName(value = "settingDisplayValueType", alternate = {"SettingDisplayValueType"})
    @Expose
	@Nullable
    public String settingDisplayValueType;

    /**
     * The Setting Name.
     * The name of this group policy setting.
     */
    @SerializedName(value = "settingName", alternate = {"SettingName"})
    @Expose
	@Nullable
    public String settingName;

    /**
     * The Setting Scope.
     * The scope of the setting
     */
    @SerializedName(value = "settingScope", alternate = {"SettingScope"})
    @Expose
	@Nullable
    public GroupPolicySettingScope settingScope;

    /**
     * The Setting Type.
     * The setting type (security or admx) of the Group Policy.
     */
    @SerializedName(value = "settingType", alternate = {"SettingType"})
    @Expose
	@Nullable
    public GroupPolicySettingType settingType;

    /**
     * The Setting Value.
     * The value of this group policy setting.
     */
    @SerializedName(value = "settingValue", alternate = {"SettingValue"})
    @Expose
	@Nullable
    public String settingValue;

    /**
     * The Setting Value Display Units.
     * The display units of this group policy setting value
     */
    @SerializedName(value = "settingValueDisplayUnits", alternate = {"SettingValueDisplayUnits"})
    @Expose
	@Nullable
    public String settingValueDisplayUnits;

    /**
     * The Setting Value Type.
     * The value type of this group policy setting.
     */
    @SerializedName(value = "settingValueType", alternate = {"SettingValueType"})
    @Expose
	@Nullable
    public String settingValueType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
