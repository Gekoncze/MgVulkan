package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.types.uint32_t;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkExtent3D {
 *      uint32_t    width;
 *      uint32_t    height;
 *      uint32_t    depth;
 *  } VkExtent3D;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExtent3D.html">khronos documentation</a>
 **/
public class VkExtent3D extends Structure {
    public uint32_t width;
    public uint32_t height;
    public uint32_t depth;

    public VkExtent3D() {
    }

    public VkExtent3D(int width, int height, int depth) {
        this.width = new uint32_t(width);
        this.height = new uint32_t(height);
        this.depth = new uint32_t(depth);
    }

    public VkExtent3D(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "width",
                "height",
                "depth"
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

    public static class ByReference extends VkExtent3D implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends VkExtent3D implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(Pointer p) {
            super(p);
        }
    }
}
