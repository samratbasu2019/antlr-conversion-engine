package ingov.itd.iec.api.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="[ToDo]")
public class SampleEntity {
	@Id
	@Column(name="id")
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int id;
	
}
