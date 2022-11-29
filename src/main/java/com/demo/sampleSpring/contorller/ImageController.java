package com.demo.sampleSpring.contorller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.http.client.methods.HttpHead;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution;

@RestController
public class ImageController {

	@RequestMapping(value = "/upload/local", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			File path = new File("D://" + file.getOriginalFilename());
			path.createNewFile();
			FileOutputStream output = new FileOutputStream(path);
			output.write(file.getBytes());
			output.close();
			return new ResponseEntity("File is uploaded successfully!", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/getImage")
	public ResponseEntity<?> name() {
		try {
			String fileName = "D:\\all master dead.png";
			File file = new File(fileName);
			InputStreamResource inputStreamResource = new InputStreamResource(new FileInputStream(file));
			HttpHeaders headers=new HttpHeaders();
			headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"",file.getName()));
			ResponseEntity<Object> result=ResponseEntity.ok().headers(headers).contentLength(file.length()).contentType(MediaType.ALL).body(inputStreamResource);
			return result;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
