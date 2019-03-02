package cz.mg.vulkan.structures;

import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanPhysicalDeviceSparseProperties {
    public final VkPhysicalDeviceSparseProperties structure;

    public VulkanPhysicalDeviceSparseProperties() {
        this.structure = new VkPhysicalDeviceSparseProperties();
    }

    public VulkanPhysicalDeviceSparseProperties(VkPhysicalDeviceSparseProperties structure) {
        this.structure = structure;
    }

    public boolean isResidencyStandard2DBlockShape(){
        return structure.residencyStandard2DBlockShape.intValue() == VK_FALSE ? false : true;
    }

    public boolean isResidencyStandard2DMultisampleBlockShape(){
        return structure.residencyStandard2DMultisampleBlockShape.intValue() == VK_FALSE ? false : true;
    }

    public boolean isResidencyStandard3DBlockShape(){
        return structure.residencyStandard3DBlockShape.intValue() == VK_FALSE ? false : true;
    }

    public boolean isResidencyAlignedMipSize(){
        return structure.residencyAlignedMipSize.intValue() == VK_FALSE ? false : true;
    }

    public boolean isResidencyNonResidentStrict(){
        return structure.residencyNonResidentStrict.intValue() == VK_FALSE ? false : true;
    }
}
