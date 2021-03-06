package dd2.local.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: KDJ
 * Date: 13. 11. 11
 * Time: 오전 10:03
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "AD_User", schema = "dbo", catalog = "lets_ko")
@Entity
public class AdUser2Entity {
    private Long adUserId;
    private AdCompanyEntity adCompanyId;
    private Date created;
    private AdUser2Entity createdBy;
    private Date updated;
    private AdUser2Entity updatedBy;
    private String name;
    private String title;
    private String description;
    private String isActive;
    private String password;
    private String eMail;
    private String phone;
    private String phone2;
    private String fax;

    @Column(name = "AD_User_ID")
    @Id
    public Long getAdUserId() {
        return adUserId;
    }

    public void setAdUserId(Long adUserId) {
        this.adUserId = adUserId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AD_Company_ID", referencedColumnName = "AD_Company_ID")
    public AdCompanyEntity getAdCompanyId() {
        return adCompanyId;
    }

    public void setAdCompanyId(AdCompanyEntity adCompanyId) {
        this.adCompanyId = adCompanyId;
    }

    @Column(name = "Created")
    @Basic
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Basic
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="CreatedBy", referencedColumnName = "AD_User_ID")
    public AdUser2Entity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(AdUser2Entity createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "Updated")
    @Basic
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Basic
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="UpdatedBy", referencedColumnName = "AD_User_ID")
    public AdUser2Entity getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(AdUser2Entity updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Column(name = "Name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Title")
    @Basic
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "Description")
    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    @Column(name = "isActive")
//    @Basic
//    public String getActive() {
//        return isActive;
//    }
//
//    public void setActive(String active) {
//        this.isActive = active;
//    }

    @Column(name = "isActive")
    @Basic
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Column(name = "Password")
    @Basic
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "EMail")
    @Basic
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Column(name = "Phone")
    @Basic
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "Phone2")
    @Basic
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Column(name = "Fax")
    @Basic
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdUser2Entity that = (AdUser2Entity) o;

        if (adCompanyId != null ? !adCompanyId.equals(that.adCompanyId) : that.adCompanyId != null) return false;
        if (adUserId != null ? !adUserId.equals(that.adUserId) : that.adUserId != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (phone2 != null ? !phone2.equals(that.phone2) : that.phone2 != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adUserId != null ? adUserId.hashCode() : 0;
        result = 31 * result + (adCompanyId != null ? adCompanyId.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (phone2 != null ? phone2.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        return result;
    }
}
