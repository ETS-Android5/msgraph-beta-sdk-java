// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RunState;
import com.microsoft.graph.models.extensions.MobileAppTroubleshootingHistoryItem;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Troubleshooting App Target History.
 */
public class MobileAppTroubleshootingAppTargetHistory extends MobileAppTroubleshootingHistoryItem implements IJsonBackedObject {


    /**
     * The Error Code.
     * Error code for the failure, empty if no failure.
     */
    @SerializedName(value = "errorCode", alternate = {"ErrorCode"})
    @Expose
    public String errorCode;

    /**
     * The Run State.
     * Status of the item.
     */
    @SerializedName(value = "runState", alternate = {"RunState"})
    @Expose
    public RunState runState;

    /**
     * The Security Group Id.
     * AAD security group id to which it was targeted.
     */
    @SerializedName(value = "securityGroupId", alternate = {"SecurityGroupId"})
    @Expose
    public String securityGroupId;


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
