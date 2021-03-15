// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.OverallPrintUsageSummary;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Overall Print Usage Summary Parameter Set.
 */
public class ReportRootGetOverallPrintUsageSummaryParameterSet {
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
     * The top Lists Size.
     * 
     */
    @SerializedName(value = "topListsSize", alternate = {"TopListsSize"})
    @Expose
	@Nullable
    public Integer topListsSize;


    /**
     * Instiaciates a new ReportRootGetOverallPrintUsageSummaryParameterSet
     */
    public ReportRootGetOverallPrintUsageSummaryParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetOverallPrintUsageSummaryParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetOverallPrintUsageSummaryParameterSet(@Nonnull final ReportRootGetOverallPrintUsageSummaryParameterSetBuilder builder) {
        this.periodStart = builder.periodStart;
        this.periodEnd = builder.periodEnd;
        this.topListsSize = builder.topListsSize;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetOverallPrintUsageSummaryParameterSetBuilder newBuilder() {
        return new ReportRootGetOverallPrintUsageSummaryParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetOverallPrintUsageSummaryParameterSet
     */
    public static final class ReportRootGetOverallPrintUsageSummaryParameterSetBuilder {
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
        public ReportRootGetOverallPrintUsageSummaryParameterSetBuilder withPeriodStart(@Nullable final java.time.OffsetDateTime val) {
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
        public ReportRootGetOverallPrintUsageSummaryParameterSetBuilder withPeriodEnd(@Nullable final java.time.OffsetDateTime val) {
            this.periodEnd = val;
            return this;
        }
        /**
         * The topListsSize parameter value
         */
        @Nullable
        protected Integer topListsSize;
        /**
         * Sets the TopListsSize
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetOverallPrintUsageSummaryParameterSetBuilder withTopListsSize(@Nullable final Integer val) {
            this.topListsSize = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetOverallPrintUsageSummaryParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetOverallPrintUsageSummaryParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetOverallPrintUsageSummaryParameterSet build() {
            return new ReportRootGetOverallPrintUsageSummaryParameterSet(this);
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
        if(this.topListsSize != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("topListsSize", topListsSize));
        }
        return result;
    }
}
