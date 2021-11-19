// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SharedPCAccountManagerPolicy;
import com.microsoft.graph.models.SharedPCAllowedAccountType;
import com.microsoft.graph.models.Enablement;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared PCConfiguration.
 */
public class SharedPCConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Account Manager Policy.
     * Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
     */
    @SerializedName(value = "accountManagerPolicy", alternate = {"AccountManagerPolicy"})
    @Expose
	@Nullable
    public SharedPCAccountManagerPolicy accountManagerPolicy;

    /**
     * The Allowed Accounts.
     * Indicates which type of accounts are allowed to use on a shared PC.
     */
    @SerializedName(value = "allowedAccounts", alternate = {"AllowedAccounts"})
    @Expose
	@Nullable
    public EnumSet<SharedPCAllowedAccountType> allowedAccounts;

    /**
     * The Allow Local Storage.
     * Specifies whether local storage is allowed on a shared PC.
     */
    @SerializedName(value = "allowLocalStorage", alternate = {"AllowLocalStorage"})
    @Expose
	@Nullable
    public Boolean allowLocalStorage;

    /**
     * The Disable Account Manager.
     * Disables the account manager for shared PC mode.
     */
    @SerializedName(value = "disableAccountManager", alternate = {"DisableAccountManager"})
    @Expose
	@Nullable
    public Boolean disableAccountManager;

    /**
     * The Disable Edu Policies.
     * Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.
     */
    @SerializedName(value = "disableEduPolicies", alternate = {"DisableEduPolicies"})
    @Expose
	@Nullable
    public Boolean disableEduPolicies;

    /**
     * The Disable Power Policies.
     * Specifies whether the default shared PC power policies should be disabled.
     */
    @SerializedName(value = "disablePowerPolicies", alternate = {"DisablePowerPolicies"})
    @Expose
	@Nullable
    public Boolean disablePowerPolicies;

    /**
     * The Disable Sign In On Resume.
     * Disables the requirement to sign in whenever the device wakes up from sleep mode.
     */
    @SerializedName(value = "disableSignInOnResume", alternate = {"DisableSignInOnResume"})
    @Expose
	@Nullable
    public Boolean disableSignInOnResume;

    /**
     * The Enabled.
     * Enables shared PC mode and applies the shared pc policies.
     */
    @SerializedName(value = "enabled", alternate = {"Enabled"})
    @Expose
	@Nullable
    public Boolean enabled;

    /**
     * The Fast First Sign In.
     * Specifies whether to auto connect new non-admin Azure AD accounts to pre-configured candidate local accounts
     */
    @SerializedName(value = "fastFirstSignIn", alternate = {"FastFirstSignIn"})
    @Expose
	@Nullable
    public Enablement fastFirstSignIn;

    /**
     * The Idle Time Before Sleep In Seconds.
     * Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring.
     */
    @SerializedName(value = "idleTimeBeforeSleepInSeconds", alternate = {"IdleTimeBeforeSleepInSeconds"})
    @Expose
	@Nullable
    public Integer idleTimeBeforeSleepInSeconds;

    /**
     * The Kiosk App Display Name.
     * Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
     */
    @SerializedName(value = "kioskAppDisplayName", alternate = {"KioskAppDisplayName"})
    @Expose
	@Nullable
    public String kioskAppDisplayName;

    /**
     * The Kiosk App User Model Id.
     * Specifies the application user model ID of the app to use with assigned access.
     */
    @SerializedName(value = "kioskAppUserModelId", alternate = {"KioskAppUserModelId"})
    @Expose
	@Nullable
    public String kioskAppUserModelId;

    /**
     * The Local Storage.
     * Specifies whether local storage is allowed on a shared PC.
     */
    @SerializedName(value = "localStorage", alternate = {"LocalStorage"})
    @Expose
	@Nullable
    public Enablement localStorage;

    /**
     * The Maintenance Start Time.
     * Specifies the daily start time of maintenance hour.
     */
    @SerializedName(value = "maintenanceStartTime", alternate = {"MaintenanceStartTime"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.TimeOfDay maintenanceStartTime;

    /**
     * The Set Account Manager.
     * Disables the account manager for shared PC mode.
     */
    @SerializedName(value = "setAccountManager", alternate = {"SetAccountManager"})
    @Expose
	@Nullable
    public Enablement setAccountManager;

    /**
     * The Set Edu Policies.
     * Specifies whether the default shared PC education environment policies should be enabled/disabled/not configured. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.
     */
    @SerializedName(value = "setEduPolicies", alternate = {"SetEduPolicies"})
    @Expose
	@Nullable
    public Enablement setEduPolicies;

    /**
     * The Set Power Policies.
     * Specifies whether the default shared PC power policies should be enabled/disabled.
     */
    @SerializedName(value = "setPowerPolicies", alternate = {"SetPowerPolicies"})
    @Expose
	@Nullable
    public Enablement setPowerPolicies;

    /**
     * The Sign In On Resume.
     * Specifies the requirement to sign in whenever the device wakes up from sleep mode.
     */
    @SerializedName(value = "signInOnResume", alternate = {"SignInOnResume"})
    @Expose
	@Nullable
    public Enablement signInOnResume;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
