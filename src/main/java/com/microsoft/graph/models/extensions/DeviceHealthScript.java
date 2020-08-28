// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RunAsAccountType;
import com.microsoft.graph.models.extensions.DeviceHealthScriptParameter;
import com.microsoft.graph.models.extensions.DeviceHealthScriptAssignment;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRunSummary;
import com.microsoft.graph.models.extensions.DeviceHealthScriptDeviceState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptDeviceStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptDeviceStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script.
 */
public class DeviceHealthScript extends Entity implements IJsonBackedObject {


    /**
     * The Publisher.
     * Name of the device health script publisher
     */
    @SerializedName("publisher")
    @Expose
    public String publisher;

    /**
     * The Version.
     * Version of the device health script
     */
    @SerializedName("version")
    @Expose
    public String version;

    /**
     * The Display Name.
     * Name of the device health script
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Description.
     * Description of the device health script
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Detection Script Content.
     * The entire content of the detection powershell script
     */
    @SerializedName("detectionScriptContent")
    @Expose
    public byte[] detectionScriptContent;

    /**
     * The Remediation Script Content.
     * The entire content of the remediation powershell script
     */
    @SerializedName("remediationScriptContent")
    @Expose
    public byte[] remediationScriptContent;

    /**
     * The Created Date Time.
     * The timestamp of when the device health script was created. This property is read-only.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Last Modified Date Time.
     * The timestamp of when the device health script was modified. This property is read-only.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Run As Account.
     * Indicates the type of execution context
     */
    @SerializedName("runAsAccount")
    @Expose
    public RunAsAccountType runAsAccount;

    /**
     * The Enforce Signature Check.
     * Indicate whether the script signature needs be checked
     */
    @SerializedName("enforceSignatureCheck")
    @Expose
    public Boolean enforceSignatureCheck;

    /**
     * The Run As32Bit.
     * Indicate whether PowerShell script(s) should run as 32-bit
     */
    @SerializedName("runAs32Bit")
    @Expose
    public Boolean runAs32Bit;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tag IDs for the device health script
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Is Global Script.
     * Determines if this is Microsoft Proprietary Script. Proprietary scripts are read-only
     */
    @SerializedName("isGlobalScript")
    @Expose
    public Boolean isGlobalScript;

    /**
     * The Highest Available Version.
     * Highest available version for a Microsoft Proprietary script
     */
    @SerializedName("highestAvailableVersion")
    @Expose
    public String highestAvailableVersion;

    /**
     * The Detection Script Parameters.
     * List of ComplexType DetectionScriptParameters objects.
     */
    @SerializedName("detectionScriptParameters")
    @Expose
    public java.util.List<DeviceHealthScriptParameter> detectionScriptParameters;

    /**
     * The Remediation Script Parameters.
     * List of ComplexType RemediationScriptParameters objects.
     */
    @SerializedName("remediationScriptParameters")
    @Expose
    public java.util.List<DeviceHealthScriptParameter> remediationScriptParameters;

    /**
     * The Assignments.
     * The list of group assignments for the device health script
     */
    public DeviceHealthScriptAssignmentCollectionPage assignments;

    /**
     * The Run Summary.
     * High level run summary for device health script.
     */
    @SerializedName("runSummary")
    @Expose
    public DeviceHealthScriptRunSummary runSummary;

    /**
     * The Device Run States.
     * List of run states for the device health script across all devices
     */
    public DeviceHealthScriptDeviceStateCollectionPage deviceRunStates;


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


        if (json.has("assignments")) {
            final DeviceHealthScriptAssignmentCollectionResponse response = new DeviceHealthScriptAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final DeviceHealthScriptAssignment[] array = new DeviceHealthScriptAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceHealthScriptAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new DeviceHealthScriptAssignmentCollectionPage(response, null);
        }

        if (json.has("deviceRunStates")) {
            final DeviceHealthScriptDeviceStateCollectionResponse response = new DeviceHealthScriptDeviceStateCollectionResponse();
            if (json.has("deviceRunStates@odata.nextLink")) {
                response.nextLink = json.get("deviceRunStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceRunStates").toString(), JsonObject[].class);
            final DeviceHealthScriptDeviceState[] array = new DeviceHealthScriptDeviceState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceHealthScriptDeviceState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceRunStates = new DeviceHealthScriptDeviceStateCollectionPage(response, null);
        }
    }
}
