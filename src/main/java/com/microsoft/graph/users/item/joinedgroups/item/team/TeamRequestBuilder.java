package microsoft.graph.users.item.joinedgroups.item.team;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.Team;
import microsoft.graph.users.item.joinedgroups.item.team.allchannels.AllChannelsRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.channels.ChannelsRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.group.GroupRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.incomingchannels.IncomingChannelsRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.installedapps.InstalledAppsRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.installedapps.item.TeamsAppInstallationItemRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.members.item.ConversationMemberItemRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.members.MembersRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.operations.item.TeamsAsyncOperationItemRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.operations.OperationsRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.owners.item.UserItemRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.owners.OwnersRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.permissiongrants.item.ResourceSpecificPermissionGrantItemRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.permissiongrants.PermissionGrantsRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.photo.PhotoRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.primarychannel.PrimaryChannelRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.schedule.ScheduleRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.tags.item.TeamworkTagItemRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.tags.TagsRequestBuilder;
import microsoft.graph.users.item.joinedgroups.item.team.template.TemplateRequestBuilder;
/** Provides operations to manage the team property of the microsoft.graph.group entity. */
public class TeamRequestBuilder {
    /** The allChannels property */
    @javax.annotation.Nonnull
    public AllChannelsRequestBuilder allChannels() {
        return new AllChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The channels property */
    @javax.annotation.Nonnull
    public ChannelsRequestBuilder channels() {
        return new ChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The group property */
    @javax.annotation.Nonnull
    public GroupRequestBuilder group() {
        return new GroupRequestBuilder(pathParameters, requestAdapter);
    }
    /** The incomingChannels property */
    @javax.annotation.Nonnull
    public IncomingChannelsRequestBuilder incomingChannels() {
        return new IncomingChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The installedApps property */
    @javax.annotation.Nonnull
    public InstalledAppsRequestBuilder installedApps() {
        return new InstalledAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The members property */
    @javax.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The operations property */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The owners property */
    @javax.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The permissionGrants property */
    @javax.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The photo property */
    @javax.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /** The primaryChannel property */
    @javax.annotation.Nonnull
    public PrimaryChannelRequestBuilder primaryChannel() {
        return new PrimaryChannelRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The schedule property */
    @javax.annotation.Nonnull
    public ScheduleRequestBuilder schedule() {
        return new ScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tags property */
    @javax.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The template property */
    @javax.annotation.Nonnull
    public TemplateRequestBuilder template() {
        return new TemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedGroups.item.team.allChannels.item collection
     * @param id Unique identifier of the item
     * @return a channelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.joinedgroups.item.team.allchannels.item.ChannelItemRequestBuilder allChannels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("channel%2Did", id);
        return new microsoft.graph.users.item.joinedgroups.item.team.allchannels.item.ChannelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedGroups.item.team.channels.item collection
     * @param id Unique identifier of the item
     * @return a channelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.joinedgroups.item.team.channels.item.ChannelItemRequestBuilder channels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("channel%2Did", id);
        return new microsoft.graph.users.item.joinedgroups.item.team.channels.item.ChannelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TeamRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public TeamRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/joinedGroups/{group%2Did}/team{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new TeamRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public TeamRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/joinedGroups/{group%2Did}/team{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property team for users
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property team for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<TeamRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final TeamRequestBuilderDeleteRequestConfiguration requestConfig = new TeamRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The team associated with this group.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The team associated with this group.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<TeamRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final TeamRequestBuilderGetRequestConfiguration requestConfig = new TeamRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property team in users
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Team body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property team in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<TeamRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final TeamRequestBuilderPatchRequestConfiguration requestConfig = new TeamRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property team for users
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property team for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<TeamRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property team for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<TeamRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The team associated with this group.
     * @return a CompletableFuture of team
     */
    public java.util.concurrent.CompletableFuture<Team> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The team associated with this group.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of team
     */
    public java.util.concurrent.CompletableFuture<Team> get(@javax.annotation.Nullable final java.util.function.Consumer<TeamRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The team associated with this group.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of team
     */
    public java.util.concurrent.CompletableFuture<Team> get(@javax.annotation.Nullable final java.util.function.Consumer<TeamRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedGroups.item.team.incomingChannels.item collection
     * @param id Unique identifier of the item
     * @return a channelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.joinedgroups.item.team.incomingchannels.item.ChannelItemRequestBuilder incomingChannels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("channel%2Did", id);
        return new microsoft.graph.users.item.joinedgroups.item.team.incomingchannels.item.ChannelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedGroups.item.team.installedApps.item collection
     * @param id Unique identifier of the item
     * @return a teamsAppInstallationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamsAppInstallationItemRequestBuilder installedApps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsAppInstallation%2Did", id);
        return new TeamsAppInstallationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedGroups.item.team.members.item collection
     * @param id Unique identifier of the item
     * @return a conversationMemberItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConversationMemberItemRequestBuilder members(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conversationMember%2Did", id);
        return new ConversationMemberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedGroups.item.team.operations.item collection
     * @param id Unique identifier of the item
     * @return a teamsAsyncOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamsAsyncOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsAsyncOperation%2Did", id);
        return new TeamsAsyncOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedGroups.item.team.owners.item collection
     * @param id Unique identifier of the item
     * @return a userItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserItemRequestBuilder owners(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user%2Did1", id);
        return new UserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property team in users
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Team body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property team in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<TeamRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property team in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<TeamRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedGroups.item.team.permissionGrants.item collection
     * @param id Unique identifier of the item
     * @return a resourceSpecificPermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ResourceSpecificPermissionGrantItemRequestBuilder permissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("resourceSpecificPermissionGrant%2Did", id);
        return new ResourceSpecificPermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedGroups.item.team.tags.item collection
     * @param id Unique identifier of the item
     * @return a teamworkTagItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamworkTagItemRequestBuilder tags(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamworkTag%2Did", id);
        return new TeamworkTagItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class TeamRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new teamRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public TeamRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The team associated with this group. */
    public class TeamRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class TeamRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public TeamRequestBuilderGetQueryParameters queryParameters = new TeamRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new teamRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public TeamRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class TeamRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new teamRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public TeamRequestBuilderPatchRequestConfiguration() {
        }
    }
}
