// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AccessReviewScope;
import com.microsoft.graph.models.extensions.AccessReviewInstanceDecisionItem;
import com.microsoft.graph.models.extensions.AccessReviewScheduleDefinition;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceDecisionItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance.
 */
public class AccessReviewInstance extends Entity implements IJsonBackedObject {


    /**
     * The End Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Scope.
     * 
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
    public AccessReviewScope scope;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public String status;

    /**
     * The Decisions.
     * 
     */
    @SerializedName(value = "decisions", alternate = {"Decisions"})
    @Expose
    public AccessReviewInstanceDecisionItemCollectionPage decisions;

    /**
     * The Definition.
     * 
     */
    @SerializedName(value = "definition", alternate = {"Definition"})
    @Expose
    public AccessReviewScheduleDefinition definition;


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


        if (json.has("decisions")) {
            decisions = serializer.deserializeObject(json.get("decisions").toString(), AccessReviewInstanceDecisionItemCollectionPage.class);
        }
    }
}
