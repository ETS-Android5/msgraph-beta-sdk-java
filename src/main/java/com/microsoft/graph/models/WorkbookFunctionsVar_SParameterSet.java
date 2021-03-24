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
 * The class for the Workbook Functions Var_SParameter Set.
 */
public class WorkbookFunctionsVar_SParameterSet {
    /**
     * The values.
     * 
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement values;


    /**
     * Instiaciates a new WorkbookFunctionsVar_SParameterSet
     */
    public WorkbookFunctionsVar_SParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsVar_SParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsVar_SParameterSet(@Nonnull final WorkbookFunctionsVar_SParameterSetBuilder builder) {
        this.values = builder.values;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsVar_SParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsVar_SParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsVar_SParameterSet
     */
    public static final class WorkbookFunctionsVar_SParameterSetBuilder {
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
        public WorkbookFunctionsVar_SParameterSetBuilder withValues(@Nullable final com.google.gson.JsonElement val) {
            this.values = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsVar_SParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsVar_SParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsVar_SParameterSet build() {
            return new WorkbookFunctionsVar_SParameterSet(this);
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
