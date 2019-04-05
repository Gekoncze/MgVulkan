package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanShaderInfoTypeAMD extends VulkanEnum {
    public static final int SHADER_INFO_TYPE_STATISTICS_AMD = VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_STATISTICS_AMD;
    public static final int SHADER_INFO_TYPE_BINARY_AMD = VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_BINARY_AMD;
    public static final int SHADER_INFO_TYPE_DISASSEMBLY_AMD = VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD;

    public VulkanShaderInfoTypeAMD(){
        super(new VkShaderInfoTypeAMD());
    }

    public VulkanShaderInfoTypeAMD(VkShaderInfoTypeAMD vk){
        super(vk);
    }

    @Override
    public VkShaderInfoTypeAMD getVk(){
        return (VkShaderInfoTypeAMD) super.getVk();
    }

    public VulkanShaderInfoTypeAMD(int value){
        super(new VkShaderInfoTypeAMD(value));
    }

    @Override
    public String toString() {
        if(getValue() == SHADER_INFO_TYPE_STATISTICS_AMD) return "SHADER_INFO_TYPE_STATISTICS_AMD";
        if(getValue() == SHADER_INFO_TYPE_BINARY_AMD) return "SHADER_INFO_TYPE_BINARY_AMD";
        if(getValue() == SHADER_INFO_TYPE_DISASSEMBLY_AMD) return "SHADER_INFO_TYPE_DISASSEMBLY_AMD";
        return "UNKNOWN";
    }
}
