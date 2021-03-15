// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WorkbookChartPointFormat;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point.
 */
public class WorkbookChartPoint extends Entity implements IJsonBackedObject {


    /**
     * The Value.
     * Returns the value of a chart point. Read-only.
     */
    @SerializedName(value = "value", alternate = {"Value"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement value;

    /**
     * The Format.
     * Encapsulates the format properties chart point. Read-only.
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
	@Nullable
    public WorkbookChartPointFormat format;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
