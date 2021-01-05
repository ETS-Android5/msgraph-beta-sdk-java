// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SecurityBaselineContributingPolicy;
import com.microsoft.graph.models.extensions.SettingSource;
import com.microsoft.graph.models.generated.SecurityBaselineComplianceState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Setting State.
 */
public class SecurityBaselineSettingState extends Entity implements IJsonBackedObject {


    /**
     * The Contributing Policies.
     * The policies that contribute to this setting instance
     */
    @SerializedName(value = "contributingPolicies", alternate = {"ContributingPolicies"})
    @Expose
    public java.util.List<SecurityBaselineContributingPolicy> contributingPolicies;

    /**
     * The Error Code.
     * The error code if the setting is in error state
     */
    @SerializedName(value = "errorCode", alternate = {"ErrorCode"})
    @Expose
    public String errorCode;

    /**
     * The Setting Category Id.
     * The setting category id which this setting belongs to
     */
    @SerializedName(value = "settingCategoryId", alternate = {"SettingCategoryId"})
    @Expose
    public String settingCategoryId;

    /**
     * The Setting Category Name.
     * The setting category name which this setting belongs to
     */
    @SerializedName(value = "settingCategoryName", alternate = {"SettingCategoryName"})
    @Expose
    public String settingCategoryName;

    /**
     * The Setting Id.
     * The setting id guid
     */
    @SerializedName(value = "settingId", alternate = {"SettingId"})
    @Expose
    public String settingId;

    /**
     * The Setting Name.
     * The setting name that is being reported
     */
    @SerializedName(value = "settingName", alternate = {"SettingName"})
    @Expose
    public String settingName;

    /**
     * The Source Policies.
     * The policies that contribute to this setting instance
     */
    @SerializedName(value = "sourcePolicies", alternate = {"SourcePolicies"})
    @Expose
    public java.util.List<SettingSource> sourcePolicies;

    /**
     * The State.
     * The compliance state of the security baseline setting
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public SecurityBaselineComplianceState state;


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
