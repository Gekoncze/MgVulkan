package cz.mg.vulkan;

public class VkShaderStageFlags extends VkFlags {
    public VkShaderStageFlags() {
    }

    public VkShaderStageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderStageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkShaderStageFlags(int value) {
        setValue(value);
    }
}
