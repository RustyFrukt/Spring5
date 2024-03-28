package ru.geekbrains.hometask5.service;

import ru.geekbrains.hometask5.entity.ReaderEntity;

import java.util.List;
import java.util.Optional;

public interface ReaderService {

    Optional<ReaderEntity> getReaderById(long id);

    ReaderEntity addReader(ReaderEntity reader);
    Optional<ReaderEntity> updateReader(long id, ReaderEntity reader);

    void deleteReader(long id);

    List<ReaderEntity> getAllReaders();

}
