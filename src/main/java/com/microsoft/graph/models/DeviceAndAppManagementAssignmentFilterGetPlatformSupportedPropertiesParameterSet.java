// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.graph.models.AssignmentFilterSupportedProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Assignment Filter Get Platform Supported Properties Parameter Set.
 */
public class DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSet {
    /**
     * The platform.
     * 
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
	@Nullable
    public DevicePlatformType platform;


    /**
     * Instiaciates a new DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSet
     */
    public DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSet() {}
    /**
     * Instiaciates a new DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSet(@Nonnull final DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSetBuilder builder) {
        this.platform = builder.platform;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSetBuilder newBuilder() {
        return new DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSet
     */
    public static final class DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSetBuilder {
        /**
         * The platform parameter value
         */
        @Nullable
        protected DevicePlatformType platform;
        /**
         * Sets the Platform
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSetBuilder withPlatform(@Nullable final DevicePlatformType val) {
            this.platform = val;
            return this;
        }
        /**
         * Instanciates a new DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSetBuilder
         */
        @Nullable
        protected DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSet build() {
            return new DeviceAndAppManagementAssignmentFilterGetPlatformSupportedPropertiesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.platform != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("platform", platform));
        }
        return result;
    }
}
