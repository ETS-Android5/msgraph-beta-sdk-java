// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidManagedStoreAccountBindStatus;
import com.microsoft.graph.models.extensions.AndroidEnrollmentCompanyCode;
import com.microsoft.graph.models.generated.AndroidManagedStoreAccountEnrollmentTarget;
import com.microsoft.graph.models.generated.AndroidManagedStoreAccountAppSyncStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store Account Enterprise Settings.
 */
public class AndroidManagedStoreAccountEnterpriseSettings extends Entity implements IJsonBackedObject {


    /**
     * The Android Device Owner Fully Managed Enrollment Enabled.
     * Company codes for AndroidManagedStoreAccountEnterpriseSettings
     */
    @SerializedName(value = "androidDeviceOwnerFullyManagedEnrollmentEnabled", alternate = {"AndroidDeviceOwnerFullyManagedEnrollmentEnabled"})
    @Expose
    public Boolean androidDeviceOwnerFullyManagedEnrollmentEnabled;

    /**
     * The Bind Status.
     * Bind status of the tenant with the Google EMM API. Possible values are: notBound, bound, boundAndValidated, unbinding.
     */
    @SerializedName(value = "bindStatus", alternate = {"BindStatus"})
    @Expose
    public AndroidManagedStoreAccountBindStatus bindStatus;

    /**
     * The Company Codes.
     * Company codes for AndroidManagedStoreAccountEnterpriseSettings
     */
    @SerializedName(value = "companyCodes", alternate = {"CompanyCodes"})
    @Expose
    public java.util.List<AndroidEnrollmentCompanyCode> companyCodes;

    /**
     * The Device Owner Management Enabled.
     * Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     */
    @SerializedName(value = "deviceOwnerManagementEnabled", alternate = {"DeviceOwnerManagementEnabled"})
    @Expose
    public Boolean deviceOwnerManagementEnabled;

    /**
     * The Enrollment Target.
     * Indicates which users can enroll devices in Android Enterprise device management. Possible values are: none, all, targeted, targetedAsEnrollmentRestrictions.
     */
    @SerializedName(value = "enrollmentTarget", alternate = {"EnrollmentTarget"})
    @Expose
    public AndroidManagedStoreAccountEnrollmentTarget enrollmentTarget;

    /**
     * The Last App Sync Date Time.
     * Last completion time for app sync
     */
    @SerializedName(value = "lastAppSyncDateTime", alternate = {"LastAppSyncDateTime"})
    @Expose
    public java.util.Calendar lastAppSyncDateTime;

    /**
     * The Last App Sync Status.
     * Last application sync result. Possible values are: success, credentialsNotValid, androidForWorkApiError, managementServiceError, unknownError, none.
     */
    @SerializedName(value = "lastAppSyncStatus", alternate = {"LastAppSyncStatus"})
    @Expose
    public AndroidManagedStoreAccountAppSyncStatus lastAppSyncStatus;

    /**
     * The Last Modified Date Time.
     * Last modification time for Android enterprise settings
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Owner Organization Name.
     * Organization name used when onboarding Android Enterprise
     */
    @SerializedName(value = "ownerOrganizationName", alternate = {"OwnerOrganizationName"})
    @Expose
    public String ownerOrganizationName;

    /**
     * The Owner User Principal Name.
     * Owner UPN that created the enterprise
     */
    @SerializedName(value = "ownerUserPrincipalName", alternate = {"OwnerUserPrincipalName"})
    @Expose
    public String ownerUserPrincipalName;

    /**
     * The Target Group Ids.
     * Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'
     */
    @SerializedName(value = "targetGroupIds", alternate = {"TargetGroupIds"})
    @Expose
    public java.util.List<String> targetGroupIds;


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
