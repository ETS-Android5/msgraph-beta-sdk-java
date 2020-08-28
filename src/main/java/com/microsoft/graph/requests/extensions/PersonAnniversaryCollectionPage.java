// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PersonAnniversary;
import com.microsoft.graph.requests.extensions.IPersonAnniversaryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAnniversaryCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAnniversaryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Anniversary Collection Page.
 */
public class PersonAnniversaryCollectionPage extends BaseCollectionPage<PersonAnniversary, IPersonAnniversaryCollectionRequestBuilder> implements IPersonAnniversaryCollectionPage {

    /**
     * A collection page for PersonAnniversary
     *
     * @param response the serialized PersonAnniversaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PersonAnniversaryCollectionPage(final PersonAnniversaryCollectionResponse response, final IPersonAnniversaryCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
