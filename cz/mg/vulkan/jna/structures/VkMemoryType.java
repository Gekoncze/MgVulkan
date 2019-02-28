package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.flags.VkMemoryPropertyFlags;
import cz.mg.vulkan.jna.types.uint32_t;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkMemoryType {
 *      VkMemoryPropertyFlags    propertyFlags;
 *      uint32_t                 heapIndex;
 *  } VkMemoryType;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryType.html">khronos documentation</a>
 **/
public class VkMemoryType extends Structure {
    public VkMemoryPropertyFlags propertyFlags;
    public uint32_t heapIndex;

    public VkMemoryType() {
    }

    public VkMemoryType(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "propertyFlags",
                "heapIndex"
        });
    }

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkMemoryType implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends VkMemoryType implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(Pointer p) {
            super(p);
        }
    }
}
