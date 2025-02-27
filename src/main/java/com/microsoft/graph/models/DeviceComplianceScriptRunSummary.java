// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Script Run Summary.
 */
public class DeviceComplianceScriptRunSummary extends Entity implements IJsonBackedObject {


    /**
     * The Detection Script Error Device Count.
     * Number of devices on which the detection script execution encountered an error and did not complete. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "detectionScriptErrorDeviceCount", alternate = {"DetectionScriptErrorDeviceCount"})
    @Expose
	@Nullable
    public Integer detectionScriptErrorDeviceCount;

    /**
     * The Detection Script Pending Device Count.
     * Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "detectionScriptPendingDeviceCount", alternate = {"DetectionScriptPendingDeviceCount"})
    @Expose
	@Nullable
    public Integer detectionScriptPendingDeviceCount;

    /**
     * The Issue Detected Device Count.
     * Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "issueDetectedDeviceCount", alternate = {"IssueDetectedDeviceCount"})
    @Expose
	@Nullable
    public Integer issueDetectedDeviceCount;

    /**
     * The Last Script Run Date Time.
     * Last run time for the script across all devices
     */
    @SerializedName(value = "lastScriptRunDateTime", alternate = {"LastScriptRunDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastScriptRunDateTime;

    /**
     * The No Issue Detected Device Count.
     * Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "noIssueDetectedDeviceCount", alternate = {"NoIssueDetectedDeviceCount"})
    @Expose
	@Nullable
    public Integer noIssueDetectedDeviceCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
