package tn.esprit.infenion.IService;

import tn.esprit.infenion.model.Flow;

public interface IFlowService {

    Flow addFolow ( long idp , long idu);

    String DeleteFlow (Long Idp ,Long idu);
}
