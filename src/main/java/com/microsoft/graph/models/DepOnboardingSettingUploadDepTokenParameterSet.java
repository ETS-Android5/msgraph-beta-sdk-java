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
 * The class for the Dep Onboarding Setting Upload Dep Token Parameter Set.
 */
public class DepOnboardingSettingUploadDepTokenParameterSet {
    /**
     * The apple Id.
     * 
     */
    @SerializedName(value = "appleId", alternate = {"AppleId"})
    @Expose
	@Nullable
    public String appleId;

    /**
     * The dep Token.
     * 
     */
    @SerializedName(value = "depToken", alternate = {"DepToken"})
    @Expose
	@Nullable
    public String depToken;


    /**
     * Instiaciates a new DepOnboardingSettingUploadDepTokenParameterSet
     */
    public DepOnboardingSettingUploadDepTokenParameterSet() {}
    /**
     * Instiaciates a new DepOnboardingSettingUploadDepTokenParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DepOnboardingSettingUploadDepTokenParameterSet(@Nonnull final DepOnboardingSettingUploadDepTokenParameterSetBuilder builder) {
        this.appleId = builder.appleId;
        this.depToken = builder.depToken;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DepOnboardingSettingUploadDepTokenParameterSetBuilder newBuilder() {
        return new DepOnboardingSettingUploadDepTokenParameterSetBuilder();
    }
    /**
     * Fluent builder for the DepOnboardingSettingUploadDepTokenParameterSet
     */
    public static final class DepOnboardingSettingUploadDepTokenParameterSetBuilder {
        /**
         * The appleId parameter value
         */
        @Nullable
        protected String appleId;
        /**
         * Sets the AppleId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DepOnboardingSettingUploadDepTokenParameterSetBuilder withAppleId(@Nullable final String val) {
            this.appleId = val;
            return this;
        }
        /**
         * The depToken parameter value
         */
        @Nullable
        protected String depToken;
        /**
         * Sets the DepToken
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DepOnboardingSettingUploadDepTokenParameterSetBuilder withDepToken(@Nullable final String val) {
            this.depToken = val;
            return this;
        }
        /**
         * Instanciates a new DepOnboardingSettingUploadDepTokenParameterSetBuilder
         */
        @Nullable
        protected DepOnboardingSettingUploadDepTokenParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DepOnboardingSettingUploadDepTokenParameterSet build() {
            return new DepOnboardingSettingUploadDepTokenParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.appleId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("appleId", appleId));
        }
        if(this.depToken != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("depToken", depToken));
        }
        return result;
    }
}
