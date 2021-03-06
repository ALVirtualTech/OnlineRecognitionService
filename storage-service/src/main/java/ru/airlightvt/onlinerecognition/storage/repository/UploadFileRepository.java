package ru.airlightvt.onlinerecognition.storage.repository;

import org.springframework.data.repository.CrudRepository;
import ru.airlightvt.onlinerecognition.storage.data.UploadFile;

import java.util.List;

public interface UploadFileRepository  extends CrudRepository<UploadFile, Long> {
    UploadFile getById(Long id);

    List<UploadFile> findAll();
}
