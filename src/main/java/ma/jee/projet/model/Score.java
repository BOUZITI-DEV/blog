package ma.jee.projet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Score {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int likes;
	private int dislikes;

	public Score() {
		super();
	}

	public Score(int id, int likes, int dislikes) {
		super();
		this.id = id;
		this.likes = likes;
		this.dislikes = dislikes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

}
