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
 * The class for the Managed Device Request Remote Assistance Parameter Set.
 */
public class ManagedDeviceRequestRemoteAssistanceParameterSet {

    /**
     * Instiaciates a new ManagedDeviceRequestRemoteAssistanceParameterSet
     */
    public ManagedDeviceRequestRemoteAssistanceParameterSet() {}
    /**
     * Instiaciates a new ManagedDeviceRequestRemoteAssistanceParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagedDeviceRequestRemoteAssistanceParameterSet(@Nonnull final ManagedDeviceRequestRemoteAssistanceParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedDeviceRequestRemoteAssistanceParameterSetBuilder newBuilder() {
        return new ManagedDeviceRequestRemoteAssistanceParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagedDeviceRequestRemoteAssistanceParameterSet
     */
    public static final class ManagedDeviceRequestRemoteAssistanceParameterSetBuilder {
        /**
         * Instanciates a new ManagedDeviceRequestRemoteAssistanceParameterSetBuilder
         */
        @Nullable
        protected ManagedDeviceRequestRemoteAssistanceParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedDeviceRequestRemoteAssistanceParameterSet build() {
            return new ManagedDeviceRequestRemoteAssistanceParameterSet(this);
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
