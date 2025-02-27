// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.KeyLongValuePair;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Get Health Metrics Parameter Set.
 */
public class MicrosoftTunnelServerGetHealthMetricsParameterSet {
    /**
     * The metric Names.
     * 
     */
    @SerializedName(value = "metricNames", alternate = {"MetricNames"})
    @Expose
	@Nullable
    public java.util.List<String> metricNames;


    /**
     * Instiaciates a new MicrosoftTunnelServerGetHealthMetricsParameterSet
     */
    public MicrosoftTunnelServerGetHealthMetricsParameterSet() {}
    /**
     * Instiaciates a new MicrosoftTunnelServerGetHealthMetricsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected MicrosoftTunnelServerGetHealthMetricsParameterSet(@Nonnull final MicrosoftTunnelServerGetHealthMetricsParameterSetBuilder builder) {
        this.metricNames = builder.metricNames;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static MicrosoftTunnelServerGetHealthMetricsParameterSetBuilder newBuilder() {
        return new MicrosoftTunnelServerGetHealthMetricsParameterSetBuilder();
    }
    /**
     * Fluent builder for the MicrosoftTunnelServerGetHealthMetricsParameterSet
     */
    public static final class MicrosoftTunnelServerGetHealthMetricsParameterSetBuilder {
        /**
         * The metricNames parameter value
         */
        @Nullable
        protected java.util.List<String> metricNames;
        /**
         * Sets the MetricNames
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MicrosoftTunnelServerGetHealthMetricsParameterSetBuilder withMetricNames(@Nullable final java.util.List<String> val) {
            this.metricNames = val;
            return this;
        }
        /**
         * Instanciates a new MicrosoftTunnelServerGetHealthMetricsParameterSetBuilder
         */
        @Nullable
        protected MicrosoftTunnelServerGetHealthMetricsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public MicrosoftTunnelServerGetHealthMetricsParameterSet build() {
            return new MicrosoftTunnelServerGetHealthMetricsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.metricNames != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("metricNames", metricNames));
        }
        return result;
    }
}
