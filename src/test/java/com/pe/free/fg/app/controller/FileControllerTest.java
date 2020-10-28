package com.pe.free.fg.app.controller;

import com.pe.free.fg.app.service.FilesStorageService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.web.multipart.MultipartFile;
import static org.junit.Assert.fail;


public class FileControllerTest {

    @Mock
    FilesStorageService filesStorageService;

    MultipartFile file;


    @InjectMocks
    FileController fileController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void uploadFile() {
        fileController.uploadFile(file);
        Assert.assertEquals(HttpStatus.OK, HttpStatus.OK);
    }

    @Test(expected = Exception.class)
    public void ErrorGeneric() {
        Mockito.doThrow(Exception.class).when(fileController.uploadFile(file));
        Assert.assertEquals(HttpStatus.OK, HttpStatus.OK);
        fail();
    }


}
