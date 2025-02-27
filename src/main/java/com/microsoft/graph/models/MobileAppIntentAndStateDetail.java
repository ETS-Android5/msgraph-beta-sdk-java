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
import com.microsoft.graph.models.ResultantAppState;
import com.microsoft.graph.models.MobileAppIntent;
import com.microsoft.graph.models.MobileAppSupportedDeviceType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Intent And State Detail.
 */
public class MobileAppIntentAndStateDetail implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Application Id.
     * MobieApp identifier.
     */
    @SerializedName(value = "applicationId", alternate = {"ApplicationId"})
    @Expose
	@Nullable
    public String applicationId;

    /**
     * The Display Name.
     * The admin provided or imported title of the app.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Display Version.
     * Human readable version of the application
     */
    @SerializedName(value = "displayVersion", alternate = {"DisplayVersion"})
    @Expose
	@Nullable
    public String displayVersion;

    /**
     * The Install State.
     * The install state of the app. Possible values are: installed, failed, notInstalled, uninstallFailed, pendingInstall, unknown, notApplicable.
     */
    @SerializedName(value = "installState", alternate = {"InstallState"})
    @Expose
	@Nullable
    public ResultantAppState installState;

    /**
     * The Mobile App Intent.
     * Mobile App Intent. Possible values are: available, notAvailable, requiredInstall, requiredUninstall, requiredAndAvailableInstall, availableInstallWithoutEnrollment, exclude.
     */
    @SerializedName(value = "mobileAppIntent", alternate = {"MobileAppIntent"})
    @Expose
	@Nullable
    public MobileAppIntent mobileAppIntent;

    /**
     * The Supported Device Types.
     * The supported platforms for the app.
     */
    @SerializedName(value = "supportedDeviceTypes", alternate = {"SupportedDeviceTypes"})
    @Expose
	@Nullable
    public java.util.List<MobileAppSupportedDeviceType> supportedDeviceTypes;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
