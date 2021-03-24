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
 * The class for the Trust Framework Key Set Upload Secret Parameter Set.
 */
public class TrustFrameworkKeySetUploadSecretParameterSet {
    /**
     * The use.
     * 
     */
    @SerializedName(value = "use", alternate = {"Use"})
    @Expose
	@Nullable
    public String use;

    /**
     * The k.
     * 
     */
    @SerializedName(value = "k", alternate = {"K"})
    @Expose
	@Nullable
    public String k;

    /**
     * The nbf.
     * 
     */
    @SerializedName(value = "nbf", alternate = {"Nbf"})
    @Expose
	@Nullable
    public Long nbf;

    /**
     * The exp.
     * 
     */
    @SerializedName(value = "exp", alternate = {"Exp"})
    @Expose
	@Nullable
    public Long exp;


    /**
     * Instiaciates a new TrustFrameworkKeySetUploadSecretParameterSet
     */
    public TrustFrameworkKeySetUploadSecretParameterSet() {}
    /**
     * Instiaciates a new TrustFrameworkKeySetUploadSecretParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TrustFrameworkKeySetUploadSecretParameterSet(@Nonnull final TrustFrameworkKeySetUploadSecretParameterSetBuilder builder) {
        this.use = builder.use;
        this.k = builder.k;
        this.nbf = builder.nbf;
        this.exp = builder.exp;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TrustFrameworkKeySetUploadSecretParameterSetBuilder newBuilder() {
        return new TrustFrameworkKeySetUploadSecretParameterSetBuilder();
    }
    /**
     * Fluent builder for the TrustFrameworkKeySetUploadSecretParameterSet
     */
    public static final class TrustFrameworkKeySetUploadSecretParameterSetBuilder {
        /**
         * The use parameter value
         */
        @Nullable
        protected String use;
        /**
         * Sets the Use
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TrustFrameworkKeySetUploadSecretParameterSetBuilder withUse(@Nullable final String val) {
            this.use = val;
            return this;
        }
        /**
         * The k parameter value
         */
        @Nullable
        protected String k;
        /**
         * Sets the K
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TrustFrameworkKeySetUploadSecretParameterSetBuilder withK(@Nullable final String val) {
            this.k = val;
            return this;
        }
        /**
         * The nbf parameter value
         */
        @Nullable
        protected Long nbf;
        /**
         * Sets the Nbf
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TrustFrameworkKeySetUploadSecretParameterSetBuilder withNbf(@Nullable final Long val) {
            this.nbf = val;
            return this;
        }
        /**
         * The exp parameter value
         */
        @Nullable
        protected Long exp;
        /**
         * Sets the Exp
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TrustFrameworkKeySetUploadSecretParameterSetBuilder withExp(@Nullable final Long val) {
            this.exp = val;
            return this;
        }
        /**
         * Instanciates a new TrustFrameworkKeySetUploadSecretParameterSetBuilder
         */
        @Nullable
        protected TrustFrameworkKeySetUploadSecretParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TrustFrameworkKeySetUploadSecretParameterSet build() {
            return new TrustFrameworkKeySetUploadSecretParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.use != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("use", use));
        }
        if(this.k != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("k", k));
        }
        if(this.nbf != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("nbf", nbf));
        }
        if(this.exp != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("exp", exp));
        }
        return result;
    }
}
