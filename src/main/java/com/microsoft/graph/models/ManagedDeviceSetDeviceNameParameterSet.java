// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Set Device Name Parameter Set.
 */
public class ManagedDeviceSetDeviceNameParameterSet {
    /**
     * The device Name.
     * 
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;


    /**
     * Instiaciates a new ManagedDeviceSetDeviceNameParameterSet
     */
    public ManagedDeviceSetDeviceNameParameterSet() {}
    /**
     * Instiaciates a new ManagedDeviceSetDeviceNameParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagedDeviceSetDeviceNameParameterSet(@Nonnull final ManagedDeviceSetDeviceNameParameterSetBuilder builder) {
        this.deviceName = builder.deviceName;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedDeviceSetDeviceNameParameterSetBuilder newBuilder() {
        return new ManagedDeviceSetDeviceNameParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagedDeviceSetDeviceNameParameterSet
     */
    public static final class ManagedDeviceSetDeviceNameParameterSetBuilder {
        /**
         * The deviceName parameter value
         */
        @Nullable
        protected String deviceName;
        /**
         * Sets the DeviceName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceSetDeviceNameParameterSetBuilder withDeviceName(@Nullable final String val) {
            this.deviceName = val;
            return this;
        }
        /**
         * Instanciates a new ManagedDeviceSetDeviceNameParameterSetBuilder
         */
        @Nullable
        protected ManagedDeviceSetDeviceNameParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedDeviceSetDeviceNameParameterSet build() {
            return new ManagedDeviceSetDeviceNameParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.deviceName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deviceName", deviceName));
        }
        return result;
    }
}
