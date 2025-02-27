// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookRange;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Row Parameter Set.
 */
public class WorkbookRangeRowParameterSet {
    /**
     * The row.
     * 
     */
    @SerializedName(value = "row", alternate = {"Row"})
    @Expose
	@Nullable
    public Integer row;


    /**
     * Instiaciates a new WorkbookRangeRowParameterSet
     */
    public WorkbookRangeRowParameterSet() {}
    /**
     * Instiaciates a new WorkbookRangeRowParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookRangeRowParameterSet(@Nonnull final WorkbookRangeRowParameterSetBuilder builder) {
        this.row = builder.row;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookRangeRowParameterSetBuilder newBuilder() {
        return new WorkbookRangeRowParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookRangeRowParameterSet
     */
    public static final class WorkbookRangeRowParameterSetBuilder {
        /**
         * The row parameter value
         */
        @Nullable
        protected Integer row;
        /**
         * Sets the Row
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookRangeRowParameterSetBuilder withRow(@Nullable final Integer val) {
            this.row = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookRangeRowParameterSetBuilder
         */
        @Nullable
        protected WorkbookRangeRowParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookRangeRowParameterSet build() {
            return new WorkbookRangeRowParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.row != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("row", row));
        }
        return result;
    }
}
