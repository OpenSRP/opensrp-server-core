package org.opensrp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.opensrp.util.SampleFullDomainObject.getMultimedia;
import static org.opensrp.util.SampleFullDomainObject.getMultimediaDTO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.opensrp.domain.Client;
import org.opensrp.domain.Multimedia;
import org.opensrp.dto.form.MultimediaDTO;
import org.opensrp.repository.couch.MultimediaRepositoryImpl;
import org.opensrp.service.ClientService;
import org.opensrp.service.MultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-applicationContext-opensrp.xml")
public class MultimediaServiceTest {

	@Autowired
	private MultimediaService multimediaService;
	
	@Mock
	private MultimediaRepositoryImpl multimediaRepository;
	
	@Mock
	private ClientService clientService;

	
	@Before
	public void setUp() {
		initMocks(this);
		multimediaService = new MultimediaService(multimediaRepository, clientService);
	}

	@Test
	public void testGetMultimediaFilesShouldReturnAllClientMultimediaFiles() {
		List<Multimedia> multimediaFiles = new ArrayList<>();
		multimediaFiles.add(new Multimedia("caseId1", "provideId1", "contentType1", "filePath1", "fileCategory1"));
		multimediaFiles.add(new Multimedia("caseId2", "provideId2", "contentType2", "filePath2", "fileCategory2"));
		doReturn(multimediaFiles).when(multimediaRepository).get(anyString(), anyString(), anyString());
		List<Multimedia> result = multimediaService.getMultimediaFiles("entityId", "contentType", "fileCategory");
		assertEquals(result.size(), 2);
		assertEquals(result.get(0).getCaseId(), "caseId1");
		assertEquals(result.get(1).getCaseId(), "caseId2");
	}
}
