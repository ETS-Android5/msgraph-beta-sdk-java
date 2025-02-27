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
 * The class for the Governance Resource Register Parameter Set.
 */
public class GovernanceResourceRegisterParameterSet {
    /**
     * The external Id.
     * 
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;


    /**
     * Instiaciates a new GovernanceResourceRegisterParameterSet
     */
    public GovernanceResourceRegisterParameterSet() {}
    /**
     * Instiaciates a new GovernanceResourceRegisterParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected GovernanceResourceRegisterParameterSet(@Nonnull final GovernanceResourceRegisterParameterSetBuilder builder) {
        this.externalId = builder.externalId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static GovernanceResourceRegisterParameterSetBuilder newBuilder() {
        return new GovernanceResourceRegisterParameterSetBuilder();
    }
    /**
     * Fluent builder for the GovernanceResourceRegisterParameterSet
     */
    public static final class GovernanceResourceRegisterParameterSetBuilder {
        /**
         * The externalId parameter value
         */
        @Nullable
        protected String externalId;
        /**
         * Sets the ExternalId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GovernanceResourceRegisterParameterSetBuilder withExternalId(@Nullable final String val) {
            this.externalId = val;
            return this;
        }
        /**
         * Instanciates a new GovernanceResourceRegisterParameterSetBuilder
         */
        @Nullable
        protected GovernanceResourceRegisterParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public GovernanceResourceRegisterParameterSet build() {
            return new GovernanceResourceRegisterParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.externalId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("externalId", externalId));
        }
        return result;
    }
}
