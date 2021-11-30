// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.ediscovery.models.DataSourceContainerStatus;
import com.microsoft.graph.ediscovery.models.CaseIndexOperation;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Source Container.
 */
public class DataSourceContainer extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Created date and time of the dataSourceContainer entity.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Display Name.
     * Display name of the dataSourceContainer entity.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * Last modified date and time of the dataSourceContainer.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Released Date Time.
     * Date and time that the dataSourceContainer was released from the case.
     */
    @SerializedName(value = "releasedDateTime", alternate = {"ReleasedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime releasedDateTime;

    /**
     * The Status.
     * Latest status of the dataSourceContainer. Possible values are: Active, Released.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public DataSourceContainerStatus status;

    /**
     * The Last Index Operation.
     * 
     */
    @SerializedName(value = "lastIndexOperation", alternate = {"LastIndexOperation"})
    @Expose
	@Nullable
    public CaseIndexOperation lastIndexOperation;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
