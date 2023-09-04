package com.example.songr;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SongrApplicationTests {
	@Test
	public void testAlbumConstructor() {
		Album album = new Album("Test Album", "Test Artist", 5, 200, "test.jpg");

		assertThat(album).isNotNull();
		assertThat(album.getTitle()).isEqualTo("Test Album");
		assertThat(album.getArtist()).isEqualTo("Test Artist");
		assertThat(album.getSongCount()).isEqualTo(5);
		assertThat(album.getLengthInSeconds()).isEqualTo(200);
		assertThat(album.getImageUrl()).isEqualTo("test.jpg");
	}

	@Test
	public void testAlbumGettersAndSetters() {
		Album album = new Album();

		album.setTitle("Test Album");
		album.setArtist("Test Artist");
		album.setSongCount(5);
		album.setLengthInSeconds(200);
		album.setImageUrl("test.jpg");

		assertThat(album).isNotNull();
		assertThat(album.getTitle()).isEqualTo("Test Album");
		assertThat(album.getArtist()).isEqualTo("Test Artist");
		assertThat(album.getSongCount()).isEqualTo(5);
		assertThat(album.getLengthInSeconds()).isEqualTo(200);
		assertThat(album.getImageUrl()).isEqualTo("test.jpg");
	}
	@Test
	void contextLoads() {
	}

}
