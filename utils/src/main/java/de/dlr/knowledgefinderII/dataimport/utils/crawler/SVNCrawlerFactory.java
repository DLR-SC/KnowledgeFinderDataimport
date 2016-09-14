/*******************************************************************************
 * Copyright 2016 DLR - German Aerospace Center
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package de.dlr.knowledgefinderII.dataimport.utils.crawler;

import java.io.File;

import org.tmatesoft.svn.core.SVNURL;

/**
 * A factory for creating SVNCrawler objects.
 *
 * 
 */
public interface SVNCrawlerFactory {
	
	/**
	 * Creates a new SVNPropertyCrawler object for a local repository (file path).
	 *
	 * @param fileQuery the file path of a svn directory.
	 * @return the SVN property crawler<?>
	 */
	public SVNPropertyCrawler<?> createCrawler(File fileQuery);

	/**
	 * Creates a new SVNCrawler object for a remote repository.
	 *
	 * @param svnUrlEncoded the svn url
	 * @return the SVN property crawler<?>
	 */
	public SVNPropertyCrawler<?> createCrawler(SVNURL svnUrlEncoded);
}
