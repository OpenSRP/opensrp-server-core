package org.opensrp.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.opensrp.domain.IdentifierSource;
import org.opensrp.repository.IdentifierSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentifierSourceService {

	private IdentifierSourceRepository identifierSourceRepository;

	private static Logger logger = LogManager.getLogger(IdentifierSourceService.class.toString());

	@Autowired
	public IdentifierSourceService(IdentifierSourceRepository identifierSourceRepository) {
		this.identifierSourceRepository = identifierSourceRepository;
	}

	public List<IdentifierSource> findAllIdentifierSources() {
		return identifierSourceRepository.getAll();
	}

	public IdentifierSource findByIdentifier(String identifier) {
		return identifierSourceRepository.findByIdentifier(identifier);
	}

	public void add(IdentifierSource identifierSource) {
		validateFields(identifierSource);
		identifierSourceRepository.add(identifierSource);
	}

	public void update(IdentifierSource identifierSource) {
		validateFields(identifierSource);
		IdentifierSource idSource = findByIdentifier(identifierSource.getIdentifier());
		if (idSource == null) {
			return;
		}
		identifierSource.setSequenceValue(idSource.getSequenceValue());
		identifierSourceRepository.update(identifierSource);
	}

	public void saveSequenceValue(IdentifierSource identifierSource, Long sequenceValue) {
     identifierSourceRepository.updateIdSourceWithSequenceValue(identifierSource,sequenceValue);
	}

	private void validateFields(IdentifierSource identifierSource) {
		if (StringUtils.isBlank(identifierSource.getIdentifier())) {
			throw new IllegalArgumentException("Identifier value was not specified");
		} else if (StringUtils.isBlank(identifierSource.getBaseCharacterSet())) {
			throw new IllegalArgumentException("Base character set was not specified");
		} else if (identifierSource.getMinLength() == null || identifierSource.getMinLength() == 0) {
			throw new IllegalArgumentException("Minimum length was not specified");
		} else if (identifierSource.getMaxLength() == null || identifierSource.getMaxLength() == 0) {
			throw new IllegalArgumentException("Maximum length was not specified");
		} else if (!(identifierSource.getMinLength() >= 4 && identifierSource.getMinLength() <= 16)) {
			throw new IllegalArgumentException("Minimum length was invalid");
		} else if (!(identifierSource.getMaxLength() >= 4 && identifierSource.getMaxLength() <= 16
				&& identifierSource.getMaxLength() >= identifierSource.getMinLength())) {
			throw new IllegalArgumentException("Maximum length was invalid");
		} else {
			logger.info("All validations on fields passed");
		}
	}
}

