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
import com.microsoft.graph.models.ExcludedApps;
import com.microsoft.graph.models.OfficeSuiteInstallProgressDisplayLevel;
import com.microsoft.graph.models.WindowsArchitecture;
import com.microsoft.graph.models.OfficeProductId;
import com.microsoft.graph.models.OfficeUpdateChannel;
import com.microsoft.graph.models.MobileApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Suite App.
 */
public class OfficeSuiteApp extends MobileApp implements IJsonBackedObject {


    /**
     * The Auto Accept Eula.
     * The value to accept the EULA automatically on the enduser's device.
     */
    @SerializedName(value = "autoAcceptEula", alternate = {"AutoAcceptEula"})
    @Expose
	@Nullable
    public Boolean autoAcceptEula;

    /**
     * The Excluded Apps.
     * The property to represent the apps which are excluded from the selected Office365 Product Id.
     */
    @SerializedName(value = "excludedApps", alternate = {"ExcludedApps"})
    @Expose
	@Nullable
    public ExcludedApps excludedApps;

    /**
     * The Install Progress Display Level.
     * To specify the level of display for the Installation Progress Setup UI on the Device.
     */
    @SerializedName(value = "installProgressDisplayLevel", alternate = {"InstallProgressDisplayLevel"})
    @Expose
	@Nullable
    public OfficeSuiteInstallProgressDisplayLevel installProgressDisplayLevel;

    /**
     * The Locales To Install.
     * The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/en-us/library/cc179219(v=office.16).aspx
     */
    @SerializedName(value = "localesToInstall", alternate = {"LocalesToInstall"})
    @Expose
	@Nullable
    public java.util.List<String> localesToInstall;

    /**
     * The Office Configuration Xml.
     * The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app.
     */
    @SerializedName(value = "officeConfigurationXml", alternate = {"OfficeConfigurationXml"})
    @Expose
	@Nullable
    public byte[] officeConfigurationXml;

    /**
     * The Office Platform Architecture.
     * The property to represent the Office365 app suite version.
     */
    @SerializedName(value = "officePlatformArchitecture", alternate = {"OfficePlatformArchitecture"})
    @Expose
	@Nullable
    public EnumSet<WindowsArchitecture> officePlatformArchitecture;

    /**
     * The Product Ids.
     * The Product Ids that represent the Office365 Suite SKU.
     */
    @SerializedName(value = "productIds", alternate = {"ProductIds"})
    @Expose
	@Nullable
    public java.util.List<OfficeProductId> productIds;

    /**
     * The Should Uninstall Older Versions Of Office.
     * The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not.
     */
    @SerializedName(value = "shouldUninstallOlderVersionsOfOffice", alternate = {"ShouldUninstallOlderVersionsOfOffice"})
    @Expose
	@Nullable
    public Boolean shouldUninstallOlderVersionsOfOffice;

    /**
     * The Target Version.
     * The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices.
     */
    @SerializedName(value = "targetVersion", alternate = {"TargetVersion"})
    @Expose
	@Nullable
    public String targetVersion;

    /**
     * The Update Channel.
     * The property to represent the Office365 Update Channel.
     */
    @SerializedName(value = "updateChannel", alternate = {"UpdateChannel"})
    @Expose
	@Nullable
    public OfficeUpdateChannel updateChannel;

    /**
     * The Update Version.
     * The property to represent the update version in which the specific target version is available for the Office365 app suite.
     */
    @SerializedName(value = "updateVersion", alternate = {"UpdateVersion"})
    @Expose
	@Nullable
    public String updateVersion;

    /**
     * The Use Shared Computer Activation.
     * The property to represent that whether the shared computer activation is used not for Office365 app suite.
     */
    @SerializedName(value = "useSharedComputerActivation", alternate = {"UseSharedComputerActivation"})
    @Expose
	@Nullable
    public Boolean useSharedComputerActivation;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
