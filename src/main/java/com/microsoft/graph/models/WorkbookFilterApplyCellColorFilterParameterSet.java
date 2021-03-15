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
 * The class for the Workbook Filter Apply Cell Color Filter Parameter Set.
 */
public class WorkbookFilterApplyCellColorFilterParameterSet {
    /**
     * The color.
     * 
     */
    @SerializedName(value = "color", alternate = {"Color"})
    @Expose
	@Nullable
    public String color;


    /**
     * Instiaciates a new WorkbookFilterApplyCellColorFilterParameterSet
     */
    public WorkbookFilterApplyCellColorFilterParameterSet() {}
    /**
     * Instiaciates a new WorkbookFilterApplyCellColorFilterParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFilterApplyCellColorFilterParameterSet(@Nonnull final WorkbookFilterApplyCellColorFilterParameterSetBuilder builder) {
        this.color = builder.color;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFilterApplyCellColorFilterParameterSetBuilder newBuilder() {
        return new WorkbookFilterApplyCellColorFilterParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFilterApplyCellColorFilterParameterSet
     */
    public static final class WorkbookFilterApplyCellColorFilterParameterSetBuilder {
        /**
         * The color parameter value
         */
        @Nullable
        protected String color;
        /**
         * Sets the Color
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyCellColorFilterParameterSetBuilder withColor(@Nullable final String val) {
            this.color = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFilterApplyCellColorFilterParameterSetBuilder
         */
        @Nullable
        protected WorkbookFilterApplyCellColorFilterParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFilterApplyCellColorFilterParameterSet build() {
            return new WorkbookFilterApplyCellColorFilterParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.color != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("color", color));
        }
        return result;
    }
}
