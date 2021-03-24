// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DeletedWindowsAutopilotDeviceState;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity Delete Devices Parameter Set.
 */
public class WindowsAutopilotDeviceIdentityDeleteDevicesParameterSet {
    /**
     * The serial Numbers.
     * 
     */
    @SerializedName(value = "serialNumbers", alternate = {"SerialNumbers"})
    @Expose
	@Nullable
    public java.util.List<String> serialNumbers;


    /**
     * Instiaciates a new WindowsAutopilotDeviceIdentityDeleteDevicesParameterSet
     */
    public WindowsAutopilotDeviceIdentityDeleteDevicesParameterSet() {}
    /**
     * Instiaciates a new WindowsAutopilotDeviceIdentityDeleteDevicesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WindowsAutopilotDeviceIdentityDeleteDevicesParameterSet(@Nonnull final WindowsAutopilotDeviceIdentityDeleteDevicesParameterSetBuilder builder) {
        this.serialNumbers = builder.serialNumbers;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WindowsAutopilotDeviceIdentityDeleteDevicesParameterSetBuilder newBuilder() {
        return new WindowsAutopilotDeviceIdentityDeleteDevicesParameterSetBuilder();
    }
    /**
     * Fluent builder for the WindowsAutopilotDeviceIdentityDeleteDevicesParameterSet
     */
    public static final class WindowsAutopilotDeviceIdentityDeleteDevicesParameterSetBuilder {
        /**
         * The serialNumbers parameter value
         */
        @Nullable
        protected java.util.List<String> serialNumbers;
        /**
         * Sets the SerialNumbers
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WindowsAutopilotDeviceIdentityDeleteDevicesParameterSetBuilder withSerialNumbers(@Nullable final java.util.List<String> val) {
            this.serialNumbers = val;
            return this;
        }
        /**
         * Instanciates a new WindowsAutopilotDeviceIdentityDeleteDevicesParameterSetBuilder
         */
        @Nullable
        protected WindowsAutopilotDeviceIdentityDeleteDevicesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WindowsAutopilotDeviceIdentityDeleteDevicesParameterSet build() {
            return new WindowsAutopilotDeviceIdentityDeleteDevicesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.serialNumbers != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("serialNumbers", serialNumbers));
        }
        return result;
    }
}
