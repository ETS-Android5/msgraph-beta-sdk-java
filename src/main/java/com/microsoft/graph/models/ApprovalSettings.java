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
import com.microsoft.graph.models.ApprovalStage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Settings.
 */
public class ApprovalSettings implements IJsonBackedObject {

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
     * The Approval Mode.
     * One of NoApproval, SingleStage or Serial. The NoApproval is used when isApprovalRequired is false.
     */
    @SerializedName(value = "approvalMode", alternate = {"ApprovalMode"})
    @Expose
	@Nullable
    public String approvalMode;

    /**
     * The Approval Stages.
     * If approval is required, the one or two elements of this collection define each of the stages of approval. An empty array if no approval is required.
     */
    @SerializedName(value = "approvalStages", alternate = {"ApprovalStages"})
    @Expose
	@Nullable
    public java.util.List<ApprovalStage> approvalStages;

    /**
     * The Is Approval Required.
     * If false, then approval is not required for requests in this policy.
     */
    @SerializedName(value = "isApprovalRequired", alternate = {"IsApprovalRequired"})
    @Expose
	@Nullable
    public Boolean isApprovalRequired;

    /**
     * The Is Approval Required For Extension.
     * If false, then approval is not required for a user who already has an assignment to extend their assignment.
     */
    @SerializedName(value = "isApprovalRequiredForExtension", alternate = {"IsApprovalRequiredForExtension"})
    @Expose
	@Nullable
    public Boolean isApprovalRequiredForExtension;

    /**
     * The Is Requestor Justification Required.
     * Indicates whether the requestor is required to supply a justification in their request.
     */
    @SerializedName(value = "isRequestorJustificationRequired", alternate = {"IsRequestorJustificationRequired"})
    @Expose
	@Nullable
    public Boolean isRequestorJustificationRequired;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
