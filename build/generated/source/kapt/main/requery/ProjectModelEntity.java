// Generated file do not edit, generated by io.requery.processor.EntityProcessor
package requery;

import io.requery.CascadeAction;
import io.requery.Persistable;
import io.requery.ReferentialAction;
import io.requery.meta.Attribute;
import io.requery.meta.AttributeBuilder;
import io.requery.meta.AttributeDelegate;
import io.requery.meta.Cardinality;
import io.requery.meta.NumericAttributeDelegate;
import io.requery.meta.QueryExpression;
import io.requery.meta.StringAttributeDelegate;
import io.requery.meta.Type;
import io.requery.meta.TypeBuilder;
import io.requery.proxy.EntityProxy;
import io.requery.proxy.IntProperty;
import io.requery.proxy.Property;
import io.requery.proxy.PropertyState;
import io.requery.util.function.Function;
import io.requery.util.function.Supplier;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("io.requery.processor.EntityProcessor")
public class ProjectModelEntity implements ProjectModel, Persistable {
    public static final QueryExpression<Integer> OWNER_ID = 
    new AttributeBuilder<ProjectModelEntity, Integer>("owner", int.class)
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setForeignKey(true)
    .setReferencedClass(UserModelEntity.class)
    .setReferencedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return UserModelEntity.ID;
        }
    })
    .setDeleteAction(ReferentialAction.CASCADE)
    .setUpdateAction(ReferentialAction.CASCADE)
    .setCascadeAction(CascadeAction.SAVE)
    .setMappedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return UserModelEntity.PROJECTS;
        }
    })
    .build();

    public static final AttributeDelegate<ProjectModelEntity, UserModel> OWNER = new AttributeDelegate(
    new AttributeBuilder<ProjectModelEntity, UserModel>("owner", UserModel.class)
    .setProperty(new Property<ProjectModelEntity, UserModel>() {
        @Override
        public UserModel get(ProjectModelEntity entity) {
            return entity.owner;
        }

        @Override
        public void set(ProjectModelEntity entity, UserModel value) {
            entity.owner = value;
        }
    })
    .setPropertyName("getOwner")
    .setPropertyState(new Property<ProjectModelEntity, PropertyState>() {
        @Override
        public PropertyState get(ProjectModelEntity entity) {
            return entity.$owner_state;
        }

        @Override
        public void set(ProjectModelEntity entity, PropertyState value) {
            entity.$owner_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setForeignKey(true)
    .setReferencedClass(UserModelEntity.class)
    .setReferencedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return UserModelEntity.ID;
        }
    })
    .setDeleteAction(ReferentialAction.CASCADE)
    .setUpdateAction(ReferentialAction.CASCADE)
    .setCascadeAction(CascadeAction.SAVE)
    .setCardinality(Cardinality.MANY_TO_ONE)
    .setMappedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return UserModelEntity.PROJECTS;
        }
    })
    .build());

    public static final NumericAttributeDelegate<ProjectModelEntity, Integer> ID = new NumericAttributeDelegate(
    new AttributeBuilder<ProjectModelEntity, Integer>("id", int.class)
    .setProperty(new IntProperty<ProjectModelEntity>() {
        @Override
        public Integer get(ProjectModelEntity entity) {
            return entity.id;
        }

        @Override
        public void set(ProjectModelEntity entity, Integer value) {
            entity.id = value;
        }

        @Override
        public int getInt(ProjectModelEntity entity) {
            return entity.id;
        }

        @Override
        public void setInt(ProjectModelEntity entity, int value) {
            entity.id = value;
        }
    })
    .setPropertyName("getId")
    .setPropertyState(new Property<ProjectModelEntity, PropertyState>() {
        @Override
        public PropertyState get(ProjectModelEntity entity) {
            return entity.$id_state;
        }

        @Override
        public void set(ProjectModelEntity entity, PropertyState value) {
            entity.$id_state = value;
        }
    })
    .setKey(true)
    .setGenerated(true)
    .setReadOnly(true)
    .setLazy(false)
    .setNullable(false)
    .setUnique(false)
    .buildNumeric());

    public static final StringAttributeDelegate<ProjectModelEntity, String> NAME = new StringAttributeDelegate(
    new AttributeBuilder<ProjectModelEntity, String>("name", String.class)
    .setProperty(new Property<ProjectModelEntity, String>() {
        @Override
        public String get(ProjectModelEntity entity) {
            return entity.name;
        }

        @Override
        public void set(ProjectModelEntity entity, String value) {
            entity.name = value;
        }
    })
    .setPropertyName("getName")
    .setPropertyState(new Property<ProjectModelEntity, PropertyState>() {
        @Override
        public PropertyState get(ProjectModelEntity entity) {
            return entity.$name_state;
        }

        @Override
        public void set(ProjectModelEntity entity, PropertyState value) {
            entity.$name_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .buildString());

    public static final Type<ProjectModelEntity> $TYPE = new TypeBuilder<ProjectModelEntity>(ProjectModelEntity.class, "ProjectModel")
    .setBaseType(ProjectModel.class)
    .setCacheable(true)
    .setImmutable(false)
    .setReadOnly(false)
    .setStateless(false)
    .setView(false)
    .setFactory(new Supplier<ProjectModelEntity>() {
        @Override
        public ProjectModelEntity get() {
            return new ProjectModelEntity();
        }
    })
    .setProxyProvider(new Function<ProjectModelEntity, EntityProxy<ProjectModelEntity>>() {
        @Override
        public EntityProxy<ProjectModelEntity> apply(ProjectModelEntity entity) {
            return entity.$proxy;
        }
    })
    .addAttribute(OWNER)
    .addAttribute(ID)
    .addAttribute(NAME)
    .addExpression(OWNER_ID)
    .build();

    private PropertyState $owner_state;

    private PropertyState $id_state;

    private PropertyState $name_state;

    private UserModel owner;

    private int id;

    private String name;

    private final transient EntityProxy<ProjectModelEntity> $proxy = new EntityProxy<ProjectModelEntity>(this, $TYPE);

    public ProjectModelEntity() {
    }

    @Override
    public UserModel getOwner() {
        return $proxy.get(OWNER);
    }

    public void setOwner(UserModel owner) {
        $proxy.set(OWNER, owner);
    }

    @Override
    public int getId() {
        return $proxy.get(ID);
    }

    @Override
    public String getName() {
        return $proxy.get(NAME);
    }

    public void setName(String name) {
        $proxy.set(NAME, name);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ProjectModelEntity && ((ProjectModelEntity)obj).$proxy.equals(this.$proxy);
    }

    @Override
    public int hashCode() {
        return $proxy.hashCode();
    }

    @Override
    public String toString() {
        return $proxy.toString();
    }
}
