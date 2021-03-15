// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MobileAppActionType;
import com.microsoft.graph.models.RunState;
import com.microsoft.graph.models.MobileAppTroubleshootingHistoryItem;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Troubleshooting App State History.
 */
public class MobileAppTroubleshootingAppStateHistory extends MobileAppTroubleshootingHistoryItem implements IJsonBackedObject {


    /**
     * The Action Type.
     * Action type for Intune Application. Possible values are: unknown, installCommandSent, installed, uninstalled, userRequestedInstall.
     */
    @SerializedName(value = "actionType", alternate = {"ActionType"})
    @Expose
	@Nullable
    public MobileAppActionType actionType;

    /**
     * The Error Code.
     * Error code for the failure, empty if no failure.
     */
    @SerializedName(value = "errorCode", alternate = {"ErrorCode"})
    @Expose
	@Nullable
    public String errorCode;

    /**
     * The Run State.
     * Status of the item. Possible values are: unknown, success, fail, scriptError, pending, notApplicable.
     */
    @SerializedName(value = "runState", alternate = {"RunState"})
    @Expose
	@Nullable
    public RunState runState;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
