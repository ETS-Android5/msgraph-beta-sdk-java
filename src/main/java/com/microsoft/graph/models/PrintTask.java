// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PrintTaskStatus;
import com.microsoft.graph.models.PrintTaskDefinition;
import com.microsoft.graph.models.PrintTaskTrigger;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task.
 */
public class PrintTask extends Entity implements IJsonBackedObject {


    /**
     * The Parent Url.
     * The URL for the print entity that triggered this task. For example, https://graph.microsoft.com/v1.0/print/printers/{printerId}/jobs/{jobId}. Read-only.
     */
    @SerializedName(value = "parentUrl", alternate = {"ParentUrl"})
    @Expose
	@Nullable
    public String parentUrl;

    /**
     * The Status.
     * The current execution status of this printTask. The calling application is responsible for updating this status when processing is finished, unless the related printJob has been redirected to another printer. Failure to report completion will result in the related print job being blocked from printing and eventually deleted.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public PrintTaskStatus status;

    /**
     * The Definition.
     * The printTaskDefinition that was used to create this task. Read-only.
     */
    @SerializedName(value = "definition", alternate = {"Definition"})
    @Expose
	@Nullable
    public PrintTaskDefinition definition;

    /**
     * The Trigger.
     * The printTaskTrigger that triggered this task's execution. Read-only.
     */
    @SerializedName(value = "trigger", alternate = {"Trigger"})
    @Expose
	@Nullable
    public PrintTaskTrigger trigger;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
