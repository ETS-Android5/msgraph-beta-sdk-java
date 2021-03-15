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
 * The class for the Workbook Functions Beta_Dist Parameter Set.
 */
public class WorkbookFunctionsBeta_DistParameterSet {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;

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
     * The cumulative.
     * 
     */
    @SerializedName(value = "cumulative", alternate = {"Cumulative"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cumulative;

    /**
     * The a.
     * 
     */
    @SerializedName(value = "a", alternate = {"A"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement a;

    /**
     * The b.
     * 
     */
    @SerializedName(value = "b", alternate = {"B"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement b;


    /**
     * Instiaciates a new WorkbookFunctionsBeta_DistParameterSet
     */
    public WorkbookFunctionsBeta_DistParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsBeta_DistParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsBeta_DistParameterSet(@Nonnull final WorkbookFunctionsBeta_DistParameterSetBuilder builder) {
        this.x = builder.x;
        this.alpha = builder.alpha;
        this.beta = builder.beta;
        this.cumulative = builder.cumulative;
        this.a = builder.a;
        this.b = builder.b;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsBeta_DistParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsBeta_DistParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsBeta_DistParameterSet
     */
    public static final class WorkbookFunctionsBeta_DistParameterSetBuilder {
        /**
         * The x parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement x;
        /**
         * Sets the X
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBeta_DistParameterSetBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
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
        public WorkbookFunctionsBeta_DistParameterSetBuilder withAlpha(@Nullable final com.google.gson.JsonElement val) {
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
        public WorkbookFunctionsBeta_DistParameterSetBuilder withBeta(@Nullable final com.google.gson.JsonElement val) {
            this.beta = val;
            return this;
        }
        /**
         * The cumulative parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement cumulative;
        /**
         * Sets the Cumulative
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBeta_DistParameterSetBuilder withCumulative(@Nullable final com.google.gson.JsonElement val) {
            this.cumulative = val;
            return this;
        }
        /**
         * The a parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement a;
        /**
         * Sets the A
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBeta_DistParameterSetBuilder withA(@Nullable final com.google.gson.JsonElement val) {
            this.a = val;
            return this;
        }
        /**
         * The b parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement b;
        /**
         * Sets the B
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBeta_DistParameterSetBuilder withB(@Nullable final com.google.gson.JsonElement val) {
            this.b = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsBeta_DistParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsBeta_DistParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsBeta_DistParameterSet build() {
            return new WorkbookFunctionsBeta_DistParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.x != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("x", x));
        }
        if(this.alpha != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("alpha", alpha));
        }
        if(this.beta != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("beta", beta));
        }
        if(this.cumulative != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cumulative", cumulative));
        }
        if(this.a != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("a", a));
        }
        if(this.b != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("b", b));
        }
        return result;
    }
}
