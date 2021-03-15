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
 * The class for the Workbook Functions Gamma_Inv Parameter Set.
 */
public class WorkbookFunctionsGamma_InvParameterSet {
    /**
     * The probability.
     * 
     */
    @SerializedName(value = "probability", alternate = {"Probability"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement probability;

    /**
     * The alpha.
     * 
     */
    @SerializedName(value = "alpha", alternate = {"Alpha"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement alpha;

    /**
     * The beta.
     * 
     */
    @SerializedName(value = "beta", alternate = {"Beta"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement beta;


    /**
     * Instiaciates a new WorkbookFunctionsGamma_InvParameterSet
     */
    public WorkbookFunctionsGamma_InvParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsGamma_InvParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsGamma_InvParameterSet(@Nonnull final WorkbookFunctionsGamma_InvParameterSetBuilder builder) {
        this.probability = builder.probability;
        this.alpha = builder.alpha;
        this.beta = builder.beta;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsGamma_InvParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsGamma_InvParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsGamma_InvParameterSet
     */
    public static final class WorkbookFunctionsGamma_InvParameterSetBuilder {
        /**
         * The probability parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement probability;
        /**
         * Sets the Probability
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsGamma_InvParameterSetBuilder withProbability(@Nullable final com.google.gson.JsonElement val) {
            this.probability = val;
            return this;
        }
        /**
         * The alpha parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement alpha;
        /**
         * Sets the Alpha
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsGamma_InvParameterSetBuilder withAlpha(@Nullable final com.google.gson.JsonElement val) {
            this.alpha = val;
            return this;
        }
        /**
         * The beta parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement beta;
        /**
         * Sets the Beta
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsGamma_InvParameterSetBuilder withBeta(@Nullable final com.google.gson.JsonElement val) {
            this.beta = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsGamma_InvParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsGamma_InvParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsGamma_InvParameterSet build() {
            return new WorkbookFunctionsGamma_InvParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.probability != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("probability", probability));
        }
        if(this.alpha != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("alpha", alpha));
        }
        if(this.beta != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("beta", beta));
        }
        return result;
    }
}
