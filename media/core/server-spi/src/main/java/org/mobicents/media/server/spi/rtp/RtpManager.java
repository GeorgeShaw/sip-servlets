/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.media.server.spi.rtp;

import java.io.IOException;
import java.net.SocketException;
import org.mobicents.media.server.spi.MediaType;
import org.mobicents.media.server.spi.ResourceUnavailableException;

/**
 *
 * @author kulikov
 */
public interface RtpManager {
    public void setListener(RtpListener listener);
    public RtpListener getListener();
    
    /**
     * Gets the IP address to which trunk is bound. All endpoints of the trunk use this address for RTP connection.
     * 
     * @return the IP address string to which this trunk is bound.
     */
    public String getBindAddress();
    
    public void start(long now) throws SocketException, IOException;
    public void stop();
    
    /**
     * Constructs new RTP socket for the specified media type.
     * 
     * @return the RTPSocketInstance.
     * @throws StunException
     * @throws IOException
     * @throws SocketException
     * @throws StunException
     * @throws IOException
     */
    public RtpSocket getRTPSocket(MediaType media) throws IOException, ResourceUnavailableException;
     
}