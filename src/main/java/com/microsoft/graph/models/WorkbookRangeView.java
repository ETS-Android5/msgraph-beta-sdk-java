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
import com.microsoft.graph.models.WorkbookRangeView;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.WorkbookRangeViewCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View.
 */
public class WorkbookRangeView extends Entity implements IJsonBackedObject {


    /**
     * The Cell Addresses.
     * Represents the cell addresses
     */
    @SerializedName(value = "cellAddresses", alternate = {"CellAddresses"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cellAddresses;

    /**
     * The Column Count.
     * Returns the number of visible columns. Read-only.
     */
    @SerializedName(value = "columnCount", alternate = {"ColumnCount"})
    @Expose
	@Nullable
    public Integer columnCount;

    /**
     * The Formulas.
     * Represents the formula in A1-style notation.
     */
    @SerializedName(value = "formulas", alternate = {"Formulas"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement formulas;

    /**
     * The Formulas Local.
     * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     */
    @SerializedName(value = "formulasLocal", alternate = {"FormulasLocal"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement formulasLocal;

    /**
     * The Formulas R1C1.
     * Represents the formula in R1C1-style notation.
     */
    @SerializedName(value = "formulasR1C1", alternate = {"FormulasR1C1"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement formulasR1C1;

    /**
     * The Index.
     * Index of the range.
     */
    @SerializedName(value = "index", alternate = {"Index"})
    @Expose
	@Nullable
    public Integer index;

    /**
     * The Number Format.
     * Represents Excel's number format code for the given cell. Read-only.
     */
    @SerializedName(value = "numberFormat", alternate = {"NumberFormat"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numberFormat;

    /**
     * The Row Count.
     * Returns the number of visible rows. Read-only.
     */
    @SerializedName(value = "rowCount", alternate = {"RowCount"})
    @Expose
	@Nullable
    public Integer rowCount;

    /**
     * The Text.
     * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text;

    /**
     * The Values.
     * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement values;

    /**
     * The Value Types.
     * Represents the type of data of each cell. Read-only. Possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error.
     */
    @SerializedName(value = "valueTypes", alternate = {"ValueTypes"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement valueTypes;

    /**
     * The Rows.
     * Represents a collection of range views associated with the range. Read-only. Read-only.
     */
    @SerializedName(value = "rows", alternate = {"Rows"})
    @Expose
	@Nullable
    public WorkbookRangeViewCollectionPage rows;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("rows")) {
            rows = serializer.deserializeObject(json.get("rows"), WorkbookRangeViewCollectionPage.class);
        }
    }
}
