package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.bidv.rest.webservices.restfullwebservices.entity.DocumentEntity;
import com.bidv.rest.webservices.restfullwebservices.repository.DocumentRepository;
import com.bidv.rest.webservices.restfullwebservices.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentRepository repository;

	public DocumentEntity store(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		DocumentEntity doc = new DocumentEntity(fileName, file.getContentType(), file.getBytes());

		return repository.save(doc);
	}

	public DocumentEntity getFile(String id) {
		return repository.findById(id).get();
	}

	public Stream<DocumentEntity> getAllFiles() {
		return repository.findAll().stream();
	}
}