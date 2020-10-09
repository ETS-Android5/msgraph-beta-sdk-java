// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserIdentity;
import com.microsoft.graph.models.extensions.ProgramResource;
import com.microsoft.graph.models.extensions.Program;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Program Control.
 */
public class ProgramControl extends Entity implements IJsonBackedObject {


    /**
     * The Control Id.
     * 
     */
    @SerializedName(value = "controlId", alternate = {"ControlId"})
    @Expose
    public String controlId;

    /**
     * The Control Type Id.
     * 
     */
    @SerializedName(value = "controlTypeId", alternate = {"ControlTypeId"})
    @Expose
    public String controlTypeId;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Owner.
     * 
     */
    @SerializedName(value = "owner", alternate = {"Owner"})
    @Expose
    public UserIdentity owner;

    /**
     * The Program Id.
     * 
     */
    @SerializedName(value = "programId", alternate = {"ProgramId"})
    @Expose
    public String programId;

    /**
     * The Resource.
     * 
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
    public ProgramResource resource;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public String status;

    /**
     * The Program.
     * 
     */
    @SerializedName(value = "program", alternate = {"Program"})
    @Expose
    public Program program;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
