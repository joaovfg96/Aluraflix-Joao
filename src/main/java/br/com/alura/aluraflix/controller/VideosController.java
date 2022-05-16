package br.com.alura.aluraflix.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.aluraflix.dto.VideoDto;
import br.com.alura.aluraflix.model.Video;

@RestController
public class VideosController {
	
	@RequestMapping("/videos")
	public List<VideoDto> getAllVideos() {
		Video video = new Video("Teste1", "teste teste", "teste.com");
		
		return VideoDto.converter(Arrays.asList(video, video, video));
	}
}
