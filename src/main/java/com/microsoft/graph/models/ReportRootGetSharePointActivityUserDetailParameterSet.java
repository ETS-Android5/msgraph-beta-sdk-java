// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.SharePointActivityUserDetail;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Activity User Detail Parameter Set.
 */
public class ReportRootGetSharePointActivityUserDetailParameterSet {
    /**
     * The date.
     * 
     */
    @SerializedName(value = "date", alternate = {"Date"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly date;

    /**
     * The period.
     * 
     */
    @SerializedName(value = "period", alternate = {"Period"})
    @Expose
	@Nullable
    public String period;


    /**
     * Instiaciates a new ReportRootGetSharePointActivityUserDetailParameterSet
     */
    public ReportRootGetSharePointActivityUserDetailParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetSharePointActivityUserDetailParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetSharePointActivityUserDetailParameterSet(@Nonnull final ReportRootGetSharePointActivityUserDetailParameterSetBuilder builder) {
        this.date = builder.date;
        this.period = builder.period;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetSharePointActivityUserDetailParameterSetBuilder newBuilder() {
        return new ReportRootGetSharePointActivityUserDetailParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetSharePointActivityUserDetailParameterSet
     */
    public static final class ReportRootGetSharePointActivityUserDetailParameterSetBuilder {
        /**
         * The date parameter value
         */
        @Nullable
        protected com.microsoft.graph.core.DateOnly date;
        /**
         * Sets the Date
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetSharePointActivityUserDetailParameterSetBuilder withDate(@Nullable final com.microsoft.graph.core.DateOnly val) {
            this.date = val;
            return this;
        }
        /**
         * The period parameter value
         */
        @Nullable
        protected String period;
        /**
         * Sets the Period
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetSharePointActivityUserDetailParameterSetBuilder withPeriod(@Nullable final String val) {
            this.period = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetSharePointActivityUserDetailParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetSharePointActivityUserDetailParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetSharePointActivityUserDetailParameterSet build() {
            return new ReportRootGetSharePointActivityUserDetailParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.date != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("date", date));
        }
        if(this.period != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("period", period));
        }
        return result;
    }
}
