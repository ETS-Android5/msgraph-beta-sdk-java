// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.GroupPrintUsageSummary;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Group Print Usage Summary Parameter Set.
 */
public class ReportRootGetGroupPrintUsageSummaryParameterSet {
    /**
     * The group Id.
     * 
     */
    @SerializedName(value = "groupId", alternate = {"GroupId"})
    @Expose
	@Nullable
    public String groupId;

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
     * Instiaciates a new ReportRootGetGroupPrintUsageSummaryParameterSet
     */
    public ReportRootGetGroupPrintUsageSummaryParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetGroupPrintUsageSummaryParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetGroupPrintUsageSummaryParameterSet(@Nonnull final ReportRootGetGroupPrintUsageSummaryParameterSetBuilder builder) {
        this.groupId = builder.groupId;
        this.periodStart = builder.periodStart;
        this.periodEnd = builder.periodEnd;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetGroupPrintUsageSummaryParameterSetBuilder newBuilder() {
        return new ReportRootGetGroupPrintUsageSummaryParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetGroupPrintUsageSummaryParameterSet
     */
    public static final class ReportRootGetGroupPrintUsageSummaryParameterSetBuilder {
        /**
         * The groupId parameter value
         */
        @Nullable
        protected String groupId;
        /**
         * Sets the GroupId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetGroupPrintUsageSummaryParameterSetBuilder withGroupId(@Nullable final String val) {
            this.groupId = val;
            return this;
        }
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
        public ReportRootGetGroupPrintUsageSummaryParameterSetBuilder withPeriodStart(@Nullable final java.time.OffsetDateTime val) {
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
        public ReportRootGetGroupPrintUsageSummaryParameterSetBuilder withPeriodEnd(@Nullable final java.time.OffsetDateTime val) {
            this.periodEnd = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetGroupPrintUsageSummaryParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetGroupPrintUsageSummaryParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetGroupPrintUsageSummaryParameterSet build() {
            return new ReportRootGetGroupPrintUsageSummaryParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.groupId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupId", groupId));
        }
        if(this.periodStart != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("periodStart", periodStart));
        }
        if(this.periodEnd != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("periodEnd", periodEnd));
        }
        return result;
    }
}
