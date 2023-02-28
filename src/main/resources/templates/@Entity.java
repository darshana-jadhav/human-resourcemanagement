@Entity
public class Article {

    @Id
    @GeneratedValue
    Integer id;
 
    @Temporal(TemporalType.DATE)
    Date publicationDate;
 
    @Temporal(TemporalType.TIME)
    Date publicationTime;
 
    @Temporal(TemporalType.TIMESTAMP)
    Date creationDateTime;
}