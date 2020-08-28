// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PrintJobProcessingState;
import com.microsoft.graph.models.extensions.UserIdentity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Archived Print Job.
 */
public class ArchivedPrintJob implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Id.
     * 
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The Printer Id.
     * 
     */
    @SerializedName("printerId")
    @Expose
    public String printerId;

    /**
     * The Processing State.
     * 
     */
    @SerializedName("processingState")
    @Expose
    public PrintJobProcessingState processingState;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Acquired Date Time.
     * 
     */
    @SerializedName("acquiredDateTime")
    @Expose
    public java.util.Calendar acquiredDateTime;

    /**
     * The Completion Date Time.
     * 
     */
    @SerializedName("completionDateTime")
    @Expose
    public java.util.Calendar completionDateTime;

    /**
     * The Acquired By Printer.
     * 
     */
    @SerializedName("acquiredByPrinter")
    @Expose
    public Boolean acquiredByPrinter;

    /**
     * The Copies Printed.
     * 
     */
    @SerializedName("copiesPrinted")
    @Expose
    public Integer copiesPrinted;

    /**
     * The Page Count.
     * 
     */
    @SerializedName("pageCount")
    @Expose
    public Integer pageCount;

    /**
     * The Black And White Page Count.
     * 
     */
    @SerializedName("blackAndWhitePageCount")
    @Expose
    public Integer blackAndWhitePageCount;

    /**
     * The Color Page Count.
     * 
     */
    @SerializedName("colorPageCount")
    @Expose
    public Integer colorPageCount;

    /**
     * The Simplex Page Count.
     * 
     */
    @SerializedName("simplexPageCount")
    @Expose
    public Integer simplexPageCount;

    /**
     * The Duplex Page Count.
     * 
     */
    @SerializedName("duplexPageCount")
    @Expose
    public Integer duplexPageCount;

    /**
     * The Created By.
     * 
     */
    @SerializedName("createdBy")
    @Expose
    public UserIdentity createdBy;


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
