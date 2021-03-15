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
 * The class for the Workbook Functions Work Day Parameter Set.
 */
public class WorkbookFunctionsWorkDayParameterSet {
    /**
     * The start Date.
     * 
     */
    @SerializedName(value = "startDate", alternate = {"StartDate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startDate;

    /**
     * The days.
     * 
     */
    @SerializedName(value = "days", alternate = {"Days"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement days;

    /**
     * The holidays.
     * 
     */
    @SerializedName(value = "holidays", alternate = {"Holidays"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement holidays;


    /**
     * Instiaciates a new WorkbookFunctionsWorkDayParameterSet
     */
    public WorkbookFunctionsWorkDayParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsWorkDayParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsWorkDayParameterSet(@Nonnull final WorkbookFunctionsWorkDayParameterSetBuilder builder) {
        this.startDate = builder.startDate;
        this.days = builder.days;
        this.holidays = builder.holidays;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsWorkDayParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsWorkDayParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsWorkDayParameterSet
     */
    public static final class WorkbookFunctionsWorkDayParameterSetBuilder {
        /**
         * The startDate parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement startDate;
        /**
         * Sets the StartDate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsWorkDayParameterSetBuilder withStartDate(@Nullable final com.google.gson.JsonElement val) {
            this.startDate = val;
            return this;
        }
        /**
         * The days parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement days;
        /**
         * Sets the Days
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsWorkDayParameterSetBuilder withDays(@Nullable final com.google.gson.JsonElement val) {
            this.days = val;
            return this;
        }
        /**
         * The holidays parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement holidays;
        /**
         * Sets the Holidays
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsWorkDayParameterSetBuilder withHolidays(@Nullable final com.google.gson.JsonElement val) {
            this.holidays = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsWorkDayParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsWorkDayParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsWorkDayParameterSet build() {
            return new WorkbookFunctionsWorkDayParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.startDate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDate", startDate));
        }
        if(this.days != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("days", days));
        }
        if(this.holidays != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("holidays", holidays));
        }
        return result;
    }
}
