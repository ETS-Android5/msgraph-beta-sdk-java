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
 * The class for the Dep Onboarding Setting Get Expiring Vpp Token Count Parameter Set.
 */
public class DepOnboardingSettingGetExpiringVppTokenCountParameterSet {
    /**
     * The expiring Before Date Time.
     * 
     */
    @SerializedName(value = "expiringBeforeDateTime", alternate = {"ExpiringBeforeDateTime"})
    @Expose
	@Nullable
    public String expiringBeforeDateTime;


    /**
     * Instiaciates a new DepOnboardingSettingGetExpiringVppTokenCountParameterSet
     */
    public DepOnboardingSettingGetExpiringVppTokenCountParameterSet() {}
    /**
     * Instiaciates a new DepOnboardingSettingGetExpiringVppTokenCountParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DepOnboardingSettingGetExpiringVppTokenCountParameterSet(@Nonnull final DepOnboardingSettingGetExpiringVppTokenCountParameterSetBuilder builder) {
        this.expiringBeforeDateTime = builder.expiringBeforeDateTime;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DepOnboardingSettingGetExpiringVppTokenCountParameterSetBuilder newBuilder() {
        return new DepOnboardingSettingGetExpiringVppTokenCountParameterSetBuilder();
    }
    /**
     * Fluent builder for the DepOnboardingSettingGetExpiringVppTokenCountParameterSet
     */
    public static final class DepOnboardingSettingGetExpiringVppTokenCountParameterSetBuilder {
        /**
         * The expiringBeforeDateTime parameter value
         */
        @Nullable
        protected String expiringBeforeDateTime;
        /**
         * Sets the ExpiringBeforeDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DepOnboardingSettingGetExpiringVppTokenCountParameterSetBuilder withExpiringBeforeDateTime(@Nullable final String val) {
            this.expiringBeforeDateTime = val;
            return this;
        }
        /**
         * Instanciates a new DepOnboardingSettingGetExpiringVppTokenCountParameterSetBuilder
         */
        @Nullable
        protected DepOnboardingSettingGetExpiringVppTokenCountParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DepOnboardingSettingGetExpiringVppTokenCountParameterSet build() {
            return new DepOnboardingSettingGetExpiringVppTokenCountParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.expiringBeforeDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("expiringBeforeDateTime", expiringBeforeDateTime));
        }
        return result;
    }
}
