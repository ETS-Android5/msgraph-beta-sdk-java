// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AgreementFileLocalization;
import com.microsoft.graph.models.AgreementFileProperties;
import com.microsoft.graph.requests.AgreementFileLocalizationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File.
 */
public class AgreementFile extends AgreementFileProperties implements IJsonBackedObject {


    /**
     * The Localizations.
     * 
     */
    @SerializedName(value = "localizations", alternate = {"Localizations"})
    @Expose
	@Nullable
    public AgreementFileLocalizationCollectionPage localizations;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("localizations")) {
            localizations = serializer.deserializeObject(json.get("localizations"), AgreementFileLocalizationCollectionPage.class);
        }
    }
}
