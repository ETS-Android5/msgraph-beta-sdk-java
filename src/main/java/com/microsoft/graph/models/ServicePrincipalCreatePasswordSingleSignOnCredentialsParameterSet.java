// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.Credential;
import com.microsoft.graph.models.PasswordSingleSignOnCredentialSet;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Create Password Single Sign On Credentials Parameter Set.
 */
public class ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet {
    /**
     * The id.
     * 
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The credentials.
     * 
     */
    @SerializedName(value = "credentials", alternate = {"Credentials"})
    @Expose
	@Nullable
    public java.util.List<Credential> credentials;


    /**
     * Instiaciates a new ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet
     */
    public ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet() {}
    /**
     * Instiaciates a new ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet(@Nonnull final ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSetBuilder builder) {
        this.id = builder.id;
        this.credentials = builder.credentials;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSetBuilder newBuilder() {
        return new ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSetBuilder();
    }
    /**
     * Fluent builder for the ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet
     */
    public static final class ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSetBuilder {
        /**
         * The id parameter value
         */
        @Nullable
        protected String id;
        /**
         * Sets the Id
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSetBuilder withId(@Nullable final String val) {
            this.id = val;
            return this;
        }
        /**
         * The credentials parameter value
         */
        @Nullable
        protected java.util.List<Credential> credentials;
        /**
         * Sets the Credentials
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSetBuilder withCredentials(@Nullable final java.util.List<Credential> val) {
            this.credentials = val;
            return this;
        }
        /**
         * Instanciates a new ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSetBuilder
         */
        @Nullable
        protected ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet build() {
            return new ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.id != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("id", id));
        }
        if(this.credentials != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("credentials", credentials));
        }
        return result;
    }
}
