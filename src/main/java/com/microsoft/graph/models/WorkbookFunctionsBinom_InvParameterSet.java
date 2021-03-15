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
 * The class for the Workbook Functions Binom_Inv Parameter Set.
 */
public class WorkbookFunctionsBinom_InvParameterSet {
    /**
     * The trials.
     * 
     */
    @SerializedName(value = "trials", alternate = {"Trials"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement trials;

    /**
     * The probability S.
     * 
     */
    @SerializedName(value = "probabilityS", alternate = {"ProbabilityS"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement probabilityS;

    /**
     * The alpha.
     * 
     */
    @SerializedName(value = "alpha", alternate = {"Alpha"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement alpha;


    /**
     * Instiaciates a new WorkbookFunctionsBinom_InvParameterSet
     */
    public WorkbookFunctionsBinom_InvParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsBinom_InvParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsBinom_InvParameterSet(@Nonnull final WorkbookFunctionsBinom_InvParameterSetBuilder builder) {
        this.trials = builder.trials;
        this.probabilityS = builder.probabilityS;
        this.alpha = builder.alpha;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsBinom_InvParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsBinom_InvParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsBinom_InvParameterSet
     */
    public static final class WorkbookFunctionsBinom_InvParameterSetBuilder {
        /**
         * The trials parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement trials;
        /**
         * Sets the Trials
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBinom_InvParameterSetBuilder withTrials(@Nullable final com.google.gson.JsonElement val) {
            this.trials = val;
            return this;
        }
        /**
         * The probabilityS parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement probabilityS;
        /**
         * Sets the ProbabilityS
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBinom_InvParameterSetBuilder withProbabilityS(@Nullable final com.google.gson.JsonElement val) {
            this.probabilityS = val;
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
        public WorkbookFunctionsBinom_InvParameterSetBuilder withAlpha(@Nullable final com.google.gson.JsonElement val) {
            this.alpha = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsBinom_InvParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsBinom_InvParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsBinom_InvParameterSet build() {
            return new WorkbookFunctionsBinom_InvParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.trials != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("trials", trials));
        }
        if(this.probabilityS != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("probabilityS", probabilityS));
        }
        if(this.alpha != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("alpha", alpha));
        }
        return result;
    }
}
