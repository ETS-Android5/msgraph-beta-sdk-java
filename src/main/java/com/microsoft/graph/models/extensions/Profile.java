// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserAccountInformation;
import com.microsoft.graph.models.extensions.ItemAddress;
import com.microsoft.graph.models.extensions.PersonAnnualEvent;
import com.microsoft.graph.models.extensions.PersonAward;
import com.microsoft.graph.models.extensions.PersonCertification;
import com.microsoft.graph.models.extensions.EducationalActivity;
import com.microsoft.graph.models.extensions.ItemEmail;
import com.microsoft.graph.models.extensions.PersonInterest;
import com.microsoft.graph.models.extensions.LanguageProficiency;
import com.microsoft.graph.models.extensions.PersonName;
import com.microsoft.graph.models.extensions.PersonAnnotation;
import com.microsoft.graph.models.extensions.ItemPatent;
import com.microsoft.graph.models.extensions.ItemPhone;
import com.microsoft.graph.models.extensions.WorkPosition;
import com.microsoft.graph.models.extensions.ProjectParticipation;
import com.microsoft.graph.models.extensions.ItemPublication;
import com.microsoft.graph.models.extensions.SkillProficiency;
import com.microsoft.graph.models.extensions.WebAccount;
import com.microsoft.graph.models.extensions.PersonWebsite;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.UserAccountInformationCollectionPage;
import com.microsoft.graph.requests.extensions.ItemAddressCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAnnualEventCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAwardCollectionPage;
import com.microsoft.graph.requests.extensions.PersonCertificationCollectionPage;
import com.microsoft.graph.requests.extensions.EducationalActivityCollectionPage;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionPage;
import com.microsoft.graph.requests.extensions.PersonInterestCollectionPage;
import com.microsoft.graph.requests.extensions.LanguageProficiencyCollectionPage;
import com.microsoft.graph.requests.extensions.PersonNameCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAnnotationCollectionPage;
import com.microsoft.graph.requests.extensions.ItemPatentCollectionPage;
import com.microsoft.graph.requests.extensions.ItemPhoneCollectionPage;
import com.microsoft.graph.requests.extensions.WorkPositionCollectionPage;
import com.microsoft.graph.requests.extensions.ProjectParticipationCollectionPage;
import com.microsoft.graph.requests.extensions.ItemPublicationCollectionPage;
import com.microsoft.graph.requests.extensions.SkillProficiencyCollectionPage;
import com.microsoft.graph.requests.extensions.WebAccountCollectionPage;
import com.microsoft.graph.requests.extensions.PersonWebsiteCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Profile.
 */
public class Profile extends Entity implements IJsonBackedObject {


    /**
     * The Account.
     * 
     */
    @SerializedName(value = "account", alternate = {"Account"})
    @Expose
    public UserAccountInformationCollectionPage account;

    /**
     * The Addresses.
     * Represents details of addresses associated with the user.
     */
    @SerializedName(value = "addresses", alternate = {"Addresses"})
    @Expose
    public ItemAddressCollectionPage addresses;

    /**
     * The Anniversaries.
     * Represents the details of meaningful dates associated with a person.
     */
    @SerializedName(value = "anniversaries", alternate = {"Anniversaries"})
    @Expose
    public PersonAnnualEventCollectionPage anniversaries;

    /**
     * The Awards.
     * Represents the details of awards or honors associated with a person.
     */
    @SerializedName(value = "awards", alternate = {"Awards"})
    @Expose
    public PersonAwardCollectionPage awards;

    /**
     * The Certifications.
     * Represents the details of certifications associated with a person.
     */
    @SerializedName(value = "certifications", alternate = {"Certifications"})
    @Expose
    public PersonCertificationCollectionPage certifications;

    /**
     * The Educational Activities.
     * Represents data that a user has supplied related to undergraduate, graduate, postgraduate or other educational activities.
     */
    @SerializedName(value = "educationalActivities", alternate = {"EducationalActivities"})
    @Expose
    public EducationalActivityCollectionPage educationalActivities;

    /**
     * The Emails.
     * Represents detailed information about email addresses associated with the user.
     */
    @SerializedName(value = "emails", alternate = {"Emails"})
    @Expose
    public ItemEmailCollectionPage emails;

    /**
     * The Interests.
     * Provides detailed information about interests the user has associated with themselves in various services.
     */
    @SerializedName(value = "interests", alternate = {"Interests"})
    @Expose
    public PersonInterestCollectionPage interests;

    /**
     * The Languages.
     * Represents detailed information about languages that a user has added to their profile.
     */
    @SerializedName(value = "languages", alternate = {"Languages"})
    @Expose
    public LanguageProficiencyCollectionPage languages;

    /**
     * The Names.
     * Represents the names a user has added to their profile.
     */
    @SerializedName(value = "names", alternate = {"Names"})
    @Expose
    public PersonNameCollectionPage names;

    /**
     * The Notes.
     * Represents notes that a user has added to their profile.
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
    public PersonAnnotationCollectionPage notes;

    /**
     * The Patents.
     * Represents patents that a user has added to their profile.
     */
    @SerializedName(value = "patents", alternate = {"Patents"})
    @Expose
    public ItemPatentCollectionPage patents;

    /**
     * The Phones.
     * Represents detailed information about phone numbers associated with a user in various services.
     */
    @SerializedName(value = "phones", alternate = {"Phones"})
    @Expose
    public ItemPhoneCollectionPage phones;

    /**
     * The Positions.
     * Represents detailed information about work positions associated with a user's profile.
     */
    @SerializedName(value = "positions", alternate = {"Positions"})
    @Expose
    public WorkPositionCollectionPage positions;

    /**
     * The Projects.
     * Represents detailed information about projects associated with a user.
     */
    @SerializedName(value = "projects", alternate = {"Projects"})
    @Expose
    public ProjectParticipationCollectionPage projects;

    /**
     * The Publications.
     * Represents details of any publications a user has added to their profile.
     */
    @SerializedName(value = "publications", alternate = {"Publications"})
    @Expose
    public ItemPublicationCollectionPage publications;

    /**
     * The Skills.
     * Represents detailed information about skills associated with a user in various services.
     */
    @SerializedName(value = "skills", alternate = {"Skills"})
    @Expose
    public SkillProficiencyCollectionPage skills;

    /**
     * The Web Accounts.
     * Represents web accounts the user has indicated they use or has added to their user profile.
     */
    @SerializedName(value = "webAccounts", alternate = {"WebAccounts"})
    @Expose
    public WebAccountCollectionPage webAccounts;

    /**
     * The Websites.
     * Represents detailed information about websites associated with a user in various services.
     */
    @SerializedName(value = "websites", alternate = {"Websites"})
    @Expose
    public PersonWebsiteCollectionPage websites;


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


        if (json.has("account")) {
            account = serializer.deserializeObject(json.get("account").toString(), UserAccountInformationCollectionPage.class);
        }

        if (json.has("addresses")) {
            addresses = serializer.deserializeObject(json.get("addresses").toString(), ItemAddressCollectionPage.class);
        }

        if (json.has("anniversaries")) {
            anniversaries = serializer.deserializeObject(json.get("anniversaries").toString(), PersonAnnualEventCollectionPage.class);
        }

        if (json.has("awards")) {
            awards = serializer.deserializeObject(json.get("awards").toString(), PersonAwardCollectionPage.class);
        }

        if (json.has("certifications")) {
            certifications = serializer.deserializeObject(json.get("certifications").toString(), PersonCertificationCollectionPage.class);
        }

        if (json.has("educationalActivities")) {
            educationalActivities = serializer.deserializeObject(json.get("educationalActivities").toString(), EducationalActivityCollectionPage.class);
        }

        if (json.has("emails")) {
            emails = serializer.deserializeObject(json.get("emails").toString(), ItemEmailCollectionPage.class);
        }

        if (json.has("interests")) {
            interests = serializer.deserializeObject(json.get("interests").toString(), PersonInterestCollectionPage.class);
        }

        if (json.has("languages")) {
            languages = serializer.deserializeObject(json.get("languages").toString(), LanguageProficiencyCollectionPage.class);
        }

        if (json.has("names")) {
            names = serializer.deserializeObject(json.get("names").toString(), PersonNameCollectionPage.class);
        }

        if (json.has("notes")) {
            notes = serializer.deserializeObject(json.get("notes").toString(), PersonAnnotationCollectionPage.class);
        }

        if (json.has("patents")) {
            patents = serializer.deserializeObject(json.get("patents").toString(), ItemPatentCollectionPage.class);
        }

        if (json.has("phones")) {
            phones = serializer.deserializeObject(json.get("phones").toString(), ItemPhoneCollectionPage.class);
        }

        if (json.has("positions")) {
            positions = serializer.deserializeObject(json.get("positions").toString(), WorkPositionCollectionPage.class);
        }

        if (json.has("projects")) {
            projects = serializer.deserializeObject(json.get("projects").toString(), ProjectParticipationCollectionPage.class);
        }

        if (json.has("publications")) {
            publications = serializer.deserializeObject(json.get("publications").toString(), ItemPublicationCollectionPage.class);
        }

        if (json.has("skills")) {
            skills = serializer.deserializeObject(json.get("skills").toString(), SkillProficiencyCollectionPage.class);
        }

        if (json.has("webAccounts")) {
            webAccounts = serializer.deserializeObject(json.get("webAccounts").toString(), WebAccountCollectionPage.class);
        }

        if (json.has("websites")) {
            websites = serializer.deserializeObject(json.get("websites").toString(), PersonWebsiteCollectionPage.class);
        }
    }
}
