// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsAutopilotDeviceType;
import com.microsoft.graph.models.extensions.WindowsEnrollmentStatusScreenSettings;
import com.microsoft.graph.models.extensions.OutOfBoxExperienceSettings;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeviceIdentity;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfileAssignment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Deployment Profile.
 */
public class WindowsAutopilotDeploymentProfile extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Profile creation time
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Description of the profile
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Device Name Template.
     * The template used to name the AutoPilot Device. This can be a custom text and can also contain either the serial number of the device, or a randomly generated number. The total length of the text generated by the template can be no more than 15 characters.
     */
    @SerializedName(value = "deviceNameTemplate", alternate = {"DeviceNameTemplate"})
    @Expose
    public String deviceNameTemplate;

    /**
     * The Device Type.
     * The AutoPilot device type that this profile is applicable to.
     */
    @SerializedName(value = "deviceType", alternate = {"DeviceType"})
    @Expose
    public WindowsAutopilotDeviceType deviceType;

    /**
     * The Display Name.
     * Name of the profile
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Enable White Glove.
     * Enable Autopilot White Glove for the profile.
     */
    @SerializedName(value = "enableWhiteGlove", alternate = {"EnableWhiteGlove"})
    @Expose
    public Boolean enableWhiteGlove;

    /**
     * The Enrollment Status Screen Settings.
     * Enrollment status screen setting
     */
    @SerializedName(value = "enrollmentStatusScreenSettings", alternate = {"EnrollmentStatusScreenSettings"})
    @Expose
    public WindowsEnrollmentStatusScreenSettings enrollmentStatusScreenSettings;

    /**
     * The Extract Hardware Hash.
     * HardwareHash Extraction for the profile
     */
    @SerializedName(value = "extractHardwareHash", alternate = {"ExtractHardwareHash"})
    @Expose
    public Boolean extractHardwareHash;

    /**
     * The Language.
     * Language configured on the device
     */
    @SerializedName(value = "language", alternate = {"Language"})
    @Expose
    public String language;

    /**
     * The Last Modified Date Time.
     * Profile last modified time
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Out Of Box Experience Settings.
     * Out of box experience setting
     */
    @SerializedName(value = "outOfBoxExperienceSettings", alternate = {"OutOfBoxExperienceSettings"})
    @Expose
    public OutOfBoxExperienceSettings outOfBoxExperienceSettings;

    /**
     * The Role Scope Tag Ids.
     * Scope tags for the profile.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Assigned Devices.
     * The list of assigned devices for the profile.
     */
    @SerializedName(value = "assignedDevices", alternate = {"AssignedDevices"})
    @Expose
    public WindowsAutopilotDeviceIdentityCollectionPage assignedDevices;

    /**
     * The Assignments.
     * The list of group assignments for the profile.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
    public WindowsAutopilotDeploymentProfileAssignmentCollectionPage assignments;


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


        if (json.has("assignedDevices")) {
            assignedDevices = serializer.deserializeObject(json.get("assignedDevices").toString(), WindowsAutopilotDeviceIdentityCollectionPage.class);
        }

        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), WindowsAutopilotDeploymentProfileAssignmentCollectionPage.class);
        }
    }
}
