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
import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.AdministrativeUnit;
import com.microsoft.graph.models.EducationClass;
import com.microsoft.graph.models.EducationUser;
import com.microsoft.graph.models.EducationOrganization;
import com.microsoft.graph.requests.EducationClassCollectionPage;
import com.microsoft.graph.requests.EducationUserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School.
 */
public class EducationSchool extends EducationOrganization implements IJsonBackedObject {


    /**
     * The Address.
     * Address of the school.
     */
    @SerializedName(value = "address", alternate = {"Address"})
    @Expose
	@Nullable
    public PhysicalAddress address;

    /**
     * The Created By.
     * Entity who created the school.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public IdentitySet createdBy;

    /**
     * The External Id.
     * ID of school in syncing system.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The External Principal Id.
     * ID of principal in syncing system.
     */
    @SerializedName(value = "externalPrincipalId", alternate = {"ExternalPrincipalId"})
    @Expose
	@Nullable
    public String externalPrincipalId;

    /**
     * The Fax.
     * 
     */
    @SerializedName(value = "fax", alternate = {"Fax"})
    @Expose
	@Nullable
    public String fax;

    /**
     * The Highest Grade.
     * Highest grade taught.
     */
    @SerializedName(value = "highestGrade", alternate = {"HighestGrade"})
    @Expose
	@Nullable
    public String highestGrade;

    /**
     * The Lowest Grade.
     * Lowest grade taught.
     */
    @SerializedName(value = "lowestGrade", alternate = {"LowestGrade"})
    @Expose
	@Nullable
    public String lowestGrade;

    /**
     * The Phone.
     * Phone number of school.
     */
    @SerializedName(value = "phone", alternate = {"Phone"})
    @Expose
	@Nullable
    public String phone;

    /**
     * The Principal Email.
     * Email address of the principal.
     */
    @SerializedName(value = "principalEmail", alternate = {"PrincipalEmail"})
    @Expose
	@Nullable
    public String principalEmail;

    /**
     * The Principal Name.
     * Name of the principal.
     */
    @SerializedName(value = "principalName", alternate = {"PrincipalName"})
    @Expose
	@Nullable
    public String principalName;

    /**
     * The School Number.
     * School Number.
     */
    @SerializedName(value = "schoolNumber", alternate = {"SchoolNumber"})
    @Expose
	@Nullable
    public String schoolNumber;

    /**
     * The Administrative Unit.
     * 
     */
    @SerializedName(value = "administrativeUnit", alternate = {"AdministrativeUnit"})
    @Expose
	@Nullable
    public AdministrativeUnit administrativeUnit;

    /**
     * The Classes.
     * Classes taught at the school. Nullable.
     */
	@Nullable
    public EducationClassCollectionPage classes;

    /**
     * The Users.
     * Users in the school. Nullable.
     */
	@Nullable
    public EducationUserCollectionPage users;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("classes")) {
            classes = serializer.deserializeObject(json.get("classes"), EducationClassCollectionPage.class);
        }

        if (json.has("users")) {
            users = serializer.deserializeObject(json.get("users"), EducationUserCollectionPage.class);
        }
    }
}
