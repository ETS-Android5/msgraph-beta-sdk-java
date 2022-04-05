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
 * The class for the Tenant Attach RBACEnable Parameter Set.
 */
public class TenantAttachRBACEnableParameterSet {
    /**
     * The enable.
     * 
     */
    @SerializedName(value = "enable", alternate = {"Enable"})
    @Expose
	@Nullable
    public Boolean enable;


    /**
     * Instiaciates a new TenantAttachRBACEnableParameterSet
     */
    public TenantAttachRBACEnableParameterSet() {}
    /**
     * Instiaciates a new TenantAttachRBACEnableParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TenantAttachRBACEnableParameterSet(@Nonnull final TenantAttachRBACEnableParameterSetBuilder builder) {
        this.enable = builder.enable;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TenantAttachRBACEnableParameterSetBuilder newBuilder() {
        return new TenantAttachRBACEnableParameterSetBuilder();
    }
    /**
     * Fluent builder for the TenantAttachRBACEnableParameterSet
     */
    public static final class TenantAttachRBACEnableParameterSetBuilder {
        /**
         * The enable parameter value
         */
        @Nullable
        protected Boolean enable;
        /**
         * Sets the Enable
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TenantAttachRBACEnableParameterSetBuilder withEnable(@Nullable final Boolean val) {
            this.enable = val;
            return this;
        }
        /**
         * Instanciates a new TenantAttachRBACEnableParameterSetBuilder
         */
        @Nullable
        protected TenantAttachRBACEnableParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TenantAttachRBACEnableParameterSet build() {
            return new TenantAttachRBACEnableParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.enable != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("enable", enable));
        }
        return result;
    }
}
