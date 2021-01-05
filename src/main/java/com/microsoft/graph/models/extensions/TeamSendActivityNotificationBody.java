// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.TeamworkActivityTopic;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.TeamworkNotificationRecipient;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Send Activity Notification Body.
 */
public class TeamSendActivityNotificationBody {

    /**
     * The topic.
     * 
     */
    @SerializedName(value = "topic", alternate = {"Topic"})
    @Expose
    public TeamworkActivityTopic topic;

    /**
     * The activity Type.
     * 
     */
    @SerializedName(value = "activityType", alternate = {"ActivityType"})
    @Expose
    public String activityType;

    /**
     * The chain Id.
     * 
     */
    @SerializedName(value = "chainId", alternate = {"ChainId"})
    @Expose
    public Long chainId;

    /**
     * The preview Text.
     * 
     */
    @SerializedName(value = "previewText", alternate = {"PreviewText"})
    @Expose
    public ItemBody previewText;

    /**
     * The template Parameters.
     * 
     */
    @SerializedName(value = "templateParameters", alternate = {"TemplateParameters"})
    @Expose
    public java.util.List<KeyValuePair> templateParameters;

    /**
     * The recipient.
     * 
     */
    @SerializedName(value = "recipient", alternate = {"Recipient"})
    @Expose
    public TeamworkNotificationRecipient recipient;


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
