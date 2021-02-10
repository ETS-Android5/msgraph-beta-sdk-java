// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ManagedAppRemediationAction;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.generated.AndroidManagedAppSafetyNetAppsVerificationType;
import com.microsoft.graph.models.generated.AndroidManagedAppSafetyNetDeviceAttestationType;
import com.microsoft.graph.models.generated.AndroidManagedAppSafetyNetEvaluationType;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummary;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

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
    public String allowedAndroidDeviceManufacturers;

    /**
     * The Allowed Android Device Models.
     * List of device models allowed, as a string, for the managed app to work.
     */
    @SerializedName(value = "allowedAndroidDeviceModels", alternate = {"AllowedAndroidDeviceModels"})
    @Expose
    public java.util.List<String> allowedAndroidDeviceModels;

    /**
     * The App Action If Android Device Manufacturer Not Allowed.
     * Defines a managed app behavior, either block or wipe, if the specified device manufacturer is not allowed. Possible values are: block, wipe, warn.
     */
    @SerializedName(value = "appActionIfAndroidDeviceManufacturerNotAllowed", alternate = {"AppActionIfAndroidDeviceManufacturerNotAllowed"})
    @Expose
    public ManagedAppRemediationAction appActionIfAndroidDeviceManufacturerNotAllowed;

    /**
     * The App Action If Android Device Model Not Allowed.
     * Defines a managed app behavior, either block or wipe, if the specified device model is not allowed.
     */
    @SerializedName(value = "appActionIfAndroidDeviceModelNotAllowed", alternate = {"AppActionIfAndroidDeviceModelNotAllowed"})
    @Expose
    public ManagedAppRemediationAction appActionIfAndroidDeviceModelNotAllowed;

    /**
     * The App Action If Android Safety Net Apps Verification Failed.
     * Defines a managed app behavior, either warn or block, if the specified Android App Verification requirement fails. Possible values are: block, wipe, warn.
     */
    @SerializedName(value = "appActionIfAndroidSafetyNetAppsVerificationFailed", alternate = {"AppActionIfAndroidSafetyNetAppsVerificationFailed"})
    @Expose
    public ManagedAppRemediationAction appActionIfAndroidSafetyNetAppsVerificationFailed;

    /**
     * The App Action If Android Safety Net Device Attestation Failed.
     * Defines a managed app behavior, either warn or block, if the specified Android SafetyNet Attestation requirement fails. Possible values are: block, wipe, warn.
     */
    @SerializedName(value = "appActionIfAndroidSafetyNetDeviceAttestationFailed", alternate = {"AppActionIfAndroidSafetyNetDeviceAttestationFailed"})
    @Expose
    public ManagedAppRemediationAction appActionIfAndroidSafetyNetDeviceAttestationFailed;

    /**
     * The App Action If Device Lock Not Set.
     * Defines a managed app behavior, either warn, block or wipe, if the screen lock is required on android device but is not set.
     */
    @SerializedName(value = "appActionIfDeviceLockNotSet", alternate = {"AppActionIfDeviceLockNotSet"})
    @Expose
    public ManagedAppRemediationAction appActionIfDeviceLockNotSet;

    /**
     * The Approved Keyboards.
     * If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name
     */
    @SerializedName(value = "approvedKeyboards", alternate = {"ApprovedKeyboards"})
    @Expose
    public java.util.List<KeyValuePair> approvedKeyboards;

    /**
     * The Biometric Authentication Blocked.
     * Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True.
     */
    @SerializedName(value = "biometricAuthenticationBlocked", alternate = {"BiometricAuthenticationBlocked"})
    @Expose
    public Boolean biometricAuthenticationBlocked;

    /**
     * The Block After Company Portal Update Deferral In Days.
     * Maximum number of days Company Portal update can be deferred on the device or app access will be blocked.
     */
    @SerializedName(value = "blockAfterCompanyPortalUpdateDeferralInDays", alternate = {"BlockAfterCompanyPortalUpdateDeferralInDays"})
    @Expose
    public Integer blockAfterCompanyPortalUpdateDeferralInDays;

    /**
     * The Custom Browser Display Name.
     * Friendly name of the preferred custom browser to open weblink on Android.
     */
    @SerializedName(value = "customBrowserDisplayName", alternate = {"CustomBrowserDisplayName"})
    @Expose
    public String customBrowserDisplayName;

    /**
     * The Custom Browser Package Id.
     * Unique identifier of a custom browser to open weblink on Android.
     */
    @SerializedName(value = "customBrowserPackageId", alternate = {"CustomBrowserPackageId"})
    @Expose
    public String customBrowserPackageId;

    /**
     * The Custom Dialer App Display Name.
     * Friendly name of a custom dialer app to click-to-open a phone number on Android.
     */
    @SerializedName(value = "customDialerAppDisplayName", alternate = {"CustomDialerAppDisplayName"})
    @Expose
    public String customDialerAppDisplayName;

    /**
     * The Custom Dialer App Package Id.
     * PackageId of a custom dialer app to click-to-open a phone number on Android.
     */
    @SerializedName(value = "customDialerAppPackageId", alternate = {"CustomDialerAppPackageId"})
    @Expose
    public String customDialerAppPackageId;

    /**
     * The Deployed App Count.
     * Count of apps to which the current policy is deployed.
     */
    @SerializedName(value = "deployedAppCount", alternate = {"DeployedAppCount"})
    @Expose
    public Integer deployedAppCount;

    /**
     * The Device Lock Required.
     * Defines if any kind of lock must be required on android device
     */
    @SerializedName(value = "deviceLockRequired", alternate = {"DeviceLockRequired"})
    @Expose
    public Boolean deviceLockRequired;

    /**
     * The Disable App Encryption If Device Encryption Is Enabled.
     * When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     */
    @SerializedName(value = "disableAppEncryptionIfDeviceEncryptionIsEnabled", alternate = {"DisableAppEncryptionIfDeviceEncryptionIsEnabled"})
    @Expose
    public Boolean disableAppEncryptionIfDeviceEncryptionIsEnabled;

    /**
     * The Encrypt App Data.
     * Indicates whether application data for managed apps should be encrypted
     */
    @SerializedName(value = "encryptAppData", alternate = {"EncryptAppData"})
    @Expose
    public Boolean encryptAppData;

    /**
     * The Exempted App Packages.
     * App packages in this list will be exempt from the policy and will be able to receive data from managed apps.
     */
    @SerializedName(value = "exemptedAppPackages", alternate = {"ExemptedAppPackages"})
    @Expose
    public java.util.List<KeyValuePair> exemptedAppPackages;

    /**
     * The Keyboards Restricted.
     * Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well.
     */
    @SerializedName(value = "keyboardsRestricted", alternate = {"KeyboardsRestricted"})
    @Expose
    public Boolean keyboardsRestricted;

    /**
     * The Minimum Required Company Portal Version.
     * Minimum version of the Company portal that must be installed on the device or app access will be blocked
     */
    @SerializedName(value = "minimumRequiredCompanyPortalVersion", alternate = {"MinimumRequiredCompanyPortalVersion"})
    @Expose
    public String minimumRequiredCompanyPortalVersion;

    /**
     * The Minimum Required Patch Version.
     * Define the oldest required Android security patch level a user can have to gain secure access to the app.
     */
    @SerializedName(value = "minimumRequiredPatchVersion", alternate = {"MinimumRequiredPatchVersion"})
    @Expose
    public String minimumRequiredPatchVersion;

    /**
     * The Minimum Warning Company Portal Version.
     * Minimum version of the Company portal that must be installed on the device or the user will receive a warning
     */
    @SerializedName(value = "minimumWarningCompanyPortalVersion", alternate = {"MinimumWarningCompanyPortalVersion"})
    @Expose
    public String minimumWarningCompanyPortalVersion;

    /**
     * The Minimum Warning Patch Version.
     * Define the oldest recommended Android security patch level a user can have for secure access to the app.
     */
    @SerializedName(value = "minimumWarningPatchVersion", alternate = {"MinimumWarningPatchVersion"})
    @Expose
    public String minimumWarningPatchVersion;

    /**
     * The Minimum Wipe Company Portal Version.
     * Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped
     */
    @SerializedName(value = "minimumWipeCompanyPortalVersion", alternate = {"MinimumWipeCompanyPortalVersion"})
    @Expose
    public String minimumWipeCompanyPortalVersion;

    /**
     * The Minimum Wipe Patch Version.
     * Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data.
     */
    @SerializedName(value = "minimumWipePatchVersion", alternate = {"MinimumWipePatchVersion"})
    @Expose
    public String minimumWipePatchVersion;

    /**
     * The Required Android Safety Net Apps Verification Type.
     * Defines the Android SafetyNet Apps Verification requirement for a managed app to work. Possible values are: none, enabled.
     */
    @SerializedName(value = "requiredAndroidSafetyNetAppsVerificationType", alternate = {"RequiredAndroidSafetyNetAppsVerificationType"})
    @Expose
    public AndroidManagedAppSafetyNetAppsVerificationType requiredAndroidSafetyNetAppsVerificationType;

    /**
     * The Required Android Safety Net Device Attestation Type.
     * Defines the Android SafetyNet Device Attestation requirement for a managed app to work. Possible values are: none, basicIntegrity, basicIntegrityAndDeviceCertification.
     */
    @SerializedName(value = "requiredAndroidSafetyNetDeviceAttestationType", alternate = {"RequiredAndroidSafetyNetDeviceAttestationType"})
    @Expose
    public AndroidManagedAppSafetyNetDeviceAttestationType requiredAndroidSafetyNetDeviceAttestationType;

    /**
     * The Required Android Safety Net Evaluation Type.
     * Defines the Android SafetyNet evaluation type requirement for a managed app to work.
     */
    @SerializedName(value = "requiredAndroidSafetyNetEvaluationType", alternate = {"RequiredAndroidSafetyNetEvaluationType"})
    @Expose
    public AndroidManagedAppSafetyNetEvaluationType requiredAndroidSafetyNetEvaluationType;

    /**
     * The Screen Capture Blocked.
     * Indicates whether a managed user can take screen captures of managed apps
     */
    @SerializedName(value = "screenCaptureBlocked", alternate = {"ScreenCaptureBlocked"})
    @Expose
    public Boolean screenCaptureBlocked;

    /**
     * The Warn After Company Portal Update Deferral In Days.
     * Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning
     */
    @SerializedName(value = "warnAfterCompanyPortalUpdateDeferralInDays", alternate = {"WarnAfterCompanyPortalUpdateDeferralInDays"})
    @Expose
    public Integer warnAfterCompanyPortalUpdateDeferralInDays;

    /**
     * The Wipe After Company Portal Update Deferral In Days.
     * Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped
     */
    @SerializedName(value = "wipeAfterCompanyPortalUpdateDeferralInDays", alternate = {"WipeAfterCompanyPortalUpdateDeferralInDays"})
    @Expose
    public Integer wipeAfterCompanyPortalUpdateDeferralInDays;

    /**
     * The Apps.
     * List of apps to which the policy is deployed.
     */
    @SerializedName(value = "apps", alternate = {"Apps"})
    @Expose
    public ManagedMobileAppCollectionPage apps;

    /**
     * The Deployment Summary.
     * Navigation property to deployment summary of the configuration.
     */
    @SerializedName(value = "deploymentSummary", alternate = {"DeploymentSummary"})
    @Expose
    public ManagedAppPolicyDeploymentSummary deploymentSummary;


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


        if (json.has("apps")) {
            apps = serializer.deserializeObject(json.get("apps").toString(), ManagedMobileAppCollectionPage.class);
        }
    }
}
