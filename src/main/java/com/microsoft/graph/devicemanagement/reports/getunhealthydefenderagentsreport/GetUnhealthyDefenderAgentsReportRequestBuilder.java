package microsoft.graph.devicemanagement.reports.getunhealthydefenderagentsreport;

import com.microsoft.kiota.HttpMethod;
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
/** Provides operations to call the getUnhealthyDefenderAgentsReport method. */
public class GetUnhealthyDefenderAgentsReportRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new GetUnhealthyDefenderAgentsReportRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GetUnhealthyDefenderAgentsReportRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/reports/microsoft.graph.getUnhealthyDefenderAgentsReport";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new GetUnhealthyDefenderAgentsReportRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GetUnhealthyDefenderAgentsReportRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/reports/microsoft.graph.getUnhealthyDefenderAgentsReport";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke action getUnhealthyDefenderAgentsReport
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final GetUnhealthyDefenderAgentsReportRequestBody body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Invoke action getUnhealthyDefenderAgentsReport
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final GetUnhealthyDefenderAgentsReportRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<GetUnhealthyDefenderAgentsReportRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final GetUnhealthyDefenderAgentsReportRequestBuilderPostRequestConfiguration requestConfig = new GetUnhealthyDefenderAgentsReportRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke action getUnhealthyDefenderAgentsReport
     * @param body 
     * @return a CompletableFuture of getUnhealthyDefenderAgentsReportResponse
     */
    public java.util.concurrent.CompletableFuture<GetUnhealthyDefenderAgentsReportResponse> post(@javax.annotation.Nonnull final GetUnhealthyDefenderAgentsReportRequestBody body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, GetUnhealthyDefenderAgentsReportResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke action getUnhealthyDefenderAgentsReport
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of getUnhealthyDefenderAgentsReportResponse
     */
    public java.util.concurrent.CompletableFuture<GetUnhealthyDefenderAgentsReportResponse> post(@javax.annotation.Nonnull final GetUnhealthyDefenderAgentsReportRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<GetUnhealthyDefenderAgentsReportRequestBuilderPostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, GetUnhealthyDefenderAgentsReportResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke action getUnhealthyDefenderAgentsReport
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of getUnhealthyDefenderAgentsReportResponse
     */
    public java.util.concurrent.CompletableFuture<GetUnhealthyDefenderAgentsReportResponse> post(@javax.annotation.Nonnull final GetUnhealthyDefenderAgentsReportRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<GetUnhealthyDefenderAgentsReportRequestBuilderPostRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, GetUnhealthyDefenderAgentsReportResponse::createFromDiscriminatorValue, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetUnhealthyDefenderAgentsReportRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new getUnhealthyDefenderAgentsReportRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        public GetUnhealthyDefenderAgentsReportRequestBuilderPostRequestConfiguration() {
        }
    }
}
