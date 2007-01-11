package org.apache.maven.archiver;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Capture common archive configuration.
 *
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
 * @version $Id$
 * @todo is this general enough to be in Plexus Archiver?
 */
public class MavenArchiveConfiguration
{
    private boolean compress = true;

    private boolean index;

    private boolean addMavenDescriptor = true;

    private File manifestFile;

    private ManifestConfiguration manifest;

    private Map manifestEntries = new HashMap();

    private List manifestSections = new ArrayList();
    
    public boolean isCompress()
    {
        return compress;
    }

    public boolean isIndex()
    {
        return index;
    }

    public boolean isAddMavenDescriptor()
    {
        return addMavenDescriptor;
    }

    public File getManifestFile()
    {
        return manifestFile;
    }

    public ManifestConfiguration getManifest()
    {
        if ( manifest == null )
        {
            manifest = new ManifestConfiguration();
        }
        return manifest;
    }

    public void setCompress( boolean compress )
    {
        this.compress = compress;
    }

    public void setIndex( boolean index )
    {
        this.index = index;
    }

    public void setAddMavenDescriptor( boolean addMavenDescriptor )
    {
        this.addMavenDescriptor = addMavenDescriptor;
    }

    public void setManifestFile( File manifestFile )
    {
        this.manifestFile = manifestFile;
    }

    public void setManifest( ManifestConfiguration manifest )
    {
        this.manifest = manifest;
    }

    public void addManifestEntry( Object key, Object value )
    {
        manifestEntries.put( key, value );
    }

    public void addManifestEntries( Map map )
    {
        manifestEntries.putAll( map );
    }

    public boolean isManifestEntriesEmpty()
    {
        return manifestEntries.isEmpty();
    }

    public Map getManifestEntries()
    {
        return manifestEntries;
    }
    
    public void addManifestSection( ManifestSection section ) {
    	manifestSections.add( section );
    }
    
    public void addManifestSections( List list ) {
    	manifestSections.addAll( list );
    }
    
    public boolean isManifestSectionsEmpty() {
    	return manifestSections.isEmpty();
    }
    
    public List getManifestSections() {
    	return manifestSections;
    }
}
