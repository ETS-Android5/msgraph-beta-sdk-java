// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CaseAction;
import com.microsoft.graph.models.generated.CaseOperationStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Index Operation.
 */
public class CaseIndexOperation extends Entity implements IJsonBackedObject {


    /**
     * The Action.
     * 
     */
    @SerializedName(value = "action", alternate = {"Action"})
    @Expose
    public CaseAction action;

    /**
     * The Completed Date Time.
     * 
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
    public java.util.Calendar completedDateTime;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Percent Progress.
     * 
     */
    @SerializedName(value = "percentProgress", alternate = {"PercentProgress"})
    @Expose
    public Integer percentProgress;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public CaseOperationStatus status;


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
