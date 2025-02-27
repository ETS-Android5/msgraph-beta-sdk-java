// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.CredentialUsageSummary;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Credential Usage Summary Parameter Set.
 */
public class ReportRootGetCredentialUsageSummaryParameterSet {
    /**
     * The period.
     * 
     */
    @SerializedName(value = "period", alternate = {"Period"})
    @Expose
	@Nullable
    public String period;


    /**
     * Instiaciates a new ReportRootGetCredentialUsageSummaryParameterSet
     */
    public ReportRootGetCredentialUsageSummaryParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetCredentialUsageSummaryParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetCredentialUsageSummaryParameterSet(@Nonnull final ReportRootGetCredentialUsageSummaryParameterSetBuilder builder) {
        this.period = builder.period;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetCredentialUsageSummaryParameterSetBuilder newBuilder() {
        return new ReportRootGetCredentialUsageSummaryParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetCredentialUsageSummaryParameterSet
     */
    public static final class ReportRootGetCredentialUsageSummaryParameterSetBuilder {
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
        public ReportRootGetCredentialUsageSummaryParameterSetBuilder withPeriod(@Nullable final String val) {
            this.period = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetCredentialUsageSummaryParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetCredentialUsageSummaryParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetCredentialUsageSummaryParameterSet build() {
            return new ReportRootGetCredentialUsageSummaryParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.period != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("period", period));
        }
        return result;
    }
}
