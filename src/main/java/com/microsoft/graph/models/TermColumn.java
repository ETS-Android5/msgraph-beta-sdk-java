// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.termstore.models.Term;
import com.microsoft.graph.termstore.models.Set;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Term Column.
 */
public class TermColumn implements IJsonBackedObject {

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
     * The Allow Multiple Values.
     * Specifies whether the column will allow more than one value
     */
    @SerializedName(value = "allowMultipleValues", alternate = {"AllowMultipleValues"})
    @Expose
	@Nullable
    public Boolean allowMultipleValues;

    /**
     * The Show Fully Qualified Name.
     * Specifies whether to display the entire term path or only the term label.
     */
    @SerializedName(value = "showFullyQualifiedName", alternate = {"ShowFullyQualifiedName"})
    @Expose
	@Nullable
    public Boolean showFullyQualifiedName;

    /**
     * The Parent Term.
     * 
     */
    @SerializedName(value = "parentTerm", alternate = {"ParentTerm"})
    @Expose
	@Nullable
    public Term parentTerm;

    /**
     * The Term Set.
     * 
     */
    @SerializedName(value = "termSet", alternate = {"TermSet"})
    @Expose
	@Nullable
    public Set termSet;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
