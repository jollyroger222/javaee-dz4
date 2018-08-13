package geek.javaee.s.dz4.entity;
import geek.javaee.s.dz4.api.WBS;
import org.jetbrains.annotations.Nullable;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author 123
 */


    public  class Tovar implements WBS {

    @Nullable
    private String id = UUID.randomUUID().toString();

    @Nullable
    private String projectId;

    @Nullable
    private String name = null;

    @Nullable
    private String description = null;

    @Nullable
    private Date dateBegin;

    @Nullable
    private Date dateEnd;

    public Tovar() {
    }

    public Tovar(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(@Nullable final Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    @Nullable
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(@Nullable final Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    @Nullable
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(@Nullable String projectId) {
        this.projectId = projectId;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }


}
