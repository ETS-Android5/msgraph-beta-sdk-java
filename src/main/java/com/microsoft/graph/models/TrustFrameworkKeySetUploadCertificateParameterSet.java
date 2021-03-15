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
 * The class for the Trust Framework Key Set Upload Certificate Parameter Set.
 */
public class TrustFrameworkKeySetUploadCertificateParameterSet {
    /**
     * The key.
     * 
     */
    @SerializedName(value = "key", alternate = {"Key"})
    @Expose
	@Nullable
    public String key;


    /**
     * Instiaciates a new TrustFrameworkKeySetUploadCertificateParameterSet
     */
    public TrustFrameworkKeySetUploadCertificateParameterSet() {}
    /**
     * Instiaciates a new TrustFrameworkKeySetUploadCertificateParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TrustFrameworkKeySetUploadCertificateParameterSet(@Nonnull final TrustFrameworkKeySetUploadCertificateParameterSetBuilder builder) {
        this.key = builder.key;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TrustFrameworkKeySetUploadCertificateParameterSetBuilder newBuilder() {
        return new TrustFrameworkKeySetUploadCertificateParameterSetBuilder();
    }
    /**
     * Fluent builder for the TrustFrameworkKeySetUploadCertificateParameterSet
     */
    public static final class TrustFrameworkKeySetUploadCertificateParameterSetBuilder {
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
        public TrustFrameworkKeySetUploadCertificateParameterSetBuilder withKey(@Nullable final String val) {
            this.key = val;
            return this;
        }
        /**
         * Instanciates a new TrustFrameworkKeySetUploadCertificateParameterSetBuilder
         */
        @Nullable
        protected TrustFrameworkKeySetUploadCertificateParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TrustFrameworkKeySetUploadCertificateParameterSet build() {
            return new TrustFrameworkKeySetUploadCertificateParameterSet(this);
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
        return result;
    }
}
