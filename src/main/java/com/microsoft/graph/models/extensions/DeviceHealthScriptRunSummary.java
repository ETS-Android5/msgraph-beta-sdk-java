// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Run Summary.
 */
public class DeviceHealthScriptRunSummary extends Entity implements IJsonBackedObject {


    /**
     * The No Issue Detected Device Count.
     * Number of devices for which the detection script did not find an issue and the device is healthy
     */
    @SerializedName("noIssueDetectedDeviceCount")
    @Expose
    public Integer noIssueDetectedDeviceCount;

    /**
     * The Issue Detected Device Count.
     * Number of devices for which the detection script found an issue
     */
    @SerializedName("issueDetectedDeviceCount")
    @Expose
    public Integer issueDetectedDeviceCount;

    /**
     * The Detection Script Error Device Count.
     * Number of devices on which the detection script execution encountered an error and did not complete
     */
    @SerializedName("detectionScriptErrorDeviceCount")
    @Expose
    public Integer detectionScriptErrorDeviceCount;

    /**
     * The Detection Script Pending Device Count.
     * Number of devices which have not yet run the latest version of the device health script
     */
    @SerializedName("detectionScriptPendingDeviceCount")
    @Expose
    public Integer detectionScriptPendingDeviceCount;

    /**
     * The Issue Remediated Device Count.
     * Number of devices for which the remediation script was able to resolve the detected issue
     */
    @SerializedName("issueRemediatedDeviceCount")
    @Expose
    public Integer issueRemediatedDeviceCount;

    /**
     * The Remediation Skipped Device Count.
     * Number of devices for which remediation was skipped
     */
    @SerializedName("remediationSkippedDeviceCount")
    @Expose
    public Integer remediationSkippedDeviceCount;

    /**
     * The Issue Reoccurred Device Count.
     * Number of devices for which the remediation script executed successfully but failed to resolve the detected issue
     */
    @SerializedName("issueReoccurredDeviceCount")
    @Expose
    public Integer issueReoccurredDeviceCount;

    /**
     * The Remediation Script Error Device Count.
     * Number of devices for which the remediation script execution encountered an error and did not complete
     */
    @SerializedName("remediationScriptErrorDeviceCount")
    @Expose
    public Integer remediationScriptErrorDeviceCount;

    /**
     * The Last Script Run Date Time.
     * Last run time for the script across all devices
     */
    @SerializedName("lastScriptRunDateTime")
    @Expose
    public java.util.Calendar lastScriptRunDateTime;

    /**
     * The Issue Remediated Cumulative Device Count.
     * Number of devices that were remediated over the last 30 days
     */
    @SerializedName("issueRemediatedCumulativeDeviceCount")
    @Expose
    public Integer issueRemediatedCumulativeDeviceCount;


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
