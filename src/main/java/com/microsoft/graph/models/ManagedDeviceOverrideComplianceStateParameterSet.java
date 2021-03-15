// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.AdministratorConfiguredDeviceComplianceState;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Override Compliance State Parameter Set.
 */
public class ManagedDeviceOverrideComplianceStateParameterSet {
    /**
     * The compliance State.
     * 
     */
    @SerializedName(value = "complianceState", alternate = {"ComplianceState"})
    @Expose
	@Nullable
    public AdministratorConfiguredDeviceComplianceState complianceState;

    /**
     * The remediation Url.
     * 
     */
    @SerializedName(value = "remediationUrl", alternate = {"RemediationUrl"})
    @Expose
	@Nullable
    public String remediationUrl;


    /**
     * Instiaciates a new ManagedDeviceOverrideComplianceStateParameterSet
     */
    public ManagedDeviceOverrideComplianceStateParameterSet() {}
    /**
     * Instiaciates a new ManagedDeviceOverrideComplianceStateParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagedDeviceOverrideComplianceStateParameterSet(@Nonnull final ManagedDeviceOverrideComplianceStateParameterSetBuilder builder) {
        this.complianceState = builder.complianceState;
        this.remediationUrl = builder.remediationUrl;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedDeviceOverrideComplianceStateParameterSetBuilder newBuilder() {
        return new ManagedDeviceOverrideComplianceStateParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagedDeviceOverrideComplianceStateParameterSet
     */
    public static final class ManagedDeviceOverrideComplianceStateParameterSetBuilder {
        /**
         * The complianceState parameter value
         */
        @Nullable
        protected AdministratorConfiguredDeviceComplianceState complianceState;
        /**
         * Sets the ComplianceState
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceOverrideComplianceStateParameterSetBuilder withComplianceState(@Nullable final AdministratorConfiguredDeviceComplianceState val) {
            this.complianceState = val;
            return this;
        }
        /**
         * The remediationUrl parameter value
         */
        @Nullable
        protected String remediationUrl;
        /**
         * Sets the RemediationUrl
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceOverrideComplianceStateParameterSetBuilder withRemediationUrl(@Nullable final String val) {
            this.remediationUrl = val;
            return this;
        }
        /**
         * Instanciates a new ManagedDeviceOverrideComplianceStateParameterSetBuilder
         */
        @Nullable
        protected ManagedDeviceOverrideComplianceStateParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedDeviceOverrideComplianceStateParameterSet build() {
            return new ManagedDeviceOverrideComplianceStateParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.complianceState != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("complianceState", complianceState));
        }
        if(this.remediationUrl != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("remediationUrl", remediationUrl));
        }
        return result;
    }
}
