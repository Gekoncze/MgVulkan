package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.flags.VkMemoryHeapFlags;
import cz.mg.vulkan.jna.types.VkDeviceSize;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkMemoryHeap {
 *      VkDeviceSize         size;
 *      VkMemoryHeapFlags    flags;
 *  } VkMemoryHeap;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryHeap.html">khronos documentation</a>
 **/
public class VkMemoryHeap extends Structure {
    public VkDeviceSize size;
    public VkMemoryHeapFlags flags;

    public VkMemoryHeap() {
    }

    public VkMemoryHeap(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "size",
                "flags"
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

    public static class ByReference extends VkMemoryHeap implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends VkMemoryHeap implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(Pointer p) {
            super(p);
        }
    }
}
