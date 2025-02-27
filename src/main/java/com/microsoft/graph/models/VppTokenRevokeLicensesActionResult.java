// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.VppTokenActionFailureReason;
import com.microsoft.graph.models.VppTokenActionResult;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token Revoke Licenses Action Result.
 */
public class VppTokenRevokeLicensesActionResult extends VppTokenActionResult implements IJsonBackedObject {


    /**
     * The Action Failure Reason.
     * The reason for the revoke licenses action failure. Possible values are: none, appleFailure, internalError, expiredVppToken, expiredApplePushNotificationCertificate.
     */
    @SerializedName(value = "actionFailureReason", alternate = {"ActionFailureReason"})
    @Expose
	@Nullable
    public VppTokenActionFailureReason actionFailureReason;

    /**
     * The Failed Licenses Count.
     * A count of the number of licenses that failed to revoke.
     */
    @SerializedName(value = "failedLicensesCount", alternate = {"FailedLicensesCount"})
    @Expose
	@Nullable
    public Integer failedLicensesCount;

    /**
     * The Total Licenses Count.
     * A count of the number of licenses that were attempted to revoke.
     */
    @SerializedName(value = "totalLicensesCount", alternate = {"TotalLicensesCount"})
    @Expose
	@Nullable
    public Integer totalLicensesCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
