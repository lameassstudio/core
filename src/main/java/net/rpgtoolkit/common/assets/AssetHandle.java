/**
 * Copyright (c) 2015, rpgtoolkit.net <help@rpgtoolkit.net>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package net.rpgtoolkit.common.assets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Chris Hutchinson <chris@cshutchinson.com>
 */
public abstract class AssetHandle {
    
    public AssetHandle(AssetDescriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    public abstract InputStream getInputStream() 
            throws IOException;
    
    public abstract OutputStream getOutputStream() 
            throws IOException;
    
    public abstract BufferedReader getReader() 
            throws IOException;
    
    public abstract BufferedWriter getWriter() 
            throws IOException;
    
    public Asset getAsset() {
        return this.asset;
    }
    
    public void setAsset(Asset asset) {
        this.asset = asset;
    }
    
    public AssetDescriptor getDescriptor() {
        return this.descriptor;
    }
    
    protected final AssetDescriptor descriptor;
    protected Asset asset;
    
}
