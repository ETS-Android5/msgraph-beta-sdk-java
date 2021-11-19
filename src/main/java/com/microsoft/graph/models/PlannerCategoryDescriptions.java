// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Category Descriptions.
 */
public class PlannerCategoryDescriptions implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Category1.
     * 
     */
    @SerializedName(value = "category1", alternate = {"Category1"})
    @Expose
	@Nullable
    public String category1;

    /**
     * The Category10.
     * 
     */
    @SerializedName(value = "category10", alternate = {"Category10"})
    @Expose
	@Nullable
    public String category10;

    /**
     * The Category11.
     * 
     */
    @SerializedName(value = "category11", alternate = {"Category11"})
    @Expose
	@Nullable
    public String category11;

    /**
     * The Category12.
     * 
     */
    @SerializedName(value = "category12", alternate = {"Category12"})
    @Expose
	@Nullable
    public String category12;

    /**
     * The Category13.
     * 
     */
    @SerializedName(value = "category13", alternate = {"Category13"})
    @Expose
	@Nullable
    public String category13;

    /**
     * The Category14.
     * 
     */
    @SerializedName(value = "category14", alternate = {"Category14"})
    @Expose
	@Nullable
    public String category14;

    /**
     * The Category15.
     * 
     */
    @SerializedName(value = "category15", alternate = {"Category15"})
    @Expose
	@Nullable
    public String category15;

    /**
     * The Category16.
     * 
     */
    @SerializedName(value = "category16", alternate = {"Category16"})
    @Expose
	@Nullable
    public String category16;

    /**
     * The Category17.
     * 
     */
    @SerializedName(value = "category17", alternate = {"Category17"})
    @Expose
	@Nullable
    public String category17;

    /**
     * The Category18.
     * 
     */
    @SerializedName(value = "category18", alternate = {"Category18"})
    @Expose
	@Nullable
    public String category18;

    /**
     * The Category19.
     * 
     */
    @SerializedName(value = "category19", alternate = {"Category19"})
    @Expose
	@Nullable
    public String category19;

    /**
     * The Category2.
     * 
     */
    @SerializedName(value = "category2", alternate = {"Category2"})
    @Expose
	@Nullable
    public String category2;

    /**
     * The Category20.
     * 
     */
    @SerializedName(value = "category20", alternate = {"Category20"})
    @Expose
	@Nullable
    public String category20;

    /**
     * The Category21.
     * 
     */
    @SerializedName(value = "category21", alternate = {"Category21"})
    @Expose
	@Nullable
    public String category21;

    /**
     * The Category22.
     * 
     */
    @SerializedName(value = "category22", alternate = {"Category22"})
    @Expose
	@Nullable
    public String category22;

    /**
     * The Category23.
     * 
     */
    @SerializedName(value = "category23", alternate = {"Category23"})
    @Expose
	@Nullable
    public String category23;

    /**
     * The Category24.
     * 
     */
    @SerializedName(value = "category24", alternate = {"Category24"})
    @Expose
	@Nullable
    public String category24;

    /**
     * The Category25.
     * 
     */
    @SerializedName(value = "category25", alternate = {"Category25"})
    @Expose
	@Nullable
    public String category25;

    /**
     * The Category3.
     * 
     */
    @SerializedName(value = "category3", alternate = {"Category3"})
    @Expose
	@Nullable
    public String category3;

    /**
     * The Category4.
     * 
     */
    @SerializedName(value = "category4", alternate = {"Category4"})
    @Expose
	@Nullable
    public String category4;

    /**
     * The Category5.
     * 
     */
    @SerializedName(value = "category5", alternate = {"Category5"})
    @Expose
	@Nullable
    public String category5;

    /**
     * The Category6.
     * 
     */
    @SerializedName(value = "category6", alternate = {"Category6"})
    @Expose
	@Nullable
    public String category6;

    /**
     * The Category7.
     * 
     */
    @SerializedName(value = "category7", alternate = {"Category7"})
    @Expose
	@Nullable
    public String category7;

    /**
     * The Category8.
     * 
     */
    @SerializedName(value = "category8", alternate = {"Category8"})
    @Expose
	@Nullable
    public String category8;

    /**
     * The Category9.
     * 
     */
    @SerializedName(value = "category9", alternate = {"Category9"})
    @Expose
	@Nullable
    public String category9;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
