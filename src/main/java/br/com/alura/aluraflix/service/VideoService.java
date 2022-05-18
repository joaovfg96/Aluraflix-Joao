package br.com.alura.aluraflix.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.aluraflix.dto.VideoDto;
import br.com.alura.aluraflix.model.Video;
import br.com.alura.aluraflix.repository.VideoRepository;

@Service
public class VideoService {
	
	@Autowired
	private VideoRepository videoRepository;
	
	public List<VideoDto> getAll() {
		List<Video> videos = videoRepository.findAll();
		return VideoDto.converterLista(videos);
	}
	
	public VideoDto findById(Long id) {
		Optional<Video> video = videoRepository.findById(id);
		if (video.isPresent()) {
			return VideoDto.converter(video.get());
		}
		return null;
	}

}
