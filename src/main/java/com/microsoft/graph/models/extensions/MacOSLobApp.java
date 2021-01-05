// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MacOSLobChildApp;
import com.microsoft.graph.models.extensions.MacOSMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.MobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSLob App.
 */
public class MacOSLobApp extends MobileLobApp implements IJsonBackedObject {


    /**
     * The Build Number.
     * The build number of MacOS Line of Business (LoB) app.
     */
    @SerializedName(value = "buildNumber", alternate = {"BuildNumber"})
    @Expose
    public String buildNumber;

    /**
     * The Bundle Id.
     * The bundle id.
     */
    @SerializedName(value = "bundleId", alternate = {"BundleId"})
    @Expose
    public String bundleId;

    /**
     * The Child Apps.
     * The app list in this bundle package
     */
    @SerializedName(value = "childApps", alternate = {"ChildApps"})
    @Expose
    public java.util.List<MacOSLobChildApp> childApps;

    /**
     * The Identity Version.
     * The identity version.
     */
    @SerializedName(value = "identityVersion", alternate = {"IdentityVersion"})
    @Expose
    public String identityVersion;

    /**
     * The Ignore Version Detection.
     * A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for macOS Line of Business (LoB) apps that use a self update feature.
     */
    @SerializedName(value = "ignoreVersionDetection", alternate = {"IgnoreVersionDetection"})
    @Expose
    public Boolean ignoreVersionDetection;

    /**
     * The Install As Managed.
     * A boolean to control whether the app will be installed as managed (requires macOS 11.0 and other PKG restrictions).
     */
    @SerializedName(value = "installAsManaged", alternate = {"InstallAsManaged"})
    @Expose
    public Boolean installAsManaged;

    /**
     * The Md5Hash.
     * The MD5 hash codes
     */
    @SerializedName(value = "md5Hash", alternate = {"Md5Hash"})
    @Expose
    public java.util.List<String> md5Hash;

    /**
     * The Md5Hash Chunk Size.
     * The chunk size for MD5 hash
     */
    @SerializedName(value = "md5HashChunkSize", alternate = {"Md5HashChunkSize"})
    @Expose
    public Integer md5HashChunkSize;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
    public MacOSMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Version Number.
     * The version number of MacOS Line of Business (LoB) app.
     */
    @SerializedName(value = "versionNumber", alternate = {"VersionNumber"})
    @Expose
    public String versionNumber;


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
