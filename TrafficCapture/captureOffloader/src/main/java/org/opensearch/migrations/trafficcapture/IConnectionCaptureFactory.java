package org.opensearch.migrations.trafficcapture;

import org.opensearch.migrations.tracing.commoncontexts.IConnectionContext;
import org.opensearch.migrations.trafficcapture.tracing.ConnectionContext;

import java.io.IOException;

public interface IConnectionCaptureFactory<T> {
    IChannelConnectionCaptureSerializer<T> createOffloader(IConnectionContext ctx, String connectionId) throws IOException;
}
