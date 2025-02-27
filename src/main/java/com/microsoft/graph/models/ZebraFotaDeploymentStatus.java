// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ZebraFotaDeploymentState;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Zebra Fota Deployment Status.
 */
public class ZebraFotaDeploymentStatus implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Cancel Requested.
     * A boolean that indicates if a cancellation was requested on the deployment. NOTE: A cancellation request does not guarantee that the deployment was canceled.
     */
    @SerializedName(value = "cancelRequested", alternate = {"CancelRequested"})
    @Expose
	@Nullable
    public Boolean cancelRequested;

    /**
     * The Complete Or Canceled Date Time.
     * The date and time when this deployment was completed or canceled. The actual date time is determined by the value of state. If the state is canceled, this property holds the cancellation date/time. If the the state is completed, this property holds the completion date/time. If the deployment is not completed before the deployment end date, then completed date/time and end date/time are the same. This is always in the deployment timezone. Note: An installation that is in progress can continue past the deployment end date.
     */
    @SerializedName(value = "completeOrCanceledDateTime", alternate = {"CompleteOrCanceledDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completeOrCanceledDateTime;

    /**
     * The Last Updated Date Time.
     * Date and time when the deployment status was updated from Zebra
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdatedDateTime;

    /**
     * The State.
     * See zebraFotaDeploymentState enum for possible values. Possible values are: pendingCreation, createFailed, created, inProgress, completed, pendingCancel, canceled, unknownFutureValue.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public ZebraFotaDeploymentState state;

    /**
     * The Total Awaiting Install.
     * An integer that indicates the total number of devices where installation was successful.
     */
    @SerializedName(value = "totalAwaitingInstall", alternate = {"TotalAwaitingInstall"})
    @Expose
	@Nullable
    public Integer totalAwaitingInstall;

    /**
     * The Total Canceled.
     * An integer that indicates the total number of devices where installation was canceled.
     */
    @SerializedName(value = "totalCanceled", alternate = {"TotalCanceled"})
    @Expose
	@Nullable
    public Integer totalCanceled;

    /**
     * The Total Created.
     * An integer that indicates the total number of devices that have a job in the CREATED state. Typically indicates jobs that did not reach the devices.
     */
    @SerializedName(value = "totalCreated", alternate = {"TotalCreated"})
    @Expose
	@Nullable
    public Integer totalCreated;

    /**
     * The Total Devices.
     * An integer that indicates the total number of devices in the deployment.
     */
    @SerializedName(value = "totalDevices", alternate = {"TotalDevices"})
    @Expose
	@Nullable
    public Integer totalDevices;

    /**
     * The Total Downloading.
     * An integer that indicates the total number of devices where installation was successful.
     */
    @SerializedName(value = "totalDownloading", alternate = {"TotalDownloading"})
    @Expose
	@Nullable
    public Integer totalDownloading;

    /**
     * The Total Failed Download.
     * An integer that indicates the total number of devices that have failed to download the new OS file.
     */
    @SerializedName(value = "totalFailedDownload", alternate = {"TotalFailedDownload"})
    @Expose
	@Nullable
    public Integer totalFailedDownload;

    /**
     * The Total Failed Install.
     * An integer that indicates the total number of devices that have failed to install the new OS file.
     */
    @SerializedName(value = "totalFailedInstall", alternate = {"TotalFailedInstall"})
    @Expose
	@Nullable
    public Integer totalFailedInstall;

    /**
     * The Total Scheduled.
     * An integer that indicates the total number of devices that received the json and are scheduled.
     */
    @SerializedName(value = "totalScheduled", alternate = {"TotalScheduled"})
    @Expose
	@Nullable
    public Integer totalScheduled;

    /**
     * The Total Succeeded Install.
     * An integer that indicates the total number of devices where installation was successful.
     */
    @SerializedName(value = "totalSucceededInstall", alternate = {"TotalSucceededInstall"})
    @Expose
	@Nullable
    public Integer totalSucceededInstall;

    /**
     * The Total Unknown.
     * An integer that indicates the total number of devices where no deployment status or end state has not received, even after the scheduled end date was reached.
     */
    @SerializedName(value = "totalUnknown", alternate = {"TotalUnknown"})
    @Expose
	@Nullable
    public Integer totalUnknown;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
