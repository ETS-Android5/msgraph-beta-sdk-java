// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.OneDriveUsageAccountDetail;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Usage Account Detail Parameter Set.
 */
public class ReportRootGetOneDriveUsageAccountDetailParameterSet {
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
     * Instiaciates a new ReportRootGetOneDriveUsageAccountDetailParameterSet
     */
    public ReportRootGetOneDriveUsageAccountDetailParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetOneDriveUsageAccountDetailParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetOneDriveUsageAccountDetailParameterSet(@Nonnull final ReportRootGetOneDriveUsageAccountDetailParameterSetBuilder builder) {
        this.date = builder.date;
        this.period = builder.period;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetOneDriveUsageAccountDetailParameterSetBuilder newBuilder() {
        return new ReportRootGetOneDriveUsageAccountDetailParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetOneDriveUsageAccountDetailParameterSet
     */
    public static final class ReportRootGetOneDriveUsageAccountDetailParameterSetBuilder {
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
        public ReportRootGetOneDriveUsageAccountDetailParameterSetBuilder withDate(@Nullable final com.microsoft.graph.core.DateOnly val) {
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
        public ReportRootGetOneDriveUsageAccountDetailParameterSetBuilder withPeriod(@Nullable final String val) {
            this.period = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetOneDriveUsageAccountDetailParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetOneDriveUsageAccountDetailParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetOneDriveUsageAccountDetailParameterSet build() {
            return new ReportRootGetOneDriveUsageAccountDetailParameterSet(this);
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
