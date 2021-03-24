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
 * The class for the Workbook Functions Areas Parameter Set.
 */
public class WorkbookFunctionsAreasParameterSet {
    /**
     * The reference.
     * 
     */
    @SerializedName(value = "reference", alternate = {"Reference"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement reference;


    /**
     * Instiaciates a new WorkbookFunctionsAreasParameterSet
     */
    public WorkbookFunctionsAreasParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsAreasParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsAreasParameterSet(@Nonnull final WorkbookFunctionsAreasParameterSetBuilder builder) {
        this.reference = builder.reference;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsAreasParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsAreasParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsAreasParameterSet
     */
    public static final class WorkbookFunctionsAreasParameterSetBuilder {
        /**
         * The reference parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement reference;
        /**
         * Sets the Reference
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAreasParameterSetBuilder withReference(@Nullable final com.google.gson.JsonElement val) {
            this.reference = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsAreasParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsAreasParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsAreasParameterSet build() {
            return new WorkbookFunctionsAreasParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.reference != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("reference", reference));
        }
        return result;
    }
}
