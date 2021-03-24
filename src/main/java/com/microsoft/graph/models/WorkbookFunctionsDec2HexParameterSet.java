// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Dec2Hex Parameter Set.
 */
public class WorkbookFunctionsDec2HexParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The places.
     * 
     */
    @SerializedName(value = "places", alternate = {"Places"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement places;


    /**
     * Instiaciates a new WorkbookFunctionsDec2HexParameterSet
     */
    public WorkbookFunctionsDec2HexParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDec2HexParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDec2HexParameterSet(@Nonnull final WorkbookFunctionsDec2HexParameterSetBuilder builder) {
        this.number = builder.number;
        this.places = builder.places;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDec2HexParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDec2HexParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDec2HexParameterSet
     */
    public static final class WorkbookFunctionsDec2HexParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDec2HexParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The places parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement places;
        /**
         * Sets the Places
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDec2HexParameterSetBuilder withPlaces(@Nullable final com.google.gson.JsonElement val) {
            this.places = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsDec2HexParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsDec2HexParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDec2HexParameterSet build() {
            return new WorkbookFunctionsDec2HexParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.places != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("places", places));
        }
        return result;
    }
}
