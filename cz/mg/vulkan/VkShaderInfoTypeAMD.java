package cz.mg.vulkan;

public class VkShaderInfoTypeAMD extends VkEnum {
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = 0;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = 1;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;

    public VkShaderInfoTypeAMD() {
    }

    public VkShaderInfoTypeAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderInfoTypeAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkShaderInfoTypeAMD(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SHADER_INFO_TYPE_STATISTICS_AMD) return "VK_SHADER_INFO_TYPE_STATISTICS_AMD";
        if(getValue() == VK_SHADER_INFO_TYPE_BINARY_AMD) return "VK_SHADER_INFO_TYPE_BINARY_AMD";
        if(getValue() == VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD) return "VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD";
        return "UNKNOWN";
    }
}
