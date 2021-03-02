// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EducationAddedStudentAction;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Defaults.
 */
public class EducationAssignmentDefaults extends Entity implements IJsonBackedObject {


    /**
     * The Added Student Action.
     * Class-level default behavior for handling students who are added after the assignment is published. Possible values are: none, assignIfOpen.
     */
    @SerializedName(value = "addedStudentAction", alternate = {"AddedStudentAction"})
    @Expose
    public EducationAddedStudentAction addedStudentAction;

    /**
     * The Due Time.
     * Class-level default value for due time field. Default value is 23:59:00.
     */
    @SerializedName(value = "dueTime", alternate = {"DueTime"})
    @Expose
    public com.microsoft.graph.models.extensions.TimeOfDay dueTime;

    /**
     * The Notification Channel Url.
     * Default Teams channel to which notifications will be sent. Default value is null.
     */
    @SerializedName(value = "notificationChannelUrl", alternate = {"NotificationChannelUrl"})
    @Expose
    public String notificationChannelUrl;


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
