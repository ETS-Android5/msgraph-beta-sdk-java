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
import com.microsoft.graph.models.ErrorCode;
import com.microsoft.graph.models.PolicySetStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Item.
 */
public class PolicySetItem extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Creation time of the PolicySetItem.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Display Name.
     * DisplayName of the PolicySetItem.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Error Code.
     * Error code if any occured. Possible values are: noError, unauthorized, notFound, deleted.
     */
    @SerializedName(value = "errorCode", alternate = {"ErrorCode"})
    @Expose
	@Nullable
    public ErrorCode errorCode;

    /**
     * The Guided Deployment Tags.
     * Tags of the guided deployment
     */
    @SerializedName(value = "guidedDeploymentTags", alternate = {"GuidedDeploymentTags"})
    @Expose
	@Nullable
    public java.util.List<String> guidedDeploymentTags;

    /**
     * The Item Type.
     * policySetType of the PolicySetItem.
     */
    @SerializedName(value = "itemType", alternate = {"ItemType"})
    @Expose
	@Nullable
    public String itemType;

    /**
     * The Last Modified Date Time.
     * Last modified time of the PolicySetItem.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Payload Id.
     * PayloadId of the PolicySetItem.
     */
    @SerializedName(value = "payloadId", alternate = {"PayloadId"})
    @Expose
	@Nullable
    public String payloadId;

    /**
     * The Status.
     * Status of the PolicySetItem. Possible values are: unknown, validating, partialSuccess, success, error, notAssigned.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public PolicySetStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
