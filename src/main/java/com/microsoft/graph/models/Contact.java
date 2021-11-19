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
import com.microsoft.graph.models.TypedEmailAddress;
import com.microsoft.graph.models.FollowupFlag;
import com.microsoft.graph.models.Phone;
import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.graph.models.Website;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.ProfilePhoto;
import com.microsoft.graph.models.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.OutlookItem;
import com.microsoft.graph.requests.ExtensionCollectionPage;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact.
 */
public class Contact extends OutlookItem implements IJsonBackedObject {


    /**
     * The Assistant Name.
     * 
     */
    @SerializedName(value = "assistantName", alternate = {"AssistantName"})
    @Expose
	@Nullable
    public String assistantName;

    /**
     * The Birthday.
     * 
     */
    @SerializedName(value = "birthday", alternate = {"Birthday"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime birthday;

    /**
     * The Children.
     * 
     */
    @SerializedName(value = "children", alternate = {"Children"})
    @Expose
	@Nullable
    public java.util.List<String> children;

    /**
     * The Company Name.
     * 
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
	@Nullable
    public String companyName;

    /**
     * The Department.
     * 
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
	@Nullable
    public String department;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Email Addresses.
     * 
     */
    @SerializedName(value = "emailAddresses", alternate = {"EmailAddresses"})
    @Expose
	@Nullable
    public java.util.List<TypedEmailAddress> emailAddresses;

    /**
     * The File As.
     * 
     */
    @SerializedName(value = "fileAs", alternate = {"FileAs"})
    @Expose
	@Nullable
    public String fileAs;

    /**
     * The Flag.
     * 
     */
    @SerializedName(value = "flag", alternate = {"Flag"})
    @Expose
	@Nullable
    public FollowupFlag flag;

    /**
     * The Gender.
     * 
     */
    @SerializedName(value = "gender", alternate = {"Gender"})
    @Expose
	@Nullable
    public String gender;

    /**
     * The Generation.
     * 
     */
    @SerializedName(value = "generation", alternate = {"Generation"})
    @Expose
	@Nullable
    public String generation;

    /**
     * The Given Name.
     * 
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
	@Nullable
    public String givenName;

    /**
     * The Im Addresses.
     * 
     */
    @SerializedName(value = "imAddresses", alternate = {"ImAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> imAddresses;

    /**
     * The Initials.
     * 
     */
    @SerializedName(value = "initials", alternate = {"Initials"})
    @Expose
	@Nullable
    public String initials;

    /**
     * The Is Favorite.
     * 
     */
    @SerializedName(value = "isFavorite", alternate = {"IsFavorite"})
    @Expose
	@Nullable
    public Boolean isFavorite;

    /**
     * The Job Title.
     * 
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
	@Nullable
    public String jobTitle;

    /**
     * The Manager.
     * 
     */
    @SerializedName(value = "manager", alternate = {"Manager"})
    @Expose
	@Nullable
    public String manager;

    /**
     * The Middle Name.
     * 
     */
    @SerializedName(value = "middleName", alternate = {"MiddleName"})
    @Expose
	@Nullable
    public String middleName;

    /**
     * The Nick Name.
     * 
     */
    @SerializedName(value = "nickName", alternate = {"NickName"})
    @Expose
	@Nullable
    public String nickName;

    /**
     * The Office Location.
     * 
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
	@Nullable
    public String officeLocation;

    /**
     * The Parent Folder Id.
     * 
     */
    @SerializedName(value = "parentFolderId", alternate = {"ParentFolderId"})
    @Expose
	@Nullable
    public String parentFolderId;

    /**
     * The Personal Notes.
     * 
     */
    @SerializedName(value = "personalNotes", alternate = {"PersonalNotes"})
    @Expose
	@Nullable
    public String personalNotes;

    /**
     * The Phones.
     * 
     */
    @SerializedName(value = "phones", alternate = {"Phones"})
    @Expose
	@Nullable
    public java.util.List<Phone> phones;

    /**
     * The Postal Addresses.
     * 
     */
    @SerializedName(value = "postalAddresses", alternate = {"PostalAddresses"})
    @Expose
	@Nullable
    public java.util.List<PhysicalAddress> postalAddresses;

    /**
     * The Profession.
     * 
     */
    @SerializedName(value = "profession", alternate = {"Profession"})
    @Expose
	@Nullable
    public String profession;

    /**
     * The Spouse Name.
     * 
     */
    @SerializedName(value = "spouseName", alternate = {"SpouseName"})
    @Expose
	@Nullable
    public String spouseName;

    /**
     * The Surname.
     * 
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
	@Nullable
    public String surname;

    /**
     * The Title.
     * 
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The Websites.
     * 
     */
    @SerializedName(value = "websites", alternate = {"Websites"})
    @Expose
	@Nullable
    public java.util.List<Website> websites;

    /**
     * The Wedding Anniversary.
     * 
     */
    @SerializedName(value = "weddingAnniversary", alternate = {"WeddingAnniversary"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly weddingAnniversary;

    /**
     * The Yomi Company Name.
     * 
     */
    @SerializedName(value = "yomiCompanyName", alternate = {"YomiCompanyName"})
    @Expose
	@Nullable
    public String yomiCompanyName;

    /**
     * The Yomi Given Name.
     * 
     */
    @SerializedName(value = "yomiGivenName", alternate = {"YomiGivenName"})
    @Expose
	@Nullable
    public String yomiGivenName;

    /**
     * The Yomi Surname.
     * 
     */
    @SerializedName(value = "yomiSurname", alternate = {"YomiSurname"})
    @Expose
	@Nullable
    public String yomiSurname;

    /**
     * The Extensions.
     * 
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The Multi Value Extended Properties.
     * 
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
	@Nullable
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Photo.
     * 
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
	@Nullable
    public ProfilePhoto photo;

    /**
     * The Single Value Extended Properties.
     * 
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
	@Nullable
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), ExtensionCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties"), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties"), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
