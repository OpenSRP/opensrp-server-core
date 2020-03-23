package org.opensrp.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.opensrp.domain.LocationTag;
import org.opensrp.domain.LocationTagMap;
import org.opensrp.domain.postgres.LocationTagExample;
import org.opensrp.domain.postgres.LocationTagMapExample;
import org.opensrp.repository.LocationTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationTagService {
	
	private LocationTagRepository locationTagRepository;
	
	@Autowired
	public void setLocationTagRepository(LocationTagRepository locationTagRepository) {
		this.locationTagRepository = locationTagRepository;
	}
	
	public LocationTagRepository getLocationTagRepository() {
		return locationTagRepository;
	}
	
	public List<LocationTag> getAllLocationTags() {
		return getLocationTagRepository().getAll();
	}
	
	public LocationTag addOrUpdateLocationTag(LocationTag locationTag) {
		if (StringUtils.isBlank(locationTag.getName())) {
			throw new IllegalArgumentException("Location tag name not specified");
		}
		
		if (getLocationTagRepository().get(locationTag.getName()) != null) {
			getLocationTagRepository().update(locationTag);
		} else {
			getLocationTagRepository().add(locationTag);
		}
		return locationTag;
	}
	
	public void deleteLocationTag(LocationTag locationTag) {
		if (StringUtils.isBlank(locationTag.getName())) {
			throw new IllegalArgumentException("Location tag name not specified");
		}
		
		getLocationTagRepository().safeRemove(locationTag);
		
	}
	
	public void deleteLocationTag(Long id) {
		if (id != 0) {
			throw new IllegalArgumentException("Id not specified");
		}
		
		getLocationTagRepository().safeRemove(id);
		
	}
	
	public List<LocationTag> findByLocationTagExample(LocationTagExample locationTagExample, int offset, int limit) {
		return getLocationTagRepository().findByLocationTagExample(locationTagExample, offset, limit);
	}
	
	public int addLocationTagMap(LocationTagMap locationTagMap) {
		if (locationTagMap.getLocationId() == null && locationTagMap.getLocationTagId() == null) {
			throw new IllegalArgumentException("Location tag id and location id  not specified");
		}
		return getLocationTagRepository().addLocationTagMap(locationTagMap);
		
	}
	
	public List<LocationTagMap> findLocationTagMapByExample(LocationTagMapExample example) {
		
		return getLocationTagRepository().getLocationTagMapByExample(example);
	}
	
	public void deleteLocationTagMapByLocationIdAndLocationTagId(Long locationId, Long locationTagId) {
		getLocationTagRepository().deleteLocationTagMapByLocationIdAndLocationTagId(locationId, locationTagId);
	}
	
}
