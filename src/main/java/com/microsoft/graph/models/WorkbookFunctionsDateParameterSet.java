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
 * The class for the Workbook Functions Date Parameter Set.
 */
public class WorkbookFunctionsDateParameterSet {
    /**
     * The year.
     * 
     */
    @SerializedName(value = "year", alternate = {"Year"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement year;

    /**
     * The month.
     * 
     */
    @SerializedName(value = "month", alternate = {"Month"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement month;

    /**
     * The day.
     * 
     */
    @SerializedName(value = "day", alternate = {"Day"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement day;


    /**
     * Instiaciates a new WorkbookFunctionsDateParameterSet
     */
    public WorkbookFunctionsDateParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDateParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDateParameterSet(@Nonnull final WorkbookFunctionsDateParameterSetBuilder builder) {
        this.year = builder.year;
        this.month = builder.month;
        this.day = builder.day;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDateParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDateParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDateParameterSet
     */
    public static final class WorkbookFunctionsDateParameterSetBuilder {
        /**
         * The year parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement year;
        /**
         * Sets the Year
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDateParameterSetBuilder withYear(@Nullable final com.google.gson.JsonElement val) {
            this.year = val;
            return this;
        }
        /**
         * The month parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement month;
        /**
         * Sets the Month
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDateParameterSetBuilder withMonth(@Nullable final com.google.gson.JsonElement val) {
            this.month = val;
            return this;
        }
        /**
         * The day parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement day;
        /**
         * Sets the Day
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDateParameterSetBuilder withDay(@Nullable final com.google.gson.JsonElement val) {
            this.day = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsDateParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsDateParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDateParameterSet build() {
            return new WorkbookFunctionsDateParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.year != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("year", year));
        }
        if(this.month != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("month", month));
        }
        if(this.day != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("day", day));
        }
        return result;
    }
}
