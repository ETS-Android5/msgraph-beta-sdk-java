// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.CloudPcSourceDeviceImage;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc Device Image Get Source Images Parameter Set.
 */
public class CloudPcDeviceImageGetSourceImagesParameterSet {

    /**
     * Instiaciates a new CloudPcDeviceImageGetSourceImagesParameterSet
     */
    public CloudPcDeviceImageGetSourceImagesParameterSet() {}
    /**
     * Instiaciates a new CloudPcDeviceImageGetSourceImagesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CloudPcDeviceImageGetSourceImagesParameterSet(@Nonnull final CloudPcDeviceImageGetSourceImagesParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CloudPcDeviceImageGetSourceImagesParameterSetBuilder newBuilder() {
        return new CloudPcDeviceImageGetSourceImagesParameterSetBuilder();
    }
    /**
     * Fluent builder for the CloudPcDeviceImageGetSourceImagesParameterSet
     */
    public static final class CloudPcDeviceImageGetSourceImagesParameterSetBuilder {
        /**
         * Instanciates a new CloudPcDeviceImageGetSourceImagesParameterSetBuilder
         */
        @Nullable
        protected CloudPcDeviceImageGetSourceImagesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CloudPcDeviceImageGetSourceImagesParameterSet build() {
            return new CloudPcDeviceImageGetSourceImagesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        return result;
    }
}
