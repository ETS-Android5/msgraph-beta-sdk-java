// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Acquire Access Token Parameter Set.
 */
public class SynchronizationAcquireAccessTokenParameterSet {
    /**
     * The credentials.
     * 
     */
    @SerializedName(value = "credentials", alternate = {"Credentials"})
    @Expose
	@Nullable
    public java.util.List<SynchronizationSecretKeyStringValuePair> credentials;


    /**
     * Instiaciates a new SynchronizationAcquireAccessTokenParameterSet
     */
    public SynchronizationAcquireAccessTokenParameterSet() {}
    /**
     * Instiaciates a new SynchronizationAcquireAccessTokenParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected SynchronizationAcquireAccessTokenParameterSet(@Nonnull final SynchronizationAcquireAccessTokenParameterSetBuilder builder) {
        this.credentials = builder.credentials;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static SynchronizationAcquireAccessTokenParameterSetBuilder newBuilder() {
        return new SynchronizationAcquireAccessTokenParameterSetBuilder();
    }
    /**
     * Fluent builder for the SynchronizationAcquireAccessTokenParameterSet
     */
    public static final class SynchronizationAcquireAccessTokenParameterSetBuilder {
        /**
         * The credentials parameter value
         */
        @Nullable
        protected java.util.List<SynchronizationSecretKeyStringValuePair> credentials;
        /**
         * Sets the Credentials
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SynchronizationAcquireAccessTokenParameterSetBuilder withCredentials(@Nullable final java.util.List<SynchronizationSecretKeyStringValuePair> val) {
            this.credentials = val;
            return this;
        }
        /**
         * Instanciates a new SynchronizationAcquireAccessTokenParameterSetBuilder
         */
        @Nullable
        protected SynchronizationAcquireAccessTokenParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public SynchronizationAcquireAccessTokenParameterSet build() {
            return new SynchronizationAcquireAccessTokenParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.credentials != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("credentials", credentials));
        }
        return result;
    }
}
