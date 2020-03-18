package org.opensrp.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.opensrp.domain.LocationDetail;
import org.opensrp.domain.PhysicalLocation;
import org.opensrp.domain.StructureDetails;
import org.opensrp.repository.LocationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhysicalLocationService {

	private static Logger logger = LoggerFactory.getLogger(PhysicalLocationService.class.toString());

	private LocationRepository locationRepository;

	private final boolean DEFAULT_RETURN_BOOLEAN = true;

	@Autowired
	public void setLocationRepository(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	public PhysicalLocation getLocation(String id, boolean returnGeometry) {
		return locationRepository.get(id, returnGeometry);
	}

	public PhysicalLocation getStructure(String id, boolean returnGeometry) {
		return locationRepository.getStructure(id, returnGeometry);
	}

	public List<PhysicalLocation> getAllLocations() {
		return locationRepository.getAll();
	}

	public void addOrUpdate(PhysicalLocation physicalLocation) {
		if (StringUtils.isBlank(physicalLocation.getId()))
			throw new IllegalArgumentException("id not specified");
		if ((physicalLocation.isJurisdiction() && getLocation(physicalLocation.getId(), DEFAULT_RETURN_BOOLEAN) == null)
				|| (!physicalLocation.isJurisdiction() && getStructure(physicalLocation.getId(), DEFAULT_RETURN_BOOLEAN) == null)) {
			add(physicalLocation);
		} else {
			update(physicalLocation);
		}
	}

	public void add(PhysicalLocation physicalLocation) {
		if (StringUtils.isBlank(physicalLocation.getId()))
			throw new IllegalArgumentException("id not specified");
		physicalLocation.setServerVersion(null);
		locationRepository.add(physicalLocation);
	}

	public void update(PhysicalLocation physicalLocation) {
		if (StringUtils.isBlank(physicalLocation.getId()))
			throw new IllegalArgumentException("id not specified");
		physicalLocation.setServerVersion(null);
		locationRepository.update(physicalLocation);
	}

	public List<PhysicalLocation> findLocationsByServerVersion(long serverVersion) {
		return locationRepository.findLocationsByServerVersion(serverVersion);
	}

	public List<PhysicalLocation> findLocationsByNames(String locationNames, long serverVersion) {
		return locationRepository.findLocationsByNames(locationNames, serverVersion);
	}

	public List<PhysicalLocation> findStructuresByParentAndServerVersion(String parentId, long serverVersion) {
		if (StringUtils.isBlank(parentId))
			throw new IllegalArgumentException("parentId not specified");
		return locationRepository.findStructuresByParentAndServerVersion(parentId, serverVersion);
	}

	public void addServerVersion() {
		try {
			List<PhysicalLocation> locations = locationRepository.findByEmptyServerVersion();
			logger.info("RUNNING addServerVersion Jurisdiction locations size: " + locations.size());
			setServerVersion(locations, true);
			List<PhysicalLocation> structures = locationRepository.findStructuresByEmptyServerVersion();
			logger.info("RUNNING addServerVersion structures size: " + structures.size());
			setServerVersion(structures, false);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

	private void setServerVersion(List<PhysicalLocation> locations, boolean isJurisdiction) {
		long currentTimeMillis = System.currentTimeMillis();
		for (PhysicalLocation location : locations) {
			try {
				Thread.sleep(1);
				location.setServerVersion(currentTimeMillis);
				location.setJurisdiction(isJurisdiction);
				locationRepository.update(location);
				currentTimeMillis += 1;
			} catch (InterruptedException e) {
				logger.error(e.getMessage());
			}
		}
	}

	public Set<String> saveLocations(List<PhysicalLocation> locations, boolean isJurisdiction) {
		Set<String> locationsWithErrors = new HashSet<>();
		for (PhysicalLocation location : locations) {
			try {
				location.setJurisdiction(isJurisdiction);
				addOrUpdate(location);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				locationsWithErrors.add(location.getId());
			}
		}
		return locationsWithErrors;

	}

	public Collection<StructureDetails> findStructuresWithinRadius(double latitude, double longitude, double radius) {
		return locationRepository.findStructureAndFamilyDetails(latitude, longitude, radius);
	}

	/**
	 * This methods searches for jurisdictions using the parentId and location properties
	 * It returns the Geometry optionally if @param returnGeometry is set to true. 
	 * @param returnGeometry boolean which controls if geometry is returned
	 * @param parentId string the parent id of the jurisdiction being searched
	 * @param properties map of location properties to filter with, each entry in map has property name and value
	 * @return jurisdictions matching the params 
	 * @see org.opensrp.repository.LocationRepository#findLocationsByProperties(boolean, String, Map)
	 */
	public List<PhysicalLocation> findLocationsByProperties(boolean returnGeometry, String parentId,
			Map<String, String> properties) {
		return locationRepository.findLocationsByProperties(returnGeometry, parentId, properties);
	}

	/**
	 * This methods searches for structures using the parentId and location properties
	 * It returns the Geometry optionally if @param returnGeometry is set to true. 
	 * @param returnGeometry boolean which controls if geometry is returned
	 * @param parentId string the parent id of the structure being searched
	 * @param properties map of location properties to filter with, each entry in map has property name and value
	 * @return structures matching the params 
	 * @see org.opensrp.repository.LocationRepository#findStructuresByProperties(boolean, String, Map)
	 */
	public List<PhysicalLocation> findStructuresByProperties(boolean returnGeometry, String parentId,
			Map<String, String> properties) {
		return locationRepository.findStructuresByProperties(returnGeometry, parentId, properties);
	}

	/**
	 * This methods provides an API endpoint that searches for locations using a list of provided location ids.
	 * It returns the Geometry optionally if @param returnGeometry is set to true.
	 * @param returnGeometry boolean which controls if geometry is returned
	 * @param ids list of location ids
	 * @return jurisdictions whose ids match the provided params
	 */
	public List<PhysicalLocation> findLocationsByIds(boolean returnGeometry,	List<String> ids) {
		return locationRepository.findLocationsByIds(returnGeometry, ids);
	}
	

	/**
	 * This methods searches for locations using a list of provided location ids.It
	 * returns location whose is in the list or whose parent is in list It returns
	 * the Geometry optionally if @param returnGeometry is set to true.
	 * 
	 * @param returnGeometry boolean which controls if geometry is returned
	 * @param ids            list of location ids
	 * @return jurisdictions whose ids match the provided params
	 */
	public List<PhysicalLocation> findLocationsByIdsOrParentIds(boolean returnGeometry,	List<String> ids) {
		return locationRepository.findLocationsByIdsOrParentIds(returnGeometry, ids);
	}

	/**
	 * This methods searches for a location and it's children using the provided location id
	 * It returns the Geometry optionally if @param returnGeometry is set to true.
	 * @param returnGeometry boolean which controls if geometry is returned
	 * @param id location id
	 * @param pageSize number of records to be returned
	 * @return location together with it's children whose id matches the provided param
	 */
	public List<PhysicalLocation> findLocationByIdWithChildren(boolean returnGeometry, String id, int pageSize) {
		return locationRepository.findLocationByIdWithChildren(returnGeometry, id, pageSize);
	}

	/**
	 * This method searches for all structure ids
	 *
	 * @param serverVersion
	 * @param limit upper limit on number of structure ids to fetch
	 * @return a list of structure ids as well as the lastServerVersion
	 */
	public Pair<List<String>, Long> findAllStructureIds(Long serverVersion, int limit) {
		return locationRepository.findAllStructureIds(serverVersion, limit);
	}

	/**
	 * This method searches for location identifier and name using a plan identifier.
	 *
	 * @param planIdentifier identifier of the plan
	 * @return list of location details i.e. identifier and name
	 */
	public List <LocationDetail> findLocationDetailsByPlanId(String planIdentifier) {
		return  locationRepository.findLocationDetailsByPlanId(planIdentifier);
	}

	/**
	 * This method searches for jurisdictions ordered by serverVersion ascending
	 *
	 * @param returnGeometry boolean which controls if geometry is returned
	 * @param serverVersion
	 * @param limit upper limit on number of jurisdictions to fetch
	 * @return list of jurisdictions
	 */
	public List<PhysicalLocation> findAllLocations(boolean returnGeometry, Long serverVersion, int limit) {
		return locationRepository.findAllLocations(returnGeometry, serverVersion, limit);
	};

	/**
	 * This method searches for structures ordered by serverVersion ascending
	 *
	 * @param returnGeometry boolean which controls if geometry is returned
	 * @param limit upper limit on number of structures to fetch
	 * @return list of structures
	 */
	public List<PhysicalLocation> findAllStructures(boolean returnGeometry, Long serverVersion, int limit) {
		return locationRepository.findAllStructures(returnGeometry, serverVersion, limit);
	};

	/**
	 * This method searches for all location ids
	 *
	 * @param serverVersion
	 * @param limit upper limit on number of location ids to fetch
	 * @return a list of location ids
	 */
	public Pair<List<String>, Long> findAllLocationIds(Long serverVersion, int limit) {
		return locationRepository.findAllLocationIds(serverVersion, limit);
	}

}
