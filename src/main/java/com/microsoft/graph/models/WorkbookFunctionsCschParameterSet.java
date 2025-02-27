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
 * The class for the Workbook Functions Csch Parameter Set.
 */
public class WorkbookFunctionsCschParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;


    /**
     * Instiaciates a new WorkbookFunctionsCschParameterSet
     */
    public WorkbookFunctionsCschParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsCschParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsCschParameterSet(@Nonnull final WorkbookFunctionsCschParameterSetBuilder builder) {
        this.number = builder.number;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsCschParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsCschParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsCschParameterSet
     */
    public static final class WorkbookFunctionsCschParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCschParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsCschParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsCschParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsCschParameterSet build() {
            return new WorkbookFunctionsCschParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        return result;
    }
}
