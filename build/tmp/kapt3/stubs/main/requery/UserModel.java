package requery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lrequery/UserModel;", "Lio/requery/Persistable;", "id", "", "getId", "()I", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "projects", "", "Lrequery/ProjectModel;", "getProjects", "()Ljava/util/Set;", "RequeryDemo"})
@io.requery.Entity()
public abstract interface UserModel extends io.requery.Persistable {
    
    @io.requery.Generated()
    @io.requery.Key()
    public abstract int getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    public abstract void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    @io.requery.OneToMany(mappedBy = "owner")
    public abstract java.util.Set<requery.ProjectModel> getProjects();
}