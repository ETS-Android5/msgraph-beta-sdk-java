// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.UserPrintUsageSummary;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Print Usage Summaries By User Parameter Set.
 */
public class ReportRootGetPrintUsageSummariesByUserParameterSet {
    /**
     * The period Start.
     * 
     */
    @SerializedName(value = "periodStart", alternate = {"PeriodStart"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime periodStart;

    /**
     * The period End.
     * 
     */
    @SerializedName(value = "periodEnd", alternate = {"PeriodEnd"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime periodEnd;


    /**
     * Instiaciates a new ReportRootGetPrintUsageSummariesByUserParameterSet
     */
    public ReportRootGetPrintUsageSummariesByUserParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetPrintUsageSummariesByUserParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetPrintUsageSummariesByUserParameterSet(@Nonnull final ReportRootGetPrintUsageSummariesByUserParameterSetBuilder builder) {
        this.periodStart = builder.periodStart;
        this.periodEnd = builder.periodEnd;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetPrintUsageSummariesByUserParameterSetBuilder newBuilder() {
        return new ReportRootGetPrintUsageSummariesByUserParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetPrintUsageSummariesByUserParameterSet
     */
    public static final class ReportRootGetPrintUsageSummariesByUserParameterSetBuilder {
        /**
         * The periodStart parameter value
         */
        @Nullable
        protected java.time.OffsetDateTime periodStart;
        /**
         * Sets the PeriodStart
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetPrintUsageSummariesByUserParameterSetBuilder withPeriodStart(@Nullable final java.time.OffsetDateTime val) {
            this.periodStart = val;
            return this;
        }
        /**
         * The periodEnd parameter value
         */
        @Nullable
        protected java.time.OffsetDateTime periodEnd;
        /**
         * Sets the PeriodEnd
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetPrintUsageSummariesByUserParameterSetBuilder withPeriodEnd(@Nullable final java.time.OffsetDateTime val) {
            this.periodEnd = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetPrintUsageSummariesByUserParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetPrintUsageSummariesByUserParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetPrintUsageSummariesByUserParameterSet build() {
            return new ReportRootGetPrintUsageSummariesByUserParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.periodStart != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("periodStart", periodStart));
        }
        if(this.periodEnd != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("periodEnd", periodEnd));
        }
        return result;
    }
}
