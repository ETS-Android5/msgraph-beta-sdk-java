// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ChromeOSOnboardingStatus;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chrome OSOnboarding Settings Connect Parameter Set.
 */
public class ChromeOSOnboardingSettingsConnectParameterSet {
    /**
     * The owner User Principal Name.
     * 
     */
    @SerializedName(value = "ownerUserPrincipalName", alternate = {"OwnerUserPrincipalName"})
    @Expose
	@Nullable
    public String ownerUserPrincipalName;

    /**
     * The service Account Credentials.
     * 
     */
    @SerializedName(value = "serviceAccountCredentials", alternate = {"ServiceAccountCredentials"})
    @Expose
	@Nullable
    public String serviceAccountCredentials;


    /**
     * Instiaciates a new ChromeOSOnboardingSettingsConnectParameterSet
     */
    public ChromeOSOnboardingSettingsConnectParameterSet() {}
    /**
     * Instiaciates a new ChromeOSOnboardingSettingsConnectParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ChromeOSOnboardingSettingsConnectParameterSet(@Nonnull final ChromeOSOnboardingSettingsConnectParameterSetBuilder builder) {
        this.ownerUserPrincipalName = builder.ownerUserPrincipalName;
        this.serviceAccountCredentials = builder.serviceAccountCredentials;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ChromeOSOnboardingSettingsConnectParameterSetBuilder newBuilder() {
        return new ChromeOSOnboardingSettingsConnectParameterSetBuilder();
    }
    /**
     * Fluent builder for the ChromeOSOnboardingSettingsConnectParameterSet
     */
    public static final class ChromeOSOnboardingSettingsConnectParameterSetBuilder {
        /**
         * The ownerUserPrincipalName parameter value
         */
        @Nullable
        protected String ownerUserPrincipalName;
        /**
         * Sets the OwnerUserPrincipalName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ChromeOSOnboardingSettingsConnectParameterSetBuilder withOwnerUserPrincipalName(@Nullable final String val) {
            this.ownerUserPrincipalName = val;
            return this;
        }
        /**
         * The serviceAccountCredentials parameter value
         */
        @Nullable
        protected String serviceAccountCredentials;
        /**
         * Sets the ServiceAccountCredentials
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ChromeOSOnboardingSettingsConnectParameterSetBuilder withServiceAccountCredentials(@Nullable final String val) {
            this.serviceAccountCredentials = val;
            return this;
        }
        /**
         * Instanciates a new ChromeOSOnboardingSettingsConnectParameterSetBuilder
         */
        @Nullable
        protected ChromeOSOnboardingSettingsConnectParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ChromeOSOnboardingSettingsConnectParameterSet build() {
            return new ChromeOSOnboardingSettingsConnectParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.ownerUserPrincipalName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("ownerUserPrincipalName", ownerUserPrincipalName));
        }
        if(this.serviceAccountCredentials != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("serviceAccountCredentials", serviceAccountCredentials));
        }
        return result;
    }
}
