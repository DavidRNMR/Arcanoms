package pl.piomin.services.employee.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * The persistent class for the "Productos" database table.
 */
//@NamedNativeQuery(name = ProductModel.GET_LAST_PRODUCTS, query = "WITH r AS ( SELECT p.*, ROW_NUMBER() OVER " + "(PARTITION BY p.PRO_Aria_ID ORDER BY p.PRO_Fecha_carga DESC) row_num FROM Productos p WHERE trim(p.PRO_Nombre) NOT like '--%' AND p.PRO_Nombre <> '') " + "SELECT r.PRO_Id, r.PRO_Aria_ID, r.PRO_Nombre, r.PRO_Isin, r.PRO_BBG_Ticker, r.PRO_DIV_Id, r.PRO_Fecha_carga, r.PRO_Tipo " + "FROM r  WHERE row_num = 1", resultClass = ProductModel.class)
//@NamedQuery(name = ProductModel.FIND_PRODUCTS_ADVANCE_SEARCH, query = "SELECT p.id FROM ProductModel p WHERE p.id IN :" + ProductModel.PRODUCTS_PARAM + " AND p.name LIKE CONCAT('%', :" + ProductModel.NAME_PARAM + ", '%')")
@Getter
@Setter
@NoArgsConstructor
public
class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String GET_LAST_PRODUCTS = "ProductModel.getLastProducts";
    public static final String PRODUCT_ARIA_ID_PARAM = "ariaId";
    public static final String FIND_PRODUCTS_ADVANCE_SEARCH = "ProductModel.findProductsAdvanceSearch";
    public static final String NAME_PARAM = "name";
    public static final String PRODUCTS_PARAM = "lstProducts";

    private Long id;
    private Long ariaId;
    private Long currencyId;
    private String bbgTicker;
    private String isin;
    private String name;
    private Date createdDate;
    private String productType;

    private CurrencyModel currency;
//    private Collection<ParticipatingPositionModel> participatingPositions;
//    private Collection<CapitalCallModel> capitalCalls;
//    private Collection<DistributionModel> distributions;
//    private Collection<CapitalReturnModel> capitalReturns;
//    private Collection<OverpaymentReturnModel> overpaymentReturns;
//    private Collection<DocumentModel> documents;
//    private Collection<RelBnpProductModel> relBnpProducts;
//    private Collection<GdDocumentReadModel> documentsRead;
//    private Collection<ProductContactModel> productContact;
//    private Collection<UserApiModel> userApi;
}
