// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceManagementAutopilotPolicyComplianceStatus;
import com.microsoft.graph.models.generated.DeviceManagementAutopilotPolicyType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Autopilot Policy Status Detail.
 */
public class DeviceManagementAutopilotPolicyStatusDetail extends Entity implements IJsonBackedObject {


    /**
     * The Compliance Status.
     * The policy compliance status.
     */
    @SerializedName(value = "complianceStatus", alternate = {"ComplianceStatus"})
    @Expose
    public DeviceManagementAutopilotPolicyComplianceStatus complianceStatus;

    /**
     * The Display Name.
     * The friendly name of the policy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Last Reported Date Time.
     * Timestamp of the reported policy status
     */
    @SerializedName(value = "lastReportedDateTime", alternate = {"LastReportedDateTime"})
    @Expose
    public java.util.Calendar lastReportedDateTime;

    /**
     * The Policy Type.
     * The type of policy.
     */
    @SerializedName(value = "policyType", alternate = {"PolicyType"})
    @Expose
    public DeviceManagementAutopilotPolicyType policyType;

    /**
     * The Tracked On Enrollment Status.
     * Indicates if this prolicy was tracked as part of the autopilot bootstrap enrollment sync session
     */
    @SerializedName(value = "trackedOnEnrollmentStatus", alternate = {"TrackedOnEnrollmentStatus"})
    @Expose
    public Boolean trackedOnEnrollmentStatus;


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
