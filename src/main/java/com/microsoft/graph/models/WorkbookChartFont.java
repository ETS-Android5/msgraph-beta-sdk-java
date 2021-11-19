// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Font.
 */
public class WorkbookChartFont extends Entity implements IJsonBackedObject {


    /**
     * The Bold.
     * 
     */
    @SerializedName(value = "bold", alternate = {"Bold"})
    @Expose
	@Nullable
    public Boolean bold;

    /**
     * The Color.
     * 
     */
    @SerializedName(value = "color", alternate = {"Color"})
    @Expose
	@Nullable
    public String color;

    /**
     * The Italic.
     * 
     */
    @SerializedName(value = "italic", alternate = {"Italic"})
    @Expose
	@Nullable
    public Boolean italic;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Size.
     * 
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public Double size;

    /**
     * The Underline.
     * 
     */
    @SerializedName(value = "underline", alternate = {"Underline"})
    @Expose
	@Nullable
    public String underline;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
