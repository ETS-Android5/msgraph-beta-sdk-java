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
import com.microsoft.graph.models.DepEnrollmentBaseProfile;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep IOSEnrollment Profile.
 */
public class DepIOSEnrollmentProfile extends DepEnrollmentBaseProfile implements IJsonBackedObject {


    /**
     * The Appearance Screen Disabled.
     * Indicates if Apperance screen is disabled
     */
    @SerializedName(value = "appearanceScreenDisabled", alternate = {"AppearanceScreenDisabled"})
    @Expose
	@Nullable
    public Boolean appearanceScreenDisabled;

    /**
     * The Await Device Configured Confirmation.
     * Indicates if the device will need to wait for configured confirmation
     */
    @SerializedName(value = "awaitDeviceConfiguredConfirmation", alternate = {"AwaitDeviceConfiguredConfirmation"})
    @Expose
	@Nullable
    public Boolean awaitDeviceConfiguredConfirmation;

    /**
     * The Carrier Activation Url.
     * Carrier URL for activating device eSIM.
     */
    @SerializedName(value = "carrierActivationUrl", alternate = {"CarrierActivationUrl"})
    @Expose
	@Nullable
    public String carrierActivationUrl;

    /**
     * The Company Portal Vpp Token Id.
     * If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set.
     */
    @SerializedName(value = "companyPortalVppTokenId", alternate = {"CompanyPortalVppTokenId"})
    @Expose
	@Nullable
    public String companyPortalVppTokenId;

    /**
     * The Device To Device Migration Disabled.
     * Indicates if Device To Device Migration is disabled
     */
    @SerializedName(value = "deviceToDeviceMigrationDisabled", alternate = {"DeviceToDeviceMigrationDisabled"})
    @Expose
	@Nullable
    public Boolean deviceToDeviceMigrationDisabled;

    /**
     * The Enable Shared IPad.
     * This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     */
    @SerializedName(value = "enableSharedIPad", alternate = {"EnableSharedIPad"})
    @Expose
	@Nullable
    public Boolean enableSharedIPad;

    /**
     * The Enable Single App Enrollment Mode.
     * Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set.
     */
    @SerializedName(value = "enableSingleAppEnrollmentMode", alternate = {"EnableSingleAppEnrollmentMode"})
    @Expose
	@Nullable
    public Boolean enableSingleAppEnrollmentMode;

    /**
     * The Express Language Screen Disabled.
     * Indicates if Express Language screen is disabled
     */
    @SerializedName(value = "expressLanguageScreenDisabled", alternate = {"ExpressLanguageScreenDisabled"})
    @Expose
	@Nullable
    public Boolean expressLanguageScreenDisabled;

    /**
     * The Force Temporary Session.
     * Indicates if temporary sessions is enabled
     */
    @SerializedName(value = "forceTemporarySession", alternate = {"ForceTemporarySession"})
    @Expose
	@Nullable
    public Boolean forceTemporarySession;

    /**
     * The Home Button Screen Disabled.
     * Indicates if home button sensitivity screen is disabled
     */
    @SerializedName(value = "homeButtonScreenDisabled", alternate = {"HomeButtonScreenDisabled"})
    @Expose
	@Nullable
    public Boolean homeButtonScreenDisabled;

    /**
     * The IMessage And Face Time Screen Disabled.
     * Indicates if iMessage and FaceTime screen is disabled
     */
    @SerializedName(value = "iMessageAndFaceTimeScreenDisabled", alternate = {"IMessageAndFaceTimeScreenDisabled"})
    @Expose
	@Nullable
    public Boolean iMessageAndFaceTimeScreenDisabled;

    /**
     * The ITunes Pairing Mode.
     * Indicates the iTunes pairing mode. Possible values are: disallow, allow, requiresCertificate.
     */
    @SerializedName(value = "iTunesPairingMode", alternate = {"ITunesPairingMode"})
    @Expose
	@Nullable
    public ITunesPairingMode iTunesPairingMode;

    /**
     * The Management Certificates.
     * Management certificates for Apple Configurator
     */
    @SerializedName(value = "managementCertificates", alternate = {"ManagementCertificates"})
    @Expose
	@Nullable
    public java.util.List<ManagementCertificateWithThumbprint> managementCertificates;

    /**
     * The On Boarding Screen Disabled.
     * Indicates if onboarding setup screen is disabled
     */
    @SerializedName(value = "onBoardingScreenDisabled", alternate = {"OnBoardingScreenDisabled"})
    @Expose
	@Nullable
    public Boolean onBoardingScreenDisabled;

    /**
     * The Pass Code Disabled.
     * Indicates if Passcode setup pane is disabled
     */
    @SerializedName(value = "passCodeDisabled", alternate = {"PassCodeDisabled"})
    @Expose
	@Nullable
    public Boolean passCodeDisabled;

    /**
     * The Passcode Lock Grace Period In Seconds.
     * Indicates timeout before locked screen requires the user to enter the device passocde to unlock it
     */
    @SerializedName(value = "passcodeLockGracePeriodInSeconds", alternate = {"PasscodeLockGracePeriodInSeconds"})
    @Expose
	@Nullable
    public Integer passcodeLockGracePeriodInSeconds;

    /**
     * The Preferred Language Screen Disabled.
     * Indicates if Preferred language screen is disabled
     */
    @SerializedName(value = "preferredLanguageScreenDisabled", alternate = {"PreferredLanguageScreenDisabled"})
    @Expose
	@Nullable
    public Boolean preferredLanguageScreenDisabled;

    /**
     * The Restore Completed Screen Disabled.
     * Indicates if Weclome screen is disabled
     */
    @SerializedName(value = "restoreCompletedScreenDisabled", alternate = {"RestoreCompletedScreenDisabled"})
    @Expose
	@Nullable
    public Boolean restoreCompletedScreenDisabled;

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
     * The Sim Setup Screen Disabled.
     * Indicates if the SIMSetup screen is disabled
     */
    @SerializedName(value = "simSetupScreenDisabled", alternate = {"SimSetupScreenDisabled"})
    @Expose
	@Nullable
    public Boolean simSetupScreenDisabled;

    /**
     * The Software Update Screen Disabled.
     * Indicates if the mandatory sofware update screen is disabled
     */
    @SerializedName(value = "softwareUpdateScreenDisabled", alternate = {"SoftwareUpdateScreenDisabled"})
    @Expose
	@Nullable
    public Boolean softwareUpdateScreenDisabled;

    /**
     * The Temporary Session Timeout In Seconds.
     * Indicates timeout of temporary session
     */
    @SerializedName(value = "temporarySessionTimeoutInSeconds", alternate = {"TemporarySessionTimeoutInSeconds"})
    @Expose
	@Nullable
    public Integer temporarySessionTimeoutInSeconds;

    /**
     * The Update Complete Screen Disabled.
     * Indicates if Weclome screen is disabled
     */
    @SerializedName(value = "updateCompleteScreenDisabled", alternate = {"UpdateCompleteScreenDisabled"})
    @Expose
	@Nullable
    public Boolean updateCompleteScreenDisabled;

    /**
     * The Userless Shared Aad Mode Enabled.
     * Indicates that this apple device is designated to support 'shared device mode' scenarios. This is distinct from the 'shared iPad' scenario. See Shared iOS and iPadOS devices.
     */
    @SerializedName(value = "userlessSharedAadModeEnabled", alternate = {"UserlessSharedAadModeEnabled"})
    @Expose
	@Nullable
    public Boolean userlessSharedAadModeEnabled;

    /**
     * The User Session Timeout In Seconds.
     * Indicates timeout of temporary session
     */
    @SerializedName(value = "userSessionTimeoutInSeconds", alternate = {"UserSessionTimeoutInSeconds"})
    @Expose
	@Nullable
    public Integer userSessionTimeoutInSeconds;

    /**
     * The Watch Migration Screen Disabled.
     * Indicates if the watch migration screen is disabled
     */
    @SerializedName(value = "watchMigrationScreenDisabled", alternate = {"WatchMigrationScreenDisabled"})
    @Expose
	@Nullable
    public Boolean watchMigrationScreenDisabled;

    /**
     * The Welcome Screen Disabled.
     * Indicates if Weclome screen is disabled
     */
    @SerializedName(value = "welcomeScreenDisabled", alternate = {"WelcomeScreenDisabled"})
    @Expose
	@Nullable
    public Boolean welcomeScreenDisabled;

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
