// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceManagementIntent;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Create Copy Parameter Set.
 */
public class DeviceManagementIntentCreateCopyParameterSet {
    /**
     * The display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;


    /**
     * Instiaciates a new DeviceManagementIntentCreateCopyParameterSet
     */
    public DeviceManagementIntentCreateCopyParameterSet() {}
    /**
     * Instiaciates a new DeviceManagementIntentCreateCopyParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceManagementIntentCreateCopyParameterSet(@Nonnull final DeviceManagementIntentCreateCopyParameterSetBuilder builder) {
        this.displayName = builder.displayName;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceManagementIntentCreateCopyParameterSetBuilder newBuilder() {
        return new DeviceManagementIntentCreateCopyParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceManagementIntentCreateCopyParameterSet
     */
    public static final class DeviceManagementIntentCreateCopyParameterSetBuilder {
        /**
         * The displayName parameter value
         */
        @Nullable
        protected String displayName;
        /**
         * Sets the DisplayName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementIntentCreateCopyParameterSetBuilder withDisplayName(@Nullable final String val) {
            this.displayName = val;
            return this;
        }
        /**
         * Instanciates a new DeviceManagementIntentCreateCopyParameterSetBuilder
         */
        @Nullable
        protected DeviceManagementIntentCreateCopyParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceManagementIntentCreateCopyParameterSet build() {
            return new DeviceManagementIntentCreateCopyParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.displayName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("displayName", displayName));
        }
        return result;
    }
}
