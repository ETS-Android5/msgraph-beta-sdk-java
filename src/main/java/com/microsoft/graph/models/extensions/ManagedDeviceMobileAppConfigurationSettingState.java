// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.extensions.SettingSource;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Setting State.
 */
public class ManagedDeviceMobileAppConfigurationSettingState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Setting.
     * The setting that is being reported
     */
    @SerializedName("setting")
    @Expose
    public String setting;

    /**
     * The Setting Name.
     * Localized/user friendly setting name that is being reported
     */
    @SerializedName("settingName")
    @Expose
    public String settingName;

    /**
     * The Instance Display Name.
     * Name of setting instance that is being reported.
     */
    @SerializedName("instanceDisplayName")
    @Expose
    public String instanceDisplayName;

    /**
     * The State.
     * The compliance state of the setting
     */
    @SerializedName("state")
    @Expose
    public ComplianceStatus state;

    /**
     * The Error Code.
     * Error code for the setting
     */
    @SerializedName("errorCode")
    @Expose
    public Long errorCode;

    /**
     * The Error Description.
     * Error description
     */
    @SerializedName("errorDescription")
    @Expose
    public String errorDescription;

    /**
     * The User Id.
     * UserId
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The User Name.
     * UserName
     */
    @SerializedName("userName")
    @Expose
    public String userName;

    /**
     * The User Email.
     * UserEmail
     */
    @SerializedName("userEmail")
    @Expose
    public String userEmail;

    /**
     * The User Principal Name.
     * UserPrincipalName.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Sources.
     * Contributing policies
     */
    @SerializedName("sources")
    @Expose
    public java.util.List<SettingSource> sources;

    /**
     * The Current Value.
     * Current value of setting on device
     */
    @SerializedName("currentValue")
    @Expose
    public String currentValue;

    /**
     * The Setting Instance Id.
     * SettingInstanceId
     */
    @SerializedName("settingInstanceId")
    @Expose
    public String settingInstanceId;


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
