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
import com.microsoft.graph.models.ManagedAppRemediationAction;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.AndroidManagedAppSafetyNetAppsVerificationType;
import com.microsoft.graph.models.AndroidManagedAppSafetyNetDeviceAttestationType;
import com.microsoft.graph.models.AndroidManagedAppSafetyNetEvaluationType;
import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.models.ManagedAppPolicyDeploymentSummary;
import com.microsoft.graph.models.TargetedManagedAppProtection;
import com.microsoft.graph.requests.ManagedMobileAppCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Protection.
 */
public class AndroidManagedAppProtection extends TargetedManagedAppProtection implements IJsonBackedObject {


    /**
     * The Allowed Android Device Manufacturers.
     * Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work.
     */
    @SerializedName(value = "allowedAndroidDeviceManufacturers", alternate = {"AllowedAndroidDeviceManufacturers"})
    @Expose
	@Nullable
    public String allowedAndroidDeviceManufacturers;

    /**
     * The Allowed Android Device Models.
     * List of device models allowed, as a string, for the managed app to work.
     */
    @SerializedName(value = "allowedAndroidDeviceModels", alternate = {"AllowedAndroidDeviceModels"})
    @Expose
	@Nullable
    public java.util.List<String> allowedAndroidDeviceModels;

    /**
     * The App Action If Android Device Manufacturer Not Allowed.
     * Defines a managed app behavior, either block or wipe, if the specified device manufacturer is not allowed. Possible values are: block, wipe, warn.
     */
    @SerializedName(value = "appActionIfAndroidDeviceManufacturerNotAllowed", alternate = {"AppActionIfAndroidDeviceManufacturerNotAllowed"})
    @Expose
	@Nullable
    public ManagedAppRemediationAction appActionIfAndroidDeviceManufacturerNotAllowed;

    /**
     * The App Action If Android Device Model Not Allowed.
     * Defines a managed app behavior, either block or wipe, if the specified device model is not allowed.
     */
    @SerializedName(value = "appActionIfAndroidDeviceModelNotAllowed", alternate = {"AppActionIfAndroidDeviceModelNotAllowed"})
    @Expose
	@Nullable
    public ManagedAppRemediationAction appActionIfAndroidDeviceModelNotAllowed;

    /**
     * The App Action If Android Safety Net Apps Verification Failed.
     * Defines a managed app behavior, either warn or block, if the specified Android App Verification requirment fails. Possible values are: block, wipe, warn.
     */
    @SerializedName(value = "appActionIfAndroidSafetyNetAppsVerificationFailed", alternate = {"AppActionIfAndroidSafetyNetAppsVerificationFailed"})
    @Expose
	@Nullable
    public ManagedAppRemediationAction appActionIfAndroidSafetyNetAppsVerificationFailed;

    /**
     * The App Action If Android Safety Net Device Attestation Failed.
     * Defines a managed app behavior, either warn or block, if the specified Android SafetyNet Attestation requirment fails. Possible values are: block, wipe, warn.
     */
    @SerializedName(value = "appActionIfAndroidSafetyNetDeviceAttestationFailed", alternate = {"AppActionIfAndroidSafetyNetDeviceAttestationFailed"})
    @Expose
	@Nullable
    public ManagedAppRemediationAction appActionIfAndroidSafetyNetDeviceAttestationFailed;

    /**
     * The App Action If Device Lock Not Set.
     * Defines a managed app behavior, either warn, block or wipe, if the screen lock is required on android device but is not set.
     */
    @SerializedName(value = "appActionIfDeviceLockNotSet", alternate = {"AppActionIfDeviceLockNotSet"})
    @Expose
	@Nullable
    public ManagedAppRemediationAction appActionIfDeviceLockNotSet;

    /**
     * The Approved Keyboards.
     * If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name
     */
    @SerializedName(value = "approvedKeyboards", alternate = {"ApprovedKeyboards"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> approvedKeyboards;

    /**
     * The Biometric Authentication Blocked.
     * Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True.
     */
    @SerializedName(value = "biometricAuthenticationBlocked", alternate = {"BiometricAuthenticationBlocked"})
    @Expose
	@Nullable
    public Boolean biometricAuthenticationBlocked;

    /**
     * The Block After Company Portal Update Deferral In Days.
     * Maximum number of days Company Portal update can be deferred on the device or app access will be blocked.
     */
    @SerializedName(value = "blockAfterCompanyPortalUpdateDeferralInDays", alternate = {"BlockAfterCompanyPortalUpdateDeferralInDays"})
    @Expose
	@Nullable
    public Integer blockAfterCompanyPortalUpdateDeferralInDays;

    /**
     * The Custom Browser Display Name.
     * Friendly name of the preferred custom browser to open weblink on Android.
     */
    @SerializedName(value = "customBrowserDisplayName", alternate = {"CustomBrowserDisplayName"})
    @Expose
	@Nullable
    public String customBrowserDisplayName;

    /**
     * The Custom Browser Package Id.
     * Unique identifier of a custom browser to open weblink on Android.
     */
    @SerializedName(value = "customBrowserPackageId", alternate = {"CustomBrowserPackageId"})
    @Expose
	@Nullable
    public String customBrowserPackageId;

    /**
     * The Custom Dialer App Display Name.
     * Friendly name of a custom dialer app to click-to-open a phone number on Android.
     */
    @SerializedName(value = "customDialerAppDisplayName", alternate = {"CustomDialerAppDisplayName"})
    @Expose
	@Nullable
    public String customDialerAppDisplayName;

    /**
     * The Custom Dialer App Package Id.
     * PackageId of a custom dialer app to click-to-open a phone number on Android.
     */
    @SerializedName(value = "customDialerAppPackageId", alternate = {"CustomDialerAppPackageId"})
    @Expose
	@Nullable
    public String customDialerAppPackageId;

    /**
     * The Deployed App Count.
     * Count of apps to which the current policy is deployed.
     */
    @SerializedName(value = "deployedAppCount", alternate = {"DeployedAppCount"})
    @Expose
	@Nullable
    public Integer deployedAppCount;

    /**
     * The Device Lock Required.
     * Defines if any kind of lock must be required on android device
     */
    @SerializedName(value = "deviceLockRequired", alternate = {"DeviceLockRequired"})
    @Expose
	@Nullable
    public Boolean deviceLockRequired;

    /**
     * The Disable App Encryption If Device Encryption Is Enabled.
     * When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     */
    @SerializedName(value = "disableAppEncryptionIfDeviceEncryptionIsEnabled", alternate = {"DisableAppEncryptionIfDeviceEncryptionIsEnabled"})
    @Expose
	@Nullable
    public Boolean disableAppEncryptionIfDeviceEncryptionIsEnabled;

    /**
     * The Encrypt App Data.
     * Indicates whether application data for managed apps should be encrypted
     */
    @SerializedName(value = "encryptAppData", alternate = {"EncryptAppData"})
    @Expose
	@Nullable
    public Boolean encryptAppData;

    /**
     * The Exempted App Packages.
     * App packages in this list will be exempt from the policy and will be able to receive data from managed apps.
     */
    @SerializedName(value = "exemptedAppPackages", alternate = {"ExemptedAppPackages"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> exemptedAppPackages;

    /**
     * The Keyboards Restricted.
     * Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well.
     */
    @SerializedName(value = "keyboardsRestricted", alternate = {"KeyboardsRestricted"})
    @Expose
	@Nullable
    public Boolean keyboardsRestricted;

    /**
     * The Minimum Required Company Portal Version.
     * Minimum version of the Company portal that must be installed on the device or app access will be blocked
     */
    @SerializedName(value = "minimumRequiredCompanyPortalVersion", alternate = {"MinimumRequiredCompanyPortalVersion"})
    @Expose
	@Nullable
    public String minimumRequiredCompanyPortalVersion;

    /**
     * The Minimum Required Patch Version.
     * Define the oldest required Android security patch level a user can have to gain secure access to the app.
     */
    @SerializedName(value = "minimumRequiredPatchVersion", alternate = {"MinimumRequiredPatchVersion"})
    @Expose
	@Nullable
    public String minimumRequiredPatchVersion;

    /**
     * The Minimum Warning Company Portal Version.
     * Minimum version of the Company portal that must be installed on the device or the user will receive a warning
     */
    @SerializedName(value = "minimumWarningCompanyPortalVersion", alternate = {"MinimumWarningCompanyPortalVersion"})
    @Expose
	@Nullable
    public String minimumWarningCompanyPortalVersion;

    /**
     * The Minimum Warning Patch Version.
     * Define the oldest recommended Android security patch level a user can have for secure access to the app.
     */
    @SerializedName(value = "minimumWarningPatchVersion", alternate = {"MinimumWarningPatchVersion"})
    @Expose
	@Nullable
    public String minimumWarningPatchVersion;

    /**
     * The Minimum Wipe Company Portal Version.
     * Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped
     */
    @SerializedName(value = "minimumWipeCompanyPortalVersion", alternate = {"MinimumWipeCompanyPortalVersion"})
    @Expose
	@Nullable
    public String minimumWipeCompanyPortalVersion;

    /**
     * The Minimum Wipe Patch Version.
     * Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data.
     */
    @SerializedName(value = "minimumWipePatchVersion", alternate = {"MinimumWipePatchVersion"})
    @Expose
	@Nullable
    public String minimumWipePatchVersion;

    /**
     * The Required Android Safety Net Apps Verification Type.
     * Defines the Android SafetyNet Apps Verification requirement for a managed app to work. Possible values are: none, enabled.
     */
    @SerializedName(value = "requiredAndroidSafetyNetAppsVerificationType", alternate = {"RequiredAndroidSafetyNetAppsVerificationType"})
    @Expose
	@Nullable
    public AndroidManagedAppSafetyNetAppsVerificationType requiredAndroidSafetyNetAppsVerificationType;

    /**
     * The Required Android Safety Net Device Attestation Type.
     * Defines the Android SafetyNet Device Attestation requirement for a managed app to work. Possible values are: none, basicIntegrity, basicIntegrityAndDeviceCertification.
     */
    @SerializedName(value = "requiredAndroidSafetyNetDeviceAttestationType", alternate = {"RequiredAndroidSafetyNetDeviceAttestationType"})
    @Expose
	@Nullable
    public AndroidManagedAppSafetyNetDeviceAttestationType requiredAndroidSafetyNetDeviceAttestationType;

    /**
     * The Required Android Safety Net Evaluation Type.
     * Defines the Android SafetyNet evaluation type requirement for a managed app to work.
     */
    @SerializedName(value = "requiredAndroidSafetyNetEvaluationType", alternate = {"RequiredAndroidSafetyNetEvaluationType"})
    @Expose
	@Nullable
    public AndroidManagedAppSafetyNetEvaluationType requiredAndroidSafetyNetEvaluationType;

    /**
     * The Screen Capture Blocked.
     * Indicates whether a managed user can take screen captures of managed apps
     */
    @SerializedName(value = "screenCaptureBlocked", alternate = {"ScreenCaptureBlocked"})
    @Expose
	@Nullable
    public Boolean screenCaptureBlocked;

    /**
     * The Warn After Company Portal Update Deferral In Days.
     * Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning
     */
    @SerializedName(value = "warnAfterCompanyPortalUpdateDeferralInDays", alternate = {"WarnAfterCompanyPortalUpdateDeferralInDays"})
    @Expose
	@Nullable
    public Integer warnAfterCompanyPortalUpdateDeferralInDays;

    /**
     * The Wipe After Company Portal Update Deferral In Days.
     * Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped
     */
    @SerializedName(value = "wipeAfterCompanyPortalUpdateDeferralInDays", alternate = {"WipeAfterCompanyPortalUpdateDeferralInDays"})
    @Expose
	@Nullable
    public Integer wipeAfterCompanyPortalUpdateDeferralInDays;

    /**
     * The Apps.
     * List of apps to which the policy is deployed.
     */
    @SerializedName(value = "apps", alternate = {"Apps"})
    @Expose
	@Nullable
    public ManagedMobileAppCollectionPage apps;

    /**
     * The Deployment Summary.
     * Navigation property to deployment summary of the configuration.
     */
    @SerializedName(value = "deploymentSummary", alternate = {"DeploymentSummary"})
    @Expose
	@Nullable
    public ManagedAppPolicyDeploymentSummary deploymentSummary;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("apps")) {
            apps = serializer.deserializeObject(json.get("apps"), ManagedMobileAppCollectionPage.class);
        }
    }
}
