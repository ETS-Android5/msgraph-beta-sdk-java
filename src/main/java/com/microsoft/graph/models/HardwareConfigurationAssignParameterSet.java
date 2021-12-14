// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.HardwareConfigurationAssignment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Hardware Configuration Assign Parameter Set.
 */
public class HardwareConfigurationAssignParameterSet {
    /**
     * The hardware Configuration Assignments.
     * 
     */
    @SerializedName(value = "hardwareConfigurationAssignments", alternate = {"HardwareConfigurationAssignments"})
    @Expose
	@Nullable
    public java.util.List<HardwareConfigurationAssignment> hardwareConfigurationAssignments;


    /**
     * Instiaciates a new HardwareConfigurationAssignParameterSet
     */
    public HardwareConfigurationAssignParameterSet() {}
    /**
     * Instiaciates a new HardwareConfigurationAssignParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected HardwareConfigurationAssignParameterSet(@Nonnull final HardwareConfigurationAssignParameterSetBuilder builder) {
        this.hardwareConfigurationAssignments = builder.hardwareConfigurationAssignments;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static HardwareConfigurationAssignParameterSetBuilder newBuilder() {
        return new HardwareConfigurationAssignParameterSetBuilder();
    }
    /**
     * Fluent builder for the HardwareConfigurationAssignParameterSet
     */
    public static final class HardwareConfigurationAssignParameterSetBuilder {
        /**
         * The hardwareConfigurationAssignments parameter value
         */
        @Nullable
        protected java.util.List<HardwareConfigurationAssignment> hardwareConfigurationAssignments;
        /**
         * Sets the HardwareConfigurationAssignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public HardwareConfigurationAssignParameterSetBuilder withHardwareConfigurationAssignments(@Nullable final java.util.List<HardwareConfigurationAssignment> val) {
            this.hardwareConfigurationAssignments = val;
            return this;
        }
        /**
         * Instanciates a new HardwareConfigurationAssignParameterSetBuilder
         */
        @Nullable
        protected HardwareConfigurationAssignParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public HardwareConfigurationAssignParameterSet build() {
            return new HardwareConfigurationAssignParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.hardwareConfigurationAssignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("hardwareConfigurationAssignments", hardwareConfigurationAssignments));
        }
        return result;
    }
}
