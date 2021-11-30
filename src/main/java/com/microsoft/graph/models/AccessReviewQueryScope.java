// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AccessReviewScope;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Query Scope.
 */
public class AccessReviewQueryScope extends AccessReviewScope implements IJsonBackedObject {


    /**
     * The Query.
     * The query representing what will be reviewed in an access review.
     */
    @SerializedName(value = "query", alternate = {"Query"})
    @Expose
	@Nullable
    public String query;

    /**
     * The Query Root.
     * In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query is specified. For example, ./manager.
     */
    @SerializedName(value = "queryRoot", alternate = {"QueryRoot"})
    @Expose
	@Nullable
    public String queryRoot;

    /**
     * The Query Type.
     * Indicates the type of query. Types include MicrosoftGraph and ARM.
     */
    @SerializedName(value = "queryType", alternate = {"QueryType"})
    @Expose
	@Nullable
    public String queryType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
