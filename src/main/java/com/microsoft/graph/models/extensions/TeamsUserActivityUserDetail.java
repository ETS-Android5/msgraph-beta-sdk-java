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
 * The class for the Teams User Activity User Detail.
 */
public class TeamsUserActivityUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName("reportRefreshDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName("lastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly lastActivityDate;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName("isDeleted")
    @Expose
    public Boolean isDeleted;

    /**
     * The Deleted Date.
     * 
     */
    @SerializedName("deletedDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly deletedDate;

    /**
     * The Assigned Products.
     * 
     */
    @SerializedName("assignedProducts")
    @Expose
    public java.util.List<String> assignedProducts;

    /**
     * The Team Chat Message Count.
     * 
     */
    @SerializedName("teamChatMessageCount")
    @Expose
    public Long teamChatMessageCount;

    /**
     * The Private Chat Message Count.
     * 
     */
    @SerializedName("privateChatMessageCount")
    @Expose
    public Long privateChatMessageCount;

    /**
     * The Call Count.
     * 
     */
    @SerializedName("callCount")
    @Expose
    public Long callCount;

    /**
     * The Meeting Count.
     * 
     */
    @SerializedName("meetingCount")
    @Expose
    public Long meetingCount;

    /**
     * The Has Other Action.
     * 
     */
    @SerializedName("hasOtherAction")
    @Expose
    public Boolean hasOtherAction;

    /**
     * The Report Period.
     * 
     */
    @SerializedName("reportPeriod")
    @Expose
    public String reportPeriod;


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
