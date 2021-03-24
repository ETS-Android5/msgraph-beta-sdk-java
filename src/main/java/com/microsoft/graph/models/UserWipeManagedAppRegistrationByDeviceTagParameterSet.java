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
 * The class for the User Wipe Managed App Registration By Device Tag Parameter Set.
 */
public class UserWipeManagedAppRegistrationByDeviceTagParameterSet {
    /**
     * The device Tag.
     * 
     */
    @SerializedName(value = "deviceTag", alternate = {"DeviceTag"})
    @Expose
	@Nullable
    public String deviceTag;


    /**
     * Instiaciates a new UserWipeManagedAppRegistrationByDeviceTagParameterSet
     */
    public UserWipeManagedAppRegistrationByDeviceTagParameterSet() {}
    /**
     * Instiaciates a new UserWipeManagedAppRegistrationByDeviceTagParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UserWipeManagedAppRegistrationByDeviceTagParameterSet(@Nonnull final UserWipeManagedAppRegistrationByDeviceTagParameterSetBuilder builder) {
        this.deviceTag = builder.deviceTag;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UserWipeManagedAppRegistrationByDeviceTagParameterSetBuilder newBuilder() {
        return new UserWipeManagedAppRegistrationByDeviceTagParameterSetBuilder();
    }
    /**
     * Fluent builder for the UserWipeManagedAppRegistrationByDeviceTagParameterSet
     */
    public static final class UserWipeManagedAppRegistrationByDeviceTagParameterSetBuilder {
        /**
         * The deviceTag parameter value
         */
        @Nullable
        protected String deviceTag;
        /**
         * Sets the DeviceTag
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserWipeManagedAppRegistrationByDeviceTagParameterSetBuilder withDeviceTag(@Nullable final String val) {
            this.deviceTag = val;
            return this;
        }
        /**
         * Instanciates a new UserWipeManagedAppRegistrationByDeviceTagParameterSetBuilder
         */
        @Nullable
        protected UserWipeManagedAppRegistrationByDeviceTagParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UserWipeManagedAppRegistrationByDeviceTagParameterSet build() {
            return new UserWipeManagedAppRegistrationByDeviceTagParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.deviceTag != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deviceTag", deviceTag));
        }
        return result;
    }
}
