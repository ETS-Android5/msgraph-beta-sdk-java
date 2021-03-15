// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Assign Parameter Set.
 */
public class DeviceConfigurationAssignParameterSet {
    /**
     * The device Configuration Group Assignments.
     * 
     */
    @SerializedName(value = "deviceConfigurationGroupAssignments", alternate = {"DeviceConfigurationGroupAssignments"})
    @Expose
	@Nullable
    public java.util.List<DeviceConfigurationGroupAssignment> deviceConfigurationGroupAssignments;

    /**
     * The assignments.
     * 
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public java.util.List<DeviceConfigurationAssignment> assignments;


    /**
     * Instiaciates a new DeviceConfigurationAssignParameterSet
     */
    public DeviceConfigurationAssignParameterSet() {}
    /**
     * Instiaciates a new DeviceConfigurationAssignParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceConfigurationAssignParameterSet(@Nonnull final DeviceConfigurationAssignParameterSetBuilder builder) {
        this.deviceConfigurationGroupAssignments = builder.deviceConfigurationGroupAssignments;
        this.assignments = builder.assignments;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceConfigurationAssignParameterSetBuilder newBuilder() {
        return new DeviceConfigurationAssignParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceConfigurationAssignParameterSet
     */
    public static final class DeviceConfigurationAssignParameterSetBuilder {
        /**
         * The deviceConfigurationGroupAssignments parameter value
         */
        @Nullable
        protected java.util.List<DeviceConfigurationGroupAssignment> deviceConfigurationGroupAssignments;
        /**
         * Sets the DeviceConfigurationGroupAssignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceConfigurationAssignParameterSetBuilder withDeviceConfigurationGroupAssignments(@Nullable final java.util.List<DeviceConfigurationGroupAssignment> val) {
            this.deviceConfigurationGroupAssignments = val;
            return this;
        }
        /**
         * The assignments parameter value
         */
        @Nullable
        protected java.util.List<DeviceConfigurationAssignment> assignments;
        /**
         * Sets the Assignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceConfigurationAssignParameterSetBuilder withAssignments(@Nullable final java.util.List<DeviceConfigurationAssignment> val) {
            this.assignments = val;
            return this;
        }
        /**
         * Instanciates a new DeviceConfigurationAssignParameterSetBuilder
         */
        @Nullable
        protected DeviceConfigurationAssignParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceConfigurationAssignParameterSet build() {
            return new DeviceConfigurationAssignParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.deviceConfigurationGroupAssignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deviceConfigurationGroupAssignments", deviceConfigurationGroupAssignments));
        }
        if(this.assignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("assignments", assignments));
        }
        return result;
    }
}
