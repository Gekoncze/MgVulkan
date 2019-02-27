package cz.mg.vulkan;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.VulkanNative.*;


public class VulkanPhysicalDeviceSparseProperties {
    private final VkPhysicalDeviceSparseProperties structure;

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
