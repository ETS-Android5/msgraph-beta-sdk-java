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
 * The class for the Ios Vpp App Revoke All Licenses Parameter Set.
 */
public class IosVppAppRevokeAllLicensesParameterSet {
    /**
     * The notify Managed Devices.
     * 
     */
    @SerializedName(value = "notifyManagedDevices", alternate = {"NotifyManagedDevices"})
    @Expose
	@Nullable
    public Boolean notifyManagedDevices;


    /**
     * Instiaciates a new IosVppAppRevokeAllLicensesParameterSet
     */
    public IosVppAppRevokeAllLicensesParameterSet() {}
    /**
     * Instiaciates a new IosVppAppRevokeAllLicensesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected IosVppAppRevokeAllLicensesParameterSet(@Nonnull final IosVppAppRevokeAllLicensesParameterSetBuilder builder) {
        this.notifyManagedDevices = builder.notifyManagedDevices;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static IosVppAppRevokeAllLicensesParameterSetBuilder newBuilder() {
        return new IosVppAppRevokeAllLicensesParameterSetBuilder();
    }
    /**
     * Fluent builder for the IosVppAppRevokeAllLicensesParameterSet
     */
    public static final class IosVppAppRevokeAllLicensesParameterSetBuilder {
        /**
         * The notifyManagedDevices parameter value
         */
        @Nullable
        protected Boolean notifyManagedDevices;
        /**
         * Sets the NotifyManagedDevices
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public IosVppAppRevokeAllLicensesParameterSetBuilder withNotifyManagedDevices(@Nullable final Boolean val) {
            this.notifyManagedDevices = val;
            return this;
        }
        /**
         * Instanciates a new IosVppAppRevokeAllLicensesParameterSetBuilder
         */
        @Nullable
        protected IosVppAppRevokeAllLicensesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public IosVppAppRevokeAllLicensesParameterSet build() {
            return new IosVppAppRevokeAllLicensesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.notifyManagedDevices != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("notifyManagedDevices", notifyManagedDevices));
        }
        return result;
    }
}
