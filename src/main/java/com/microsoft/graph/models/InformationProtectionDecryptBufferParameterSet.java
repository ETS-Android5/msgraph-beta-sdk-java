// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.BufferDecryptionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Decrypt Buffer Parameter Set.
 * @deprecated This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs.
 */
@Deprecated
public class InformationProtectionDecryptBufferParameterSet {
    /**
     * The encrypted Buffer.
     * 
     */
    @SerializedName(value = "encryptedBuffer", alternate = {"EncryptedBuffer"})
    @Expose
	@Nonnull
    public byte[] encryptedBuffer;

    /**
     * The publishing License.
     * 
     */
    @SerializedName(value = "publishingLicense", alternate = {"PublishingLicense"})
    @Expose
	@Nonnull
    public byte[] publishingLicense;


    /**
     * Instiaciates a new InformationProtectionDecryptBufferParameterSet
     */
    public InformationProtectionDecryptBufferParameterSet() {}
    /**
     * Instiaciates a new InformationProtectionDecryptBufferParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected InformationProtectionDecryptBufferParameterSet(@Nonnull final InformationProtectionDecryptBufferParameterSetBuilder builder) {
        this.encryptedBuffer = builder.encryptedBuffer;
        this.publishingLicense = builder.publishingLicense;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static InformationProtectionDecryptBufferParameterSetBuilder newBuilder() {
        return new InformationProtectionDecryptBufferParameterSetBuilder();
    }
    /**
     * Fluent builder for the InformationProtectionDecryptBufferParameterSet
     */
    public static final class InformationProtectionDecryptBufferParameterSetBuilder {
        /**
         * The encryptedBuffer parameter value
         */
        @Nullable
        protected byte[] encryptedBuffer;
        /**
         * Sets the EncryptedBuffer
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public InformationProtectionDecryptBufferParameterSetBuilder withEncryptedBuffer(@Nullable final byte[] val) {
            this.encryptedBuffer = val;
            return this;
        }
        /**
         * The publishingLicense parameter value
         */
        @Nullable
        protected byte[] publishingLicense;
        /**
         * Sets the PublishingLicense
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public InformationProtectionDecryptBufferParameterSetBuilder withPublishingLicense(@Nullable final byte[] val) {
            this.publishingLicense = val;
            return this;
        }
        /**
         * Instanciates a new InformationProtectionDecryptBufferParameterSetBuilder
         */
        @Nullable
        protected InformationProtectionDecryptBufferParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public InformationProtectionDecryptBufferParameterSet build() {
            return new InformationProtectionDecryptBufferParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.encryptedBuffer != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("encryptedBuffer", encryptedBuffer));
        }
        if(this.publishingLicense != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("publishingLicense", publishingLicense));
        }
        return result;
    }
}
