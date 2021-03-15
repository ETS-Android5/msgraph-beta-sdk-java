// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.RoleScopeTag;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Get Role Scope Tags By Ids Parameter Set.
 */
public class DeviceManagementGetRoleScopeTagsByIdsParameterSet {
    /**
     * The ids.
     * 
     */
    @SerializedName(value = "ids", alternate = {"Ids"})
    @Expose
	@Nullable
    public java.util.List<String> ids;


    /**
     * Instiaciates a new DeviceManagementGetRoleScopeTagsByIdsParameterSet
     */
    public DeviceManagementGetRoleScopeTagsByIdsParameterSet() {}
    /**
     * Instiaciates a new DeviceManagementGetRoleScopeTagsByIdsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceManagementGetRoleScopeTagsByIdsParameterSet(@Nonnull final DeviceManagementGetRoleScopeTagsByIdsParameterSetBuilder builder) {
        this.ids = builder.ids;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceManagementGetRoleScopeTagsByIdsParameterSetBuilder newBuilder() {
        return new DeviceManagementGetRoleScopeTagsByIdsParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceManagementGetRoleScopeTagsByIdsParameterSet
     */
    public static final class DeviceManagementGetRoleScopeTagsByIdsParameterSetBuilder {
        /**
         * The ids parameter value
         */
        @Nullable
        protected java.util.List<String> ids;
        /**
         * Sets the Ids
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementGetRoleScopeTagsByIdsParameterSetBuilder withIds(@Nullable final java.util.List<String> val) {
            this.ids = val;
            return this;
        }
        /**
         * Instanciates a new DeviceManagementGetRoleScopeTagsByIdsParameterSetBuilder
         */
        @Nullable
        protected DeviceManagementGetRoleScopeTagsByIdsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceManagementGetRoleScopeTagsByIdsParameterSet build() {
            return new DeviceManagementGetRoleScopeTagsByIdsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.ids != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("ids", ids));
        }
        return result;
    }
}
