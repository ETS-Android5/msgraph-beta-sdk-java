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
 * The class for the Workbook Functions Nominal Parameter Set.
 */
public class WorkbookFunctionsNominalParameterSet {
    /**
     * The effect Rate.
     * 
     */
    @SerializedName(value = "effectRate", alternate = {"EffectRate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement effectRate;

    /**
     * The npery.
     * 
     */
    @SerializedName(value = "npery", alternate = {"Npery"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement npery;


    /**
     * Instiaciates a new WorkbookFunctionsNominalParameterSet
     */
    public WorkbookFunctionsNominalParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsNominalParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsNominalParameterSet(@Nonnull final WorkbookFunctionsNominalParameterSetBuilder builder) {
        this.effectRate = builder.effectRate;
        this.npery = builder.npery;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsNominalParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsNominalParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsNominalParameterSet
     */
    public static final class WorkbookFunctionsNominalParameterSetBuilder {
        /**
         * The effectRate parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement effectRate;
        /**
         * Sets the EffectRate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNominalParameterSetBuilder withEffectRate(@Nullable final com.google.gson.JsonElement val) {
            this.effectRate = val;
            return this;
        }
        /**
         * The npery parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement npery;
        /**
         * Sets the Npery
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNominalParameterSetBuilder withNpery(@Nullable final com.google.gson.JsonElement val) {
            this.npery = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsNominalParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsNominalParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsNominalParameterSet build() {
            return new WorkbookFunctionsNominalParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.effectRate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("effectRate", effectRate));
        }
        if(this.npery != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("npery", npery));
        }
        return result;
    }
}
