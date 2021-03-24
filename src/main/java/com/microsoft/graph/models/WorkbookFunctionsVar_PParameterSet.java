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
 * The class for the Workbook Functions Var_PParameter Set.
 */
public class WorkbookFunctionsVar_PParameterSet {
    /**
     * The values.
     * 
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement values;


    /**
     * Instiaciates a new WorkbookFunctionsVar_PParameterSet
     */
    public WorkbookFunctionsVar_PParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsVar_PParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsVar_PParameterSet(@Nonnull final WorkbookFunctionsVar_PParameterSetBuilder builder) {
        this.values = builder.values;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsVar_PParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsVar_PParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsVar_PParameterSet
     */
    public static final class WorkbookFunctionsVar_PParameterSetBuilder {
        /**
         * The values parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement values;
        /**
         * Sets the Values
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVar_PParameterSetBuilder withValues(@Nullable final com.google.gson.JsonElement val) {
            this.values = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsVar_PParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsVar_PParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsVar_PParameterSet build() {
            return new WorkbookFunctionsVar_PParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.values != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("values", values));
        }
        return result;
    }
}
