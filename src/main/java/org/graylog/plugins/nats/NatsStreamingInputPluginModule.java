/**
 * Graylog NATS Plugin - NATS plugin for Graylog
 * Copyright © 2016 Graylog, Inc. (hello@graylog.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog.plugins.nats;

import org.graylog.plugins.nats.input.GelfNatsStreamingInput;
import org.graylog.plugins.nats.input.RawNatsStreamingInput;
import org.graylog.plugins.nats.input.SyslogNatsStreamingInput;
import org.graylog.plugins.nats.output.GelfNatsStreamingOutput;
import org.graylog.plugins.nats.transport.NatsStreamingTransport;
import org.graylog2.plugin.PluginModule;

public class NatsStreamingInputPluginModule extends PluginModule {
    @Override
    protected void configure() {
        addTransport("nats-streaming", NatsStreamingTransport.class);
        addMessageInput(GelfNatsStreamingInput.class);
        addMessageInput(RawNatsStreamingInput.class);
        addMessageInput(SyslogNatsStreamingInput.class);
        addMessageOutput(GelfNatsStreamingOutput.class);
    }
}
