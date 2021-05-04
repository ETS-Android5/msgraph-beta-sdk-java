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
 * The class for the Organization Activate Service Parameter Set.
 */
public class OrganizationActivateServiceParameterSet {
    /**
     * The service.
     * 
     */
    @SerializedName(value = "service", alternate = {"Service"})
    @Expose
	@Nullable
    public String service;

    /**
     * The service Plan Id.
     * 
     */
    @SerializedName(value = "servicePlanId", alternate = {"ServicePlanId"})
    @Expose
	@Nullable
    public java.util.UUID servicePlanId;

    /**
     * The sku Id.
     * 
     */
    @SerializedName(value = "skuId", alternate = {"SkuId"})
    @Expose
	@Nullable
    public java.util.UUID skuId;


    /**
     * Instiaciates a new OrganizationActivateServiceParameterSet
     */
    public OrganizationActivateServiceParameterSet() {}
    /**
     * Instiaciates a new OrganizationActivateServiceParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected OrganizationActivateServiceParameterSet(@Nonnull final OrganizationActivateServiceParameterSetBuilder builder) {
        this.service = builder.service;
        this.servicePlanId = builder.servicePlanId;
        this.skuId = builder.skuId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static OrganizationActivateServiceParameterSetBuilder newBuilder() {
        return new OrganizationActivateServiceParameterSetBuilder();
    }
    /**
     * Fluent builder for the OrganizationActivateServiceParameterSet
     */
    public static final class OrganizationActivateServiceParameterSetBuilder {
        /**
         * The service parameter value
         */
        @Nullable
        protected String service;
        /**
         * Sets the Service
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OrganizationActivateServiceParameterSetBuilder withService(@Nullable final String val) {
            this.service = val;
            return this;
        }
        /**
         * The servicePlanId parameter value
         */
        @Nullable
        protected java.util.UUID servicePlanId;
        /**
         * Sets the ServicePlanId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OrganizationActivateServiceParameterSetBuilder withServicePlanId(@Nullable final java.util.UUID val) {
            this.servicePlanId = val;
            return this;
        }
        /**
         * The skuId parameter value
         */
        @Nullable
        protected java.util.UUID skuId;
        /**
         * Sets the SkuId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OrganizationActivateServiceParameterSetBuilder withSkuId(@Nullable final java.util.UUID val) {
            this.skuId = val;
            return this;
        }
        /**
         * Instanciates a new OrganizationActivateServiceParameterSetBuilder
         */
        @Nullable
        protected OrganizationActivateServiceParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public OrganizationActivateServiceParameterSet build() {
            return new OrganizationActivateServiceParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.service != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("service", service));
        }
        if(this.servicePlanId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("servicePlanId", servicePlanId));
        }
        if(this.skuId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("skuId", skuId));
        }
        return result;
    }
}
