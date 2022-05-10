package microsoft.graph.reports.getsharepointsiteusagedetailwithdate;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getSharePointSiteUsageDetail method. */
public class GetSharePointSiteUsageDetailWithDateRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new GetSharePointSiteUsageDetailWithDateRequestBuilder and sets the default values.
     * @param date Usage: date={date}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GetSharePointSiteUsageDetailWithDateRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter, @javax.annotation.Nullable final LocalDate date) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/reports/microsoft.graph.getSharePointSiteUsageDetail(date={date})";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        urlTplParams.put("", date);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new GetSharePointSiteUsageDetailWithDateRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GetSharePointSiteUsageDetailWithDateRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/reports/microsoft.graph.getSharePointSiteUsageDetail(date={date})";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke function getSharePointSiteUsageDetail
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Invoke function getSharePointSiteUsageDetail
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetSharePointSiteUsageDetailWithDateRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final GetSharePointSiteUsageDetailWithDateRequestBuilderGetRequestConfiguration requestConfig = new GetSharePointSiteUsageDetailWithDateRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke function getSharePointSiteUsageDetail
     * @return a CompletableFuture of getSharePointSiteUsageDetailWithDateResponse
     */
    public java.util.concurrent.CompletableFuture<GetSharePointSiteUsageDetailWithDateResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, GetSharePointSiteUsageDetailWithDateResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function getSharePointSiteUsageDetail
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of getSharePointSiteUsageDetailWithDateResponse
     */
    public java.util.concurrent.CompletableFuture<GetSharePointSiteUsageDetailWithDateResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetSharePointSiteUsageDetailWithDateRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, GetSharePointSiteUsageDetailWithDateResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function getSharePointSiteUsageDetail
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of getSharePointSiteUsageDetailWithDateResponse
     */
    public java.util.concurrent.CompletableFuture<GetSharePointSiteUsageDetailWithDateResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetSharePointSiteUsageDetailWithDateRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, GetSharePointSiteUsageDetailWithDateResponse::createFromDiscriminatorValue, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetSharePointSiteUsageDetailWithDateRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new getSharePointSiteUsageDetailWithDateRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public GetSharePointSiteUsageDetailWithDateRequestBuilderGetRequestConfiguration() {
        }
    }
}
