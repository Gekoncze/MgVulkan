package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.types.VkBool32;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkPhysicalDeviceSparseProperties {
 *      VkBool32    residencyStandard2DBlockShape;
 *      VkBool32    residencyStandard2DMultisampleBlockShape;
 *      VkBool32    residencyStandard3DBlockShape;
 *      VkBool32    residencyAlignedMipSize;
 *      VkBool32    residencyNonResidentStrict;
 *  } VkPhysicalDeviceSparseProperties;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceSparseProperties.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceSparseProperties extends Structure {
    public VkBool32 residencyStandard2DBlockShape;
    public VkBool32 residencyStandard2DMultisampleBlockShape;
    public VkBool32 residencyStandard3DBlockShape;
    public VkBool32 residencyAlignedMipSize;
    public VkBool32 residencyNonResidentStrict;

    public VkPhysicalDeviceSparseProperties() {
    }

    public VkPhysicalDeviceSparseProperties(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "residencyStandard2DBlockShape",
                "residencyStandard2DMultisampleBlockShape",
                "residencyStandard3DBlockShape",
                "residencyAlignedMipSize",
                "residencyNonResidentStrict"
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

    public static class ByReference extends VkPhysicalDeviceSparseProperties implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends VkPhysicalDeviceSparseProperties implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(Pointer p) {
            super(p);
        }
    }
}
