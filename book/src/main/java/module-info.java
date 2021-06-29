/*
 * nmw-oss - Aggregator POM for all New Media Works open-source software projects.
 * Copyright (C) 2021  New Media Works
 *     info@newmediaworks.com
 *     703 2nd Street #465
 *     Santa Rosa, CA 95404
 *
 * This file is part of nmw-oss.
 *
 * nmw-oss is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * nmw-oss is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with nmw-oss.  If not, see <http://www.gnu.org/licenses/>.
 */
module com.newmediaworks.oss.book {
	// Direct
	requires com.aoapps.badges; // <groupId>com.aoapps</groupId><artifactId>ao-badges</artifactId>
	requires com.aoapps.taglib; // <groupId>com.aoapps</groupId><artifactId>ao-taglib</artifactId>
	requires com.semanticcms.changelog.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-changelog-taglib</artifactId>
	requires com.semanticcms.core.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-taglib</artifactId>
	requires com.semanticcms.section.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-taglib</artifactId>
	requires taglibs.standard.spec; // <groupId>org.apache.taglibs</groupId><artifactId>taglibs-standard-spec</artifactId>
}
