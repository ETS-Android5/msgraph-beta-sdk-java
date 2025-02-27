// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.graph.models.CallDisposition;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Redirect Parameter Set.
 */
public class CallRedirectParameterSet {
    /**
     * The targets.
     * 
     */
    @SerializedName(value = "targets", alternate = {"Targets"})
    @Expose
	@Nullable
    public java.util.List<InvitationParticipantInfo> targets;

    /**
     * The target Disposition.
     * 
     */
    @SerializedName(value = "targetDisposition", alternate = {"TargetDisposition"})
    @Expose
	@Nullable
    public CallDisposition targetDisposition;

    /**
     * The timeout.
     * 
     */
    @SerializedName(value = "timeout", alternate = {"Timeout"})
    @Expose
	@Nullable
    public Integer timeout;

    /**
     * The mask Callee.
     * 
     */
    @SerializedName(value = "maskCallee", alternate = {"MaskCallee"})
    @Expose
	@Nullable
    public Boolean maskCallee;

    /**
     * The mask Caller.
     * 
     */
    @SerializedName(value = "maskCaller", alternate = {"MaskCaller"})
    @Expose
	@Nullable
    public Boolean maskCaller;

    /**
     * The callback Uri.
     * 
     */
    @SerializedName(value = "callbackUri", alternate = {"CallbackUri"})
    @Expose
	@Nullable
    public String callbackUri;


    /**
     * Instiaciates a new CallRedirectParameterSet
     */
    public CallRedirectParameterSet() {}
    /**
     * Instiaciates a new CallRedirectParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CallRedirectParameterSet(@Nonnull final CallRedirectParameterSetBuilder builder) {
        this.targets = builder.targets;
        this.targetDisposition = builder.targetDisposition;
        this.timeout = builder.timeout;
        this.maskCallee = builder.maskCallee;
        this.maskCaller = builder.maskCaller;
        this.callbackUri = builder.callbackUri;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallRedirectParameterSetBuilder newBuilder() {
        return new CallRedirectParameterSetBuilder();
    }
    /**
     * Fluent builder for the CallRedirectParameterSet
     */
    public static final class CallRedirectParameterSetBuilder {
        /**
         * The targets parameter value
         */
        @Nullable
        protected java.util.List<InvitationParticipantInfo> targets;
        /**
         * Sets the Targets
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRedirectParameterSetBuilder withTargets(@Nullable final java.util.List<InvitationParticipantInfo> val) {
            this.targets = val;
            return this;
        }
        /**
         * The targetDisposition parameter value
         */
        @Nullable
        protected CallDisposition targetDisposition;
        /**
         * Sets the TargetDisposition
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRedirectParameterSetBuilder withTargetDisposition(@Nullable final CallDisposition val) {
            this.targetDisposition = val;
            return this;
        }
        /**
         * The timeout parameter value
         */
        @Nullable
        protected Integer timeout;
        /**
         * Sets the Timeout
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRedirectParameterSetBuilder withTimeout(@Nullable final Integer val) {
            this.timeout = val;
            return this;
        }
        /**
         * The maskCallee parameter value
         */
        @Nullable
        protected Boolean maskCallee;
        /**
         * Sets the MaskCallee
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRedirectParameterSetBuilder withMaskCallee(@Nullable final Boolean val) {
            this.maskCallee = val;
            return this;
        }
        /**
         * The maskCaller parameter value
         */
        @Nullable
        protected Boolean maskCaller;
        /**
         * Sets the MaskCaller
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRedirectParameterSetBuilder withMaskCaller(@Nullable final Boolean val) {
            this.maskCaller = val;
            return this;
        }
        /**
         * The callbackUri parameter value
         */
        @Nullable
        protected String callbackUri;
        /**
         * Sets the CallbackUri
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRedirectParameterSetBuilder withCallbackUri(@Nullable final String val) {
            this.callbackUri = val;
            return this;
        }
        /**
         * Instanciates a new CallRedirectParameterSetBuilder
         */
        @Nullable
        protected CallRedirectParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallRedirectParameterSet build() {
            return new CallRedirectParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.targets != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("targets", targets));
        }
        if(this.targetDisposition != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("targetDisposition", targetDisposition));
        }
        if(this.timeout != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("timeout", timeout));
        }
        if(this.maskCallee != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("maskCallee", maskCallee));
        }
        if(this.maskCaller != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("maskCaller", maskCaller));
        }
        if(this.callbackUri != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("callbackUri", callbackUri));
        }
        return result;
    }
}
