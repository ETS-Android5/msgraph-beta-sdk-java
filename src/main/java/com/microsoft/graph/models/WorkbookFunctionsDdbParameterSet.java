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
 * The class for the Workbook Functions Ddb Parameter Set.
 */
public class WorkbookFunctionsDdbParameterSet {
    /**
     * The cost.
     * 
     */
    @SerializedName(value = "cost", alternate = {"Cost"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cost;

    /**
     * The salvage.
     * 
     */
    @SerializedName(value = "salvage", alternate = {"Salvage"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement salvage;

    /**
     * The life.
     * 
     */
    @SerializedName(value = "life", alternate = {"Life"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement life;

    /**
     * The period.
     * 
     */
    @SerializedName(value = "period", alternate = {"Period"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement period;

    /**
     * The factor.
     * 
     */
    @SerializedName(value = "factor", alternate = {"Factor"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement factor;


    /**
     * Instiaciates a new WorkbookFunctionsDdbParameterSet
     */
    public WorkbookFunctionsDdbParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDdbParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDdbParameterSet(@Nonnull final WorkbookFunctionsDdbParameterSetBuilder builder) {
        this.cost = builder.cost;
        this.salvage = builder.salvage;
        this.life = builder.life;
        this.period = builder.period;
        this.factor = builder.factor;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDdbParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDdbParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDdbParameterSet
     */
    public static final class WorkbookFunctionsDdbParameterSetBuilder {
        /**
         * The cost parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement cost;
        /**
         * Sets the Cost
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDdbParameterSetBuilder withCost(@Nullable final com.google.gson.JsonElement val) {
            this.cost = val;
            return this;
        }
        /**
         * The salvage parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement salvage;
        /**
         * Sets the Salvage
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDdbParameterSetBuilder withSalvage(@Nullable final com.google.gson.JsonElement val) {
            this.salvage = val;
            return this;
        }
        /**
         * The life parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement life;
        /**
         * Sets the Life
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDdbParameterSetBuilder withLife(@Nullable final com.google.gson.JsonElement val) {
            this.life = val;
            return this;
        }
        /**
         * The period parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement period;
        /**
         * Sets the Period
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDdbParameterSetBuilder withPeriod(@Nullable final com.google.gson.JsonElement val) {
            this.period = val;
            return this;
        }
        /**
         * The factor parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement factor;
        /**
         * Sets the Factor
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDdbParameterSetBuilder withFactor(@Nullable final com.google.gson.JsonElement val) {
            this.factor = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsDdbParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsDdbParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDdbParameterSet build() {
            return new WorkbookFunctionsDdbParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.cost != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cost", cost));
        }
        if(this.salvage != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("salvage", salvage));
        }
        if(this.life != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("life", life));
        }
        if(this.period != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("period", period));
        }
        if(this.factor != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("factor", factor));
        }
        return result;
    }
}
