// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DepEnrollmentBaseProfile;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Mac OSEnrollment Profile.
 */
public class DepMacOSEnrollmentProfile extends DepEnrollmentBaseProfile implements IJsonBackedObject {


    /**
     * The Accessibility Screen Disabled.
     * Indicates if Accessibility screen is disabled
     */
    @SerializedName(value = "accessibilityScreenDisabled", alternate = {"AccessibilityScreenDisabled"})
    @Expose
	@Nullable
    public Boolean accessibilityScreenDisabled;

    /**
     * The Auto Unlock With Watch Disabled.
     * Indicates if UnlockWithWatch screen is disabled
     */
    @SerializedName(value = "autoUnlockWithWatchDisabled", alternate = {"AutoUnlockWithWatchDisabled"})
    @Expose
	@Nullable
    public Boolean autoUnlockWithWatchDisabled;

    /**
     * The Choose Your Lock Screen Disabled.
     * Indicates if iCloud Documents and Desktop screen is disabled
     */
    @SerializedName(value = "chooseYourLockScreenDisabled", alternate = {"ChooseYourLockScreenDisabled"})
    @Expose
	@Nullable
    public Boolean chooseYourLockScreenDisabled;

    /**
     * The File Vault Disabled.
     * Indicates if file vault is disabled
     */
    @SerializedName(value = "fileVaultDisabled", alternate = {"FileVaultDisabled"})
    @Expose
	@Nullable
    public Boolean fileVaultDisabled;

    /**
     * The ICloud Diagnostics Disabled.
     * Indicates if iCloud Analytics screen is disabled
     */
    @SerializedName(value = "iCloudDiagnosticsDisabled", alternate = {"ICloudDiagnosticsDisabled"})
    @Expose
	@Nullable
    public Boolean iCloudDiagnosticsDisabled;

    /**
     * The ICloud Storage Disabled.
     * Indicates if iCloud Documents and Desktop screen is disabled
     */
    @SerializedName(value = "iCloudStorageDisabled", alternate = {"ICloudStorageDisabled"})
    @Expose
	@Nullable
    public Boolean iCloudStorageDisabled;

    /**
     * The Pass Code Disabled.
     * Indicates if Passcode setup pane is disabled
     */
    @SerializedName(value = "passCodeDisabled", alternate = {"PassCodeDisabled"})
    @Expose
	@Nullable
    public Boolean passCodeDisabled;

    /**
     * The Registration Disabled.
     * Indicates if registration is disabled
     */
    @SerializedName(value = "registrationDisabled", alternate = {"RegistrationDisabled"})
    @Expose
	@Nullable
    public Boolean registrationDisabled;

    /**
     * The Zoom Disabled.
     * Indicates if zoom setup pane is disabled
     */
    @SerializedName(value = "zoomDisabled", alternate = {"ZoomDisabled"})
    @Expose
	@Nullable
    public Boolean zoomDisabled;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
