// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceLogCollectionRequest;
import com.microsoft.graph.models.DeviceLogCollectionResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Create Device Log Collection Request Parameter Set.
 */
public class ManagedDeviceCreateDeviceLogCollectionRequestParameterSet {
    /**
     * The template Type.
     * 
     */
    @SerializedName(value = "templateType", alternate = {"TemplateType"})
    @Expose
	@Nullable
    public DeviceLogCollectionRequest templateType;


    /**
     * Instiaciates a new ManagedDeviceCreateDeviceLogCollectionRequestParameterSet
     */
    public ManagedDeviceCreateDeviceLogCollectionRequestParameterSet() {}
    /**
     * Instiaciates a new ManagedDeviceCreateDeviceLogCollectionRequestParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagedDeviceCreateDeviceLogCollectionRequestParameterSet(@Nonnull final ManagedDeviceCreateDeviceLogCollectionRequestParameterSetBuilder builder) {
        this.templateType = builder.templateType;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedDeviceCreateDeviceLogCollectionRequestParameterSetBuilder newBuilder() {
        return new ManagedDeviceCreateDeviceLogCollectionRequestParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagedDeviceCreateDeviceLogCollectionRequestParameterSet
     */
    public static final class ManagedDeviceCreateDeviceLogCollectionRequestParameterSetBuilder {
        /**
         * The templateType parameter value
         */
        @Nullable
        protected DeviceLogCollectionRequest templateType;
        /**
         * Sets the TemplateType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceCreateDeviceLogCollectionRequestParameterSetBuilder withTemplateType(@Nullable final DeviceLogCollectionRequest val) {
            this.templateType = val;
            return this;
        }
        /**
         * Instanciates a new ManagedDeviceCreateDeviceLogCollectionRequestParameterSetBuilder
         */
        @Nullable
        protected ManagedDeviceCreateDeviceLogCollectionRequestParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedDeviceCreateDeviceLogCollectionRequestParameterSet build() {
            return new ManagedDeviceCreateDeviceLogCollectionRequestParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.templateType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("templateType", templateType));
        }
        return result;
    }
}
