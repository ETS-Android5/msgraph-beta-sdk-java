// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;

import com.microsoft.graph.managedtenants.models.Tenant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Reset Tenant Onboarding Status Parameter Set.
 */
public class TenantResetTenantOnboardingStatusParameterSet {

    /**
     * Instiaciates a new TenantResetTenantOnboardingStatusParameterSet
     */
    public TenantResetTenantOnboardingStatusParameterSet() {}
    /**
     * Instiaciates a new TenantResetTenantOnboardingStatusParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TenantResetTenantOnboardingStatusParameterSet(@Nonnull final TenantResetTenantOnboardingStatusParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TenantResetTenantOnboardingStatusParameterSetBuilder newBuilder() {
        return new TenantResetTenantOnboardingStatusParameterSetBuilder();
    }
    /**
     * Fluent builder for the TenantResetTenantOnboardingStatusParameterSet
     */
    public static final class TenantResetTenantOnboardingStatusParameterSetBuilder {
        /**
         * Instanciates a new TenantResetTenantOnboardingStatusParameterSetBuilder
         */
        @Nullable
        protected TenantResetTenantOnboardingStatusParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TenantResetTenantOnboardingStatusParameterSet build() {
            return new TenantResetTenantOnboardingStatusParameterSet(this);
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
