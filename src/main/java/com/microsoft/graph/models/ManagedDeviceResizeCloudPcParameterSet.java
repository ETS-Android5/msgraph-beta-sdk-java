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
 * The class for the Managed Device Resize Cloud Pc Parameter Set.
 */
public class ManagedDeviceResizeCloudPcParameterSet {
    /**
     * The target Service Plan Id.
     * 
     */
    @SerializedName(value = "targetServicePlanId", alternate = {"TargetServicePlanId"})
    @Expose
	@Nullable
    public String targetServicePlanId;


    /**
     * Instiaciates a new ManagedDeviceResizeCloudPcParameterSet
     */
    public ManagedDeviceResizeCloudPcParameterSet() {}
    /**
     * Instiaciates a new ManagedDeviceResizeCloudPcParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagedDeviceResizeCloudPcParameterSet(@Nonnull final ManagedDeviceResizeCloudPcParameterSetBuilder builder) {
        this.targetServicePlanId = builder.targetServicePlanId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedDeviceResizeCloudPcParameterSetBuilder newBuilder() {
        return new ManagedDeviceResizeCloudPcParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagedDeviceResizeCloudPcParameterSet
     */
    public static final class ManagedDeviceResizeCloudPcParameterSetBuilder {
        /**
         * The targetServicePlanId parameter value
         */
        @Nullable
        protected String targetServicePlanId;
        /**
         * Sets the TargetServicePlanId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceResizeCloudPcParameterSetBuilder withTargetServicePlanId(@Nullable final String val) {
            this.targetServicePlanId = val;
            return this;
        }
        /**
         * Instanciates a new ManagedDeviceResizeCloudPcParameterSetBuilder
         */
        @Nullable
        protected ManagedDeviceResizeCloudPcParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedDeviceResizeCloudPcParameterSet build() {
            return new ManagedDeviceResizeCloudPcParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.targetServicePlanId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("targetServicePlanId", targetServicePlanId));
        }
        return result;
    }
}
