// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.Office365ActivationCounts;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activation Counts Parameter Set.
 */
public class ReportRootGetOffice365ActivationCountsParameterSet {

    /**
     * Instiaciates a new ReportRootGetOffice365ActivationCountsParameterSet
     */
    public ReportRootGetOffice365ActivationCountsParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetOffice365ActivationCountsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetOffice365ActivationCountsParameterSet(@Nonnull final ReportRootGetOffice365ActivationCountsParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetOffice365ActivationCountsParameterSetBuilder newBuilder() {
        return new ReportRootGetOffice365ActivationCountsParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetOffice365ActivationCountsParameterSet
     */
    public static final class ReportRootGetOffice365ActivationCountsParameterSetBuilder {
        /**
         * Instanciates a new ReportRootGetOffice365ActivationCountsParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetOffice365ActivationCountsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetOffice365ActivationCountsParameterSet build() {
            return new ReportRootGetOffice365ActivationCountsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        return result;
    }
}
