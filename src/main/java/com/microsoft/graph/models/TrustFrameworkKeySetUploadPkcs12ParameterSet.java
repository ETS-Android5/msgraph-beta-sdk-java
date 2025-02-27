// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.TrustFrameworkKey;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Key Set Upload Pkcs12Parameter Set.
 */
public class TrustFrameworkKeySetUploadPkcs12ParameterSet {
    /**
     * The key.
     * 
     */
    @SerializedName(value = "key", alternate = {"Key"})
    @Expose
	@Nullable
    public String key;

    /**
     * The password.
     * 
     */
    @SerializedName(value = "password", alternate = {"Password"})
    @Expose
	@Nullable
    public String password;


    /**
     * Instiaciates a new TrustFrameworkKeySetUploadPkcs12ParameterSet
     */
    public TrustFrameworkKeySetUploadPkcs12ParameterSet() {}
    /**
     * Instiaciates a new TrustFrameworkKeySetUploadPkcs12ParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TrustFrameworkKeySetUploadPkcs12ParameterSet(@Nonnull final TrustFrameworkKeySetUploadPkcs12ParameterSetBuilder builder) {
        this.key = builder.key;
        this.password = builder.password;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TrustFrameworkKeySetUploadPkcs12ParameterSetBuilder newBuilder() {
        return new TrustFrameworkKeySetUploadPkcs12ParameterSetBuilder();
    }
    /**
     * Fluent builder for the TrustFrameworkKeySetUploadPkcs12ParameterSet
     */
    public static final class TrustFrameworkKeySetUploadPkcs12ParameterSetBuilder {
        /**
         * The key parameter value
         */
        @Nullable
        protected String key;
        /**
         * Sets the Key
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TrustFrameworkKeySetUploadPkcs12ParameterSetBuilder withKey(@Nullable final String val) {
            this.key = val;
            return this;
        }
        /**
         * The password parameter value
         */
        @Nullable
        protected String password;
        /**
         * Sets the Password
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TrustFrameworkKeySetUploadPkcs12ParameterSetBuilder withPassword(@Nullable final String val) {
            this.password = val;
            return this;
        }
        /**
         * Instanciates a new TrustFrameworkKeySetUploadPkcs12ParameterSetBuilder
         */
        @Nullable
        protected TrustFrameworkKeySetUploadPkcs12ParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TrustFrameworkKeySetUploadPkcs12ParameterSet build() {
            return new TrustFrameworkKeySetUploadPkcs12ParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.key != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("key", key));
        }
        if(this.password != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("password", password));
        }
        return result;
    }
}
