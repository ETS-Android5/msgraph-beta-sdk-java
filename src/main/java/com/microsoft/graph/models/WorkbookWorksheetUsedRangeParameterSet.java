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
 * The class for the Workbook Worksheet Used Range Parameter Set.
 */
public class WorkbookWorksheetUsedRangeParameterSet {
    /**
     * The values Only.
     * 
     */
    @SerializedName(value = "valuesOnly", alternate = {"ValuesOnly"})
    @Expose
	@Nullable
    public Boolean valuesOnly;


    /**
     * Instiaciates a new WorkbookWorksheetUsedRangeParameterSet
     */
    public WorkbookWorksheetUsedRangeParameterSet() {}
    /**
     * Instiaciates a new WorkbookWorksheetUsedRangeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookWorksheetUsedRangeParameterSet(@Nonnull final WorkbookWorksheetUsedRangeParameterSetBuilder builder) {
        this.valuesOnly = builder.valuesOnly;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookWorksheetUsedRangeParameterSetBuilder newBuilder() {
        return new WorkbookWorksheetUsedRangeParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookWorksheetUsedRangeParameterSet
     */
    public static final class WorkbookWorksheetUsedRangeParameterSetBuilder {
        /**
         * The valuesOnly parameter value
         */
        @Nullable
        protected Boolean valuesOnly;
        /**
         * Sets the ValuesOnly
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookWorksheetUsedRangeParameterSetBuilder withValuesOnly(@Nullable final Boolean val) {
            this.valuesOnly = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookWorksheetUsedRangeParameterSetBuilder
         */
        @Nullable
        protected WorkbookWorksheetUsedRangeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookWorksheetUsedRangeParameterSet build() {
            return new WorkbookWorksheetUsedRangeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.valuesOnly != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("valuesOnly", valuesOnly));
        }
        return result;
    }
}
