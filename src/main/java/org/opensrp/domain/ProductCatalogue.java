package org.opensrp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductCatalogue {

	private Long uniqueId;

	private String productName;

	private Boolean isAttractiveItem;

	private String materialNumber;

	private String availability;

	private String condition;

	private String appropriateUsage;

	private Integer accountabilityPeriod;

	private String photoURL;

	private Long serverVersion;
}
