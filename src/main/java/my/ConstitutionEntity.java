package my;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Constitution", catalog = "")
public class ConstitutionEntity {
    private int IDConstitution;
    private String ConstitutionName;
    private String Author;
    private int Amount;
    private List<PresidentEntity> presidentEntities;

    public ConstitutionEntity() {
    }

    public ConstitutionEntity(int IDConstitution, String ConstitutionName, String Author, int Amount) {
        this.IDConstitution = IDConstitution;
        this.ConstitutionName = ConstitutionName;
        this.Author = Author;
        this.Amount = Amount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPerson", nullable = false)
    public int getIDConstitution() {
        return IDConstitution;
    }

    public void setIDConstitution(int IDConstitution) {
        this.IDConstitution = IDConstitution;
    }

    @Column(name = "Surname", nullable = false, length = 25)
    public String getConstitutionName() {
        return ConstitutionName;
    }

    public void setConstitutionName(String constitutionName) {
        this.ConstitutionName = constitutionName;
    }

    @Column(name = "Name", nullable = false, length = 25)
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    @Column(name = "Email", nullable = true, length = 45)
    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        this.Amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConstitutionEntity that = (ConstitutionEntity) o;

        if (IDConstitution != that.IDConstitution) return false;
        if (ConstitutionName != null ? !ConstitutionName.equals(that.ConstitutionName) : that.ConstitutionName != null) return false;
        if (Author != null ? !Author.equals(that.Author) : that.Author != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = IDConstitution;
        result = 31 * result + (ConstitutionName != null ? ConstitutionName.hashCode() : 0);
        result = 31 * result + (Author != null ? Author.hashCode() : 0);

        return result;
    }

    public void setPresidentEntities(List<PresidentEntity> presidentEntities) {
        this.presidentEntities = presidentEntities;
    }
}
