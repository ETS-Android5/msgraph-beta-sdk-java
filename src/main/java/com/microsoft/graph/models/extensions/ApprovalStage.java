// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Stage.
 */
public class ApprovalStage implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Approval Stage Time Out In Days.
     * 
     */
    @SerializedName(value = "approvalStageTimeOutInDays", alternate = {"ApprovalStageTimeOutInDays"})
    @Expose
    public Integer approvalStageTimeOutInDays;

    /**
     * The Escalation Approvers.
     * 
     */
    @SerializedName(value = "escalationApprovers", alternate = {"EscalationApprovers"})
    @Expose
    public java.util.List<UserSet> escalationApprovers;

    /**
     * The Escalation Time In Minutes.
     * 
     */
    @SerializedName(value = "escalationTimeInMinutes", alternate = {"EscalationTimeInMinutes"})
    @Expose
    public Integer escalationTimeInMinutes;

    /**
     * The Is Approver Justification Required.
     * 
     */
    @SerializedName(value = "isApproverJustificationRequired", alternate = {"IsApproverJustificationRequired"})
    @Expose
    public Boolean isApproverJustificationRequired;

    /**
     * The Is Escalation Enabled.
     * 
     */
    @SerializedName(value = "isEscalationEnabled", alternate = {"IsEscalationEnabled"})
    @Expose
    public Boolean isEscalationEnabled;

    /**
     * The Primary Approvers.
     * 
     */
    @SerializedName(value = "primaryApprovers", alternate = {"PrimaryApprovers"})
    @Expose
    public java.util.List<UserSet> primaryApprovers;


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
