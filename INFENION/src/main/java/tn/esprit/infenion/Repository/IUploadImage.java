package tn.esprit.infenion.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.infenion.model.UploadImageProfil;

public interface IUploadImage extends CrudRepository<UploadImageProfil,Long> {
}
