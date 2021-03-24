// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IosDeviceType;
import com.microsoft.graph.models.IosMinimumOperatingSystem;
import com.microsoft.graph.models.ManagedMobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed IOSLob App.
 */
public class ManagedIOSLobApp extends ManagedMobileLobApp implements IJsonBackedObject {


    /**
     * The Applicable Device Type.
     * The iOS architecture for which this app can run on.
     */
    @SerializedName(value = "applicableDeviceType", alternate = {"ApplicableDeviceType"})
    @Expose
	@Nullable
    public IosDeviceType applicableDeviceType;

    /**
     * The Build Number.
     * The build number of managed iOS Line of Business (LoB) app.
     */
    @SerializedName(value = "buildNumber", alternate = {"BuildNumber"})
    @Expose
	@Nullable
    public String buildNumber;

    /**
     * The Bundle Id.
     * The Identity Name.
     */
    @SerializedName(value = "bundleId", alternate = {"BundleId"})
    @Expose
	@Nullable
    public String bundleId;

    /**
     * The Expiration Date Time.
     * The expiration time.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expirationDateTime;

    /**
     * The Identity Version.
     * The identity version.
     */
    @SerializedName(value = "identityVersion", alternate = {"IdentityVersion"})
    @Expose
	@Nullable
    public String identityVersion;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
	@Nullable
    public IosMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Version Number.
     * The version number of managed iOS Line of Business (LoB) app.
     */
    @SerializedName(value = "versionNumber", alternate = {"VersionNumber"})
    @Expose
	@Nullable
    public String versionNumber;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
