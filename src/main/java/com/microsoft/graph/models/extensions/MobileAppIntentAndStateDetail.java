// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ResultantAppState;
import com.microsoft.graph.models.generated.MobileAppIntent;
import com.microsoft.graph.models.extensions.MobileAppSupportedDeviceType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Intent And State Detail.
 */
public class MobileAppIntentAndStateDetail implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Application Id.
     * MobieApp identifier.
     */
    @SerializedName(value = "applicationId", alternate = {"ApplicationId"})
    @Expose
    public String applicationId;

    /**
     * The Display Name.
     * The admin provided or imported title of the app.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Display Version.
     * Human readable version of the application
     */
    @SerializedName(value = "displayVersion", alternate = {"DisplayVersion"})
    @Expose
    public String displayVersion;

    /**
     * The Install State.
     * The install state of the app. Possible values are: installed, failed, notInstalled, uninstallFailed, pendingInstall, unknown, notApplicable.
     */
    @SerializedName(value = "installState", alternate = {"InstallState"})
    @Expose
    public ResultantAppState installState;

    /**
     * The Mobile App Intent.
     * Mobile App Intent. Possible values are: available, notAvailable, requiredInstall, requiredUninstall, requiredAndAvailableInstall, availableInstallWithoutEnrollment, exclude.
     */
    @SerializedName(value = "mobileAppIntent", alternate = {"MobileAppIntent"})
    @Expose
    public MobileAppIntent mobileAppIntent;

    /**
     * The Supported Device Types.
     * The supported platforms for the app.
     */
    @SerializedName(value = "supportedDeviceTypes", alternate = {"SupportedDeviceTypes"})
    @Expose
    public java.util.List<MobileAppSupportedDeviceType> supportedDeviceTypes;


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
