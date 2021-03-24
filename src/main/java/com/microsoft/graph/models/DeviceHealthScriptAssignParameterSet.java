// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceHealthScriptAssignment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Assign Parameter Set.
 */
public class DeviceHealthScriptAssignParameterSet {
    /**
     * The device Health Script Assignments.
     * 
     */
    @SerializedName(value = "deviceHealthScriptAssignments", alternate = {"DeviceHealthScriptAssignments"})
    @Expose
	@Nullable
    public java.util.List<DeviceHealthScriptAssignment> deviceHealthScriptAssignments;


    /**
     * Instiaciates a new DeviceHealthScriptAssignParameterSet
     */
    public DeviceHealthScriptAssignParameterSet() {}
    /**
     * Instiaciates a new DeviceHealthScriptAssignParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceHealthScriptAssignParameterSet(@Nonnull final DeviceHealthScriptAssignParameterSetBuilder builder) {
        this.deviceHealthScriptAssignments = builder.deviceHealthScriptAssignments;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceHealthScriptAssignParameterSetBuilder newBuilder() {
        return new DeviceHealthScriptAssignParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceHealthScriptAssignParameterSet
     */
    public static final class DeviceHealthScriptAssignParameterSetBuilder {
        /**
         * The deviceHealthScriptAssignments parameter value
         */
        @Nullable
        protected java.util.List<DeviceHealthScriptAssignment> deviceHealthScriptAssignments;
        /**
         * Sets the DeviceHealthScriptAssignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceHealthScriptAssignParameterSetBuilder withDeviceHealthScriptAssignments(@Nullable final java.util.List<DeviceHealthScriptAssignment> val) {
            this.deviceHealthScriptAssignments = val;
            return this;
        }
        /**
         * Instanciates a new DeviceHealthScriptAssignParameterSetBuilder
         */
        @Nullable
        protected DeviceHealthScriptAssignParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceHealthScriptAssignParameterSet build() {
            return new DeviceHealthScriptAssignParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.deviceHealthScriptAssignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deviceHealthScriptAssignments", deviceHealthScriptAssignments));
        }
        return result;
    }
}
