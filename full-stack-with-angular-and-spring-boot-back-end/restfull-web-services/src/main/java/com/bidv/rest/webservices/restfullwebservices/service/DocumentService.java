package com.bidv.rest.webservices.restfullwebservices.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import com.bidv.rest.webservices.restfullwebservices.entity.DocumentEntity;

public interface DocumentService {

	public DocumentEntity store(MultipartFile file) throws IOException;

	public Stream<DocumentEntity> getAllFiles();
	
	public DocumentEntity getFile(String id);
}
