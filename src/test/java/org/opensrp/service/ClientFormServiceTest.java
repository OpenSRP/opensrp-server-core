package org.opensrp.service;

import org.junit.Before;
import org.junit.Test;
import org.opensrp.domain.IdVersionTuple;
import org.opensrp.domain.postgres.ClientForm;
import org.opensrp.domain.postgres.ClientFormMetadata;
import org.opensrp.repository.postgres.BaseRepositoryTest;
import org.opensrp.repository.postgres.mapper.ClientFormMapper;
import org.opensrp.repository.postgres.mapper.custom.CustomClientFormMapper;
import org.opensrp.repository.postgres.mapper.custom.CustomClientFormMetadataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ClientFormServiceTest extends BaseRepositoryTest {

    private ClientFormService clientFormService;

    @Autowired
    private CustomClientFormMapper clientFormMapper;

    @Autowired
    private CustomClientFormMetadataMapper clientFormMetadataMapper;

    private Set<String> scripts = new HashSet<String>();

    @Before
    public void setUpService() {
        clientFormService = new ClientFormService(clientFormMapper, clientFormMetadataMapper);
    }

    @Test
    public void isClientFormExistsShouldReturnTrue() {
        assertTrue(clientFormService.isClientFormExists("json.form/adverse_event.json"));
    }

    @Test
    public void getClientFormMetadataByIdentifierAndVersion() {
        ClientFormMetadata clientFormMetadata = clientFormService.getClientFormMetadataByIdentifierAndVersion("json.form/adverse_event.json", "0.0.1");
        assertNotNull(clientFormMetadata);
        assertEquals("child", clientFormMetadata.getModule());
        assertNull(clientFormMetadata.getJurisdiction());
        assertEquals("AEFI", clientFormMetadata.getLabel());
    }

    @Test
    public void getClientFormById() {
        ClientForm clientForm = clientFormService.getClientFormById(3);
        assertNotNull(clientForm.getJson());
    }

    @Test
    public void getAvailableClientFormMetadataVersionByIdentifier() {
        List<IdVersionTuple> idVersionTupleList = clientFormService.getAvailableClientFormMetadataVersionByIdentifier("json.form/adverse_event.json");
        assertEquals(5, idVersionTupleList.size());
        assertEquals("0.0.1", idVersionTupleList.get(0).getVersion());
        assertEquals(1, idVersionTupleList.get(0).getId());
        assertEquals("0.1.2", idVersionTupleList.get(4).getVersion());
        assertEquals(5, idVersionTupleList.get(4).getId());
    }

    @Test
    public void getClientFormMetadataById() {
        ClientFormMetadata clientFormMetadata = clientFormService.getClientFormMetadataById(3);
        assertEquals("0.1.0", clientFormMetadata.getVersion());
        assertEquals("child", clientFormMetadata.getModule());
        assertEquals("json.form/adverse_event.json", clientFormMetadata.getIdentifier());
    }

    @Test
    public void addClientForm() {
        ClientForm clientForm = new ClientForm();
        clientForm.setCreatedAt(new Date());
        clientForm.setJson("{'from': 'child'}");

        ClientFormMetadata clientFormMetadata = new ClientFormMetadata();
        clientFormMetadata.setModule("child");
        clientFormMetadata.setVersion("1.0.0");
        clientFormMetadata.setIdentifier("json.form/child/sample.json");
        clientFormMetadata.setLabel("SAMPLE FORM");
        clientFormMetadata.setCreatedAt(new Date());

        ClientFormService.CompleteClientForm completeClientForm = clientFormService.addClientForm(clientForm, clientFormMetadata);

        assertEquals(clientForm, completeClientForm.clientForm);
        assertEquals(clientFormMetadata, completeClientForm.clientFormMetadata);

        assertEquals(6, (int) completeClientForm.clientForm.getId());
        assertEquals(6, (int) completeClientForm.clientFormMetadata.getId());
    }

    @Override
    protected Set<String> getDatabaseScripts() {
        scripts.add("client_form.sql");
        return scripts;
    }
}