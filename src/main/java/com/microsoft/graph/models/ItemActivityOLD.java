// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ItemActionSet;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.ItemActivityTimeSet;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.ListItem;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity OLD.
 */
public class ItemActivityOLD extends Entity implements IJsonBackedObject {


    /**
     * The Action.
     * 
     */
    @SerializedName(value = "action", alternate = {"Action"})
    @Expose
	@Nullable
    public ItemActionSet action;

    /**
     * The Actor.
     * 
     */
    @SerializedName(value = "actor", alternate = {"Actor"})
    @Expose
	@Nullable
    public IdentitySet actor;

    /**
     * The Times.
     * 
     */
    @SerializedName(value = "times", alternate = {"Times"})
    @Expose
	@Nullable
    public ItemActivityTimeSet times;

    /**
     * The Drive Item.
     * 
     */
    @SerializedName(value = "driveItem", alternate = {"DriveItem"})
    @Expose
	@Nullable
    public DriveItem driveItem;

    /**
     * The List Item.
     * 
     */
    @SerializedName(value = "listItem", alternate = {"ListItem"})
    @Expose
	@Nullable
    public ListItem listItem;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
