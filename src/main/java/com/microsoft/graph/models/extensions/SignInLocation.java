// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.GeoCoordinates;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sign In Location.
 */
public class SignInLocation implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The City.
     * Provides the city where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity.
     */
    @SerializedName(value = "city", alternate = {"City"})
    @Expose
    public String city;

    /**
     * The Country Or Region.
     * Provides the country code info (2 letter code) where the sign-in originated.  This is calculated using latitude/longitude information from the sign-in activity.
     */
    @SerializedName(value = "countryOrRegion", alternate = {"CountryOrRegion"})
    @Expose
    public String countryOrRegion;

    /**
     * The Geo Coordinates.
     * Provides the latitude, longitude and altitude where the sign-in originated.
     */
    @SerializedName(value = "geoCoordinates", alternate = {"GeoCoordinates"})
    @Expose
    public GeoCoordinates geoCoordinates;

    /**
     * The State.
     * Provides the State where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public String state;


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
