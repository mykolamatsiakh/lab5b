package my;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "President", catalog = "")
public class PresidentEntity {
    private int IDPresident;
    private String Surname;
    private String Name;
    private String Country;
    private List<ConstitutionEntity> persons;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDBook", nullable = false)
    public int getIDPresident() {
        return IDPresident;
    }

    public void setIDPresident(int IDPresident) {
        this.IDPresident = IDPresident;
    }

    @Basic
    @Column(name = "BookName", nullable = false, length = 45)
    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    @Basic
    @Column(name = "Author", nullable = false, length = 45)
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @Basic
    @Column(name = "Amount", nullable = false)
    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PresidentEntity that = (PresidentEntity) o;

        if (IDPresident != that.IDPresident) return false;
        if (Country != that.Country) return false;
        if (Surname != null ? !Surname.equals(that.Surname) : that.Surname != null) return false;
        if (Name != null ? !Name.equals(that.Name) : that.Name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = IDPresident;
        result = 31 * result + (Surname != null ? Surname.hashCode() : 0);
        result = 31 * result + (Name != null ? Name.hashCode() : 0);
        result = 31 * result + (Country != null ? Name.hashCode() : 0);
        return result;
    }

    @ManyToMany
    @JoinTable(name = "personbook", catalog = "", schema = "db_jdbc", joinColumns = @JoinColumn(name = "IDBook", referencedColumnName = "IDBook", nullable = false), inverseJoinColumns = @JoinColumn(name = "IDPerson", referencedColumnName = "IDPerson", nullable = false))
    public List<ConstitutionEntity> getPersons() {
        return persons;
    }

    public void setPersons(List<ConstitutionEntity> persons) {
        this.persons = persons;
    }
}
