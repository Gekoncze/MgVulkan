package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.flags.VkMemoryHeapFlags;
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
    public long size;
    public VkMemoryHeapFlags.ByValue flags;

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

    public static class ByReference extends VkMemoryHeap implements Structure.ByReference {}
    public static class ByValue extends VkMemoryHeap implements Structure.ByValue {}
}
