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
 * The class for the Workbook Functions Time Parameter Set.
 */
public class WorkbookFunctionsTimeParameterSet {
    /**
     * The hour.
     * 
     */
    @SerializedName(value = "hour", alternate = {"Hour"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement hour;

    /**
     * The minute.
     * 
     */
    @SerializedName(value = "minute", alternate = {"Minute"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement minute;

    /**
     * The second.
     * 
     */
    @SerializedName(value = "second", alternate = {"Second"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement second;


    /**
     * Instiaciates a new WorkbookFunctionsTimeParameterSet
     */
    public WorkbookFunctionsTimeParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsTimeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsTimeParameterSet(@Nonnull final WorkbookFunctionsTimeParameterSetBuilder builder) {
        this.hour = builder.hour;
        this.minute = builder.minute;
        this.second = builder.second;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsTimeParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsTimeParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsTimeParameterSet
     */
    public static final class WorkbookFunctionsTimeParameterSetBuilder {
        /**
         * The hour parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement hour;
        /**
         * Sets the Hour
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTimeParameterSetBuilder withHour(@Nullable final com.google.gson.JsonElement val) {
            this.hour = val;
            return this;
        }
        /**
         * The minute parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement minute;
        /**
         * Sets the Minute
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTimeParameterSetBuilder withMinute(@Nullable final com.google.gson.JsonElement val) {
            this.minute = val;
            return this;
        }
        /**
         * The second parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement second;
        /**
         * Sets the Second
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTimeParameterSetBuilder withSecond(@Nullable final com.google.gson.JsonElement val) {
            this.second = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsTimeParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsTimeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsTimeParameterSet build() {
            return new WorkbookFunctionsTimeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.hour != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("hour", hour));
        }
        if(this.minute != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("minute", minute));
        }
        if(this.second != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("second", second));
        }
        return result;
    }
}
