// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.SuggestedEnrollmentLimit;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Get Suggested Enrollment Limit Parameter Set.
 */
public class DeviceManagementGetSuggestedEnrollmentLimitParameterSet {
    /**
     * The enrollment Type.
     * 
     */
    @SerializedName(value = "enrollmentType", alternate = {"EnrollmentType"})
    @Expose
	@Nullable
    public String enrollmentType;


    /**
     * Instiaciates a new DeviceManagementGetSuggestedEnrollmentLimitParameterSet
     */
    public DeviceManagementGetSuggestedEnrollmentLimitParameterSet() {}
    /**
     * Instiaciates a new DeviceManagementGetSuggestedEnrollmentLimitParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceManagementGetSuggestedEnrollmentLimitParameterSet(@Nonnull final DeviceManagementGetSuggestedEnrollmentLimitParameterSetBuilder builder) {
        this.enrollmentType = builder.enrollmentType;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceManagementGetSuggestedEnrollmentLimitParameterSetBuilder newBuilder() {
        return new DeviceManagementGetSuggestedEnrollmentLimitParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceManagementGetSuggestedEnrollmentLimitParameterSet
     */
    public static final class DeviceManagementGetSuggestedEnrollmentLimitParameterSetBuilder {
        /**
         * The enrollmentType parameter value
         */
        @Nullable
        protected String enrollmentType;
        /**
         * Sets the EnrollmentType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementGetSuggestedEnrollmentLimitParameterSetBuilder withEnrollmentType(@Nullable final String val) {
            this.enrollmentType = val;
            return this;
        }
        /**
         * Instanciates a new DeviceManagementGetSuggestedEnrollmentLimitParameterSetBuilder
         */
        @Nullable
        protected DeviceManagementGetSuggestedEnrollmentLimitParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceManagementGetSuggestedEnrollmentLimitParameterSet build() {
            return new DeviceManagementGetSuggestedEnrollmentLimitParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.enrollmentType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("enrollmentType", enrollmentType));
        }
        return result;
    }
}
