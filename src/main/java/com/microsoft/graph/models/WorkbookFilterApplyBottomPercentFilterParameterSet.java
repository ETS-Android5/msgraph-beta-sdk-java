// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Bottom Percent Filter Parameter Set.
 */
public class WorkbookFilterApplyBottomPercentFilterParameterSet {
    /**
     * The percent.
     * 
     */
    @SerializedName(value = "percent", alternate = {"Percent"})
    @Expose
	@Nullable
    public Integer percent;


    /**
     * Instiaciates a new WorkbookFilterApplyBottomPercentFilterParameterSet
     */
    public WorkbookFilterApplyBottomPercentFilterParameterSet() {}
    /**
     * Instiaciates a new WorkbookFilterApplyBottomPercentFilterParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFilterApplyBottomPercentFilterParameterSet(@Nonnull final WorkbookFilterApplyBottomPercentFilterParameterSetBuilder builder) {
        this.percent = builder.percent;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFilterApplyBottomPercentFilterParameterSetBuilder newBuilder() {
        return new WorkbookFilterApplyBottomPercentFilterParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFilterApplyBottomPercentFilterParameterSet
     */
    public static final class WorkbookFilterApplyBottomPercentFilterParameterSetBuilder {
        /**
         * The percent parameter value
         */
        @Nullable
        protected Integer percent;
        /**
         * Sets the Percent
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyBottomPercentFilterParameterSetBuilder withPercent(@Nullable final Integer val) {
            this.percent = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFilterApplyBottomPercentFilterParameterSetBuilder
         */
        @Nullable
        protected WorkbookFilterApplyBottomPercentFilterParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFilterApplyBottomPercentFilterParameterSet build() {
            return new WorkbookFilterApplyBottomPercentFilterParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.percent != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("percent", percent));
        }
        return result;
    }
}
