// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.DeviceManagementScriptAssignment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Shell Script Assign Parameter Set.
 */
public class DeviceShellScriptAssignParameterSet {
    /**
     * The device Management Script Group Assignments.
     * 
     */
    @SerializedName(value = "deviceManagementScriptGroupAssignments", alternate = {"DeviceManagementScriptGroupAssignments"})
    @Expose
	@Nullable
    public java.util.List<DeviceManagementScriptGroupAssignment> deviceManagementScriptGroupAssignments;

    /**
     * The device Management Script Assignments.
     * 
     */
    @SerializedName(value = "deviceManagementScriptAssignments", alternate = {"DeviceManagementScriptAssignments"})
    @Expose
	@Nullable
    public java.util.List<DeviceManagementScriptAssignment> deviceManagementScriptAssignments;


    /**
     * Instiaciates a new DeviceShellScriptAssignParameterSet
     */
    public DeviceShellScriptAssignParameterSet() {}
    /**
     * Instiaciates a new DeviceShellScriptAssignParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceShellScriptAssignParameterSet(@Nonnull final DeviceShellScriptAssignParameterSetBuilder builder) {
        this.deviceManagementScriptGroupAssignments = builder.deviceManagementScriptGroupAssignments;
        this.deviceManagementScriptAssignments = builder.deviceManagementScriptAssignments;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceShellScriptAssignParameterSetBuilder newBuilder() {
        return new DeviceShellScriptAssignParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceShellScriptAssignParameterSet
     */
    public static final class DeviceShellScriptAssignParameterSetBuilder {
        /**
         * The deviceManagementScriptGroupAssignments parameter value
         */
        @Nullable
        protected java.util.List<DeviceManagementScriptGroupAssignment> deviceManagementScriptGroupAssignments;
        /**
         * Sets the DeviceManagementScriptGroupAssignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceShellScriptAssignParameterSetBuilder withDeviceManagementScriptGroupAssignments(@Nullable final java.util.List<DeviceManagementScriptGroupAssignment> val) {
            this.deviceManagementScriptGroupAssignments = val;
            return this;
        }
        /**
         * The deviceManagementScriptAssignments parameter value
         */
        @Nullable
        protected java.util.List<DeviceManagementScriptAssignment> deviceManagementScriptAssignments;
        /**
         * Sets the DeviceManagementScriptAssignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceShellScriptAssignParameterSetBuilder withDeviceManagementScriptAssignments(@Nullable final java.util.List<DeviceManagementScriptAssignment> val) {
            this.deviceManagementScriptAssignments = val;
            return this;
        }
        /**
         * Instanciates a new DeviceShellScriptAssignParameterSetBuilder
         */
        @Nullable
        protected DeviceShellScriptAssignParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceShellScriptAssignParameterSet build() {
            return new DeviceShellScriptAssignParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.deviceManagementScriptGroupAssignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deviceManagementScriptGroupAssignments", deviceManagementScriptGroupAssignments));
        }
        if(this.deviceManagementScriptAssignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deviceManagementScriptAssignments", deviceManagementScriptAssignments));
        }
        return result;
    }
}
