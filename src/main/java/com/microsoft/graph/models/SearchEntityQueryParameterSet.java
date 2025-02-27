// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.SearchRequest;
import com.microsoft.graph.models.SearchResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Entity Query Parameter Set.
 */
public class SearchEntityQueryParameterSet {
    /**
     * The requests.
     * 
     */
    @SerializedName(value = "requests", alternate = {"Requests"})
    @Expose
	@Nullable
    public java.util.List<SearchRequest> requests;


    /**
     * Instiaciates a new SearchEntityQueryParameterSet
     */
    public SearchEntityQueryParameterSet() {}
    /**
     * Instiaciates a new SearchEntityQueryParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected SearchEntityQueryParameterSet(@Nonnull final SearchEntityQueryParameterSetBuilder builder) {
        this.requests = builder.requests;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static SearchEntityQueryParameterSetBuilder newBuilder() {
        return new SearchEntityQueryParameterSetBuilder();
    }
    /**
     * Fluent builder for the SearchEntityQueryParameterSet
     */
    public static final class SearchEntityQueryParameterSetBuilder {
        /**
         * The requests parameter value
         */
        @Nullable
        protected java.util.List<SearchRequest> requests;
        /**
         * Sets the Requests
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SearchEntityQueryParameterSetBuilder withRequests(@Nullable final java.util.List<SearchRequest> val) {
            this.requests = val;
            return this;
        }
        /**
         * Instanciates a new SearchEntityQueryParameterSetBuilder
         */
        @Nullable
        protected SearchEntityQueryParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public SearchEntityQueryParameterSet build() {
            return new SearchEntityQueryParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.requests != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("requests", requests));
        }
        return result;
    }
}
