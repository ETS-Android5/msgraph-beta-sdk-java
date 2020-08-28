// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DepTokenType;
import com.microsoft.graph.models.extensions.DepIOSEnrollmentProfile;
import com.microsoft.graph.models.extensions.DepMacOSEnrollmentProfile;
import com.microsoft.graph.models.extensions.EnrollmentProfile;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentity;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EnrollmentProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.EnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityCollectionResponse;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Onboarding Setting.
 */
public class DepOnboardingSetting extends Entity implements IJsonBackedObject {


    /**
     * The Apple Identifier.
     * The Apple ID used to obtain the current token.
     */
    @SerializedName("appleIdentifier")
    @Expose
    public String appleIdentifier;

    /**
     * The Token Expiration Date Time.
     * When the token will expire.
     */
    @SerializedName("tokenExpirationDateTime")
    @Expose
    public java.util.Calendar tokenExpirationDateTime;

    /**
     * The Last Modified Date Time.
     * When the service was onboarded.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Last Successful Sync Date Time.
     * When the service last syned with Intune
     */
    @SerializedName("lastSuccessfulSyncDateTime")
    @Expose
    public java.util.Calendar lastSuccessfulSyncDateTime;

    /**
     * The Last Sync Triggered Date Time.
     * When Intune last requested a sync.
     */
    @SerializedName("lastSyncTriggeredDateTime")
    @Expose
    public java.util.Calendar lastSyncTriggeredDateTime;

    /**
     * The Share Token With School Data Sync Service.
     * Whether or not the Dep token sharing is enabled with the School Data Sync service.
     */
    @SerializedName("shareTokenWithSchoolDataSyncService")
    @Expose
    public Boolean shareTokenWithSchoolDataSyncService;

    /**
     * The Last Sync Error Code.
     * Error code reported by Apple during last dep sync.
     */
    @SerializedName("lastSyncErrorCode")
    @Expose
    public Integer lastSyncErrorCode;

    /**
     * The Token Type.
     * Gets or sets the Dep Token Type.
     */
    @SerializedName("tokenType")
    @Expose
    public DepTokenType tokenType;

    /**
     * The Token Name.
     * Friendly Name for Dep Token
     */
    @SerializedName("tokenName")
    @Expose
    public String tokenName;

    /**
     * The Synced Device Count.
     * Gets synced device count
     */
    @SerializedName("syncedDeviceCount")
    @Expose
    public Integer syncedDeviceCount;

    /**
     * The Data Sharing Consent Granted.
     * Consent granted for data sharing with Apple Dep Service
     */
    @SerializedName("dataSharingConsentGranted")
    @Expose
    public Boolean dataSharingConsentGranted;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Default Ios Enrollment Profile.
     * Default iOS Enrollment Profile
     */
    @SerializedName("defaultIosEnrollmentProfile")
    @Expose
    public DepIOSEnrollmentProfile defaultIosEnrollmentProfile;

    /**
     * The Default Mac Os Enrollment Profile.
     * Default MacOs Enrollment Profile
     */
    @SerializedName("defaultMacOsEnrollmentProfile")
    @Expose
    public DepMacOSEnrollmentProfile defaultMacOsEnrollmentProfile;

    /**
     * The Enrollment Profiles.
     * The enrollment profiles.
     */
    public EnrollmentProfileCollectionPage enrollmentProfiles;

    /**
     * The Imported Apple Device Identities.
     * The imported Apple device identities.
     */
    public ImportedAppleDeviceIdentityCollectionPage importedAppleDeviceIdentities;


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


        if (json.has("enrollmentProfiles")) {
            final EnrollmentProfileCollectionResponse response = new EnrollmentProfileCollectionResponse();
            if (json.has("enrollmentProfiles@odata.nextLink")) {
                response.nextLink = json.get("enrollmentProfiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("enrollmentProfiles").toString(), JsonObject[].class);
            final EnrollmentProfile[] array = new EnrollmentProfile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EnrollmentProfile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            enrollmentProfiles = new EnrollmentProfileCollectionPage(response, null);
        }

        if (json.has("importedAppleDeviceIdentities")) {
            final ImportedAppleDeviceIdentityCollectionResponse response = new ImportedAppleDeviceIdentityCollectionResponse();
            if (json.has("importedAppleDeviceIdentities@odata.nextLink")) {
                response.nextLink = json.get("importedAppleDeviceIdentities@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("importedAppleDeviceIdentities").toString(), JsonObject[].class);
            final ImportedAppleDeviceIdentity[] array = new ImportedAppleDeviceIdentity[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ImportedAppleDeviceIdentity.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            importedAppleDeviceIdentities = new ImportedAppleDeviceIdentityCollectionPage(response, null);
        }
    }
}
