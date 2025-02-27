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
 * The class for the Workbook Range Rows Above Parameter Set.
 */
public class WorkbookRangeRowsAboveParameterSet {
    /**
     * The count.
     * 
     */
    @SerializedName(value = "count", alternate = {"Count"})
    @Expose
	@Nullable
    public Integer count;


    /**
     * Instiaciates a new WorkbookRangeRowsAboveParameterSet
     */
    public WorkbookRangeRowsAboveParameterSet() {}
    /**
     * Instiaciates a new WorkbookRangeRowsAboveParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookRangeRowsAboveParameterSet(@Nonnull final WorkbookRangeRowsAboveParameterSetBuilder builder) {
        this.count = builder.count;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookRangeRowsAboveParameterSetBuilder newBuilder() {
        return new WorkbookRangeRowsAboveParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookRangeRowsAboveParameterSet
     */
    public static final class WorkbookRangeRowsAboveParameterSetBuilder {
        /**
         * The count parameter value
         */
        @Nullable
        protected Integer count;
        /**
         * Sets the Count
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookRangeRowsAboveParameterSetBuilder withCount(@Nullable final Integer val) {
            this.count = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookRangeRowsAboveParameterSetBuilder
         */
        @Nullable
        protected WorkbookRangeRowsAboveParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookRangeRowsAboveParameterSet build() {
            return new WorkbookRangeRowsAboveParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.count != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("count", count));
        }
        return result;
    }
}
