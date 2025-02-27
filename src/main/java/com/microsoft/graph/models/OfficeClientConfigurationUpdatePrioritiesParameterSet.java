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
 * The class for the Office Client Configuration Update Priorities Parameter Set.
 */
public class OfficeClientConfigurationUpdatePrioritiesParameterSet {
    /**
     * The office Configuration Policy Ids.
     * 
     */
    @SerializedName(value = "officeConfigurationPolicyIds", alternate = {"OfficeConfigurationPolicyIds"})
    @Expose
	@Nullable
    public java.util.List<String> officeConfigurationPolicyIds;

    /**
     * The office Configuration Priorities.
     * 
     */
    @SerializedName(value = "officeConfigurationPriorities", alternate = {"OfficeConfigurationPriorities"})
    @Expose
	@Nullable
    public java.util.List<Integer> officeConfigurationPriorities;


    /**
     * Instiaciates a new OfficeClientConfigurationUpdatePrioritiesParameterSet
     */
    public OfficeClientConfigurationUpdatePrioritiesParameterSet() {}
    /**
     * Instiaciates a new OfficeClientConfigurationUpdatePrioritiesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected OfficeClientConfigurationUpdatePrioritiesParameterSet(@Nonnull final OfficeClientConfigurationUpdatePrioritiesParameterSetBuilder builder) {
        this.officeConfigurationPolicyIds = builder.officeConfigurationPolicyIds;
        this.officeConfigurationPriorities = builder.officeConfigurationPriorities;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static OfficeClientConfigurationUpdatePrioritiesParameterSetBuilder newBuilder() {
        return new OfficeClientConfigurationUpdatePrioritiesParameterSetBuilder();
    }
    /**
     * Fluent builder for the OfficeClientConfigurationUpdatePrioritiesParameterSet
     */
    public static final class OfficeClientConfigurationUpdatePrioritiesParameterSetBuilder {
        /**
         * The officeConfigurationPolicyIds parameter value
         */
        @Nullable
        protected java.util.List<String> officeConfigurationPolicyIds;
        /**
         * Sets the OfficeConfigurationPolicyIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OfficeClientConfigurationUpdatePrioritiesParameterSetBuilder withOfficeConfigurationPolicyIds(@Nullable final java.util.List<String> val) {
            this.officeConfigurationPolicyIds = val;
            return this;
        }
        /**
         * The officeConfigurationPriorities parameter value
         */
        @Nullable
        protected java.util.List<Integer> officeConfigurationPriorities;
        /**
         * Sets the OfficeConfigurationPriorities
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OfficeClientConfigurationUpdatePrioritiesParameterSetBuilder withOfficeConfigurationPriorities(@Nullable final java.util.List<Integer> val) {
            this.officeConfigurationPriorities = val;
            return this;
        }
        /**
         * Instanciates a new OfficeClientConfigurationUpdatePrioritiesParameterSetBuilder
         */
        @Nullable
        protected OfficeClientConfigurationUpdatePrioritiesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public OfficeClientConfigurationUpdatePrioritiesParameterSet build() {
            return new OfficeClientConfigurationUpdatePrioritiesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.officeConfigurationPolicyIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("officeConfigurationPolicyIds", officeConfigurationPolicyIds));
        }
        if(this.officeConfigurationPriorities != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("officeConfigurationPriorities", officeConfigurationPriorities));
        }
        return result;
    }
}
