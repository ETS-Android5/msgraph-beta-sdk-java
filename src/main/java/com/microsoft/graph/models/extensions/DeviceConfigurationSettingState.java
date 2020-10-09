// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SettingSource;
import com.microsoft.graph.models.generated.ComplianceStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Setting State.
 */
public class DeviceConfigurationSettingState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Current Value.
     * Current value of setting on device
     */
    @SerializedName(value = "currentValue", alternate = {"CurrentValue"})
    @Expose
    public String currentValue;

    /**
     * The Error Code.
     * Error code for the setting
     */
    @SerializedName(value = "errorCode", alternate = {"ErrorCode"})
    @Expose
    public Long errorCode;

    /**
     * The Error Description.
     * Error description
     */
    @SerializedName(value = "errorDescription", alternate = {"ErrorDescription"})
    @Expose
    public String errorDescription;

    /**
     * The Instance Display Name.
     * Name of setting instance that is being reported.
     */
    @SerializedName(value = "instanceDisplayName", alternate = {"InstanceDisplayName"})
    @Expose
    public String instanceDisplayName;

    /**
     * The Setting.
     * The setting that is being reported
     */
    @SerializedName(value = "setting", alternate = {"Setting"})
    @Expose
    public String setting;

    /**
     * The Setting Instance Id.
     * SettingInstanceId
     */
    @SerializedName(value = "settingInstanceId", alternate = {"SettingInstanceId"})
    @Expose
    public String settingInstanceId;

    /**
     * The Setting Name.
     * Localized/user friendly setting name that is being reported
     */
    @SerializedName(value = "settingName", alternate = {"SettingName"})
    @Expose
    public String settingName;

    /**
     * The Sources.
     * Contributing policies
     */
    @SerializedName(value = "sources", alternate = {"Sources"})
    @Expose
    public java.util.List<SettingSource> sources;

    /**
     * The State.
     * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public ComplianceStatus state;

    /**
     * The User Email.
     * UserEmail
     */
    @SerializedName(value = "userEmail", alternate = {"UserEmail"})
    @Expose
    public String userEmail;

    /**
     * The User Id.
     * UserId
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;

    /**
     * The User Name.
     * UserName
     */
    @SerializedName(value = "userName", alternate = {"UserName"})
    @Expose
    public String userName;

    /**
     * The User Principal Name.
     * UserPrincipalName.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;


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
