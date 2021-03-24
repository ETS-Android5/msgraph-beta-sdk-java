// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceManagementSettingComparison;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Compare Parameter Set.
 */
public class DeviceManagementIntentCompareParameterSet {
    /**
     * The template Id.
     * 
     */
    @SerializedName(value = "templateId", alternate = {"TemplateId"})
    @Expose
	@Nullable
    public String templateId;


    /**
     * Instiaciates a new DeviceManagementIntentCompareParameterSet
     */
    public DeviceManagementIntentCompareParameterSet() {}
    /**
     * Instiaciates a new DeviceManagementIntentCompareParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceManagementIntentCompareParameterSet(@Nonnull final DeviceManagementIntentCompareParameterSetBuilder builder) {
        this.templateId = builder.templateId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceManagementIntentCompareParameterSetBuilder newBuilder() {
        return new DeviceManagementIntentCompareParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceManagementIntentCompareParameterSet
     */
    public static final class DeviceManagementIntentCompareParameterSetBuilder {
        /**
         * The templateId parameter value
         */
        @Nullable
        protected String templateId;
        /**
         * Sets the TemplateId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementIntentCompareParameterSetBuilder withTemplateId(@Nullable final String val) {
            this.templateId = val;
            return this;
        }
        /**
         * Instanciates a new DeviceManagementIntentCompareParameterSetBuilder
         */
        @Nullable
        protected DeviceManagementIntentCompareParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceManagementIntentCompareParameterSet build() {
            return new DeviceManagementIntentCompareParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.templateId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("templateId", templateId));
        }
        return result;
    }
}
