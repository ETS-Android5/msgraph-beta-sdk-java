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
import com.microsoft.graph.models.AdvancedThreatProtectionOnboardingDeviceSettingState;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Advanced Threat Protection Onboarding State Summary.
 */
public class AdvancedThreatProtectionOnboardingStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Compliant Device Count.
     * Number of compliant devices
     */
    @SerializedName(value = "compliantDeviceCount", alternate = {"CompliantDeviceCount"})
    @Expose
	@Nullable
    public Integer compliantDeviceCount;

    /**
     * The Conflict Device Count.
     * Number of conflict devices
     */
    @SerializedName(value = "conflictDeviceCount", alternate = {"ConflictDeviceCount"})
    @Expose
	@Nullable
    public Integer conflictDeviceCount;

    /**
     * The Error Device Count.
     * Number of error devices
     */
    @SerializedName(value = "errorDeviceCount", alternate = {"ErrorDeviceCount"})
    @Expose
	@Nullable
    public Integer errorDeviceCount;

    /**
     * The Non Compliant Device Count.
     * Number of NonCompliant devices
     */
    @SerializedName(value = "nonCompliantDeviceCount", alternate = {"NonCompliantDeviceCount"})
    @Expose
	@Nullable
    public Integer nonCompliantDeviceCount;

    /**
     * The Not Applicable Device Count.
     * Number of not applicable devices
     */
    @SerializedName(value = "notApplicableDeviceCount", alternate = {"NotApplicableDeviceCount"})
    @Expose
	@Nullable
    public Integer notApplicableDeviceCount;

    /**
     * The Not Assigned Device Count.
     * Number of not assigned devices
     */
    @SerializedName(value = "notAssignedDeviceCount", alternate = {"NotAssignedDeviceCount"})
    @Expose
	@Nullable
    public Integer notAssignedDeviceCount;

    /**
     * The Remediated Device Count.
     * Number of remediated devices
     */
    @SerializedName(value = "remediatedDeviceCount", alternate = {"RemediatedDeviceCount"})
    @Expose
	@Nullable
    public Integer remediatedDeviceCount;

    /**
     * The Unknown Device Count.
     * Number of unknown devices
     */
    @SerializedName(value = "unknownDeviceCount", alternate = {"UnknownDeviceCount"})
    @Expose
	@Nullable
    public Integer unknownDeviceCount;

    /**
     * The Advanced Threat Protection Onboarding Device Setting States.
     * Not yet documented
     */
    @SerializedName(value = "advancedThreatProtectionOnboardingDeviceSettingStates", alternate = {"AdvancedThreatProtectionOnboardingDeviceSettingStates"})
    @Expose
	@Nullable
    public AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionPage advancedThreatProtectionOnboardingDeviceSettingStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("advancedThreatProtectionOnboardingDeviceSettingStates")) {
            advancedThreatProtectionOnboardingDeviceSettingStates = serializer.deserializeObject(json.get("advancedThreatProtectionOnboardingDeviceSettingStates"), AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionPage.class);
        }
    }
}
