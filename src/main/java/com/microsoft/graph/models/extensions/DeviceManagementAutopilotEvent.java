// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsAutopilotDeploymentState;
import com.microsoft.graph.models.generated.EnrollmentState;
import com.microsoft.graph.models.generated.WindowsAutopilotEnrollmentType;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotPolicyStatusDetail;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotPolicyStatusDetailCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Autopilot Event.
 */
public class DeviceManagementAutopilotEvent extends Entity implements IJsonBackedObject {


    /**
     * The Account Setup Duration.
     * Time spent in user ESP.
     */
    @SerializedName(value = "accountSetupDuration", alternate = {"AccountSetupDuration"})
    @Expose
    public javax.xml.datatype.Duration accountSetupDuration;

    /**
     * The Account Setup Status.
     * Deployment status for the enrollment status page account setup phase. Possible values are: unknown, success, inProgress, failure, successWithTimeout, notAttempted, disabled.
     */
    @SerializedName(value = "accountSetupStatus", alternate = {"AccountSetupStatus"})
    @Expose
    public WindowsAutopilotDeploymentState accountSetupStatus;

    /**
     * The Deployment Duration.
     * Autopilot deployment duration including enrollment.
     */
    @SerializedName(value = "deploymentDuration", alternate = {"DeploymentDuration"})
    @Expose
    public javax.xml.datatype.Duration deploymentDuration;

    /**
     * The Deployment End Date Time.
     * Deployment end time.
     */
    @SerializedName(value = "deploymentEndDateTime", alternate = {"DeploymentEndDateTime"})
    @Expose
    public java.util.Calendar deploymentEndDateTime;

    /**
     * The Deployment Start Date Time.
     * Deployment start time.
     */
    @SerializedName(value = "deploymentStartDateTime", alternate = {"DeploymentStartDateTime"})
    @Expose
    public java.util.Calendar deploymentStartDateTime;

    /**
     * The Deployment State.
     * Deployment state like Success, Failure, InProgress, SuccessWithTimeout. Possible values are: unknown, success, inProgress, failure, successWithTimeout, notAttempted, disabled.
     */
    @SerializedName(value = "deploymentState", alternate = {"DeploymentState"})
    @Expose
    public WindowsAutopilotDeploymentState deploymentState;

    /**
     * The Deployment Total Duration.
     * Total deployment duration from enrollment to Desktop screen.
     */
    @SerializedName(value = "deploymentTotalDuration", alternate = {"DeploymentTotalDuration"})
    @Expose
    public javax.xml.datatype.Duration deploymentTotalDuration;

    /**
     * The Device Id.
     * Device id associated with the object
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
    public String deviceId;

    /**
     * The Device Preparation Duration.
     * Time spent in device enrollment.
     */
    @SerializedName(value = "devicePreparationDuration", alternate = {"DevicePreparationDuration"})
    @Expose
    public javax.xml.datatype.Duration devicePreparationDuration;

    /**
     * The Device Registered Date Time.
     * Device registration date.
     */
    @SerializedName(value = "deviceRegisteredDateTime", alternate = {"DeviceRegisteredDateTime"})
    @Expose
    public java.util.Calendar deviceRegisteredDateTime;

    /**
     * The Device Serial Number.
     * Device serial number.
     */
    @SerializedName(value = "deviceSerialNumber", alternate = {"DeviceSerialNumber"})
    @Expose
    public String deviceSerialNumber;

    /**
     * The Device Setup Duration.
     * Time spent in device ESP.
     */
    @SerializedName(value = "deviceSetupDuration", alternate = {"DeviceSetupDuration"})
    @Expose
    public javax.xml.datatype.Duration deviceSetupDuration;

    /**
     * The Device Setup Status.
     * Deployment status for the enrollment status page device setup phase. Possible values are: unknown, success, inProgress, failure, successWithTimeout, notAttempted, disabled.
     */
    @SerializedName(value = "deviceSetupStatus", alternate = {"DeviceSetupStatus"})
    @Expose
    public WindowsAutopilotDeploymentState deviceSetupStatus;

    /**
     * The Enrollment Failure Details.
     * Enrollment failure details.
     */
    @SerializedName(value = "enrollmentFailureDetails", alternate = {"EnrollmentFailureDetails"})
    @Expose
    public String enrollmentFailureDetails;

    /**
     * The Enrollment Start Date Time.
     * Device enrollment start date.
     */
    @SerializedName(value = "enrollmentStartDateTime", alternate = {"EnrollmentStartDateTime"})
    @Expose
    public java.util.Calendar enrollmentStartDateTime;

    /**
     * The Enrollment State.
     * Enrollment state like Enrolled, Failed. Possible values are: unknown, enrolled, pendingReset, failed, notContacted, blocked.
     */
    @SerializedName(value = "enrollmentState", alternate = {"EnrollmentState"})
    @Expose
    public EnrollmentState enrollmentState;

    /**
     * The Enrollment Type.
     * Enrollment type. Possible values are: unknown, azureADJoinedWithAutopilotProfile, offlineDomainJoined, azureADJoinedUsingDeviceAuthWithAutopilotProfile, azureADJoinedUsingDeviceAuthWithoutAutopilotProfile, azureADJoinedWithOfflineAutopilotProfile, azureADJoinedWithWhiteGlove, offlineDomainJoinedWithWhiteGlove, offlineDomainJoinedWithOfflineAutopilotProfile.
     */
    @SerializedName(value = "enrollmentType", alternate = {"EnrollmentType"})
    @Expose
    public WindowsAutopilotEnrollmentType enrollmentType;

    /**
     * The Event Date Time.
     * Time when the event occurred .
     */
    @SerializedName(value = "eventDateTime", alternate = {"EventDateTime"})
    @Expose
    public java.util.Calendar eventDateTime;

    /**
     * The Managed Device Name.
     * Managed device name.
     */
    @SerializedName(value = "managedDeviceName", alternate = {"ManagedDeviceName"})
    @Expose
    public String managedDeviceName;

    /**
     * The Os Version.
     * Device operating system version.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
    public String osVersion;

    /**
     * The Targeted App Count.
     * Count of applications targeted.
     */
    @SerializedName(value = "targetedAppCount", alternate = {"TargetedAppCount"})
    @Expose
    public Integer targetedAppCount;

    /**
     * The Targeted Policy Count.
     * Count of policies targeted.
     */
    @SerializedName(value = "targetedPolicyCount", alternate = {"TargetedPolicyCount"})
    @Expose
    public Integer targetedPolicyCount;

    /**
     * The User Principal Name.
     * User principal name used to enroll the device.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The Windows10Enrollment Completion Page Configuration Display Name.
     * Enrollment Status Page profile name
     */
    @SerializedName(value = "windows10EnrollmentCompletionPageConfigurationDisplayName", alternate = {"Windows10EnrollmentCompletionPageConfigurationDisplayName"})
    @Expose
    public String windows10EnrollmentCompletionPageConfigurationDisplayName;

    /**
     * The Windows10Enrollment Completion Page Configuration Id.
     * Enrollment Status Page profile ID
     */
    @SerializedName(value = "windows10EnrollmentCompletionPageConfigurationId", alternate = {"Windows10EnrollmentCompletionPageConfigurationId"})
    @Expose
    public String windows10EnrollmentCompletionPageConfigurationId;

    /**
     * The Windows Autopilot Deployment Profile Display Name.
     * Autopilot profile name.
     */
    @SerializedName(value = "windowsAutopilotDeploymentProfileDisplayName", alternate = {"WindowsAutopilotDeploymentProfileDisplayName"})
    @Expose
    public String windowsAutopilotDeploymentProfileDisplayName;

    /**
     * The Policy Status Details.
     * Policy and application status details for this device.
     */
    @SerializedName(value = "policyStatusDetails", alternate = {"PolicyStatusDetails"})
    @Expose
    public DeviceManagementAutopilotPolicyStatusDetailCollectionPage policyStatusDetails;


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


        if (json.has("policyStatusDetails")) {
            policyStatusDetails = serializer.deserializeObject(json.get("policyStatusDetails").toString(), DeviceManagementAutopilotPolicyStatusDetailCollectionPage.class);
        }
    }
}
