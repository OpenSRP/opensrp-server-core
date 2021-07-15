package org.opensrp.domain.rapidpro.converter.zeir;

import org.opensrp.domain.rapidpro.contact.zeir.RapidProContact;
import org.opensrp.domain.rapidpro.contact.zeir.RapidProFields;
import org.opensrp.domain.rapidpro.converter.BaseRapidProClientConverter;
import org.opensrp.service.IdentifierSourceService;
import org.opensrp.service.UniqueIdentifierService;
import org.opensrp.util.DateParserUtils;
import org.opensrp.util.constants.RapidProConstants;
import org.smartregister.domain.Address;
import org.smartregister.domain.Client;

import java.util.Locale;

public class ZeirChildClientConverter extends BaseRapidProClientConverter {

	public ZeirChildClientConverter(IdentifierSourceService identifierSourceService,
			UniqueIdentifierService identifierService) {
		super(identifierSourceService, identifierService);
	}

	@Override
	public Client convertContactToClient(RapidProContact rapidProContact) {
		RapidProFields fields = rapidProContact.getFields();
		if (RapidProConstants.CHILD.equalsIgnoreCase(fields.getPosition())) {
			Client childClient = new Client(rapidProContact.getUuid());
			addCommonZeirProperties(rapidProContact, childClient);

			addZeirClientIdentifier(rapidProContact, childClient, RapidProConstants.ZEIR_ID);

			childClient.setBirthdate(DateParserUtils.parseZoneDateTime(fields.getDob()));
			childClient.addAttribute(RapidProConstants.CHILD_REGISTER_CARD_NUMBER, fields.getMvaccId());
			childClient.addAttribute(RapidProConstants.RESIDENTIAL_AREA, fields.getLocation());
			childClient.addAttribute(RapidProConstants.RESIDENTIAL_ADDRESS, fields.getLocation());

			//Place of birth facility saved as health_facility in ZEIR
			String birth = RapidProConstants.FACILITY.equalsIgnoreCase(fields.getBirth()) ?
					RapidProConstants.HEALTH_FACILITY :
					fields.getBirth();
			childClient.addAttribute(RapidProConstants.PLACE_OF_BIRTH, birth.toLowerCase(Locale.ROOT).replaceAll(" ", "_"));

			//Use Supervisor's location as the default place of birth and home facility both saved as location
			// id address property of client json
			Address address = new Address();
			address.setAddressType(RapidProConstants.USUAL_RESIDENCE);
			address.addAddressField(RapidProConstants.ADDRESS_SIX, fields.getFacilityLocationId());
			address.addAddressField(RapidProConstants.ADDRESS_SEVEN, fields.getFacilityLocationId());
			childClient.addAddress(address);

			childClient.setGender(fields.getSex().toLowerCase(Locale.ROOT));

			return childClient;
		}
		return null;
	}

	@Override
	public RapidProContact convertClientToContact(Client client) {
		return null;
	}
}
