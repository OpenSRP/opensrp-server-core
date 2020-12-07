package org.opensrp.repository;

import org.smartregister.domain.ProductCatalogue;
import org.opensrp.search.ProductCatalogueSearchBean;

import java.util.List;

public interface ProductCatalogueRepository extends BaseRepository<ProductCatalogue> {

	ProductCatalogue getById(Long uniqueId);

	List<ProductCatalogue> getProductCataloguesBySearchBean(ProductCatalogueSearchBean productCatalogueSearchBean);

	void safeRemove(Long id);

	ProductCatalogue getProductCatalogueByName(String productName);

}
