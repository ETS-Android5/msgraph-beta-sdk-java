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
import com.microsoft.graph.models.RestrictionAction;
import com.microsoft.graph.models.RestrictionTrigger;
import com.microsoft.graph.models.DlpActionInfo;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Restriction Action.
 */
public class DeviceRestrictionAction extends DlpActionInfo implements IJsonBackedObject {


    /**
     * The Message.
     * 
     */
    @SerializedName(value = "message", alternate = {"Message"})
    @Expose
	@Nullable
    public String message;

    /**
     * The Restriction Action.
     * 
     */
    @SerializedName(value = "restrictionAction", alternate = {"RestrictionAction"})
    @Expose
	@Nullable
    public RestrictionAction restrictionAction;

    /**
     * The Triggers.
     * 
     */
    @SerializedName(value = "triggers", alternate = {"Triggers"})
    @Expose
	@Nullable
    public java.util.List<RestrictionTrigger> triggers;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
