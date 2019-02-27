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

    public static class ByReference extends VkPhysicalDeviceSparseProperties implements Structure.ByReference {}
    public static class ByValue extends VkPhysicalDeviceSparseProperties implements Structure.ByValue {}
}
