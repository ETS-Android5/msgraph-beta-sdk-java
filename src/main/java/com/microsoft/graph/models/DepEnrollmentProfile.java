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
import com.microsoft.graph.models.ITunesPairingMode;
import com.microsoft.graph.models.ManagementCertificateWithThumbprint;
import com.microsoft.graph.models.EnrollmentProfile;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Enrollment Profile.
 */
public class DepEnrollmentProfile extends EnrollmentProfile implements IJsonBackedObject {


    /**
     * The Apple Id Disabled.
     * Indicates if Apple id setup pane is disabled
     */
    @SerializedName(value = "appleIdDisabled", alternate = {"AppleIdDisabled"})
    @Expose
	@Nullable
    public Boolean appleIdDisabled;

    /**
     * The Apple Pay Disabled.
     * Indicates if Apple pay setup pane is disabled
     */
    @SerializedName(value = "applePayDisabled", alternate = {"ApplePayDisabled"})
    @Expose
	@Nullable
    public Boolean applePayDisabled;

    /**
     * The Await Device Configured Confirmation.
     * Indicates if the device will need to wait for configured confirmation
     */
    @SerializedName(value = "awaitDeviceConfiguredConfirmation", alternate = {"AwaitDeviceConfiguredConfirmation"})
    @Expose
	@Nullable
    public Boolean awaitDeviceConfiguredConfirmation;

    /**
     * The Diagnostics Disabled.
     * Indicates if diagnostics setup pane is disabled
     */
    @SerializedName(value = "diagnosticsDisabled", alternate = {"DiagnosticsDisabled"})
    @Expose
	@Nullable
    public Boolean diagnosticsDisabled;

    /**
     * The Enable Shared IPad.
     * This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     */
    @SerializedName(value = "enableSharedIPad", alternate = {"EnableSharedIPad"})
    @Expose
	@Nullable
    public Boolean enableSharedIPad;

    /**
     * The Is Default.
     * Indicates if this is the default profile
     */
    @SerializedName(value = "isDefault", alternate = {"IsDefault"})
    @Expose
	@Nullable
    public Boolean isDefault;

    /**
     * The Is Mandatory.
     * Indicates if the profile is mandatory
     */
    @SerializedName(value = "isMandatory", alternate = {"IsMandatory"})
    @Expose
	@Nullable
    public Boolean isMandatory;

    /**
     * The ITunes Pairing Mode.
     * Indicates the iTunes pairing mode. Possible values are: disallow, allow, requiresCertificate.
     */
    @SerializedName(value = "iTunesPairingMode", alternate = {"ITunesPairingMode"})
    @Expose
	@Nullable
    public ITunesPairingMode iTunesPairingMode;

    /**
     * The Location Disabled.
     * Indicates if Location service setup pane is disabled
     */
    @SerializedName(value = "locationDisabled", alternate = {"LocationDisabled"})
    @Expose
	@Nullable
    public Boolean locationDisabled;

    /**
     * The Mac OSFile Vault Disabled.
     * Indicates if Mac OS file vault is disabled
     */
    @SerializedName(value = "macOSFileVaultDisabled", alternate = {"MacOSFileVaultDisabled"})
    @Expose
	@Nullable
    public Boolean macOSFileVaultDisabled;

    /**
     * The Mac OSRegistration Disabled.
     * Indicates if Mac OS registration is disabled
     */
    @SerializedName(value = "macOSRegistrationDisabled", alternate = {"MacOSRegistrationDisabled"})
    @Expose
	@Nullable
    public Boolean macOSRegistrationDisabled;

    /**
     * The Management Certificates.
     * Management certificates for Apple Configurator
     */
    @SerializedName(value = "managementCertificates", alternate = {"ManagementCertificates"})
    @Expose
	@Nullable
    public java.util.List<ManagementCertificateWithThumbprint> managementCertificates;

    /**
     * The Pass Code Disabled.
     * Indicates if Passcode setup pane is disabled
     */
    @SerializedName(value = "passCodeDisabled", alternate = {"PassCodeDisabled"})
    @Expose
	@Nullable
    public Boolean passCodeDisabled;

    /**
     * The Profile Removal Disabled.
     * Indicates if the profile removal option is disabled
     */
    @SerializedName(value = "profileRemovalDisabled", alternate = {"ProfileRemovalDisabled"})
    @Expose
	@Nullable
    public Boolean profileRemovalDisabled;

    /**
     * The Restore Blocked.
     * Indicates if Restore setup pane is blocked
     */
    @SerializedName(value = "restoreBlocked", alternate = {"RestoreBlocked"})
    @Expose
	@Nullable
    public Boolean restoreBlocked;

    /**
     * The Restore From Android Disabled.
     * Indicates if Restore from Android is disabled
     */
    @SerializedName(value = "restoreFromAndroidDisabled", alternate = {"RestoreFromAndroidDisabled"})
    @Expose
	@Nullable
    public Boolean restoreFromAndroidDisabled;

    /**
     * The Shared IPad Maximum User Count.
     * This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     */
    @SerializedName(value = "sharedIPadMaximumUserCount", alternate = {"SharedIPadMaximumUserCount"})
    @Expose
	@Nullable
    public Integer sharedIPadMaximumUserCount;

    /**
     * The Siri Disabled.
     * Indicates if siri setup pane is disabled
     */
    @SerializedName(value = "siriDisabled", alternate = {"SiriDisabled"})
    @Expose
	@Nullable
    public Boolean siriDisabled;

    /**
     * The Supervised Mode Enabled.
     * Supervised mode, True to enable, false otherwise. See https://docs.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     */
    @SerializedName(value = "supervisedModeEnabled", alternate = {"SupervisedModeEnabled"})
    @Expose
	@Nullable
    public Boolean supervisedModeEnabled;

    /**
     * The Support Department.
     * Support department information
     */
    @SerializedName(value = "supportDepartment", alternate = {"SupportDepartment"})
    @Expose
	@Nullable
    public String supportDepartment;

    /**
     * The Support Phone Number.
     * Support phone number
     */
    @SerializedName(value = "supportPhoneNumber", alternate = {"SupportPhoneNumber"})
    @Expose
	@Nullable
    public String supportPhoneNumber;

    /**
     * The Terms And Conditions Disabled.
     * Indicates if 'Terms and Conditions' setup pane is disabled
     */
    @SerializedName(value = "termsAndConditionsDisabled", alternate = {"TermsAndConditionsDisabled"})
    @Expose
	@Nullable
    public Boolean termsAndConditionsDisabled;

    /**
     * The Touch Id Disabled.
     * Indicates if touch id setup pane is disabled
     */
    @SerializedName(value = "touchIdDisabled", alternate = {"TouchIdDisabled"})
    @Expose
	@Nullable
    public Boolean touchIdDisabled;

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
